var koa = require('koa');

var app = koa();

app.keys = ['secret', 'keys'];


// Reference: https://github.com/teamrun/myAnwser-kick-off-koa/blob/master/08-cookie.js
// app.use(function* (){
    
//     // 需要判断路径
//     // 否则会吧favIcon的请求也计算在view页面里
//     if(this.path === '/'){
//         // get 和 set 都要指明option, signed: true
//         // this.cookies.get/set
//         // get到的是string类型的
//         var alreadyViewed = Number(this.cookies.get('view', {signed: true}));
//         if( isNaN(alreadyViewed) ){
//             alreadyViewed = 0;
//         }
//         var viewCountThisTiime = alreadyViewed + 1;
//         this.cookies.set('view', viewCountThisTiime, { signed: true });
//         this.body = viewCountThisTiime + ' views';
//     }
    
// });

// official solution
app.use(function* () {
	var n = ~~this.cookies.get('view', { signed: true}) + 1;
	this.cookies.set('view', n, { signed: true});
	this.body = n + ' views';
});

app.listen(process.argv[2] || 3000);