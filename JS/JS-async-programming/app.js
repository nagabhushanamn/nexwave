


// sync func exe..
//---------------------

// function f1(){
//     //...
// }
// function f2(){
//     f1(); // sync ...................
// }

// f2();

//---------------------------------------------


// async func exe..
//---------------------


// function f(){
//     setTimeout(function(){},1000)
// }

//---------------------------------------------


// using promise API

// let swiggy = {
//     getFood() {
//         let promise = new Promise((resolve, reject) => {
//             setTimeout(()=>{
//                 console.log('resolving food promise...')
//                 resolve('Biryani...');
//                 //reject('No Biryani')
//             },5000);

//         });
//         return promise;
//     }
// }

// let bar = {
//     getDrink() {
//         let promise = new Promise((resolve, reject) => {
//             setTimeout(()=>{
//                 console.log('resolving bar promise...')
//                 resolve('Beer');
//                 //reject('No Beer');
//             },1000);

//         });
//         return promise;
//     }
// }


// let person = {
//     doWork() {
//         console.log('person working....');
//         console.log('feels hungry.. request swiggy for food');
//         let promise1 = swiggy.getFood();
//         let promise2 = bar.getDrink();

//         console.log('got promise..defer my food actions to future')
//         Promise.race([promise1,promise2]).then(
//             (items) => {console.log('yummy...' + items) }, 
//             (reason) => { console.log('ooops '+reason)}
//         );

//         console.log('can cont...with other work...completed.');    
//     }
// };

// person.doWork();


//--------------------------------------------------------------

// using RxJS


// create stream

// var Rx = require('rxjs/Rx');

// let stream = 
//             Rx.Observable.of(1, 2, 3)
//             .map(x=>x*x)
//             .filter(x=>x>5) 
// //--------------------------------------

// stream.subscribe(ele => {
//     console.log(ele)
// });

//------------------------------------------------



var Rx = require('rxjs/Rx');

let inputField=document.querySelector('#inp');
let stream=
           Rx.Observable.fromEvent(inputField,"keyup")
           .debounceTime(1000)
           .map(e=>e.target.value)
           .map(v=>v.toUpperCase())
          




stream.subscribe((v)=>{
    console.log(v)
});









