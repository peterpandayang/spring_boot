package com.example.controller;

import com.example.model.ConvertUrlRequest;
import com.example.model.ConvertUrlResponse;
import com.example.service.UrlSearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@Slf4j
public class TinyUrlController {

    private UrlSearchService urlSearchService;

    @Autowired
    public TinyUrlController(UrlSearchService urlSearchService){
        this.urlSearchService = urlSearchService;
    }

    @RequestMapping(value = "/getTinyUrl", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ConvertUrlResponse> convertURL(@RequestBody ConvertUrlRequest request){
        String shortUrl = request.getLongUrl();
        return new ResponseEntity<>(new ConvertUrlResponse(shortUrl, request.getLongUrl()), HttpStatus.OK);
    }

}
