package com.one.Models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by asus on 10/03/18.
 */

public class Story {


    public int Id,StoryTime,StoryUserId;
    public String StoryTitle,StoryDescription;

    public Story()
    {

    }
    public Story(String jsonHospital)
    {
        try {
            JSONObject s = new JSONObject(jsonHospital);
            this.Id = s.getInt("Id");
            this.StoryTime = s.getInt("StoryTime");
            this.StoryUserId = s.getInt("StoryUserId");
            this.StoryTitle =   s.getString(" StoryTitle");
            this.StoryDescription = s.getString("StoryDescription");


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public JSONObject toJson()
    {
        JSONObject s = new JSONObject();
        try {
            s.put("Id",this.Id);
            s.put("StoryTime",this.StoryTime);
            s.put("StoryUserId",this.StoryUserId);
            s.put("StoryTitle",this.StoryTitle);
            s.put("StoryDescription",this.StoryDescription);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return s;
    }



}
