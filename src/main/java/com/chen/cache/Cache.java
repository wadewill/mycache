package com.chen.cache;

import java.util.HashMap;

/**
 * Created by w on 2017/5/10.
 */
public class Cache<K extends Object,V extends Object> extends HashMap<K,V>{

    private int expire;
    private long gmtModify;


    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        this.expire = expire;
    }

    public long getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(long gmtModify) {
        this.gmtModify = gmtModify;
    }


}
