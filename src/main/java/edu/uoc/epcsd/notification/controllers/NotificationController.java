package edu.uoc.epcsd.notification.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.uoc.epcsd.notification.pojos.Show;
import edu.uoc.epcsd.notification.pojos.User;
import edu.uoc.epcsd.notification.services.NotificationService;
import edu.uoc.epcsd.notification.services.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


@Log4j2
@RestController
@RequestMapping("/notifications")

public class NotificationController {


    @Autowired
    private NotificationService notificationService;

    @PostMapping(path = "/sendNotification")
    @ResponseStatus(HttpStatus.OK)
    public void sendNotification(@RequestParam Show show){
       notificationService.notifyShowCreation(show);

    }




}
