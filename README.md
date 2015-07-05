# Awesome JavaScript

[JavaScript](http://javascript.crockford.com/zh/javascript.html)是一个仅在一周就被发明出来的小玩意，所以，它有着有多的缺陷，即使是这样，它已经存在了20年，全世界几乎每台电脑都至少装有一个JavaScript解释器，况且今天这个当初的小玩意的目标是编写大型的企业应用。如果你对JavaScript的理解仅限于DOM操纵，页面动画，jQuery等等，本列表将为你展现JavaScript的更多的令人震撼的功能。

这份列表是一些优秀的网络资源的汇总，部分资源可能需要翻墙（[梯子](http://www.jianshu.com/p/3ded38c49de6)）访问。本列表不追求大而全，而追求寻找那些对JavaScript中的某些知识点有着独到见解的网络资源，希望这些资料的汇集能够为您在寻找类似资料的时候带来一点便利。

## JavaScript

### Books

1. [Eloquent JavaScript Online Book](http://eloquentjavascript.net/)
2. [Speaking JavaScript: An In-Depth Guide for Programmers](http://speakingjs.com/)
2. [JavaScript高级程序设计，第三版](http://book.douban.com/subject/10546125/)
3. [JavaScript秘密花园](http://bonsaiden.github.io/JavaScript-Garden/zh/)
4. [JavaScript精粹](https://www.safaribooksonline.com/library/view/javascript-the-good/9780596517748/)
2. [阮一峰： JavaScript 标准参考教程](http://javascript.ruanyifeng.com/)

### Readings

1. [同构JavaScript应用](http://isomorphic.net/)
2. [知乎：大公司是如何开发和部署前端代码的](http://www.zhihu.com/question/20790576/answer/32602154)

### Blogs

1. [@ality - JavaScript and more](http://www.2ality.com/)
2. [Blog: Ariya Hidayat](http://ariya.ofilabs.com/)

### Abstract Syntax Tree

Basic Knowledge

1. 美团：[抽象语法树在JavaScript中的应用](http://tech.meituan.com/abstract-syntax-tree.html)
2. [轻松搞定JavaScript预解析机制](http://www.cnblogs.com/ivangel/p/3694694.html)
2. [JavaScript编译运行原理](http://www.chenjunxyf.me/javascriptjie-xi-yun-xing-ji-zhi/)
3. SlideShare: [JavaScript: Abstract Syntax Tree](http://www.slideshare.net/RReverser/speaker-presentation2)
4. SlideShare: [Esprima, what is that](http://www.slideshare.net/abhijeetkpawar/esprima-what-is-that)

Tools

1. [SpiderMonkey: Reflect.parse](https://developer.mozilla.org/zh-CN/docs/Mozilla/Projects/SpiderMonkey/Parser_API) - Mozilla's Parser API
2. [Esprima: most popular ECMAScript parser in JS](http://esprima.org/index.html)
3. [Acorn](https://github.com/marijnh/acorn) - faster alternative ECMAScript parser in JS
4. [UglifyJS](http://lisperator.net/uglifyjs/ast) - has own parser with custom AST format

> Esprima解析得到的抽象语法树AST遵循SpiderMonkey的[API](https://developer.mozilla.org/zh-CN/docs/Mozilla/Projects/SpiderMonkey/Parser_API)。

Helpers

1. [Esprima Online Parser](http://esprima.org/demo/parse.html)
2. [ESLint](http://eslint.org/) - The pluggable linting utility for JavaScript and JSX
3. [aster](http://asterjs.github.io/aster/) - AST-based code builder

Tutorial

1. [Esprima tutorial](http://sevinf.github.io/blog/2012/09/29/esprima-tutorial/)
2. [Fun with Esprima and Static Analysis](http://tobyho.com/2013/12/02/fun-with-esprima/)
3. [Parsing and modifying JavaScript code with Esprima and Scodegen](http://www.mattzeunert.com/2013/12/30/parsing-and-modifying-Javascript-code-with-esprima-and-escodegen.html)

### Functions

1. [JavaScript Immediately-Invoked Function Expression](http://benalman.com/news/2010/11/immediately-invoked-function-expression/#iife)

### Promise

1. Browser-side: [bluebird, a full featured promise library](https://github.com/petkaantonov/bluebird)
2. Nodejs-side: [co - he ultimate generator based flow-control goodness for nodejs (supports thunks, promises, etc)](https://github.com/tj/co)


### Modular

Reading 

1. [从零开始实现一个JavaScript模块化加载器](http://wwsun.me/posts/creating-javascript-modules-loader.html)
2. [Eloquent JavaScript, chapter 10, Modules](http://eloquentjavascript.net/10_modules.html)
3. [详解JavaScript模块化开发](http://segmentfault.com/a/1190000000733959)
4. [图文：SeaJS与RequireJS最大的区别](http://www.douban.com/note/283566440/)
5. [模块化开发，SeaJS简单总结](http://www.cnblogs.com/Ivangel/p/3824541.html)
4. [Why AMD?](http://requirejs.org/docs/whyamd.html)
6. [百度EFE：玩转AMD](http://efe.baidu.com/blog/dissecting-amd-preface/)
7. [异步模块定义AMD API中文版](https://github.com/amdjs/amdjs-api/wiki/AMD-(%E4%B8%AD%E6%96%87%E7%89%88))
8. [CommonJS规范 中文版](http://javascript.ruanyifeng.com/nodejs/commonjs.html)
9. [ RequireJS in Node](http://requirejs.org/docs/node.html)
11. [前端模块及依赖管理的新选择：Browserify](http://segmentfault.com/a/1190000002941361)
12. [Browserify Handbook](https://github.com/substack/browserify-handbook)
13. [前端工程与模块化框架](http://div.io/topic/439)

### Design Patterns

1. [极客学院：学用JavaScript设计模式](http://wiki.jikexueyuan.com/project/javascript-design-patterns/overwise.html)
2. [什么是掺合模式（Mixin）](http://www.cnblogs.com/snandy/archive/2013/05/24/3086663.html)

Tutorial

1. [Understanding RequireJS for Effective JavaScript Module Loading](http://www.sitepoint.com/understanding-requirejs-for-effective-javascript-module-loading/)
2. [Writing Modular JavaScript With AMD, CommonJS & ES Harmony](http://addyosmani.com/writing-modular-js/)

### ES 5

1. [Object.create()](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/Object/create)
2. [Object.defineProperty](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/Object/defineProperty)
3. [getter](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Functions/get)
4. [setter](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Functions/set)
5. [严格模式](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Strict_mode)
6. [JSON](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/JSON)
7. [Array.prototype.map()](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/Array/map)
8. [Array.prototype.filter()](https://developer.mozilla.org/zh-CN/docs/Web/JavaScript/Reference/Global_Objects/Array/filter)

### React.js

Reading

1. [颠覆式前端UI开发框架：React](http://www.infoq.com/cn/articles/subversion-front-end-ui-development-framework-react)
2. [React: Create maintainable, high-performance UI components](http://www.ibm.com/developerworks/library/wa-react-intro/)
3. [Navigating the React Ecosystem](http://www.toptal.com/react/navigating-the-react-ecosystem)
4. [Flux: An Application Architecture for React](https://facebook.github.io/react/blog/2014/05/06/flux.html)
6. [Smart and Dumb Components](https://medium.com/@dan_abramov/smart-and-dumb-components-7ca2f9a7c7d0)
8. [Container Components](https://medium.com/@learnreact/container-components-c0e67432e005)
9. [React To The Future With Isomorphic Apps](React To The Future With Isomorphic Apps)
10. [React 入门教程](http://hulufei.gitbooks.io/react-tutorial/content/jsx-spread-attributes.html)
11. [Thinking in React](http://hulufei.gitbooks.io/react-tutorial/content/jsx-spread-attributes.html)
12. [An opinionated guide to React.js best practices and conventions](https://web-design-weekly.com/2015/01/29/opinionated-guide-react-js-best-practices-conventions/)
13. [Best practices for building large React applications](http://blog.siftscience.com/blog/2015/best-practices-for-building-large-react-applications)
14. [From AngularJS to React: The Isomorphic Way](http://blog.risingstack.com/from-angularjs-to-react-the-isomorphic-way/)


Libraies

9. [React-Bootstrap: css framework ](http://react-bootstrap.github.io/)
10. [React-Router: routing in react app](http://rackt.github.io/react-router/)
11. [formsy-react: a form input builder and validator for React JS](https://github.com/christianalfoni/formsy-react)

Tutorial

7. [Building The Facebook News Feed With Relay](http://facebook.github.io/react/blog/2015/03/19/building-the-facebook-news-feed-with-relay.html)
2. [React.js Starter Kit](http://facebook.github.io/react/downloads.html)
3. [Flux Quick Start: manage data and state for react app](https://facebook.github.io/flux/docs/overview.html)
2. [Getting started with Facebook's React.js](https://scotch.io/courses/getting-started-with-facebooks-react-js)
3. [React with WebPack - part 1](http://jslog.com/2014/10/02/react-with-webpack-part-1/)
4. [基于ES6，使用React、Webpack、Babel构建模块化JavaScript应用](http://www.csdn.net/article/2015-05-24/2824757-building-modular-javascript-applications-in-es6-with-react-webpack-and-babel)

### Others

1. [跟 Web Components 打个啵](http://segmentfault.com/a/1190000002931974)
2. [Isomorphic JavaScript: The Future of Web Apps](http://nerds.airbnb.com/isomorphic-javascript-future-web-apps/)


## ECMAScript 6

### Reading

1. [Learn ES2015, a detailed overview of ECMASCRIPT 6 features](https://babeljs.io/docs/learn-es2015/)
2. [阮一峰： ECMAScript 6入门](http://es6.ruanyifeng.com/#docs/intro)
2. [Exploring ES6: Upgrade to the next version of JavaScript](http://exploringjs.com/)
3. InfoQ专栏：[深入浅出ES6(更新中)](http://www.infoq.com/cn/es6-in-depth/)
4. Mozilla: [ES6 in Depth](https://hacks.mozilla.org/category/es6-in-depth/https:/hacks.mozilla.org/category/es6-in-depth/)


### Speech

1. Youtube: [John Paul - ES6 Right Now](https://www.youtube.com/watch?v=rwm5JLqCpdk)
2. Youtube: [PeterHallam & AlexRussell: Traceur: JS to JS compiler](https://www.youtube.com/watch?feature=player_detailpage&v=ntDZa7ekFEA)

### Tutorial

1. [Using the ES6 transpiler Babel on Node.js](http://www.2ality.com/2015/03/babel-on-node.html)
2. [Traceur, Gulp, Browserify and ES6](http://www.mattgreer.org/articles/traceur-gulp-browserify-es6/)

### Libraries

1. Github: [es6-shim, ECMAScript 6 (Harmony) compatibility shims for legacy JavaScript engines](https://github.com/paulmillr/es6-shim/)
2. [Babel](https://babeljs.io/) is a JavaScript compiler.
3. Github: [Traceur, a JavaScript.next-to-JavaScript-of-today compiler](https://github.com/google/traceur-compiler)
4. [Traceur REPL](https://google.github.io/traceur-compiler/demo/repl.html)
5. [Babel REPL](http://babeljs.io/repl/)
4. Github: [grunt-traceur](https://github.com/aaronfrost/grunt-traceur)
5. Github: [gulp-traceur](https://github.com/sindresorhus/gulp-traceur)
6. Github: [broccoli-traceur](https://github.com/sindresorhus/broccoli-traceur)
7. Github: [es6ify](https://github.com/thlorenz/es6ify)

### Questions

1. StackoverFlow: [Differences between Babel and Traceur](http://stackoverflow.com/questions/28447132/should-i-use-babel-or-google-traceur-to-compile-my-es6-code)

### ES6 Iterators/Generator

1. [Iterators gonna iterate](http://www.sitepoint.com/ecmascript-2015-generators-and-iterators/)
2. Youtube: [ES6 Generator Tutorial](https://www.youtube.com/watch?v=QO07THdLWQo)
2. [The Basics Of ES6 Generators](http://davidwalsh.name/es6-generators)
3. [学习ES6生成器](http://www.toobug.net/article/learning_es6_generator.html)
4. Workshop: [Learn Generators](https://github.com/isRuslan/learn-generators)
5. ECMAScript 2015: [Generators and Iterators](http://www.sitepoint.com/ecmascript-2015-generators-and-iterators/)

### ES6 Promise

1. [谈谈ES6的Promise对象](http://segmentfault.com/a/1190000002928371)
2. [异步流程控制：7 行代码学会 co 模块](http://segmentfault.com/a/1190000002732081)

## Node.js

### Reading

1. Book: [Node.js In Action](http://www.manning.com/cantelon/)
2. [Node.js概述](http://javascript.ruanyifeng.com/nodejs/basic.html)
3. [List: Awesome nodejs](https://github.com/vndmtrx/awesome-nodejs)
3. [Eleoquent JavaScript, chapter 20, Node.js](http://www.manning.com/cantelon/)
4. [七天学会Node.js](http://nqdeng.github.io/7-days-nodejs/?spm=0.0.0.0.VHCNjm)
4. [Node.js Manual & Documentation](https://nodejs.org/api/modules.html)
5. [Node.js Process对象](http://javascript.ruanyifeng.com/nodejs/process.html)
5. [Node编码规范](http://www.ituring.com.cn/article/197990)
6. [ES6 on node.js](http://h3manth.com/new/blog/2013/es6-on-nodejs/)
7. [美团酒店Node全栈开发实践](http://tech.meituan.com/node-fullstack-development-practice.html)

### Node.js Tutorial

1. [Creating and Publishing Node.js Modules](https://quickleft.com/blog/creating-and-publishing-a-node-js-module/)
2. [Node.js Tutorial Collection](http://docs.nodejitsu.com/)
3. [NodeSchool](http://nodeschool.io/)

### Node.js Modules

Module `fs`

1. [fs模块简介](http://javascript.ruanyifeng.com/nodejs/fs.html)
2. [How do I write files in node.js?](http://docs.nodejitsu.com/articles/file-system/how-to-write-files-in-nodejs)
2. [Create Simple Text File in Node.js Using 'fs' Module](http://www.c-sharpcorner.com/UploadFile/dacca2/node-js-in-action-create-simple-text-file-in-node-js-using/)
3. [Making directory along with missing parents in Node.js](http://lmws.net/making-directory-along-with-missing-parents-in-node-js)

Module `path`

1. [path模块简介](http://javascript.ruanyifeng.com/nodejs/path.html)


### Koajs

1. [Koajs - 下一代Node.js Web框架](http://koa.rednode.cn/)
2. [Koa中文文档](https://github.com/turingou/koa-guide)
2. PPT: [Co and Koa Talk](http://deadhorse.me/co-and-koa-talk/)
2. [Getting Started With Koajs](http://h3manth.com/new/blog/2014/getting-started-with-koajs/)
3. [Koajs开发最佳实践](http://www.html-js.com/article/Koa-small-classroom-Koajs-development-best-practices)
4. [Koajs中间件开发最佳实践和应用架构建议](http://koa.rednode.cn/#guide)
5. [Why you should and shouln't use Koa](http://www.jongleberry.com/why-you-should-and-shouldnt-use-koa.html)
6. [Kick-Off-Koa](https://github.com/koajs/kick-off-koa) - An intro to koa via a set of self-guided workshops
7. [Workshop](https://github.com/koajs/workshop) - A workshop to learn the the basics of koa, Express's spiritual successor
8. [Koajs quick start guide](http://knowthen.com/episode-3-koajs-quickstart-guide/)

## Template Language

### Nunjucks

1. [Nunjucks 快速上手](http://mozilla.github.io/nunjucks/cn/getting-started.html)
2. doc: [Nunjucks 可用模版列表](http://mozilla.github.io/nunjucks/cn/templating.html)

### Jade

1. Jade - a Node Template Engine, [Language Reference](http://jade-lang.com/reference/)
2. [Jade Syntax Documentation](http://naltatis.github.io/jade-syntax-docs/)

## Tools

### Editor

1. WebStrom
2. Visual Studio Code
3. Visual Studio Community

Tutorial

1. [Hello Visual Studio Code (with Node.js)](https://channel9.msdn.com/Blogs/cloud-with-a-silver-lining/hello-visual-studio-code-nodejs)
2. John Papa: [Debugging with Visual Studio Code](https://channel9.msdn.com/Blogs/cloud-with-a-silver-lining/hello-visual-studio-code-nodejs)

### Build

Build Tools

1. [Grunt](http://gruntjs.com/)
2. [Gulp, the streaming building system](http://gulpjs.com/)
3. [Browserify](http://browserify.org/)
4. [WebPack](http://webpack.github.io)

Reading

1. [The State of JS Build Tools 2015](http://www.walkercoderanger.com/blog/2015/06/state-of-js-build-tools-2015)
2. 腾讯：[Browserify运行原理分析](http://www.alloyteam.com/2014/10/browserify-yun-xing-yuan-li-fen-xi/)
2. [Getting started with webpack](http://webpack.github.io/docs/tutorials/getting-started/)
3. [WebPack怎么用](http://segmentfault.com/a/1190000002552008)
4. github: [webpack-howto: a simple cookbook](https://github.com/petehunt/webpack-howto)

### Git/ Github/ Gitlab

> If you use Github, just use Github for Windows;
> If you use Gitlab in a internal network, you can use TortoiseGit as a GUI tool for git.

1. Youtube: [TortoiseGit Tutorial](www.youtube.com/watch?v=pp2S2lHjzZI)