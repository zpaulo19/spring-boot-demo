package br.com.example.springbootdemo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Calendar;
import java.util.Date;

@Data
@AllArgsConstructor
public class ApiResponse {
    private Boolean success;
    private String message;
    private Date serveDateTime = Calendar.getInstance().getTime();

    public  ApiResponse(Boolean success, String message){
        this.success = success;
        this.message = message;
    }
}
