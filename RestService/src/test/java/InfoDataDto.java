
public class InfoDataDto {
	private Integer id;
	private String version;
	private Integer fechaLanzamientos;
	private Boolean offLine;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

  

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getFechaLanzamientos() {
		return fechaLanzamientos;
	}

	public void setFechaLanzamientos(Integer fechaLanzamientos) {
		this.fechaLanzamientos = fechaLanzamientos;
	}

	public Boolean getOffLine() {
		return offLine;
	}

	public void setOffLine(Boolean offLine) {
		this.offLine = offLine;
	}

}