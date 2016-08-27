package tools;

public class ConnHelper {

	public String setURL(String ip) {
		// TODO Auto-generated constructor stub
		String API_HOST = "http://apis.juhe.cn/ip/ip2addr";
		String APPKEY = "46642e4313f12a32a387731b7a095598";
		StringBuffer sb= new StringBuffer();
		sb = sb.append(API_HOST).append("?ip=").append(ip).append("&key=").append(APPKEY);
		String url = sb.toString();
		return url;
	}
	public static void main(String[] args) {
		ConnHelper connHelper = new ConnHelper();
		connHelper.setURL("124.90.68.194");
		
	}

}
