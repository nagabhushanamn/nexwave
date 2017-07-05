


function sessionStart(){


    function Employee(name){
        this.name=name;
    }

    let e1=new Employee("A")
    let e2=new Employee("B")



    function Trainer(name){
        this.name=name;
        this.doTeach=function(){
            console.log(this.name+" teaching...");
            let self=this;
            let doLearn=function(){
                console.log(this.name+" learning .js from "+self.name);
            }
            return doLearn;    
        }
    }


    let tnr1=new Trainer("Nag");  // constructur-invication
    let tnr2=new Trainer("You");
    let learnFunc=tnr1.doTeach(); // method-invocation
    let learnFunc2=tnr2.doTeach();

    learnFunc.call(e1);  // call/apply/bind invocation
    learnFunc.call(e2);

}

sessionStart(); // function-invocation