package myservice.dhrutenpatel.example.com.errorutils;

import android.util.Log;

public class ErrorLogs {
    public static void ErrorLog(String errorTag,String errorMessage)
    {
        Log.e(errorTag,"Error message from library  "+errorMessage);


    }
}
