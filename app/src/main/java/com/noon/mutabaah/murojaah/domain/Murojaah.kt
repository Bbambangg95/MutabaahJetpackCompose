package com.noon.mutabaah.murojaah.domain

import java.util.*

data class Murojaah(
    var id: UUID = UUID.randomUUID(),
    var category: String = "",
    var key: String = "",
    var value: String = "",
    var createdAt: Date = Date(),
    var updatedAt: Date = Date(),
    var studentName: String = ""
)
