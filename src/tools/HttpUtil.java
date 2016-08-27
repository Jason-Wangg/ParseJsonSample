package tools;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUtil {

	public HttpUtil() {
		// TODO Auto-generated constructor stub
		
	}
	public static String getJson(String url) {
		try {
			URL url_path = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) 
					url_path.openConnection();
			connection.setConnectTimeout(3000);
			connection.setRequestMethod("GET");
			connection.setDoInput(true);
			//connection.setDoOutput(true);
			connection.setRequestProperty("charset", "utf-8");
			int code = connection.getResponseCode();
			if (code==200) {
				 BufferedReader reader = new BufferedReader
						 (new InputStreamReader(connection.getInputStream(), "utf-8"));
				 String line = "";
				 //OutputStream result = null;
				 String jsonstr = "";
				 while (null != (line= reader.readLine())) {
					 //OutputStreamWriter outputStream = new OutputStreamWriter(result, "utf-8");
					//OutputStreamWriter writer = new OutputStreamWriter(out, charsetName)
					 //jsonstr = outputStream.toString();
					 jsonstr += line;
				}
				 return jsonstr;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	/*private static String changeInputstream(InputStream inputStream) {
		// TODO Auto-generated method stub
		String jsonstring = null;
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		int len = 0;
		byte []data = new byte[1024];
		try {
			while ((len=inputStream.read(data))!= -1) {
				outputStream.write(data, 0, len);
				//System.out.println(inputStream);
				//System.out.println(outputStream);
			}
			jsonstring = outputStream.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return jsonstring;
	}*/

}
