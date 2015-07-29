
var path = require('path');
var express = require('express');
var bodyParser = require('body-parser');

require('node-jsx').install({ extension: '.jsx'});
var routes = require('./app/routes/routes');

var app = express();
var port = 3000;

app.use(express.static(path.join(__dirname, 'public')));
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');

// setup routes for the application
routes(app);

app.listen(port);
console.log('server is Up and Running at Port: ' + port);