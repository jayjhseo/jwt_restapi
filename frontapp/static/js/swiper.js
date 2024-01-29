// 스와이퍼 옵션
var swiper = new Swiper(".swiper-100", {
    loop: true,
    pagination: {
        el: ".swiper-pagination",
        clickable: true,
    },
    navigation: {
        nextEl: ".swiper-button-next",
        prevEl: ".swiper-button-prev",
    },
    slidesPerView: 3, 
    spaceBetween: 30, 
    slidesPerGroup: 3, 
    effect: "fade", 
    direction: "vertical", 
    autoplay : {
        delay : 5000,
        disableOnInteraction : false,
        stopOnLastSlide : true
    },
    centeredSlides: true,
    speed : 4000,
    breakpoints: {
        360: {
            slidesPerView: 1,  
            spaceBetween: 0,
        },
        767: {
            slidesPerView: 2,  
            spaceBetween: 40,
        },
        1023: {
            slidesPerView: 3,
            spaceBetween: 50,
        },
    },
});

var swiper = new Swiper(".search-swiper", {
    direction: "vertical",
    loop: true,
    autoplay : {
        delay : 3000,
        disableOnInteraction : false,
        stopOnLastSlide : true
    },
});

var swiper = new Swiper(".main-swiper", {
    loop: true,
    pagination: {
        el: ".swiper-pagination",
        clickable: true,
    },
    navigation: {
        nextEl: ".swiper-button-next",
        prevEl: ".swiper-button-prev",
    },
    slidesPerView: 2,
    spaceBetween: 20,
    autoplay : {
        delay : 4000,
        disableOnInteraction : false,
        stopOnLastSlide : true
    },
    centeredSlides: true,
});

var swiper = new Swiper(".product-detail-swiper", {
    spaceBetween: 0,
    slidesPerView: 1,
    loop: true,
    pagination: {
        el: ".swiper-pagination",
        clickable: true,
    },
    autoplay : {
        delay : 4000,
        disableOnInteraction : false,
        stopOnLastSlide : true
    },
});

var swiper = new Swiper(".swiper-1", {
    spaceBetween: 20,
    slidesPerView: 5,
    navigation: {
        nextEl: ".swiper-button-next-1",
        prevEl: ".swiper-button-prev-1",
    },
});

var swiper = new Swiper(".swiper-2", {
    spaceBetween: 20,
    slidesPerView: 5,
    navigation: {
        nextEl: ".swiper-button-next-2",
        prevEl: ".swiper-button-prev-2",
    },
});