



/*

Execution Context ( scope )
//--------------------------

    memory/stack-frame with local-var and given-args
    to execute instructions

    phase-1: creation

        any variable declared with 'var' keyword 
        any-where in context will get hoisted to top with default value 'undefined'

    phase-2: execution

        instruction will get in sequence

    //----------------------------------------------------


    by default, .js-runtime has one global-context & global-object


     global-object

     browser-envi  ==> window
     Node.js       ==> process


    //------------------------------------------------------ 

    best-practice: always declare variable in top.

    //--------------------------------------------------------


    every function invocation also creates new-context 
    which is child of in-which context that func has declared.


*/



// console.log(v);
// var v=12;


//--------------------------------------------------------


// var v=12;

// function f1(){
//     console.log(v)
//     var v=13;
// }

// f1(); // f1-context  ==> global-context


//--------------------------------------------------------



// Quiz

// var v=12;
// function f1(){
//     function f2(){
//         console.log(v);
//     }
//     f2(); // f2-context ==> f1-context
//     var v=13;
// }
// f1(); // f1-context ==> global-context




//-------------------------------------------------------


// problems with 'var' keyword



// prob-1: variables always get hoist

// console.log(i);
// var i=10;

// prob-2 : No Block-scope

// var i=100;
// {
//     var i=200;
// }
// console.log(i);

// prob-3: we can re-declare sample var multiples within same-context
// var i=100;
// var i=200;


//----------------------------------------------------------

// Solutions : Using "let" & "const" keywords ==> from ES6 version

//----------------------------------------------------------

// console.log(v);
// let v=12;


// var i=100;

// {
//     let i=200;
// }

// console.log(i);


// let i=10;
// let i=10;


//----------------------------------------------


// const PI=3.14;


// const person={
//     name:'Nag'
// };






//----------------------------------------------


// var i=13;
// function f1(){
//     function f2(){
//         console.log(i);
//     }
//     f2();
//     let i=12;
// }

// f1();

//-----------------------------------------------

// console.log(drink);
// let drink="tea";




