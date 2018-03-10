package com.one.Models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Nona ^^ on 3/10/2018.
 */

public class specialist {
    int id,SpecialistHospitalId,SpecialistCancerId;
    String SpecialistName,SpecialistMajor,SpecialistEmail ;

    public specialist(){

    }

    public specialist(String jasonSpecialist){

        try {
            JSONObject t = new JSONObject(jasonSpecialist);
            this.id=t.getInt("Id");
            this.SpecialistCancerId= t.getInt("SpecialistCancerId");
            this.SpecialistHospitalId = t.getInt("SpecialistHospitalId");
            this.SpecialistEmail = t.getString("SpecialistEmail");
            this.SpecialistMajor = t.getString("SpecialistMajor");
            this.SpecialistName = t.getString("SpecialistName");

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    public JSONObject toJason(){
        JSONObject t = new JSONObject();
        try {
            t.put("Id",id);
            t.put("SpecialistCancerId",SpecialistCancerId);
            t.put("SpecialistHospitalId",SpecialistHospitalId);
            t.put("SpecialistEmail",SpecialistEmail);
            t.put("SpecialistMajor",SpecialistMajor);
            t.put("SpecialistName",SpecialistName);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return t ;

    }
}
