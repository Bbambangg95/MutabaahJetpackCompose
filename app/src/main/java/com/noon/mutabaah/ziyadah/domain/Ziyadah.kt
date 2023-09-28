package com.noon.mutabaah.ziyadah.domain

import java.util.*

data class Ziyadah(
    var id: UUID = UUID.randomUUID(),
    var juz: Int = 1,
    var page: Int = 1,
    var memorizeValue: String = "",
    var recitationValue: String = "",
    var createdAt: Date = Date(),
    var updatedAt: Date = Date(),
    var studentName: String = ""
)
