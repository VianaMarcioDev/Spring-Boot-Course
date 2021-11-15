package br.com.zup.Spring.Boot.Essentials.Course.error;

public class CustomErrorType {

    private String error;

    public CustomErrorType(String error) {
        this.error = error;
    }

    public CustomErrorType() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
