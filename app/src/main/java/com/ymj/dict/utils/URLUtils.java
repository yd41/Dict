package com.ymj.dict.utils;

public class URLUtils {

    public static String pinyinurl = "http://v.juhe.cn/xhzd/querypy?key=";

    public static String bushourul = "http://v.juhe.cn/xhzd/querybs?key=";


    public static final String DICTKEY = "";



    public static String wordurl = "http://v.juhe.cn/xhzd/query?key=";

    public static final String CHENGYUKEY = "";


    public static String chengyuurl = "http://v.juhe.cn/chengyu/query?key=";

    public static String getChengyuurl(String word){
        String url = chengyuurl+CHENGYUKEY+"&word="+word;
        return url;
    }
    public static String getWordurl(String word){
        String url = wordurl+DICTKEY+"&word="+word;
        return url;
    }

    public static String getPinyinurl(String word,int page,int pagesize){
        String url = pinyinurl+DICTKEY+"&word="+word+"&page="+page+"&pagesize="+pagesize;
        return url;
    }

    public static String getBushouurl(String bs,int page,int pagesize){
        String url = bushourul+DICTKEY+"&word="+bs+"&page="+page+"&pagesize="+pagesize;
        return url;
    }
}
