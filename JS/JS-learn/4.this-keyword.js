
/*

    this ==> current context's owner

*/


// why we need 'this' keyword?

// let pName="Global";
let person={
    pName:'Nag',
    sayName:function(){
        let pName="Local";
        console.log("im "+pName);  // context's hierarchy data
        console.log('im '+person.pName); // obj's data
        console.log('im '+this.pName);
    }
};
// person.sayName();

let oldPerson=person;
person={pName:'Ria'}
// oldPerson.sayName();


//-------------------------------------------------------



// function-binding

//-----------------------------------------------------------------------------

// a. static function binding


// let p1={name:'Nag',sayName:function(){console.log('im '+this.name)}}
// let p2={name:'Ria',sayName:function(){console.log('im '+this.name)}}


function sayNameForAll(){
    console.dir(this);
    console.log('im '+this.name);
}

let p1={name:'Nag',sayName:sayNameForAll}
let p2={name:'Ria',sayName:sayNameForAll}


// sayNameForAll(); // im "" // function invocation ( this --> global-obj)
// p1.sayName(); // im Nag   // method invocation   ( this --> invoker-obj)
// p2.sayName(); // im Ria

//-----------------------------------------------------------------------------


// b. dynamic function binding


// out data-objects

let p={name:'Nag'}
let e={name:'Yash'}


// greet lib

let greetLib={
    sayName:function(message,from){
        console.dir(arguments)
        console.log(message+' im '+this.name+" - "+from);
    }
}


//
// greetLib.sayName();

// way-1
// greetLib.sayName.call(p,"Hello","CHN")
// greetLib.sayName.call(e,"Hey","BOM")


// // way-2
// greetLib.sayName.apply(p,["Hello","CHN"])
// greetLib.sayName.apply(e,["Hey","BOM"])


//way-3
let personGreetFunc=greetLib.sayName.bind(p,"Hello","CHN");
personGreetFunc();
// personGreetFunc();

// let empGreetFunc=greetLib.sayName.bind(e);
// empGreetFunc("hey","BLR");
// empGreetFunc("dude","Universe");





//-----------------------------------------------------------------------------


 

let p11=new Person("Nag")
let p12=new Person("Ria")  // constructor invocation ( this ==> new-obj)





//-------------------------------------------------------



/*

 in .js-lang , we can invoke functions in 4 ways

 1. function invocation  ( this ==> global-obj)
 2. method-invocation    ( this ==> invoker)
 3. call/apply/bind invocation ( this => arg-obj)
 4. constructor invocation ( this ==> new-obj)


*/


//-----------------------------------------------------------



































