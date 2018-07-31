package controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.omnifaces.cdi.ViewScoped;
import org.primefaces.event.map.MarkerDragEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;


import com.google.gson.Gson;

import com.google.gson.reflect.TypeToken;


import javax.inject.Named;
  

@Named
@ViewScoped
public class mapsController implements Serializable {

	   private MapModel draggableModel;
	     
	    private Marker marker;
	     
	    @PostConstruct
	    public void init() {
	    	
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
			TestDto responsee = gson.fromJson(maps, new TypeToken<TestDto>() {}.getType());
			List<mapsDto> last = gson.fromJson(gson.toJson(responsee.getData()), new TypeToken<List<mapsDto>>() {}.getType());
		for (mapsDto mapsDto : last) {
	    	System.out.println(mapsDto.getLatitud());
			
		}	
	    	
	    	
	        draggableModel = new DefaultMapModel();
	          
	        //Shared coordinates
	        LatLng coord1 = new LatLng(36.879466, 30.667648);
	        LatLng coord2 = new LatLng(36.883707, 30.689216);
	        LatLng coord3 = new LatLng(36.879703, 30.706707);
	        LatLng coord4 = new LatLng(36.885233, 30.702323);
	          
	        //Draggable
	        draggableModel.addOverlay(new Marker(coord1, "Konyaalti"));
	        draggableModel.addOverlay(new Marker(coord2, "Ataturk Parki"));
	        draggableModel.addOverlay(new Marker(coord3, "Karaalioglu Parki"));
	        draggableModel.addOverlay(new Marker(coord4, "Kaleici"));
	          
	        for(Marker premarker : draggableModel.getMarkers()) {
	            premarker.setDraggable(true);
	        }
	    }
	      
	    public MapModel getDraggableModel() {
	        return draggableModel;
	    }
	      
	    public void onMarkerDrag(MarkerDragEvent event) {
	        marker = event.getMarker();
	    }
}
