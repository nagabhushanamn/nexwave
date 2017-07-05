

// 1

// function foo(b) {
//   var a = 10;
//   return a + b + 11;
// }

// function bar(x) {
//   var y = 3;
//   return foo(x * y);
// }

// console.log(bar(7));

//-----------------------------------------------

//2

// function foo(){}
// function bar(){foo()}
// function baz(){bar()}
// baz()


//-------------------------------------------------

// function foo(){throw new Error('ooops')}
// function bar(){foo()}
// function baz(){bar()}
// baz()


//----------------------------------------------------

// function foo(){foo()}
// foo();

//-------------------------------------------------------

// function shortRunning(){
//     console.log('short...');
// }

// longRunning();
// shortRunning();

//-----------------------------------------------------


// on event

/*
    <button class="veg"> Veg </button>
    <button class="non-veg"> Non-Veg </button>
*/


console.log('start........');

$.on('.veg','click',function vegHandler(event){
    console.log('handling click event on veg buttons');
})

$.on('.non-veg','click',function nonVegHandler(event){
    console.log('handling click event on nonveg buttons');
})

function longRunning(){
    var i=0;
    while(i<10){
        console.log('long run......');
        i++;
    }
}

console.log('cont..with other work...');
longRunning();

//--------------------------------------------------------



console.log('start...');

setTimeout(function timout(){
    console.log('after timeout...');
},1000);


function longRunning(){
    var i=0;
    while(i<100){
        console.log('long run......');
        i++;
    }
}

console.log('cont..with other work...');
longRunning();