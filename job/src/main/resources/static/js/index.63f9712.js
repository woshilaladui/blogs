$(document).ready(function () {
    // 导航栏
    layui.use('element', function () {
        var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
        //监听导航点击
        element.on('nav(demo)', function (elem) {
            //console.log(elem)
            layer.msg(elem.text());
        });
    });

    // 搜索
    $('.searchShow').click(function () {
        $('.searchInput').animate({
            'width': '220px'
        }, 300);
        $('.searchInput').css('display', 'block');
        $('.searchShow').css('display', 'none');
        $('.searchsuosou').css('display', 'block');
        /*     return false;    */
        $(document).ready(function () {
            $("input").focus();
        });
    });
    $('.searchInput').blur(function () {
        /*  setTimeout(function () {  */
        $('.searchInput').addClass('go').animate({
            'width': '0'
        }, 300);
        $('.searchInput').css('display', 'none');
        $('.searchShow').css('display', 'block');
        $('.searchsuosou').css('display', 'none');
        /*  },1000) */
    });
    /* 导航栏页面滚动 */
    $(window).scroll(function () {
        var scrolls = $(this).scrollTop();
        if (scrolls > 810) {

            $('.tmHeader').css('display', 'none');
            $('.btHeader').css('display', 'block');
        } else {
            $('.btHeader').css('display', 'none');
            $('.tmHeader').css('display', 'block');
        }
    })
})







$('.article').click(function () {
    window.location.href = "./writeArticle.html";
})
$('.calligraphy').click(function () {
    window.location.href = "./writeArticle.html";
})


$(function () {
    // api 地址
    var IndexUrl = 'http://www.dyspace.top/writing/';
    // img
    var IndexImg = 'http://www.dyspace.top/';
    // 文库强推 Api.
    $.ajax({
        type: 'GET',
        url: IndexUrl + '/firstPage/selectWebsiteRecommend',
        success: function (data) {
            var img = '';
            var text = '';
            var u = '';
            var str = '<ul class="content-aRul">';
            for (var i = 0; i < 4; i++) {
                var book = data.data[i];
                if (book.booksId == 1) {
                    img = '<img src="' + IndexImg + book.booksLogo + '" alt="">';
                    text = '<div class="content-aRtext">';
                    u = '<u class="jj">' + book.booksType + '</u></div>';
                } else if (book.booksId !== 1) {
                    img = '';
                    u = '';
                }
                str += '<li class="content-aRlix"><a href="#">' + img + text;
                str += '<span>' + book.booksName + '</span>' + u;
                str += '<p>' + book.booksAuthor + '</p>';
                str += ' </a></li>'
            }
            str += '</ul>';
            $('.content-aRul').html(str);
            var firstLi = $(".content-aRtop .content-aRul li:first-child");
            firstLi.removeClass('content-aRlix');
            firstLi.addClass('content-aRli');

            //内容 B

            for (var i = 0; i < data.data.length; i++) {
                var nrB = data.data[i];

                $('#content-bBg span').html(nrB.booksName);
                $('#content-bBg p').html(nrB.booksType);
                $('#content-bBg u').html(nrB.tdRead + '&nbsp;人阅读&emsp;' + '作者:&nbsp;' + nrB.booksAuthor);
                /* return; */
            }



        },
        error: function () {
            console.log('服务器更新中..');
        }
    })
    // 优秀作文排行 Api
    $.ajax({
        type: 'GET',
        url: IndexUrl + '/CRanking/Ranking',
        success: function (data) {
            // console.log(data);
            var str = '<ul class="content-aRl" id="yxzfph">';
            for (var i = 0; i < 6; i++) {
                var yxzfph = data.data.list[i];
                str += '<li class="content-aRlix"><a href="#"><span>';
                str += yxzfph.tdTitle + '</span><p>' + yxzfph.remark + '</p></a></li>';
            }
            str += '</ul>';
            $('#yxzfph').html(str);
        },
        error: function () {}
    })
    // 老师推荐 api
    $.ajax({
        type: 'GET',
        url: IndexUrl + '/firstPage/selectTeacherRecommend',
        success: function (data) {
            /*         console.log(data); */
            var str = '';
            for (var i = 0; i < 7; i++) {
                var lstj = data.data[i];
                // console.log(lstj);
                str += '<div data-value="' + lstj.booksId + '" class="swiper-slide"><img src="' + IndexImg;
                str += lstj.booksLogo + '" width="100%" height="100%" /></div></div>';
                $('.swiper-wrapper').html(str);
            }
            lbt(data);
            var sstr = '';
            for (var i = 0; i < 4; i++) {
                var lstjBottom = data.data[i];
                /*    console.log(lstjBottom) */
                sstr += '<li class="content-ali"><a href="#"><span>';
                sstr += lstjBottom.booksName + '</span><P>' + lstjBottom.booksSynopsis + ' </P><u>【书籍详情】</u></a></li>';
            }
            $('#lstjsBottom').html(sstr);

        }
    })
    // 新闻
    $.ajax({
        type: 'GET',
        url: IndexUrl + 'news/selectNews',
        data: {
            type: '',
        },
        success: function (news) {
            /*   console.log(news.data.list); */
            var news = news.data.list;
            var newsStr = '';
            for (var i = 0; i < 3; i++) {
                var newList = news[i];
                // 平台动态新闻 0
                if (newList.tdType == 0) {
                    /*         console.log(IndexImg + newList.remark) */
                    //
                    newsStr += '<li><img style="height:181px;border-top-left-radius: 10px;border-top-right-radius: 10px;" src="' + IndexImg + newList.remark + '" alt=""><div class="contentD-text"><span>';
                    newsStr += newList.tdTime + '</span><p>' + newList.tdContent + '</p> </div><a href="./page/news.html">阅读详情>></a></li>';
                    $('#newsContent').html(newsStr);
                }
            }

        }
    })
    // 轮播图
    $.ajax({
        type: 'GET',
        url: IndexUrl + '/advertising/selectAdvertisingByPlace?',
        data: {
            place: 0,
        },
        success: function (lbt) {
            var str = '';
            for (var i = 0; i < lbt.data.length; i++) {
                var lbts = lbt.data[i];
                str += '<div><img src="' + IndexImg + lbts.srcurl + '" alt="" style="width:100%;height:100%;"></div>';
            }
            $('#lbt').html(str);
            //轮播图
            layui.use('carousel', function () {
                var carousel = layui.carousel;
                //建造实例
                carousel.render({
                    elem: '#test1',
                    width: '100%' //设置容器宽度
                        ,
                    arrow: 'none' //始终显示箭头
                    //,anim: 'updown' //切换动画方式
                });
            });
        }
    })
    // 优秀作者
    $.ajax({
        type: 'GET',
        url: IndexUrl + 'firstPage/selectExcellentAuthor',
        success: function (data) {
            // 优秀作者
            var str = '';
            var sex = '';
            console.log(data.data)

            for (var i = 0; i < 5; i++) {
                /*    console.log(data.data[i]); */
                var yxzz = data.data[i];
                console.log(yxzz.tdSex);
                if (yxzz.tdSex !== "男") {
                    sex = ' icon-nv';
                } else if (yxzz.tdSex == "男") {
                    sex = ' icon-nan';
                }
                str += '<li><a href="#"><img src="' + IndexImg + yxzz.tdImageurl + '" alt=""><span>';
                str += yxzz.tdName + '<i class="iconfont ' + sex + '"></i>' + '</span></a></li>';
            }

            $('#content-yxzz').html(str);
        }
    })
    // 搜索功能
    $.ajax({
        type: 'GET',
        url: IndexUrl + '/inquire/selectcomposition',
        success:function (search) {
            console.log(search);    
        }
    })

})


function lbt(data) {
    var certifySwiper = new Swiper('#certify .swiper-container', {
        watchSlidesProgress: true,
        slidesPerView: 'auto',
        centeredSlides: true,
        loop: true,
        loopedSlides: 5,
        autoplay: 10000,
        prevButton: '.swiper-button-prev',
        nextButton: '.swiper-button-next',
        pagination: '.swiper-pagination',
        //paginationClickable :true,
        onProgress: function (swiper, progress) {
            haoleia()
            for (var i = 0; i < swiper.slides.length; i++) {
                var slide = swiper.slides.eq(i);
                var slideProgress = swiper.slides[i].progress;
                var modify = 1;
                if (Math.abs(slideProgress) > 1) {
                    modify = (Math.abs(slideProgress) - 1) * 0.3 + 1;
                }
                var translate = slideProgress * modify * 70 + 'px';
                var scale = 1 - Math.abs(slideProgress) / 5;
                var zIndex = 999 - Math.abs(Math.round(10 * slideProgress));
                slide.transform('translateX(' + translate + ') scale(' + scale + ')');
                slide.css('zIndex', zIndex);
                slide.css('opacity', 1);
                if (Math.abs(slideProgress) > 3) {
                    slide.css('opacity', 0);
                }
            }
        },
        onSetTransition: function (swiper, transition) {
            for (var i = 0; i < swiper.slides.length; i++) {
                var slide = swiper.slides.eq(i)
                slide.transition(transition);
            }

        },
        //处理分页器bug
        onSlideChangeStart: function (swiper) {
            if (swiper.activeIndex == 4) {
                swiper.bullets.eq(9).addClass('swiper-pagination-bullet-active');

            }
        },
        onTouchEnd: function (swiper) {
            haoleia()
        }

    });

    function haoleia() {
        $('.swiper-wrapper').children('.swiper-slide').each(function () {
            /*           console.log(11) */
            // console.log($(this))
            var active = 'swiper-slide swiper-slide-active';
            var activeS = 'swiper-slide swiper-slide-duplicate';
            if ($(this).attr('class') == active) {
                /*    console.log($(this).attr('class')) */
                // console.log($(this).attr('data-value'));
                for (var i = 0; i < data.data.length; i++) {
                    if ($(this).attr('data-value') == data.data[i].booksId) {
                        /*      console.log(data.data) */
                        var str = '<span>' + data.data[i].booksName + '</span><p>' + data.data[i].booksSynopsis;
                        str += '</p><button>书籍详情</button>';
                    }
                }
                $('#akfkoana').html(str);
            }
        })
    }
}