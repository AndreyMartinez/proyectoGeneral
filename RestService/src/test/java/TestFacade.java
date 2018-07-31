
import java.util.List;

import com.google.gson.Gson;

import com.google.gson.reflect.TypeToken;

public class TestFacade {

	public static void main(String[] args) {
		final String json = "{\n" + "  \"success\": true,\n" + "  \"httpResponseCode\": 200,\n" + "  \"error\": null,\n"
				+ "  \"message\": \"succces\",\n" + "  \"data\": {\n" + "    \"id\": 1,\n"
				+ "    \"version\": \"0.1.0\",\n" + "    \"fechaLanzamiento\": 1528261200000,\n"
				+ "    \"offLine\": false\n" + "  },\n" + "  \"fechaActual\": 1532571839119\n" + "}";
		
		final String  maps= "{\n" + 
				"  \"success\": true,\n" + 
				"  \"httpResponseCode\": 200,\n" + 
				"  \"message\": \"succces\",\n" + 
				"  \"data\": [\n" + 
				"    {\n" + 
				"      \"nombreSede\": \"Clinica De Marly\",\n" + 
				"      \"razonSocialProveedor\": \"Clinica De Marly S A\",\n" + 
				"      \"idSucursalPositiva\": 382,\n" + 
				"      \"direccion\": \"Calle 50 #9-67\",\n" + 
				"      \"telefono\": \"03436600\",\n" + 
				"      \"latitud\": 4.6370378,\n" + 
				"      \"longitud\": -74.065186,\n" + 
				"      \"distancia\": 3.550244,\n" + 
				"      \"horarioAtencion\": \"\"\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"nombreSede\": \"Fundacion Abood Shaio\",\n" + 
				"      \"razonSocialProveedor\": \"Fundacion Abood Shaio\",\n" + 
				"      \"idSucursalPositiva\": 383,\n" + 
				"      \"direccion\": \"DIAG 115 A # 70 C 75\",\n" + 
				"      \"telefono\": \"02714930-5938210\",\n" + 
				"      \"latitud\": 4.672562,\n" + 
				"      \"longitud\": -74.08943,\n" + 
				"      \"distancia\": 7.0405025,\n" + 
				"      \"horarioAtencion\": \"\"\n" + 
				"    },\n" + 
				"    {\n" + 
				"      \"nombreSede\": \"Clinica Los Nogales Sas\",\n" + 
				"      \"razonSocialProveedor\": \"Clinica Los Nogales Sas\",\n" + 
				"      \"idSucursalPositiva\": 15004926,\n" + 
				"      \"direccion\": \"calle 95 N 23  61\",\n" + 
				"      \"telefono\": \"912574474\",\n" + 
				"      \"latitud\": 4.6832633,\n" + 
				"      \"longitud\": -74.05733,\n" + 
				"      \"distancia\": 8.61502,\n" + 
				"      \"horarioAtencion\": \"\"\n" + 
				"    }\n" + 
				"  ],\n" + 
				"  \"fechaActual\": \"1532571839119\"\n" + 
				"}"; 

		Gson gson = new Gson();
		TestDto response = gson.fromJson(json, new TypeToken<TestDto>() {
		}.getType());
	InfoDataDto lest = gson.fromJson(gson.toJson(response.getData()), new TypeToken<InfoDataDto>() {
		}.getType()); 
	System.out.println(lest.getVersion());
		
		TestDto responsee = gson.fromJson(maps, new TypeToken<TestDto>() {}.getType());
		List<mapsDto> last = gson.fromJson(gson.toJson(responsee.getData()), new TypeToken<List<mapsDto>>() {}.getType());
	for (mapsDto mapsDto : last) {
    	System.out.println(mapsDto.getLatitud());
		
	}		

	}

}
