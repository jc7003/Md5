package com.owen.md5test;

import java.security.MessageDigest;

/**
 * Created by owenchen on 2016/3/1.
 */
public class Md5Encode {

    public String encode(String plaintext){
        String md5 ="";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] barr = md.digest(plaintext.getBytes());  //將 byte 陣列加密
            StringBuffer sb = new StringBuffer();  //將 byte 陣列轉成 16 進制

            for (int i=0; i < barr.length; i++)
                sb.append(byteToHex(barr[i]));

            String hex=sb.toString();
            md5 = hex.toUpperCase(); //一律轉成大寫
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return md5;
    }

    private String byteToHex(byte b) {
        String[] h={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        int i=b;
        if (i < 0)
            i += 256;

        return h[i/16] + h[i%16];
    }
}
