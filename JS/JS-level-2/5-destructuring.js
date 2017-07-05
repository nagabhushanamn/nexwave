

// Array destructuring
//--------------------------------

// let salaries=[100,200,300]

// let min=salaries[0];
// let avg=salaries[1];
// let max=salaries[2];


// let [min,avg,max]=salaries;

//------------------------------------

// let salaries=[100,200,300,400]
// let [min]=salaries;

//--------------------------------------

// let salaries=[100,200,300]
// let [min,,max]=salaries;

//----------------------------------------

// let salaries=[100,200]
// let [min,avg,max=500]=salaries;

//-----------------------------------------

// let salaries=[100,200,[300,400]];
// let [min,avg,[max1,max2]]=salaries;

//----------------------------------------


// let salaries=[100,200]

// let min;
// let max;

// [min,max]=salaries;



//---------------------------------------------


// Object destruturing

let person={
    name:'nag',
    age:33
};

// let name=person.name
// let age=person.age


// let {name,age}=person;
// let {name:myName,age:myAge}=person;

let myName;
let myAge;

({name:myName,age:myAge}=person)




















