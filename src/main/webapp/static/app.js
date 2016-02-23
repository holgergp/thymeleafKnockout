/**
 * Created by hgp on 22.02.16.
 */



$(function () {

    function viewModel() {
        var self = this;
        self.burger = ko.observableArray([]);
        self.selectedBurger = ko.observable();// Nothing selected by default
        self.sides = ko.observableArray([]);
        self.selectedSide = ko.observable();// Nothing selected by default
        self.sidesVisible = ko.computed(function () {
            return !s.isBlank(self.selectedBurger());
        });
        self.drinks = ko.observableArray([]);
        self.selectedDrink = ko.observable();// Nothing selected by default
        self.drinksVisible = ko.observable(false);


        self.selectedBurger.subscribe(function (newValue) {
            console.log(newValue);
        });

        self.sidesVisible.subscribe(function (newValue) {
            if (self.sidesVisible()) {
                $.getJSON("/sides", function (sidesBean) {
                    console.log(sidesBean);


                    sidesBean.sidesList.forEach(function (entry) {
                        self.sides.push(entry);
                    });
                    // Now use this data to update your view models,
                    // and Knockout will update your UI automatically
                });
            }
        });


        $.getJSON("/burger", function (burgerBean) {
            console.log(burgerBean);


            burgerBean.burgerEntryList.forEach(function (entry) {
                self.burger.push(entry);
            });
            // Now use this data to update your view models,
            // and Knockout will update your UI automatically
        });

    }

    ko.applyBindings(new viewModel(), $('#knockoutRegion')[0]);
});


