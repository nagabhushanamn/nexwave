

function getFood():string;
function getFood(pay:number):string;
function getFood(pay:string,n:number):string;

function getFood(prop?:any):string{
    if(typeof prop === "string"){
        return "Biryani"
    }
    else{
        return "No Food"
    }
};
getFood("234234",12);