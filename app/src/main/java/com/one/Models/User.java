package com.one.Models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by norah3mair on 03/03/2018 AD.
 */

public class User
{
    public int Id, UserPassword , UserPhone ;
    public String UserType,UserName,UserEmail ;

    public User()
    {

    }
    public User(String jsonHospital)
    {
        try {
            JSONObject t = new JSONObject(jsonHospital);
            this.Id = t.getInt("Id");
            this.UserPassword = t.getInt("UserPassword");
            this.UserPhone = t.getInt("UserPhone ");
            this.UserType = t.getString("UserType");
            this.UserName = t.getString("UserName");
            this.UserEmail = t.getString("UserEmail");
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public JSONObject toJson()
    {
        JSONObject t = new JSONObject();
        try {
            t.put("Id",this.Id);
            t.put("UserPassword",this.UserPassword);
            t.put("UserPhone" ,this.UserPhone);
            t.put("UserType",this.UserType);
            t.put("UserName",this.UserName);
            t.put("UserEmail",this.UserEmail);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return t;
    }

}
