

/*


  data-types

  1. simple/primitives==> values

     a. string
     b. number
     c. boolean
     d. undefined
     e. symbol

  2. complex/reference ==> objects


*/

//-----------------------------------------------------


// 1. primitives

//-----------------------------------------------------

// a. String

var name="Nag";
var selection='a';

//-----------------------------------------------------


// b. Number

var count=12;
var cost=12.12;

//-----------------------------------------------------

// c. boolean

var found=true;

// imp-note: 

/*

 falsy values ==> false,0,"",null,undefined,NAN

*/

// ref : https://dorey.github.io/JavaScript-Equality-Table/


//-----------------------------------------------------


// d. undefined


var v;

//-------------------------------------------------------


// Reference Types ==> objects


/*

    How to create objects in .js-lang ?

    syntax

    var ref=new Constructor();


*/


var person=new Object();

/*

 by default , .js objects are extensible & configurable

*/

person.name="Nag";
person.age=33;
person.doWork=function(){
    console.log('work...');
}

delete person.age;


//--------------------------------------------------------

// literal-style objects

//--------------------------------------------------------

// 1. Object

var config=new Object();
config.url="http://";
config.method="GET";
config.success=function(resp){
    //....
}

// or

var newConfig={
    url:"http://",
    method:'GET',
    success:function(resp){

    }
};

//--------------------------------------------------------

// 2. Array


var menu=new Array();
menu[0]="biryani";
menu[1]="fish";
menu.push("egg")


// or

var newMenu=["biryani","fish","egg",1];


//-------------------------------------------------------


// 3. RegExp


var re=new RegExp("\\d{10}");

// or

var newRe=/\d{10}/;


//-------------------------------------------------------


// 4. Function


var add=new Function("n1","n2","var r=n1+n2;return r;");


// or

function newAdd(n1,n2){
    var r=n1+n2;return r;
}
 
newAdd.prop1=12;
newAdd.prop2=13;
newAdd.m=function(){
    //..
} 

//-------------------------------------------------------


// How to acess obj's properties


var person={
    name:"Nag",
    "full-name":"Nag N"
}


person.name="New Nag"; // set
console.log(person.name); // get


console.log(person["full-name"]);



























































