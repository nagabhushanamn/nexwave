

function func(a,b,c){
    console.log(a);
    console.log(b);
    console.log(c);
}


// func(1,2,3);

let nums=[1,2,3];

// func(nums[0],num[1],nums[2]);
func(...nums);

//-------------------------------------------


let arr1=[1,2,3]
let arr2=[7,8,9]
let name="NAG";

let newArray=[...arr1,5,6,7,...arr2,name];