

let name="Nag"
let age=33

let dynamicField="prop"

// Es5
let person1={
    name:name,
    age:age,
    sayName:function(){

    }
}

//es6
let person2={
    name,
    age,
    ["wissen-"+dynamicField]:'value....',
    sayName(){

    },
    [dynamicField](){

    },
    "get Name"(){

    }
}
console.log(person2["wissen-"+dynamicField])
person2["get Name"]()