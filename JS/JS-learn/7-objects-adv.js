"use strict"

// let person={
//     name:'Nag',
//     age:33
// };

// Object.defineProperty(person,'name',{configurable:false,writable:false,enumerable:false});
// Object.defineProperties

// delete person.name
// person.name="";

// for(let prop in person){
//     console.log(prop);
// }

//---------------------------------------------------------------

// Object.preventExtensions(person);
// Object.seal(person);
// Object.freeze(person);

// person.bla='bla value';
// delete person.name;
// person.age=12;


//----------------------------------------------------------------


// let person={
//     name:'',
//     age:33
// };


// // how to check property exist?

// if("name" in person ){
//     console.log("name peoperty exist");
// }

//-------------------------------------------------------------------



let person={
    // data properties
    _name:'Nag',
    _age:33,

    // accessor properties
    set nam(name){
        console.log('set...')
        if(name)this._name=name
    },

    get nam(){
        console.log('get...')
        return this._name;
    }

};



person.nam="Yash" ; // set
console.log(person.nam); // get



