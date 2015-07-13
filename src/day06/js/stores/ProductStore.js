
// each store manages application state for a domain within an application
var AppDispatcher = require('../dispatcher/AppDispatcher');
var EventEmitter = require('events').EventEmitter;
var FluxCartConstants = require('../constants/FluxCartConstants');

var _ = require('underscore');

// define initial dta points
var _product = {};

// method to load product data from mock API
function loadProductData(data) {
    _product = data[0];
}

// extend ProductStore with EventEmitter to add eventing capabilities
var ProductStore = _.extend({}, EventEmitter.prototype, {

    // return product data
    getProduct: function () {
        return _product;
    }
});

// register callback with AppDispatcher
AppDispatcher.register(function (payload) {
    var action = payload.action;

    switch(action.actionType) {
        case FluxCartConstants.RECEIVE_DATA:
            loadProductData(action.data);
            break;

        default:
            return true;
    }

    // If action was responded to, emit change event
    //ProductStore.emitChange();

    return true;
});

module.exports = ProductStore;