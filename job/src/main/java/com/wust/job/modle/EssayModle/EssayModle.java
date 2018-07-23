/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: EssayModle
 * Author:   meng
 * Date:     2018/7/17 15:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.modle.EssayModle;

import com.wust.job.entity.Essay;
import com.wust.job.modle.BaseModle;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/17
 * @since 1.0.0
 */
public class EssayModle extends BaseModle {

    public List<Essay> data;

    public EssayModle( ) {

    }


    public EssayModle(int code, String msg, List<Essay> data) {
        super(code, msg);
        this.data = data;
    }

    public EssayModle(int code, String msg, int count, List<Essay> data) {
        super(code, msg, count);
        this.data = data;
    }

    @Override
    public String toString() {
        return "EssayModle{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                '}';
    }
}