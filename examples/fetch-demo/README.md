# Fetch DEMO

## Introduction

这个Tutorial来自于[这个链接](http://www.sitepoint.com/asynchronous-apis-using-fetch-api-es6-generators/)。
有关Fetch API的基本使用方法参考如下：

    var req = new Request(URL, {method: 'GET', cache: 'reload'});
    fetch(req).then(function(response) {
      return response.json();
    }).then(function(json) {
      insertPhotos(json);
    });

## Running

### install all dependencies

    npm install
    
### build

    gulp
    
### running

open from browser to visit `index.html`,
put your codes in a web server, or open from `WebStorm` directly.

## References

1. [Fetch Introduction](http://www.sitepoint.com/introduction-to-the-fetch-api/)
1. [That's so fetch!](https://jakearchibald.com/2015/thats-so-fetch/)
1. [Fetch+Generator](http://www.sitepoint.com/asynchronous-apis-using-fetch-api-es6-generators/)