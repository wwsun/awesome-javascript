
var Dispatcher = require('flux').Dispatcher;

// create dispatcher instance
var AppDispatcher = new Dispatcher();

// helper method: identify where this action came from
AppDispatcher.handleAction = function (action) {
    this.dispatch({
        source: 'VIEW_ACTION',
        action: action
    });
};

module.exports = AppDispatcher;