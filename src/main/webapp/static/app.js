/**
 * Created by hgp on 22.02.16.
 */



$(function () {
    var viewModel = {
        burger: ko.observableArray([]),
        selectedBurger: ko.observable() // Nothing selected by default
    };

    viewModel.selectedBurger.subscribe(function (newValue) {
        console.log(newValue);

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


