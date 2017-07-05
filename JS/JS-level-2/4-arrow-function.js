

// syntax


// let getPrice=function(){
//     //..
//     return 100.00;
// }


// let getPrice=()=>{return 100.00};
// let getPrice=()=>100.00
// let getPrice=(count)=>count*100.00
// let getPrice=count=>count*100.00
// let getPrice=(count,gst)=>count*100.00+18
// let getPrice=(count,gst)=>{
//     let cost=count*100;
//     let total=cost+18
//     return total;
// }


//-------------------------------------------------------



// why we need 'arrow function"


// use-1: more readable

// let nums=[1,3,5,7,9,2,4,6,8,10];
// nums.sort(function(a,b){return a-b});
// nums.sort((a,b)=>a-b)

//----------------------------------------------------


/*

    limitations of regular-function(s)

    -> they can bind to any object dynamically..

    advantages of arrow-function

    --> always bound to creator i.e arrow-function context always run by creator


*/

// let trainer = {
//     name: 'Nag',
//     doTeach: function () {
//         console.log(this.name + " teaching .js");

//         // let askQues = function (ques) {
//         //     console.log(this.name + " answering " + ques)
//         // }

//         // or

//         let askQues =  (ques) => {
//             console.log(this.name + " answering " + ques)
//         }

//         console.log("teach end...")
//         return askQues;
//     }
// };


// let askQues=trainer.doTeach();
// askQues("Q1")

// let newTrainer={name:'Praveen'}
// askQues.call(newTrainer,"Q2");




//------------------------------------------------------------



// let invoice={
//     num:123,
//     process:function(){
//         console.log(this.num+" processed");
//     }
// }

// let invoice={
//     num:123,
//     process:()=>{
//         console.log(this.num+" processed");
//     }
// }



let invoice={
    num:123,
    process:function(){
        console.log(this.num+" processed partially");
        return ()=>{
            console.log(this.num+" processed completly");
        }
    }
}


let finishFunc=invoice.process();
finishFunc();










