package com.arcesium.archetypewar.service;

import com.arcesium.archetypewar.domain.SomeObject;
import com.arcesium.frames.service.ServiceClass;
import com.arcesium.frames.service.ServiceMethod;

@ServiceClass(docString = "Archetype Server Some Service API \n", contactGroup = "some-dev-group", inputFormat = "json", format = "json")
public interface SomeService {

    @ServiceMethod(docString = "To get some object with given ID")
    SomeObject getSomeObject(int objectId);

    @ServiceMethod(docString = "To process some object")
    void processSomeObject(SomeObject someObject);

}
