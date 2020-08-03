package usingUniRest;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestHttpRequestExample {
	
	
	public void getRequestExample() throws UnirestException {
		HttpResponse<JsonNode>  jsonResponse=Unirest.get("http://dummy.restapiexample.com/api/v1/employees").asJson();
		
		System.out.println("Status code is : "+ jsonResponse.getStatus());
		System.out.println("Status message is : "+ jsonResponse.getStatusText());
		System.out.println("Response Body : "+ jsonResponse.getBody());
	}
	
	public void postRequestExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse=Unirest.post("http://dummy.restapiexample.com/api/v1/create").
	body("{\"employee_name\":\"sweety\",\"employee_salary\":\"70000\",\"employee_age\":\"24\"}").asJson();
	
	System.out.println("Status code is : "+ jsonResponse.getStatus());
	System.out.println("Status message is : "+ jsonResponse.getStatusText());
	System.out.println("Response Body : "+ jsonResponse.getBody());
	
	}
	
	public void putRequestExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse=Unirest.put("http://dummy.restapiexample.com/api/v1/update/7628").
	body("{\"employee_name\":\"sweety\",\"employee_salary\":\"700000000\",\"employee_age\":\"28\"}").asJson();
	
	System.out.println("Status code is : "+ jsonResponse.getStatus());
	System.out.println("Status message is : "+ jsonResponse.getStatusText());
	System.out.println("Response Body : "+ jsonResponse.getBody());
	
	}
	
	public void deleteRequestExample() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse=Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/7628").
	body("{\"employee_name\":\"sweety\",\"employee_salary\":\"700000000\",\"employee_age\":\"28\"}").asJson();
	
	System.out.println("Status code is : "+ jsonResponse.getStatus());
	System.out.println("Status message is : "+ jsonResponse.getStatusText());
	System.out.println("Response Body : "+ jsonResponse.getBody());
	
	}
	
	

	public static void main(String[] args) throws UnirestException {
		// TODO Auto-generated method stub
		
		UnirestHttpRequestExample requestExample=new UnirestHttpRequestExample();
		//requestExample.getRequestExample();
		//requestExample.postRequestExample();
		//requestExample.putRequestExample();
		requestExample.deleteRequestExample();
		

	}

}
