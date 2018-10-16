package com.esp.order.utils;

import com.esp.order.VO.ResultVO;

/**
 * @Author hekai
 * @Date 2018/10/8 17:56
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
