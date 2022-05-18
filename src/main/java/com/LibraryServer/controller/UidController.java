package com.LibraryServer.controller;

import com.LibraryServer.common.UID;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@JsonAutoDetect
@Controller
public class UidController {
    private final Logger log = LoggerFactory.getLogger("SendApiController");

    @PostMapping("test")
    @ResponseBody
    public UID test(@RequestBody UID uid) throws IOException {
        log.info("List id:"+uid.getId());
        return uid;
    }
}
