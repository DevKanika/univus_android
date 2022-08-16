package com.example.toastmessage;

import android.content.Context;
import android.widget.Toast;


public class ToastMessage {

        public static void toast(Context c, String message) {
            Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
        }

}