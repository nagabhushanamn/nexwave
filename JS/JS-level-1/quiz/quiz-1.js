


function Person(name){
    this.name=name;
    this.sayName=function(){
        console.log('im '+this.name)
    }
}


new Person("Abc")