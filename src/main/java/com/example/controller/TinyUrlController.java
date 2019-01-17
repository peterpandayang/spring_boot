package com.example.controller;

import com.example.model.ConvertUrlRequest;
import com.example.model.ConvertUrlResponse;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Slf4j
public class TinyUrlController {

    @RequestMapping(value = "/getTinyUrl", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ConvertUrlResponse> convertURL(@RequestBody ConvertUrlRequest request){
        return new ResponseEntity<>(new ConvertUrlResponse(request.getLongUrl()), HttpStatus.OK);
    }

}
