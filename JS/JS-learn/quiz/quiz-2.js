

let trainer={
    name:'Nag',
    doTeach:function(){
        console.log(this.name +" teaching .js");
        let self=this;
        let doLearn=function(){
            console.log(this.name+" learning .js from "+self.name);
        }
        // doLearn();
        let emp={name:"wissen"}
        doLearn.call(emp);
    }
}

trainer.doTeach();

let newTrainer={name:'Praveen'}
trainer.doTeach.call(newTrainer);