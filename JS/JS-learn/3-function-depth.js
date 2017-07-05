

/*

    we can create func-obj in 2 ways

    1. function-declaration/Named functions

        ->alwasy get hoist with func-obj
        ->func-obj will get created at context-creation-phase
         

    2. function-expression

         -> func-obj will get created at context-execution phase.


*/

//-------------------------------------------------------

// 1. function-declaration

// console.log(add(12,12))

// function add(n1,n2){
//     return n1+n2;
// }

// console.log(add(12,12))


//-------------------------------------------------------

// 2. function-expression

// console.log(add(12,12)) // Error

// var add=function(n1,n2){
//     return n1+n2;
// } 
// var sum=add;


// console.log(add(12,12))


// let action;

// if(1===2){
//     action=function(){console.log('im Nag')}
// }else{
//     action=function(){console.log('im Yash')}
// }

// action();


//-------------------------------------------------------


// .js is FP


// functions can be assigned to any other variables 

// function sayHello(){
//     console.log("Hello...");
// }

// // sayHello();

// let greet=sayHello;
// greet();

//----------------------------------------------------------


// function as arg


// function greet(f){
//     if(f){
//         f();return;
//     }
//     console.log("Hello..");
// }


// greet();
// greet(function(){console.log("Ola........")})



// // e.g

// let arr=[1,3,5,7,9,2,4,6,8,10];
// arr.sort();
// arr.sort(function(a,b){return a-b;});
// console.log(arr);



//----------------------------------------------------------


// function as return

// function teach(){
//     console.log('im teaching...');
//     let learn=function(){
//         console.log('im learning...');
//     }
//     return learn;
// }

// let learnFunc=teach();
// learnFunc();
// learnFunc();

//----------------------------------------------------------


// function reflect(){
//     console.dir(arguments)
// }

// console.log(reflect(12));

//------------------------------------------------------------


// function getFood(){
//     return "No Food"
// }
// // let getFood=new Function();

// function getFood(pay){
//     if(!pay)return "No Food";
//     return "biryani"
// }
// //getFood=new Function();

// console.log(getFood(100));

//----------------------------------------------------------



// function sum(){
//     let result=0,
//         i=0,
//         len=arguments.length;
//     while(i<len){
//         result+=arguments[i]
//         i++
//     }    
//     return result;
// }


//------------------------------------------------------------

// ES6

//------------------------------------------------------------

// default func params

// function func(a=1,b=2){
    
//     // if(!a)a=1
//     // if(!b)b=2

//     // a=a||1;
//     // b=b||2

//     console.log(a)
//     console.log(b)
// }

// func(undefined,20);



//------------------------------------------------------------



// function rest parameter



// function func(arg1,arg2,...rest){
//     console.log(arg1);
//     console.log(arg2);
//     console.log(Array.isArray(rest));
//     console.log(rest);
// }

// func(1,2,3,4,5,6);


//------------------------------------------------------------





























