



/*

    how to implement inheritance in .js-lang ?

        -> using 'prototype'

        child-obj  ====> parent-obj( prototype )
        

*/

function Person(name, age) {
    this.name = name;
    this.age = age;
    // this.sayName=function(){
    //     console.log('im '+this.name);
    // }
    // this.sayAge=function(){
    //     console.log('im '+this.age+' old');
    // }
}

Person.prototype.sayName = function () {
    console.log('im ' + this.name);
}
Person.prototype.sayAge = function () {
    console.log('im ' + this.age + ' old');
}

//----------------------------------------------------

// let p1 = new Person("Nag", 33)
// let p2 = new Person("Ria", 2)


// let p11=Object.create(p1);

//------------------------------------------------------




function Employee(name,age,salary){
    Person.call(this,name,age);
    this.salary=salary;
}
Employee.prototype=new Person();
Employee.prototype.saySalary=function(){
    console.log('i get '+this.salary);
}

let emp=new Employee("Nag",30,1000);



//-----------------------------------------------


// Array.prototype.push="";

//-----------------------------------------------


var foodMenu=[];
foodMenu.push("biryani")