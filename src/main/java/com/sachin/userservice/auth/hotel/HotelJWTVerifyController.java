package com.sachin.userservice.auth.hotel;

import com.sachin.userservice.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/gethotel")
@RequiredArgsConstructor
public class HotelJWTVerifyController {
    @PostMapping
    public ResponseEntity<StandardResponse<String>> verify() {
        return new ResponseEntity<>(new StandardResponse<>(200, "OK", null), HttpStatus.OK);
    }
}
