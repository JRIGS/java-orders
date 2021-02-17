package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Agents;

public interface AgentsService
{
    Agents findAgentsById(long id);
}
