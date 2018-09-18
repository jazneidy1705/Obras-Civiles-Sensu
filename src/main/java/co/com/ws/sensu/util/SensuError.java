package co.com.ws.sensu.util;

public class SensuError {
	private String errorMessage;

	public SensuError(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
