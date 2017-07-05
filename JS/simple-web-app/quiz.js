
let trainer = {
    doTeach: function () {
        let name="Nag" // move this data to heap
        try {
            console.log(name+ ' teach start...');
            //if(1===1)throw new Error('hate-.js');
            setTimeout(()=>{
                console.log(name+' stating new topic');
                //if(1===2)throw new Error('hate-.js');
            },1000);
            console.log('teach end');
        } catch (e) {
            console.log('i caught ' + e.message);
        }
    }
}

trainer.doTeach();