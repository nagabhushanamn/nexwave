(function e(t,n,r){function s(o,u){if(!n[o]){if(!t[o]){var a=typeof require=="function"&&require;if(!u&&a)return a(o,!0);if(i)return i(o,!0);var f=new Error("Cannot find module '"+o+"'");throw f.code="MODULE_NOT_FOUND",f}var l=n[o]={exports:{}};t[o][0].call(l.exports,function(e){var n=t[o][1][e];return s(n?n:e)},l,l.exports,e,t,n,r)}return n[o].exports}var i=typeof require=="function"&&require;for(var o=0;o<r.length;o++)s(r[o]);return s})({1:[function(require,module,exports){
// console.log('-app.js-')


// var wissen=wissen||{}

// wissen.mod1.doWork();


//-------------------------------------------------------


// console.log('-app.js-');
// let mod1=require('./pack1');
// mod1.greet('en');
// mod1.greet('es');
// // mod1.sayName();

//-------------------------------------------------------


var wg=require('wissen-greet');
wg.greet('fr')

},{"wissen-greet":2}],2:[function(require,module,exports){


// var o={
//     doWork:function(){
//         console.log('im mod1')
//     }
// }

//----------------------------------------------------

// var wissen = wissen || {};

// (function () {

//     wissen.mod2.doWork();
//     wissen.mod3.doWork();

//     var o = {
//         doWork: function () {
//             console.log('im mod1')
//         }
//     }

//     var i = 100;

//     wissen.mod1 = o; // export

// })();

//------------------------------------------------------


// console.log('-mod1.js-');

let en=require('./mod2');
let es=require('./mod3');
let fr=require('./mod4');

let message="Hello.."

function greet(lang){
    // console.log(message);
    if(lang==='en')en()
    if(lang==="es")es()
    if(lang==="fr")fr()
}
function sayName(){
    console.log('im mod1');
}
// greet();
module.exports={
    greet,
    sayName
}

},{"./mod2":3,"./mod3":4,"./mod4":5}],3:[function(require,module,exports){


// var o={
//     doWork:function(){
//         console.log('im mod2')
//     }
// }

//----------------------------------------------------

// var wissen=wissen||{};

// (function() {

//     var o = {
//         doWork: function () {
//             console.log('im mod2')
//         }
//     }

//     wissen.mod2=o;

// })();

//-------------------------------------------------------


function greet(){
    console.log("Hello...");
}
module.exports=greet;
},{}],4:[function(require,module,exports){


// var o={
//     doWork:function(){
//         console.log('im mod3')
//     }
// }

//----------------------------------------------------
// var wissen=wissen||{};

// (function() {

//     var o = {
//         doWork: function () {
//             console.log('im mod3')
//         }
//     }

//     wissen.mod3=o;

// })();

//----------------------------------------------------


function greet(){
    console.log("Ola.....");
}
module.exports=greet;



},{}],5:[function(require,module,exports){

function greet(){
    console.log("bonjure..");
}
module.exports=greet;
},{}]},{},[1]);
