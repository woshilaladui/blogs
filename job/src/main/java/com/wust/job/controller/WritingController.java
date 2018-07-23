/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: WritingController
 * Author:   meng
 * Date:     2018/7/21 9:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.controller;

import com.wust.job.constant.Constant;
import com.wust.job.entity.Essay;
import com.wust.job.entity.Heart;
import com.wust.job.entity.Writing;
import com.wust.job.modle.BaseModle;
import com.wust.job.modle.writing.WritingModle;
import com.wust.job.service.MyWritingService;
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
@RequestMapping("/writing")
public class WritingController {


    @Autowired
    private MyWritingService myWritingService;

    @Autowired
    private HttpServletRequest request;


    @RequestMapping("/getMyWriting")
    @ResponseBody
    public WritingModle getMyWriting(){
        String username = request.getParameter("username");
        return returnWritings(myWritingService.getMyWritingEssay(username));
    }

    @RequestMapping("/getAllWriting")
    @ResponseBody
    public WritingModle getAllWriting() {
        String username = request.getParameter("username");
        String title = request.getParameter("title");


        if(username == null){
            return  returnWritings(myWritingService.getAllWriting());
        }else{//如果输入框为空
            System.out.println("username = "+username);
            System.out.println("title = "+title);
            if(username.length() == 0){
                return returnWritings(myWritingService.getAllWriting());
            }else{//输入框不为空，可能是按照用户名，或者是文章标题来搜索
                List<Writing> writings = myWritingService.getUsersWritingByTitle(title);//按照用户名搜索
                if(writings == null ||writings.size() ==0){//为空的时候说明不是用户名搜索，或者是不存在
                    writings = myWritingService.getMyWritingEssay(username);
                    if(writings !=null){
                        return returnWritings(writings);
                    }else{
                        return null;
                    }
                }else {//不为空说明是为标题
                    return returnWritings(writings);
                }
            }//end else
        }//end if

    }

    @RequestMapping("/deleteOneWriting")
    @ResponseBody
    public BaseModle deleteOneWriting(){

        int titleid = Integer.parseInt(request.getParameter("titleid"));
        if(myWritingService.deleteMyWritingByTitleId(titleid)){
            return new BaseModle(0,"书法删除成功",10);
        }
        return new BaseModle(1,"书法删除失败",0);
    }


    public WritingModle returnWritings(List<Writing> writings) {

        if (writings != null) {
            return new WritingModle(0, "writing sucess", 100, writings);
        }else{
            System.out.println("null");
        }
        return new WritingModle(Constant.ERROR, "writing error", 0, null);
    }


    @RequestMapping("/addWritingPage")
    public String writingPage(){
        return "account/addWriting";
    }

    @RequestMapping("/addWriting")
    @ResponseBody
    public BaseModle addWriting(){

        String title = request.getParameter("title");

        System.out.println("title = "+title);

        Random random = new Random();

        int viewCount = random.nextInt(1000000);
        int remarkCount = random.nextInt(1000000);
        int collectCount = random.nextInt(1000000);
        int titleId =  random.nextInt(1000000);

        if(myWritingService.addWriting(new Writing(
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