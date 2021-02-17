package com.lambdaschool.javaorders.services;


import com.lambdaschool.javaorders.models.Agents;
import com.lambdaschool.javaorders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "agentsService")
public class AgentsServiceImpl implements AgentsService
{
    @Autowired
    private AgentsRepository agentsrepository;

    @Override
    public Agents findAgentsById(long id)
    {
        return agentsrepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Agent " + id + " Not Found"));
    }
}
