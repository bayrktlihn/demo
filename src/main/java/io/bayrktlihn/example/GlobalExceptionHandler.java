package io.bayrktlihn.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, ?>> handle(Exception e) {

        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("message", e.getMessage());

        return ResponseEntity.ok(objectObjectHashMap);
    }

}
