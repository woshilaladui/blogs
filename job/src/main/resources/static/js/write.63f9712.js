!function(e){var n={};function t(o){if(n[o])return n[o].exports;var r=n[o]={i:o,l:!1,exports:{}};return e[o].call(r.exports,r,r.exports,t),r.l=!0,r.exports}t.m=e,t.c=n,t.d=function(e,n,o){t.o(e,n)||Object.defineProperty(e,n,{enumerable:!0,get:o})},t.r=function(e){"undefined"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},t.t=function(e,n){if(1&n&&(e=t(e)),8&n)return e;if(4&n&&"object"==typeof e&&e&&e.__esModule)return e;var o=Object.create(null);if(t.r(o),Object.defineProperty(o,"default",{enumerable:!0,value:e}),2&n&&"string"!=typeof e)for(var r in e)t.d(o,r,function(n){return e[n]}.bind(null,r));return o},t.n=function(e){var n=e&&e.__esModule?function(){return e.default}:function(){return e};return t.d(n,"a",n),n},t.o=function(e,n){return Object.prototype.hasOwnProperty.call(e,n)},t.p="",t(t.s=4)}({104:function(e,n){},39:function(e,n){},4:function(e,n,t){"use strict";t.r(n);t(104),t(39),t(43),t(93),t(91);setTimeout(()=>{console.log("index")},1e3),$(document).ready(function(){layui.use("element",function(){layui.element.on("nav(demo)",function(e){layer.msg(e.text())})}),layui.use("carousel",function(){layui.carousel.render({elem:"#test1",width:"100%",arrow:"none"})}),$(".searchShow").click(function(){$(".searchInput").animate({width:"220px"},300),$(".searchInput").css("display","block"),$(".searchShow").css("display","none"),$(".searchsuosou").css("display","block"),$(document).ready(function(){$("input").focus()})}),$(".searchInput").blur(function(){$(".searchInput").addClass("go").animate({width:"0"},300),$(".searchInput").css("display","none"),$(".searchShow").css("display","block"),$(".searchsuosou").css("display","none")}),$(window).scroll(function(){$(this).scrollTop()>810?($(".tmHeader").css("display","none"),$(".btHeader").css("display","block")):($(".btHeader").css("display","none"),$(".tmHeader").css("display","block"))}),$(function(){$(".mailbox-l a").click(function(){$(this).parent().parent().parent().siblings().hide(),$(".mailbox").show()}),$(".phone-l a").click(function(){$(this).parent().parent().parent().siblings().hide(),$(".phone-mak").show()}),$(".password-l a").click(function(){$(this).parent().parent().parent().siblings().hide(),$(".password").show()})})})},43:function(e,n){},91:function(e,n){},93:function(e,n){}});