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
- JavaScript权威指南
- Eloquent JavaScript
- JavaScript忍者禁术
- You Don't Know JS
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

### JavaScript

1. [日期和时间字符串](https://msdn.microsoft.com/library/ff743760)
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

### ES6

语法转换 ES6 to ES5

1. [Babel](https://babeljs.io/) - 推荐！杀手级特性"human-readable output"
1. [Traceur](https://github.com/google/traceur-compiler)
1. [Babelify](https://github.com/babel/babelify): 将`babel`引入到Gulp, Grunt, npm run等构建过程
1. [A Brief History of ES6 Tooling](https://ponyfoo.com/articles/a-brief-history-of-es6-tooling)

入门

1. [Learn ES2015](https://babeljs.io/docs/learn-es2015/)
1. [ES6 Overview in 350 Bullet Points]()

兼容性

[ES5/ES6 compatibility table](http://kangax.github.io/compat-table/es6/)

## Node.js

### 图书

1. [Node.js In Action](http://book.douban.com/subject/25870705/)
1. [深入浅出Node.js](http://book.douban.com/subject/25768396/)

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

1. JavaScript编写同步代码辅助工具包：[async](https://github.com/caolan/async)
1. 配置管理工具包：[nconf](https://github.com/indexzero/nconf)
1. 基于生成器的控制流管理工具包：[co](https://github.com/tj/co)
1. 模块调试：[debug](https://www.npmjs.com/package/debug)
1. 构建请求: [superagent](https://www.npmjs.com/package/superagent)
1. 辅助测试工具：[Sinon.js](http://sinonjs.org/)

## 开发工具和库

对于前端开发而言，如果你需要查找一些库或框架来帮你解决问题，
下面两个网站可能会帮助你选择：

1. [JavaScripting.com](http://www.javascripting.com/)
1. [JavaScriptOO](http://www.javascriptoo.com/)

借助上面的两个网站，你能够迅速的找到相关的工具。你还可以参考这篇文章来了解[JavaScript必备的工具和库](http://www.sitepoint.com/essential-tools-libraries-modern-javascript-developers/)。
下面会继续列举一些常用的工具、库、或框架：

1. 自动构建

	- [Gulp](http://gulpjs.com/)
	- [Grunt](http://gruntjs.com/)

1. 代码质量

	- [JSLint](http://jslint.com/), by Dogulas Crockford
	- [JSHint](http://jshint.com/), by Anton Kovalyov
	- [ESLint](http://eslint.org/), by Nicholas Zaks
	- [JSCS](http://jscs.info/)

1. 前端工具

	- 浏览器特性检测工具：[Modernizr](https://modernizr.com/)
	- 高级JavaScript调试工具库：[debug util](https://github.com/amasad/debug_utils)

1. 文档生成
	
	- [JSDoc](http://speakingjs.com/es5/ch29.html)

1. 工具库

	- 提供大量工具函数：[Underscore.js](http://underscorejs.org/)
	- 工具函数库：[Lo-Dash](http://lodash.com/)
	- 正则表达式库：[XRegExp](http://xregexp.com/)

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
	- 包管理器
		- [npm](https://npmjs.org/)(Node包管理器)
		- [Bower](http://bower.io/)（主要是前端资源包）
		- [Browserify](http://browserify.org/)(将Npm包转为浏览器友好的)

1. JS单元测试

	- [Mocha](http://visionmedia.github.io/mocha/)
	- [Jasmine](http://pivotal.github.io/jasmine/)
	- QUnit
	- Tape
	- Jest
	- Karma

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