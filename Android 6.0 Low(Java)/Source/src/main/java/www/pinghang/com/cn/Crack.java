package www.pinghang.com.cn;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.lang.String;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class Crack {
    static String toHex(byte[] ary){
        final String hex="0123456789ABCDEF";
        String ret="";
        for(int i=0;i<ary.length;i++){
            ret+=hex.charAt((ary[i]>>4)&0xf);
            ret+=hex.charAt(ary[i]&0xf);
        }
        return ret;
    }

    //salt-->
    public static String  getSalt(){
        return Long.toHexString(5396646208785659850l);
    }

    public static String passwordToHash(String password) {
        if (password == null) {
            return null;
        }
        byte[] hashed = null;
        try {
            byte[] saltedPassword = (password + getSalt()).getBytes();
            byte[] sha1 = MessageDigest.getInstance("SHA-1").digest(saltedPassword);
            byte[] md5  = MessageDigest.getInstance("MD5").digest(saltedPassword);
            return toHex(sha1)+toHex(md5);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        String PasswordkeyHashAndMD5 = "BE6FE050DF8CA9C5F5BE6DB931BF4E16B4C665621972D4257DE1144DBC8DD6FA9E6CED8A";
        String strPinNumber="";
        String hashbuf="";

        //4位 纯数字
        for(int i=0;i<10000;i++)
        {
            strPinNumber=String.valueOf(i);
            if(i<1000)
            {
                if(i%1000<=9)
                    strPinNumber="0"+"0"+"0"+String.valueOf(i);
                else if(i%1000<=99)
                    strPinNumber="0"+"0"+String.valueOf(i);
                else
                    strPinNumber="0"+String.valueOf(i);
            }
            hashbuf = passwordToHash(strPinNumber);
            System.out.println(strPinNumber);
            if(PasswordkeyHashAndMD5.equals(hashbuf))
            {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                System.out.println("                                       !!!Success!!!                                      ");
                System.out.println("Debug info:");
                System.out.println("----------------------------------------------");
                System.out.println("salt:"+getSalt());
                System.out.println("PasswordKeyHash:"+hashbuf);
                System.out.println("----------------------------------------------");
                System.out.println("");
                System.out.println("");
                System.out.println("Password:"+strPinNumber);
                System.out.println("");
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                return;
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //5位 纯数字
        for(int i=0;i<100000;i++)
        {
            strPinNumber=String.valueOf(i);
            if(i<10000)
            {
                if(i%10000<=9)
                    strPinNumber="0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%10000<=99)
                    strPinNumber="0"+"0"+"0"+String.valueOf(i);
                else if(i%10000<=999)
                    strPinNumber="0"+"0"+String.valueOf(i);
                else
                    strPinNumber="0"+String.valueOf(i);
            }
            hashbuf = passwordToHash(strPinNumber);
            System.out.println(strPinNumber);
            if(PasswordkeyHashAndMD5.equals(hashbuf))
            {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                System.out.println("                                       !!!Success!!!                                      ");
                System.out.println("Debug info:");
                System.out.println("----------------------------------------------");
                System.out.println("salt:"+getSalt());
                System.out.println("PasswordKeyHash:"+hashbuf);
                System.out.println("----------------------------------------------");
                System.out.println("");
                System.out.println("");
                System.out.println("Password:"+strPinNumber);
                System.out.println("");
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                return;
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //6位 纯数字
        for(int i=0;i<1000000;i++)
        {
            strPinNumber=String.valueOf(i);
            if(i<100000) // 099999
            {
                if(i%100000<=9)
                    strPinNumber="0"+"0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%100000<=99)
                    strPinNumber="0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%100000<=999)
                    strPinNumber="0"+"0"+"0"+String.valueOf(i);
                else if(i%100000<=9999)
                    strPinNumber="0"+"0"+String.valueOf(i);
                else
                    strPinNumber="0"+String.valueOf(i);
            }
            hashbuf = passwordToHash(strPinNumber);
            System.out.println(strPinNumber);
            if(PasswordkeyHashAndMD5.equals(hashbuf))
            {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                System.out.println("                                       !!!Success!!!                                      ");
                System.out.println("Debug info:");
                System.out.println("----------------------------------------------");
                System.out.println("salt:"+getSalt());
                System.out.println("PasswordKeyHash:"+hashbuf);
                System.out.println("----------------------------------------------");
                System.out.println("");
                System.out.println("");
                System.out.println("Password:"+strPinNumber);
                System.out.println("");
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                return;
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //7位 纯数字
        for(int i=0;i<10000000;i++)
        {
            strPinNumber=String.valueOf(i);
            if(i<1000000) // 099999
            {
                if(i%1000000<=9)
                    strPinNumber="0"+"0"+"0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%1000000<=99)
                    strPinNumber="0"+"0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%1000000<=999)
                    strPinNumber="0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%1000000<=9999)
                    strPinNumber="0"+"0"+"0"+String.valueOf(i);
                else if(i%1000000<=99999)
                    strPinNumber="0"+"0"+String.valueOf(i);
                else
                    strPinNumber="0"+String.valueOf(i);
            }
            hashbuf = passwordToHash(strPinNumber);
            System.out.println(strPinNumber);
            if(PasswordkeyHashAndMD5.equals(hashbuf))
            {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                System.out.println("                                       !!!Success!!!                                      ");
                System.out.println("Debug info:");
                System.out.println("----------------------------------------------");
                System.out.println("salt:"+getSalt());
                System.out.println("PasswordKeyHash:"+hashbuf);
                System.out.println("----------------------------------------------");
                System.out.println("");
                System.out.println("");
                System.out.println("Password:"+strPinNumber);
                System.out.println("");
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                return;
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //8位 纯数字

        for(int i=0;i<100000000;i++){
            strPinNumber=String.valueOf(i);
            if(i<10000000) // 099999
            {
                if(i%10000000<=9)
                    strPinNumber="0"+"0"+"0"+"0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%10000000<=99)
                    strPinNumber="0"+"0"+"0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%10000000<=999)
                    strPinNumber="0"+"0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%10000000<=9999)
                    strPinNumber="0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%10000000<=99999)
                    strPinNumber="0"+"0"+"0"+String.valueOf(i);
                else if(i%10000000<=999999)
                    strPinNumber="0"+"0"+String.valueOf(i);
                else
                    strPinNumber="0"+String.valueOf(i);
            }
            hashbuf = passwordToHash(strPinNumber);
            System.out.println(strPinNumber);
            if(PasswordkeyHashAndMD5.equals(hashbuf))
            {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                System.out.println("                                       !!!Success!!!                                      ");
                System.out.println("Debug info:");
                System.out.println("----------------------------------------------");
                System.out.println("salt:"+getSalt());
                System.out.println("PasswordKeyHash:"+hashbuf);
                System.out.println("----------------------------------------------");
                System.out.println("");
                System.out.println("");
                System.out.println("Password:"+strPinNumber);
                System.out.println("");
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                return;
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //9位 纯数字
        for(int i=0;i<1000000000;i++){
            strPinNumber=String.valueOf(i);
            if(i<100000000) // 099999
            {
                if(i%100000000<=9)
                    strPinNumber="0"+"0"+"0"+"0"+"0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%100000000<=99)
                    strPinNumber="0"+"0"+"0"+"0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%100000000<=999)
                    strPinNumber="0"+"0"+"0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%100000000<=9999)
                    strPinNumber="0"+"0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%100000000<=99999)
                    strPinNumber="0"+"0"+"0"+"0"+String.valueOf(i);
                else if(i%100000000<=999999)
                    strPinNumber="0"+"0"+"0"+String.valueOf(i);
                else if(i%100000000<=9999999)
                    strPinNumber="0"+"0"+String.valueOf(i);
                else
                    strPinNumber="0"+String.valueOf(i);
            }
            hashbuf = passwordToHash(strPinNumber);
            System.out.println(strPinNumber);
            if(PasswordkeyHashAndMD5.equals(hashbuf))
            {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                System.out.println("                                       !!!Success!!!                                      ");
                System.out.println("Debug info:");
                System.out.println("----------------------------------------------");
                System.out.println("salt:"+getSalt());
                System.out.println("PasswordKeyHash:"+hashbuf);
                System.out.println("----------------------------------------------");
                System.out.println("");
                System.out.println("");
                System.out.println("Password:"+strPinNumber);
                System.out.println("");
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                return;
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
