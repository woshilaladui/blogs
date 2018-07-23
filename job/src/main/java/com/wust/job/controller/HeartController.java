/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HeartController
 * Author:   meng
 * Date:     2018/7/21 9:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.controller;

import com.sun.org.apache.regexp.internal.RE;
import com.wust.job.constant.Constant;
import com.wust.job.entity.Essay;
import com.wust.job.entity.Heart;
import com.wust.job.modle.BaseModle;
import com.wust.job.modle.EssayModle.EssayModle;
import com.wust.job.modle.heart.HeartModle;
import com.wust.job.service.MyHeartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/21
 * @since 1.0.0
 */
@CrossOrigin
@Controller
@RequestMapping("/heart")
public class HeartController {

    @Autowired
    private MyHeartService myHeartService;

    @Autowired
    private HttpServletRequest request;


    @RequestMapping("/getMyHeart")
    @ResponseBody
    public HeartModle getMyHeart(){
        String username = request.getParameter("username");
        return returnHearts(myHeartService.getMyHeart(username));
    }


    @RequestMapping("/getAllHeart")
    @ResponseBody
    public HeartModle getAllHeart() {

        String username = request.getParameter("username");
        String title = request.getParameter("title");

        if(username == null){
            return  returnHearts(myHeartService.getAllHeart());
        }else{//如果输入框为空
            System.out.println("username = "+username);
            System.out.println("title = "+title);
            if(username.length() == 0){
                return returnHearts(myHeartService.getAllHeart());
            }else{//输入框不为空，可能是按照用户名，或者是文章标题来搜索
                List<Heart> hearts = myHeartService.getUsersHeartByTitle(title);//按照用户名搜索
                if(hearts == null ||hearts.size() ==0){//为空的时候说明不是用户名搜索，或者是不存在
                    hearts = myHeartService.getMyHeart(username);
                    if(hearts !=null){
                        return returnHearts(hearts);
                    }else{
                        return null;
                    }
                }else {//不为空说明是为标题
                    return returnHearts(hearts);
                }
            }//end else
        }//end if
    }



    @RequestMapping("/deleteMyHeart")
    @ResponseBody
    public BaseModle deleteMyHeart(){

        int titleid = Integer.parseInt(request.getParameter("titleid"));


        if(myHeartService.deleteMyHeartByTitleId(titleid)){
            return new BaseModle(0,"删除心得成功",100);
        }

        return new BaseModle(1,"删除心得失败",0);
    }




    public HeartModle returnHearts(List<Heart> hearts) {

        if (hearts != null) {
            return new HeartModle(0,"hearts sucess",100,hearts);
        }
        return new HeartModle(Constant.ERROR, "hearts error",0, null);
    }


    @RequestMapping("/addHeartPage")
    public String heartPage(){
        return "account/addHeart";
    }

    @RequestMapping("/addHeart")
    @ResponseBody
    public BaseModle addHeart(){

        String title = request.getParameter("title");

        System.out.println("title = "+title);

        Random random = new Random();

        int viewCount = random.nextInt(1000000);
        int remarkCount = random.nextInt(1000000);
        int collectCount = random.nextInt(1000000);
        int titleId =  random.nextInt(1000000);

        if(myHeartService.addHeart(new Heart(
                0,
                title,
                "admin",
                viewCount,
                remarkCount,
                collectCount,
                titleId,
                new Date()
        ))){

            return new BaseModle(Constant.SUCESS,"添加心得成功",10);

        }

        return new BaseModle(Constant.ERROR,"添加心得失败",0);
    }


}