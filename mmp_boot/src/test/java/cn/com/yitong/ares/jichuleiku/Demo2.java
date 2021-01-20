package cn.com.yitong.ares.jichuleiku;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        String str = "2213231213231";
        byte[] bytes = str.getBytes();
        parseTLVData(bytes);
    }

    /** 拆分55域 */
    public static JSONObject parseTLVData(byte[] bytes) {
        JSONObject jo = new JSONObject();

        byte tag1;
        byte tag2;
        int len;
        String tag;
        byte[] content;
        int ret;
        for (int i = 0; i < bytes.length; ) {
            tag1 = bytes[i++];
            ret = tag1 & 0x0f;
            if (tag1 == 0x4f) {
                tag = toHex1(tag1);
            } else if (ret == 0x0f) {
                tag2 = bytes[i++];
                tag = toHex1(tag1) + toHex1(tag2);
            } else {
                tag = toHex1(tag1);
            }
            len = bytes[i++];
            System.out.println(len);
            content = new byte[len];
            System.out.println(Arrays.toString(content));
            System.out.println(content.length);
            System.out.println(i);
            System.arraycopy(bytes, i, content, 0, len);
            try {
                jo.put("Z" + tag, bytesToHexString(content));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            i += len;
        }
        return jo;
    }

    public static String toHex1(byte buf) {
        String str;
        str = Integer.toHexString(buf & 0xff);
        if (str.length() == 1) str = "0" + str;
        return str;
    }

    public static String bytesToHexString(byte[] bArr) {
        StringBuffer sb = new StringBuffer(bArr.length);
        String sTmp;

        for (int i = 0; i < bArr.length; i++) {
            sTmp = Integer.toHexString(0xFF & bArr[i]);
            if (sTmp.length() < 2) sb.append(0);
            sb.append(sTmp.toUpperCase());
        }

        return sb.toString();
    }
}
