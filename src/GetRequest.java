import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;


public class GetRequest {

	public static int makeGetRequest(String passedUrl) throws Exception
	{			 	 
		URL url = new URL(passedUrl);
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		int code = connection.getResponseCode();
		return code;
	}
	
	
}
