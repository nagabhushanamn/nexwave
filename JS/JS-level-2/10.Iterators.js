

let idMaker={
    [Symbol.iterator]:function(){
        let id=0;
        return{
            next:function(){
                ++id;
                return {value:id<=10?id:undefined,done:id<=10?false:true}
            }
        }
    }
};

//----------------------------------------------------


// for(let id of idMaker){
//     console.log(id);
// }


// let ids=[...idMaker];

let [id1,id2,id3]=idMaker