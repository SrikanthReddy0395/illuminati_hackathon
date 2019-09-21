package com.arcesium.archetypewar.service

import com.arcesium.archetypewar.domain.SomeKtObject
import org.slf4j.LoggerFactory
import java.time.Instant
import java.time.ZonedDateTime
import javax.inject.Named

@Named("SomeKtService")
class SomeKtServiceImpl: SomeKtService {

    private val log = LoggerFactory.getLogger(SomeKtServiceImpl::class.java)

    override fun processSomeKtObject(someObject: SomeKtObject) {
        log.info("Received {} ", someObject)
        val result = someObject.bumpValues()
        log.info("Processed {} ", result)
    }

    override fun getSomeKtObject(objectId: Int): SomeKtObject {
        return SomeKtObject(objectId, "Some String", Instant.now(), ZonedDateTime.now())
    }
}