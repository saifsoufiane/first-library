package com.example.firstlibrary;

import android.content.Context;
import android.widget.Toast;

public class TosasterMEssage {

    public static void messageshow(Context c ,String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
    }
}
