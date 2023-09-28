package com.noon.mutabaah.student.domain

import java.util.*

data class Attendance(
    var id: UUID = UUID.randomUUID(),
    var attendStatus: Boolean = false,
    var timeLabel: String = "",
    var reason: String = "",
    var createdAt: Date = Date(),
    var updatedAt: Date = Date()
)
