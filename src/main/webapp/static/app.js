/**
 * Created by hgp on 22.02.16.
 */



$(function () {
    var viewModel = {
        burger: ko.observableArray([]),
        selectedBurger: ko.observable(),// Nothing selected by default
        sides: ko.observableArray([]),
        selectedSide: ko.observable(),// Nothing selected by default
        sidesVisible: ko.observable(false),
        drinks: ko.observableArray([]),
        selectedDrink: ko.observable(),// Nothing selected by default
        drinksVisible: ko.observable(false)
    };


    viewModel.selectedBurger.subscribe(function (newValue) {
        console.log(newValue);
        viewModel.sidesVisible(true);
    });

    viewModel.sidesVisible.subscribe(function (newValue) {
        if (viewModel.sidesVisible()) {
            $.getJSON("/sides", function (sidesBean) {
                console.log(sidesBean);


                sidesBean.sidesList.forEach(function (entry) {
                    viewModel.sides.push(entry);
                });
                // Now use this data to update your view models,
                // and Knockout will update your UI automatically
            });
        }
    });


    ko.applyBindings(viewModel, $('#knockoutRegion')[0]);

    $.getJSON("/burger", function (burgerBean) {
        console.log(burgerBean);


        burgerBean.burgerEntryList.forEach(function (entry) {
            viewModel.burger.push(entry);
        });
        // Now use this data to update your view models,
        // and Knockout will update your UI automatically
    });


});


