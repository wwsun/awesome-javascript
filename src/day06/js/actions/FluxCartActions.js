var AppDispatcher = require('../dispatcher/AppDispatcher');
var FluxCartConstants = require('../constants/FluxCartConstants');

// define action methods
var FluxCartActions = {

    // receive initial data
    receiveProduct: function (data) {
        AppDispatcher.handleAction({
            actionType: FluxCartConstants.RECEIVE_DATA,
            data: data
        })
    }

};

module.exports = FluxCartActions;