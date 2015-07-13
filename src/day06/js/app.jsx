
var React = require('react');
var ProductData = require('./ProductData');
var CartAPI = require('./utils/CartAPI');

var FluxCartApp = require('./components/FluxCartApp.react.jsx');

// load mock data
ProductData.init();

// call mock API
CartAPI.getProductData();

// render components
React.render(<FluxCartApp />,
    document.getElementById('flux-cart')
);