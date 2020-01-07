package myservice.dhrutenpatel.example.com.mylib;

import android.util.Log;

public class LogDetails {
    public static void printLog(String logTag,String message){
        Log.d(logTag, " "+message);
    }
}
