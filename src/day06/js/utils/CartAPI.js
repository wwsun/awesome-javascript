var FluxCartActions = require('../actions/FluxCartActions');

module.exports = {

    // sample API call
    getProductData: function () {
        var data = JSON.parse(localStorage.getItem('product'));
        FluxCartActions.receiveProduct(data);
    }
};