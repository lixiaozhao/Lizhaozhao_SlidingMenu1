package utils;

import com.google.gson.Gson;

import beans.Bean;

/**
 * 类的用途：
 * 时间:  2017/4/15  15:34
 * 姓名:  李照照
 */
public class GsonUtils {
    public static Bean changeChar(String str){
        Gson gson = new Gson();
        Bean bean1 = gson.fromJson(str, Bean.class);
        return bean1;
    }
}
