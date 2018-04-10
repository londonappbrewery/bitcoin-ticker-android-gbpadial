package com.londonappbrewery.bitcointicker;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

    private String mValue;

    public static BitcoinDataModel fromJSON(JSONObject jsonObject) {
        BitcoinDataModel bitcoinData = new BitcoinDataModel();
        try {
            bitcoinData.mValue = Double.toString(jsonObject.getDouble("last"));
            return bitcoinData;

        } catch (JSONException e) {
            Log.e("Bitcoin", e.getMessage());
            return null;
        }
    }

    public String getValue() {
        return mValue;
    }
}
