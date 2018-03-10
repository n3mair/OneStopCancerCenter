package com.one;

import android.content.Context;
import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.one.Models.User;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.entity.StringEntity;

/**
 * Created by asus on 07/03/18.
 */

public class Server {


    Context context;
    public static AsyncHttpClient client = new AsyncHttpClient();

    static final String API_URL = "http://oscc.4dsis.com/api/";



    public Server(Context con)
    {
        context= con;


        client.setConnectTimeout(30000);
        client.setResponseTimeout(30000);
    }

    public void login(String userName, String userPassword,AsyncHttpResponseHandler handler)
    {
        client.get(API_URL+"users/Login?userName="+userName+"&userPassword="+userPassword,handler);

    }

    public void sinUpUser(User user, AsyncHttpResponseHandler handler)
    {
        JSONObject jsonParams = new JSONObject();
        try {
            //jsonParams.put("Id", user.Id);
            jsonParams.put("UserEmail", user.UserEmail);
            jsonParams.put("UserName", user.UserName);
            jsonParams.put("UserType", user.UserType);
            jsonParams.put("UserPassword", user.UserPassword);
            jsonParams.put("UserPhone", user.UserPhone);

            StringEntity entity = new StringEntity(jsonParams.toString(), "UTF-8");
            Log.i(" out ", jsonParams.toString());
            client.post(context, API_URL + "users/PostUser", entity, "application/json", handler);
        }catch (JSONException e)
        {

        }


    }
}
