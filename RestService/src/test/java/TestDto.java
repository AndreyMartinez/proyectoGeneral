
public class TestDto <T>{
private Boolean success;
private String httpResponseCode;
private String error;
private String message;
private T data;
private String fechaActual;
public Boolean getSuccess() {
	return success;
}
public void setSuccess(Boolean success) {
	this.success = success;
}
public String getHttpResponseCode() {
	return httpResponseCode;
}
public void setHttpResponseCode(String httpResponseCode) {
	this.httpResponseCode = httpResponseCode;
}
public String getError() {
	return error;
}
public void setError(String error) {
	this.error = error;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Object getData() {
	return data;
}
public void setData(T data) {
	this.data = data;
}
public String getFechaActual() {
	return fechaActual;
}
public void setFechaActual(String fechaActual) {
	this.fechaActual = fechaActual;
}



}
