package com.topcontributors;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class JSONStringValidator {

    static Boolean isValid(String test) {
        try {
            new JSONObject(test);
        } catch (JSONException ex) {
            try {
                new JSONArray(test);
            } catch (JSONException ex1) {
                return false;
            }
        }
        return true;
    }
}
