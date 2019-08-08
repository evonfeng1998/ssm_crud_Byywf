package ywf.crud.bean;

import java.util.HashMap;
import java.util.Map;

/*
* 通用的返回的类
* */
public class Msg {
//状态码
    private  int code;
//提示信息
    private  String meg;

//    用户要返回给浏览器的数据
    private Map<String,Object> extend = new HashMap<String,Object>();

    public static Msg success(){
        Msg result = new Msg();
        result.setCode(100);
        result.setMeg("处理成功");
        return result;
    }
    public static Msg fail(){
        Msg result = new Msg();
        result.setCode(200);
        result.setMeg("处理失败");
        return result;
    }

    public Msg add(String key,Object value){
        this.getExtend().put( key, value);
        return this;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMeg() {
        return meg;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}
