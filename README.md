**Table of Contents**

- [Awesome JavaScript](#awesome-javascript)
  - [专题列表](#%E4%B8%93%E9%A2%98%E5%88%97%E8%A1%A8)
  - [基础](#%E5%9F%BA%E7%A1%80)
    - [开发准备](#%E5%BC%80%E5%8F%91%E5%87%86%E5%A4%87)
    - [推荐的书](#%E6%8E%A8%E8%8D%90%E7%9A%84%E4%B9%A6)
    - [源代码阅读](#%E6%BA%90%E4%BB%A3%E7%A0%81%E9%98%85%E8%AF%BB)
    - [敏捷方法与工具](#%E6%95%8F%E6%8D%B7%E6%96%B9%E6%B3%95%E4%B8%8E%E5%B7%A5%E5%85%B7)
    - [JavaScript](#javascript)
    - [ES6](#es6)
  - [Node.js](#nodejs)
    - [图书](#%E5%9B%BE%E4%B9%A6)
    - [最佳实践](#%E6%9C%80%E4%BD%B3%E5%AE%9E%E8%B7%B5)
    - [风格指南](#%E9%A3%8E%E6%A0%BC%E6%8C%87%E5%8D%97)
    - [常用的Node Web框架](#%E5%B8%B8%E7%94%A8%E7%9A%84node-web%E6%A1%86%E6%9E%B6)
    - [常用NPM工具模块](#%E5%B8%B8%E7%94%A8npm%E5%B7%A5%E5%85%B7%E6%A8%A1%E5%9D%97)
  - [开发工具和库](#%E5%BC%80%E5%8F%91%E5%B7%A5%E5%85%B7%E5%92%8C%E5%BA%93)
  - [Future](#future)

# Awesome JavaScript

[JavaScript](http://javascript.crockford.com/zh/javascript.html)是一个仅在一周就被发明出来的小玩意，
所以，它有着有多的缺陷，即使是这样，它已经存在了20年，全世界几乎每台电脑都至少装有一个JavaScript解释器，
况且今天这个当初的小玩意的目标是编写大型的企业应用。如果你对JavaScript的理解仅限于DOM操纵，页面动画，jQuery等等，
本列表将为你展现JavaScript的更多的令人震撼的功能。

## 专题列表

- [React相关资源](./sections/React/)
- [AngularJS相关资源](./sections/Angular/)
- [JavaScript语法解析](./sections/Ast/)

## 基础

### 开发准备

1. 安装 [Node.js](https://nodejs.org/en/)
2. 安装 [PhantomJS - 没有界面的浏览器](http://phantomjs.org/)
3. 安装 [Python27](https://www.python.org/downloads/) (Node有些模块对Python有依赖)
4. 安装 [Git](https://git-scm.com/)
5. 编辑器 [WebStorm](https://www.jetbrains.com/webstorm/) 或 [Visual Studio Code](https://code.visualstudio.com/)

### 推荐的书

- [JavaScript DOM编程艺术](http://www.ituring.com.cn/book/42)
- [JavaScript高级程序设计（第3版）](http://book.douban.com/subject/10546125/)
- [JavaScript语言精粹](http://book.douban.com/subject/11874748/)
- [Speaking JavaScript](http://speakingjs.com/es5/index.html)
- [You Don't Konw JS](https://github.com/getify/You-Dont-Know-JS)
- JavaScript权威指南
- Eloquent JavaScript
- JavaScript忍者禁术
- [Superhero.js - JS学习资料集](http://superherojs.com/)
- [阮一峰：JavaScript标准参考教程](http://javascript.ruanyifeng.com/)

### 源代码阅读

- [Github: Backbone](https://github.com/jashkenas/backbone)
- [Github: Underscore](https://github.com/jashkenas/underscore)
- [Github: Immutable](https://facebook.github.io/immutable-js/)

### 敏捷方法与工具

1. 持续集成与部署
	- [Continuous Delivery vs Continuous Deployment vs Continuous Integration - Wait huh?](http://blog.assembla.com/assemblablog/tabid/12618/bid/92411/Continuous-Delivery-vs-Continuous-Deployment-vs-Continuous-Integration-Wait-huh.aspx)
	- [Jenkins：开源的可扩展持续集成服务器](http://jenkins-ci.org/)
	- [CircleCI：Ship better code, faster.](https://circleci.com/)
	- [Travis CI: 一个针对开源社区的持续集成托管服务](https://travis-ci.org/)

1. 敏捷相关的几个概念
	- Scrum: [Scrum Guide](http://www.scrumguides.org/)
	- TDD: Test-Driven Development by Example (book)
	- Pair Programming

### Web安全

1. [跨站脚本攻击 - XSS](http://www.cnblogs.com/TankXiao/archive/2012/03/21/2337194.html)
1. [跨站请求伪造 - CSRF](https://www.wikiwand.com/zh-cn/%E8%B7%A8%E7%AB%99%E8%AF%B7%E6%B1%82%E4%BC%AA%E9%80%A0)
1. [SQL注入](https://technet.microsoft.com/zh-cn/library/ms161953.aspx)
1. [拒绝服务 - DDoS](https://www.wikiwand.com/zh-cn/%E9%98%BB%E6%96%B7%E6%9C%8D%E5%8B%99%E6%94%BB%E6%93%8A)
1. [An Introduction to Content Security Policy](http://www.html5rocks.com/en/tutorials/security/content-security-policy)
1. More: [Web Application Security Testing Cheat Sheet](https://www.owasp.org/index.php/Web_Application_Security_Testing_Cheat_Sheet)

### JavaScript

核心基础语法点

- [this](http://www.ibm.com/developerworks/cn/web/1207_wangqf_jsthis/index.html)
- [闭包](http://wwsun.github.io/posts/javascript-closure.html)

核心概念

1. [Functional Programming 函数式编程]()
1. [Prototyped-based OOP 基于原型的面向对象编程]()
1. [Async/Concurrent Programming 异步/并发编程]()

关键知识点

- [正则表达式](http://qntm.org/files/re/re.html)

Other topics

1. [日期和时间字符串](https://msdn.microsoft.com/library/ff743760)
1. [处理Cookies](http://www.sitepoint.com/how-to-deal-with-cookies-in-javascript/)
1. [Promise](http://javascript.ruanyifeng.com/advanced/promise.html)
	- Github: [bluebird](https://github.com/petkaantonov/bluebird)
	- Github: [q](https://github.com/kriskowal/q)
1. [JavaScript与有限状态机](http://javascript.ruanyifeng.com/advanced/fsm.html)
1. [Fetch API](http://www.sitepoint.com/introduction-to-the-fetch-api/)
	- Github: [fetch polyfill](https://github.com/github/fetch)
1. [什么是shims和polyfills](http://speakingjs.com/es5/ch30.html#shim_vs_polyfill)
1. [严格模式](http://javascript.ruanyifeng.com/advanced/strict.html)
1. [ES5增加的新特性](http://speakingjs.com/es5/ch25.html)
1. [ES6基本介绍](http://javascript.ruanyifeng.com/advanced/ecmascript6.html)
1. [JavaScript的模块化进程](http://www.cnblogs.com/lvdabao/p/js-modules-develop.html)
1. [Command Line API参考手册](https://developers.google.com/web/tools/chrome-devtools/debug/command-line/command-line-reference?hl=en)

### ECMAScript 2015 (ES6)

阅读材料

1. [Understanding ES6](https://leanpub.com/understandinges6/read/) by Nicholas C.Zakas
1. [Exploring ES6](http://exploringjs.com/es6/) by Axel Rauschmayer

语法转换 ES6 to ES5

1. [Babel](https://babeljs.io/) - 推荐！杀手级特性"human-readable output"
1. [Traceur](https://github.com/google/traceur-compiler)
1. [Babelify](https://github.com/babel/babelify): 将`babel`引入到Gulp, Grunt, npm run等构建过程
1. [A Brief History of ES6 Tooling](https://ponyfoo.com/articles/a-brief-history-of-es6-tooling)

入门

1. [Learn ES2015](https://babeljs.io/docs/learn-es2015/)
1. [ES6 - New features Overview & Comparison](http://es6-features.org/)
1. [ES6 Overview in 350 Bullet Points](https://ponyfoo.com/articles/es6)
1. 百度EFE：[使用ES6进行开发的思考](http://efe.baidu.com/blog/es6-develop-overview/)
1. [ES6 Features](http://www.sitepoint.com/20-docs-guides-front-end-developers/)

其他

1. [ES5/ES6 compatibility table](http://kangax.github.io/compat-table/es6/)
1. [ES6 Cheatsheet](http://help.wtf/es6)

## Node.js

### 图书

1. [Node.js In Action](http://book.douban.com/subject/25870705/)
1. [深入浅出Node.js](http://book.douban.com/subject/25768396/)

### 开发实践

1. [NODE_PATH](http://docs.spmjs.org/doc/environment#设置-path-和-node-path)

### 最佳实践

1. [Node.js最佳实践：第一部分](http://wwsun.me/posts/node-best-practices.html)
2. [Node.js最佳实践：第二部分](http://wwsun.github.io/posts/node-best-practices-2.html)

### 风格指南

1. [Node.js风格指南（中文）](https://github.com/wwsun/node-style-guide)

### 常用的Node Web框架

1. 传统的Node框架：[Express](http://expressjs.com/)
2. 下一代Node.js框架：[Koa](http://koajs.com/)
3. 专注于构建可重用的应用逻辑：[Hapi](http://hapijs.com/)
4. [其他Node框架](http://nodeframework.com/index.html#home)

### 常用NPM工具模块

> 感兴趣的可以参考NPM中被[依赖次数最多的模块](https://www.npmjs.com/browse/depended)列表

1. JS工具函数库：[lodash](https://lodash.com/)
1. JavaScript编写同步代码辅助工具包：[async](https://github.com/caolan/async)
1. 精简版HTTP请求客户端：[request](https://github.com/request/request)
1. 配置管理工具包：[nconf](https://github.com/indexzero/nconf)
1. 基于生成器的控制流管理工具包：[co](https://github.com/tj/co)
1. 轻量级模块调试工具：[debug](https://www.npmjs.com/package/debug)
1. 构建请求: [superagent](https://www.npmjs.com/package/superagent)
1. 辅助测试工具：[Sinon.js](http://sinonjs.org/)

### 调试、性能与安全

1. [Node.js的代码调试和性能调优](http://www.barretlee.com/blog/2015/10/07/debug-nodejs-in-command-line/)
1. [Node.js安全清单](http://segmentfault.com/a/1190000003860400)
1. [Debug with Source Maps](http://blog.getsentry.com/2015/10/29/debuggable-javascript-with-source-maps.html)
1. 雅虎: [网站性能优化建议](https://developer.yahoo.com/performance/rules.html)

## 开发工具和库

对于前端开发而言，如果你需要查找一些库或框架来帮你解决问题，
下面两个网站可能会帮助你选择：

1. [JavaScripting.com](http://www.javascripting.com/)
1. [JavaScriptOO](http://www.javascriptoo.com/)

借助上面的两个网站，你能够迅速的找到相关的工具。你还可以参考这篇文章来了解[JavaScript必备的工具和库](http://www.sitepoint.com/essential-tools-libraries-modern-javascript-developers/)。
下面会继续列举一些常用的工具、库、或框架：

1. 版本控制

	- [Git](https://git-scm.com/) | [try git](https://try.github.io/levels/1/challenges/1)
	- [Github](https://github.com/)
	- [SVN](https://subversion.apache.org/)
	- [Read more...](http://www.sitepoint.com/version-control-software-2014-what-options/)

1. 自动构建

	- [Gulp](http://gulpjs.com/) | [Introduction](http://www.sitepoint.com/introduction-gulp-js/)
	- [Grunt](http://gruntjs.com/) | [Introduction](http://www.sitepoint.com/introduction-grunt/)

1. 代码质量

	- [JSLint](http://jslint.com/), by Dogulas Crockford
	- [JSHint](http://jshint.com/), by Anton Kovalyov
	- [ESLint](http://eslint.org/), by Nicholas Zaks
	- [JSCS](http://jscs.info/)
	- [A Comparision of JavaScript Linting Tools](http://www.sitepoint.com/comparison-javascript-linting-tools/)

1. 前端工具

	- 浏览器特性检测工具：[Modernizr](https://modernizr.com/)
	- 高级JavaScript调试工具库：[debug util](https://github.com/amasad/debug_utils)

1. 文档生成
	
	- [JSDoc](http://usejsdoc.org/)
	- [YUIDoc](http://yui.github.io/yuidoc/)
	- [Read more...](http://www.sitepoint.com/products-documentation-good-enough/)

1. 工具库

	- 提供大量工具函数：[Underscore.js](http://underscorejs.org/)
	- 工具函数库：[Lo-Dash](http://lodash.com/)
	- 正则表达式库：[XRegExp](http://xregexp.com/)
	- 图形化解释正则表达式：[RegExper](http://www.sitepoint.com/regexper-regular-expressions-explained/)
	- 代码压缩丑化：[UglifyJS](http://lisperator.net/uglifyjs/) and [YUI Compressor](http://yui.github.io/yuicompressor/)
	- 浮点数工具库：[Accounting.js](http://openexchangerates.github.io/accounting.js/)
	- 日期时间工具库：[Moment.js](http://momentjs.com/) | [Tutorial](http://www.sitepoint.com/managing-dates-times-using-moment-js/)

1. UI框架

	- [Bootstrap - 最常用的UI框架](http://getbootstrap.com/)
	- [Semantic UI - Human-friendly](http://semantic-ui.com/)
	- [Foundation - Most advanced responsive FE framework](http://foundation.zurb.com/)

1. 前端框架

	- [React - UI层库，组件驱动开发](http://facebook.github.io/react/)
	- [AngularJS - MVVM](https://angularjs.org/)
	- [Polymer - web components](https://www.polymer-project.org/1.0/)
	- [Vue.js](http://cn.vuejs.org/)

1. 可视化库

	- [D3.js - Data Driven Documents](http://d3js.org/)
	- [ECharts - 百度可视化工具包](http://echarts.baidu.com/)
	- [HighCharts - 注重交互](http://www.highcharts.com/)
	- [Chart.js - Simple, clean and engaging charts](http://www.chartjs.org/)
	- [Angular Chart - AngularJS指令封装版Chart.js](http://jtblin.github.io/angular-chart.js/)
	- [Epoch - for real-time visualizations](https://fastly.github.io/epoch/)

1. 模块系统和包管理器

	- 模块系统
		- CommonJS (Node, 同步加载)
		- AMD：[RequireJS](http://requirejs.org/)(浏览器，异步加载)
		- [ES6 Module](www.2ality.com/2014/09/es6-modules-final.html)
		- [A primer on module management](http://www.sitepoint.com/understanding-requirejs-for-effective-javascript-module-loading/)
	- 包管理器
		- [npm](https://npmjs.org/)(Node包管理器)
		- [Bower](http://bower.io/)（主要是前端资源包）
		- [Browserify](http://browserify.org/)(将Npm包转为浏览器友好的) | [Intro](http://www.sitepoint.com/getting-started-browserify/)

1. 单元测试

	- [Mocha](http://visionmedia.github.io/mocha/)
	- [Jasmine](http://pivotal.github.io/jasmine/) | [Intro](http://www.sitepoint.com/testing-javascript-jasmine-travis-karma/)
	- [QUnit](https://qunitjs.com/) | [Intro](http://www.sitepoint.com/getting-started-qunit/)
	- Tape
	- Jest - React组件单元测试
	- Karma
	- 跨平台多浏览器测试
		- [BrowserStack](https://www.browserstack.com/)
		- [Sauce Labs](https://saucelabs.com/) | [Guide](http://www.sitepoint.com/testing-in-the-cloud-using-saucelabs/)

1. 代码衡量

	High code coverage means lower chances for your program to contains bugs.

	- [Istanbul](http://gotwarlost.github.io/istanbul/) - 衡量测试覆盖率
	- [Plato](https://github.com/es-analysis/plato) - 可视化代码复杂度
	- [An article on code metrics](http://www.sitepoint.com/code-metrics-and-you/)

1. 实时应用
	
	- [Meteor](https://www.meteor.com/)
	- [SocketStream](http://www.socketstream.org/)
	- [Socket.io](http://socket.io/)
	- [构建基于Node.js的聊天室](http://www.sitepoint.com/build-node-js-powered-chatroom-web-app-getting-started/)

1. 单页应用SAP
	
	- [AngularJS](https://angularjs.org/)
	- [Backbone](http://documentcloud.github.io/backbone/)
	- [Ember](http://emberjs.com/)
	- [React](http://facebook.github.io/react/)
	- [KnockoutJS](http://knockoutjs.com/)
	
1. 函数式JavaScript

	- [UnderscoreJS](http://underscorejs.org/)
	- [Lodash](https://lodash.com/)
	- [An introduction to functional programming in JavaScript](http://www.sitepoint.com/introduction-functional-javascript/)
	
1. 模版引擎

	- [Handlebars](http://handlebarsjs.com/) | [Guide](http://www.sitepoint.com/a-beginners-guide-to-handlebars/)
	- [Mustache](http://mustache.github.io/) | [Guide](http://www.sitepoint.com/creating-html-templates-with-mustachejs/)
	- [Jade](http://jade-lang.com/)

1. 前端资源CDN服务：
	- [BootCDN](http://www.bootcdn.cn/)
	- [360前端资源CDN服务](http://libs.useso.com/)
	- [七牛前端资源CDN服务](http://www.staticfile.org/)

## Future

很遗憾，这里只能列举一些常用的资料，但幸运的是，互联网极大便利了我们获取信息的方式，
下面几个链接或许是你正在寻找的：

1. [Frontend Rescue](https://uptodate.frontendrescue.org/) - 帮助你获取前端资源
1. [JSbooks](http://jsbooks.revolunet.com/) - 帮助你寻找和JS相关的书
1. [Cooper Press 订阅](https://cooperpress.com/)

### Other links

1. [JavaScript Training Sucks](https://medium.com/javascript-scene/javascript-training-sucks-284b53666245#.cbq5ijonh)
1. [The Two Pillars of JavaScript: part one - how to escape the 7th circle of hell](https://medium.com/javascript-scene/the-two-pillars-of-javascript-ee6f3281e7f3#.47bfua546)
