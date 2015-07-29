'use strict';

var React = require('react/addons');
var App = React.createFactory(require('../components/App.react.jsx'));
var About = React.createFactory(require('../components/About.react.jsx'));

module.exports = function (app) {

  app.get('/', function (req, res) {
    var reactHtml = React.renderToString(App({}));
    res.render('index.ejs', { reactOutput: reactHtml});
  });

  app.get('/about', function (req, res) {
    var reactHtml = React.renderToString(About({}));
    res.render('about.ejs', { reactOutput: reactHtml});
  });

  // routes not found
  app.get('*', function (req, res) {
    res.json({
      'route': 'sorry this page does not exist!'
    });
  })
};