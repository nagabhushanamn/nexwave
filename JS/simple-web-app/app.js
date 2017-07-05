

// document.addEventListener('DOMContentLoaded', function () {
//     console.log('DOM ready..');
//     // using DOM API

//     let box = document.querySelector('.well');
//     let hideBtn = document.querySelector('.btn-danger');
//     let showBtn = document.querySelector('.btn-primary');


//     hideBtn.addEventListener('click', function (e) {
//         box.style.display = 'none';
//     })

//     showBtn.addEventListener('click', function (e) {
//         box.style.display = '';
//     })

// })

//--------------------------------------------------


$(document).ready(function(){
    let box=$('.well')
    $('.btn-primary').click(function(){
        box.slideDown(2000)
    });
    $('.btn-danger').click(function(){
        box.slideUp(2000)
    });
});









