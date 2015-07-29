## Server render React App

Isomorphic JavaScript = Shared JavaScript codes that runs on both the client & server.

### Server-side React rending

[Reading Link](http://reactjsnews.com/isomorphic-javascript-with-react-node/)

### Isomorphic Javascript Benefits:

- Better overall user experience
- SEO-friendly
- Easier code maintenance
- Free progressive enhacements

### Key codes

	var React = require('react');
	var App = React.createFactory(require('../components/App.react.jsx'));
	
	module.exports = function (app) {
	
	  app.get('/', function (req, res) {
	    var reactHtml = React.renderToString(App({}));
	    res.render('index.ejs', { reactOutput: reactHtml});
	  });

	  // routes not found

	};

### Links

1. [github/isomorphic-react-example](https://github.com/DavidWells/isomorphic-react-example)