# Abstract Syntax Tree

Basic Knowledge

1. 美团：[抽象语法树在JavaScript中的应用](http://tech.meituan.com/abstract-syntax-tree.html)
2. [轻松搞定JavaScript预解析机制](http://www.cnblogs.com/ivangel/p/3694694.html)
2. [JavaScript编译运行原理](http://www.chenjunxyf.me/javascriptjie-xi-yun-xing-ji-zhi/)
3. PPT： [Building JavaScript Tools](http://gregfranko.com/building-javascript-tools-talk)
3. SlideShare: [JavaScript: Abstract Syntax Tree](http://www.slideshare.net/RReverser/speaker-presentation2)
4. SlideShare: [Esprima, what is that](http://www.slideshare.net/abhijeetkpawar/esprima-what-is-that)

Tools

1. [SpiderMonkey: Reflect.parse](https://developer.mozilla.org/zh-CN/docs/Mozilla/Projects/SpiderMonkey/Parser_API) - Mozilla's Parser API
2. [Esprima: most popular ECMAScript parser in JS](http://esprima.org/index.html)
3. [Acorn](https://github.com/marijnh/acorn) - faster alternative ECMAScript parser in JS
4. [UglifyJS](http://lisperator.net/uglifyjs/ast) - has own parser with custom AST format
5. [Estraverse](https://github.com/estools/estraverse) - taraverse and update the AST
6. [Escodegen](https://github.com/estools/escodegen) - generates code from an AST

> Esprima解析得到的抽象语法树AST遵循SpiderMonkey的[API](https://developer.mozilla.org/zh-CN/docs/Mozilla/Projects/SpiderMonkey/Parser_API)。

Helpers

1. [Esprima Online Parser](http://esprima.org/demo/parse.html)
2. [ESLint](http://eslint.org/) - The pluggable linting utility for JavaScript and JSX
3. [aster](http://asterjs.github.io/aster/) - AST-based code builder

Tutorial

1. [Esprima tutorial](http://sevinf.github.io/blog/2012/09/29/esprima-tutorial/)
2. [Fun with Esprima and Static Analysis](http://tobyho.com/2013/12/02/fun-with-esprima/)
3. [Parsing and modifying JavaScript code with Esprima and Scodegen](http://www.mattzeunert.com/2013/12/30/parsing-and-modifying-Javascript-code-with-esprima-and-escodegen.html)