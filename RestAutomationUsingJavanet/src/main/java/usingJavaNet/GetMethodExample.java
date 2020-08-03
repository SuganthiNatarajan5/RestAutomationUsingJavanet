package usingJavaNet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.MalformedURLException;
//import java.net.MalformedURLException;
//import java.net.MalformedURLException;
import java.net.URL;

public class GetMethodExample {

	public void getMethodExample() throws IOException {

		URL url = new URL("http://dummy.restapiexample.com/api/v1/employees");

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("GET");

		connection.connect();

		int statusCode = connection.getResponseCode();
		System.out.println("Status code is" + statusCode);

		String message = connection.getResponseMessage();
		System.out.println("Status message is" + message);

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line = bufferedReader.readLine()) != null) {
			buffer.append(line);

		}
		System.out.println(buffer);
	}

	public void postMethodExample() throws IOException {

		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		String jsonBody = "{\"employee_name\":\"suga\",\"employee_salary\":\"700000\",\"employee_age\":\"20\"}";
		byte[] inputJson = jsonBody.getBytes();
		OutputStream outputStream = connection.getOutputStream();

		outputStream.write(inputJson);

		System.out.println("Response code is :" + connection.getResponseCode());
		System.out.println("Response message is :" + connection.getResponseMessage());

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line = bufferedReader.readLine()) != null) {

			buffer.append(line);
		}

		System.out.println(buffer);
	}

	public void putMethodExample() throws IOException {

		URL url = new URL("http://dummy.restapiexample.com/api/v1/update/1");

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		String jsonBody = "{\"employeename\":\"suganthi\",\"salary\":\"6000000\",\"age\":\"5\"}";
		byte[] inputJson = jsonBody.getBytes();
		OutputStream outputStream = connection.getOutputStream();

		outputStream.write(inputJson);

		System.out.println("Response code is :" + connection.getResponseCode());
		System.out.println("Response message is :" + connection.getResponseMessage());

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line = bufferedReader.readLine()) != null) {

			buffer.append(line);
		}

		System.out.println(buffer);
	}
	
	public void deleteMethodExample() throws IOException {
		URL url = new URL("http://dummy.restapiexample.com/api/v1/delete/1");  

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

	
		System.out.println("Response code is :" + connection.getResponseCode());
		System.out.println("Response message is :" + connection.getResponseMessage());

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line = bufferedReader.readLine()) != null) {

			buffer.append(line);
		}

		System.out.println(buffer);
	}
	

	
	public static void main(String[] args) throws IOException {

		GetMethodExample connectionExample = new GetMethodExample();
		// connectionExample.getMethodExample();
		//connectionExample.postMethodExample();
		//connectionExample.putMethodExample();
		connectionExample.deleteMethodExample();
	}

}
