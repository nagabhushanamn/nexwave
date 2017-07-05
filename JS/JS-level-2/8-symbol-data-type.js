



//symbol



// let s1=Symbol.for("key1")
// let s2=Symbol.for("key1")



let emp1 = { name: 'A', [Symbol.for('java')]: 'java,spring,hibernate' }
let emp2 = { name: 'B', [Symbol.for('js')]: 'js,NG' }
let emp3 = { name: 'E' }

if (emp1[Symbol.for('java')]) {
    console.log('he is java employee');
    console.log(emp1[Symbol.for('java')]);
}


