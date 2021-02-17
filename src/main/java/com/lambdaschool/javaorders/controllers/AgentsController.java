package com.lambdaschool.javaorders.controllers;

import com.lambdaschool.javaorders.models.Agents;
import com.lambdaschool.javaorders.services.AgentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agents")
public class AgentsController
{
    @Autowired
    private AgentsService agentsService;

    @GetMapping(value = "/agent/{id}", produces = {"application/json"})
    public ResponseEntity<?> listAgentsById(@PathVariable long id)
    {
        Agents a = agentsService.findAgentsById(id);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }





}
