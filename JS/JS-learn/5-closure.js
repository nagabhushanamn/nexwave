
/*

A closure is a function having access to the parent scope, 
even after the parent function has closed.

*/


// function teach(sub) {
//     console.log("teaching " + sub);
//     let notes = sub + "-notes";
//     let i=100;
//     function learn() {
//         console.log('leaning with '+notes)
//     }
//     // learn();
//     console.log('teaching ends...');
//     return learn;
// }



// let learnFunc=teach(".js");  // teach-context created & destroyed after func exe

// learnFunc();

//--------------------------------------------------


// why/where we need closures ?

/*

    -> to abstract public behav of any module
    -> while executing func async, if it is closure, can able access parent-scope data

*/

//----------------------------------------------------------

// use-1   e.g counter-module ( using self executable function pattern)


const counter = (function (c) {
    let count = c; // private
    // public behav
    function doCount() {
        count++;
    }
    function getCount() {
        return count;
    }
    return {
        inc: doCount,
        get: getCount
    }
})(100);


//----------------------------------------------------------



// use-2


function Person(name,age,interval){
    this.name=name;
    this.age=age;
    let self=this;
    window.setInterval(function(){
        self.age++;
        console.log(self.name+"-->"+self.age);
    },interval)

}

let p=new Person("Ria",1,1000);
let p2=new Person("Jak",23,5000);