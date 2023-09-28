package com.noon.mutabaah.student.domain

import java.util.*

data class Student(
    var id: UUID = UUID.randomUUID(),
    var name: String = "",
    var birthDate: Date = Date(),
    var startProgram: Date = Date(),
    var address: String = "",
    var gender: Int = 0,
    var createdAt: Date = Date(),
    var updatedAt: Date = Date()

//    var completedZiyadah: [CompletedZiyadah] = []
//    var studentPreference: StudentPreference?
//    var attendanceData: [Attendance] = []
//    var ziyadahData: [Ziyadah] = []
//    var murojaahData: [Murojaah] = []
)