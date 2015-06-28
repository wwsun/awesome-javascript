# Awesome JavaScript

如果你对JavaScript的理解仅限于DOM操纵，页面动画等等，本列表将为你展现JavaScript更多的功能。本列表是一些优秀的网络资源的汇总，部分资料需要翻墙访问。

## JavaScript

### Reading

1. [Eloquent JavaScript Online Book](http://eloquentjavascript.net/)
2. [JavaScript高级程序设计，第三版](http://book.douban.com/subject/10546125/)
3. [JavaScript秘密花园](http://bonsaiden.github.io/JavaScript-Garden/zh/)
2. [阮一峰： JavaScript 标准参考教程](http://javascript.ruanyifeng.com/)

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
9.[ RequireJS in Node](http://requirejs.org/docs/node.html)

Tutorial

1. [Understanding RequireJS for Effective JavaScript Module Loading](http://www.sitepoint.com/understanding-requirejs-for-effective-javascript-module-loading/)
2. [Writing Modular JavaScript With AMD, CommonJS & ES Harmony](http://addyosmani.com/writing-modular-js/)

## ECMAScript 6

### Reading

1. [阮一峰： ECMAScript 6入门](http://es6.ruanyifeng.com/#docs/intro)

### ES6 Generator

1. Youtube: [ES6 Generator Tutorial](https://www.youtube.com/watch?v=QO07THdLWQo)

## Node.js

### Reading

1. Book: [Node.js In Action](http://www.manning.com/cantelon/)
2. [Node.js概述](http://javascript.ruanyifeng.com/nodejs/basic.html)
3. [Eleoquent JavaScript, chapter 20, Node.js](http://www.manning.com/cantelon/)
4. [七天学会Node.js](http://nqdeng.github.io/7-days-nodejs/?spm=0.0.0.0.VHCNjm)
4. [Node.js Manual & Documentation](https://nodejs.org/api/modules.html)
5. [Node.js Process对象](http://javascript.ruanyifeng.com/nodejs/process.html)
5. [Node编码规范](http://www.ituring.com.cn/article/197990)
6. [ES6 on node.js](http://h3manth.com/new/blog/2013/es6-on-nodejs/)

### Node.js Tutorial

1. [Creating and Publishing Node.js Modules](https://quickleft.com/blog/creating-and-publishing-a-node-js-module/)
2. [Node.js Tutorial Collection](http://docs.nodejitsu.com/)

### Node.js Modules

Module `fs`

1. [fs模块简介](http://javascript.ruanyifeng.com/nodejs/fs.html)
2. [How do I write files in node.js?](http://docs.nodejitsu.com/articles/file-system/how-to-write-files-in-nodejs)
2. [Create Simple Text File in Node.js Using 'fs' Module](http://www.c-sharpcorner.com/UploadFile/dacca2/node-js-in-action-create-simple-text-file-in-node-js-using/)

Module `path`

1. [path模块简介](http://javascript.ruanyifeng.com/nodejs/path.html)


### Koajs

1. [Koajs - 下一代Node.js Web框架](http://koa.rednode.cn/)
2. [Getting Started With Koajs](http://h3manth.com/new/blog/2014/getting-started-with-koajs/)
3. [Koajs开发最佳实践](http://www.html-js.com/article/Koa-small-classroom-Koajs-development-best-practices)
4. [Koajs中间件开发最佳实践和应用架构建议](http://koa.rednode.cn/#guide)


## Tools

### Editor

1. WebStrom
2. Visual Studio Code
3. Visual Studio Community

Tutorial

1. [Hello Visual Studio Code (with Node.js)](https://channel9.msdn.com/Blogs/cloud-with-a-silver-lining/hello-visual-studio-code-nodejs)
2. John Papa: [Debugging with Visual Studio Code](https://channel9.msdn.com/Blogs/cloud-with-a-silver-lining/hello-visual-studio-code-nodejs)

### Git/ Github/ Gitlab

> If you use Github, just use Github for Windows;
> If you use Gitlab in a internal network, you can use TortoiseGit as a GUI tool for git.

1. Youtube: [TortoiseGit Tutorial](www.youtube.com/watch?v=pp2S2lHjzZI)