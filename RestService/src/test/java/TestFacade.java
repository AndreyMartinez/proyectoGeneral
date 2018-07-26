import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class TestFacade {

public static void main (String []args) {
	final String json = "{\n" + 
			"  \"success\": true,\n" + 
			"  \"httpResponseCode\": 200,\n" + 
			"  \"error\": null,\n" + 
			"  \"message\": \"succces\",\n" + 
			"  \"data\": {\n" + 
			"    \"id\": 1,\n" + 
			"    \"version\": \"0.1.0\",\n" + 
			"    \"fechaLanzamiento\": 1528261200000,\n" + 
			"    \"offLine\": false\n" + 
			"  },\n" + 
			"  \"fechaActual\": 1532571839119\n" + 
			"}";
	
	Gson gson = new Gson();
	TestDto<InfoDataDto> response = gson.fromJson(json, new TypeToken<TestDto>(){}.getType());
	InfoDataDto lest = gson.fromJson(gson.toJson(response.getData()), new TypeToken<InfoDataDto>(){}.getType());

	System.out.println(lest.getVersion());
	
	
}



}
