package tools;

import net.sf.json.JSONObject;

public class JsonTools {
	public static String creatJsonString(String key, Object value){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put(key, value);
		return jsonObject.toString();
	}

}
