package com.baizhi.webservice;

import com.baizhi.webservice.WebService;

@javax.jws.WebService
public class WebServiceImpl implements WebService {
    @Override
    public String weather(String city) {
        if("北京".equals(city)){
            return "晴 12-15度";
        }else if("上海".equals(city)){
            return "多云 28度";
        }else{
            return "下雨";
        }
    }
}
