!function (e) {
    var n = {};

    function t(o) {
        if (n[o]) return n[o].exports;
        var u = n[o] = {i: o, l: !1, exports: {}};
        return e[o].call(u.exports, u, u.exports, t), u.l = !0, u.exports
    }

    t.m = e, t.c = n, t.d = function (e, n, o) {
        t.o(e, n) || Object.defineProperty(e, n, {enumerable: !0, get: o})
    }, t.r = function (e) {
        "undefined" != typeof Symbol && Symbol.toStringTag && Object.defineProperty(e, Symbol.toStringTag, {value: "Module"}), Object.defineProperty(e, "__esModule", {value: !0})
    }, t.t = function (e, n) {
        if (1 & n && (e = t(e)), 8 & n) return e;
        if (4 & n && "object" == typeof e && e && e.__esModule) return e;
        var o = Object.create(null);
        if (t.r(o), Object.defineProperty(o, "default", {
            enumerable: !0,
            value: e
        }), 2 & n && "string" != typeof e) for (var u in e) t.d(o, u, function (n) {
            return e[n]
        }.bind(null, u));
        return o
    }, t.n = function (e) {
        var n = e && e.__esModule ? function () {
            return e.default
        } : function () {
            return e
        };
        return t.d(n, "a", n), n
    }, t.o = function (e, n) {
        return Object.prototype.hasOwnProperty.call(e, n)
    }, t.p = "", t(t.s = 16)
}({
    104: function (e, n) {
    }, 16: function (e, n, t) {
        "use strict";
        t.r(n);
        t(104), t(61), t(47), t(93), t(91);
        layui.use(["form", "layedit", "laydate"], function () {
            layui.form
        }), layui.use("element", function () {
            layui.element.on("nav(demo)", function (e) {
                layer.msg(e.text())
            })
        }), $(".searchShow").click(function () {
            $(".searchInput").addClass("go").animate({width: "220px"}, 300), $(".searchInput").css("display", "block"), $(".searchShow").css("display", "none"), $(".searchsuosou").css("display", "block"), $(document).ready(function () {
                $("searchInput").focus()
            })
        }), $("input").blur(function () {
            $(".searchInput").addClass("go").animate({width: "0"}, 300), $(".searchInput").css("display", "none"), $(".searchShow").css("display", "block"), $(".searchsuosou").css("display", "none")
        }), layui.use("element", function () {
            layui.element.on("nav(demo)", function (e) {
                layer.msg(e.text())
            })
        }), $(function () {
            $(".gwmz").children("li").each(function () {
                $(this).mouseover(function () {
                    $(this).children(".liBg").css({display: "block"})
                }), $(this).mouseout(function () {
                    $(this).children(".liBg").css({display: "none"})
                })
            })
        }), layui.use(["laypage", "layer"], function () {
            var e = layui.laypage;
            layui.layer;
            e.render({
                elem: "demo7",
                count: ["北京", "上海", "广州", "深圳", "杭州", "长沙", "合肥", "宁夏", "成都", "西安", "南昌", "上饶", "沈阳", "济南", "厦门", "福州", "九江", "宜春", "赣州", "宁波", "绍兴", "无锡", "苏州", "徐州", "东莞", "佛山", "中山", "成都", "武汉", "青岛", "天津", "重庆", "南京", "九江", "香港", "澳门", "台北"].length,
                layout: ["count", "prev", "page", "next", "limit", "refresh", "skip"],
                jump: function (e) {
                }
            })
        }), $(function () {
            $.ajax({
                type: "GET",
                url: "http://writing.tudingsoft.com:8081/news/selectNews?type=0",
                succsse: function () {
                },
                error: function () {
                }
            })
        })
    }, 47: function (e, n) {
    }, 61: function (e, n) {
    }, 91: function (e, n) {
    }, 93: function (e, n) {
    }
});