package com.arcesium.archetypewar.domain

import java.time.Instant
import java.time.ZonedDateTime

data class SomeKtObject(val someInt: Int, val someString: String, val someTime: Instant, val zonedDateTime: ZonedDateTime) {

    fun bumpValues(): SomeKtObject {
        return SomeKtObject(this.someInt + 20, this.someString + "woohoo",
                this.someTime.plusMillis(20), this.zonedDateTime.plusDays(1))
    }

}
