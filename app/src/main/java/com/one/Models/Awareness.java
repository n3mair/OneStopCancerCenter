package com.one.Models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by norah3mair on 03/03/2018 AD.
 */

public class Awareness
{
    public int Id, AwareHosID;

    public String AwareTitle, AwareDiscription, AwareTime;

    public Awareness()
    {

    }
    public Awareness(String jsonAwareness)
    {
        try {
            JSONObject a = new JSONObject(jsonAwareness);
            this.Id = a.getInt("Id");
            this.AwareTime = a.getString("AwareTime");
            this.AwareTitle = a.getString(" AwareTitle");
            this.AwareDiscription = a.getString("AwareDiscription");
            this.AwareHosID = a.getInt("AwareHosID");


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public JSONObject toJson()
    {
        JSONObject a = new JSONObject();
        try {
            a.put("Id",this.Id);
            a.put("AwareTime",this.AwareTime);
            a.put("AwareTitle",this.AwareTitle);
            a.put("AwareDescription",this.AwareDiscription);
            a.put("AwareHosID",this.AwareHosID);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return a;
    }



}
