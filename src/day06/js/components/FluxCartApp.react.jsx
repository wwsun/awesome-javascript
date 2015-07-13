var React = require('react');
var ProductStore = require('../stores/ProductStore');

function getCartState() {
    return {
        product: ProductStore.getProduct()
    };
}

var FluxCartApp = React.createClass({

    getInitialState: function () {
        return getCartState();
    },

    render: function () {
        return (
            <div>
                <h1>{this.state.product.name}</h1>
                <p>{this.state.product.description}</p>
            </div>
        );
    }
});

module.exports = FluxCartApp;