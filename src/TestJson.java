import net.sf.json.JSONObject;
import tools.ConnHelper;
import tools.HttpUtil;
import tools.JsonServer;
import tools.JsonTools;
import tools.Person;

public class TestJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String msg = "";
		JsonServer server = new JsonServer();
		Person person = server.getPerson();
		msg = JsonTools.creatJsonString("Person", person);
		System.out.println(msg);
		JSONObject object = JSONObject.fromObject(msg);
		JSONObject personObject = object.getJSONObject("Person");
		String name = personObject.getString("name");
		String sex = personObject.getString("sex");
		int age = personObject.getInt("age");
		System.out.println("name:"+name+" age: "+age+" sex :"+sex);*/
		ConnHelper connHelper = new ConnHelper();
		HttpUtil httpUtil = new HttpUtil();
		String url = "192.168.1.1";
		String jsonstr = httpUtil.getJson(connHelper.setURL(url));
		System.out.println(jsonstr);
		JSONObject jsonObject = JSONObject.fromObject(jsonstr);
		JSONObject ipObject = jsonObject.getJSONObject("result");
		String area = ipObject.getString("area");
		String location = ipObject.getString("location");
		System.out.println("area: "+area+"\nlocation: "+location);
		
		
		
	}

}
