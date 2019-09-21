package com.arcesium.archetypewar.service

import com.arcesium.archetypewar.domain.SomeKtObject
import com.arcesium.frames.service.ServiceClass
import com.arcesium.frames.service.ServiceMethod

@ServiceClass(docString = "Archetype Server Some Kotlin Service API \n", contactGroup = "some-dev-group", inputFormat = "json", format = "json")
interface SomeKtService {

    @ServiceMethod(docString = "To get some kt object with given ID")
    fun getSomeKtObject(objectId: Int): SomeKtObject

    @ServiceMethod(docString = "To process some kt object")
    fun processSomeKtObject(someObject: SomeKtObject)

}