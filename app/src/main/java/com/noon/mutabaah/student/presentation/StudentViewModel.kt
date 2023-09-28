package com.noon.mutabaah.student.presentation

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

//class StudentViewModel : ViewModel() {
//    val students = mutableStateListOf<StudentEntity>()
//    var presentNewStudentSheet by mutableStateOf(false)
//    var isLoading by mutableStateOf(false)
//
//    private val studentService = StudentService(studentRepository = StudentCoreDataAdapter())
//
//    init {
//        fetchStudents()
//    }
//
//    private fun fetchStudents() {
//        isLoading = true
//        GlobalScope.launch(Dispatchers.IO) {
//            val fetchedStudents = getStudents()
//            launch(Dispatchers.Main) {
//                students.clear()
//                students.addAll(fetchedStudents)
//                isLoading = false
//            }
//        }
//    }
//
//    private suspend fun getStudents(): List<StudentEntity> {
//        return try {
//            studentService.getStudents()
//        } catch (e: Exception) {
//            emptyList()
//        }
//    }
//
//    fun createStudent(
//        student: StudentEntity,
//        studentPreference: StudentPreferenceEntity,
//        completion: (Result<Boolean, Exception>) -> Unit
//    ) {
//        GlobalScope.launch(Dispatchers.IO) {
//            try {
//                studentService.createStudent(student, studentPreference)
//                responseHandler(Result.success(true))
//            } catch (e: Exception) {
//                responseHandler(Result.failure(e))
//            }
//        }
//    }
//
//    fun updateStudent(
//        id: UUID,
//        newStudent: StudentEntity,
//        preferenceId: UUID,
//        studentPreference: StudentPreferenceEntity,
//        completion: (Result<Boolean, Exception>) -> Unit
//    ) {
//        GlobalScope.launch(Dispatchers.IO) {
//            try {
//                studentService.updateStudent(id, newStudent, preferenceId, studentPreference)
//                responseHandler(Result.success(true))
//            } catch (e: Exception) {
//                responseHandler(Result.failure(e))
//            }
//        }
//    }
//
//    fun deleteStudent(
//        id: UUID,
//        completion: (Result<Boolean, Exception>) -> Unit
//    ) {
//        GlobalScope.launch(Dispatchers.IO) {
//            try {
//                studentService.deleteStudent(id)
//                responseHandler(Result.success(true))
//            } catch (e: Exception) {
//                responseHandler(Result.failure(e))
//            }
//        }
//    }
//
//    private fun responseHandler(result: Result<Boolean, Exception>) {
//        when (result) {
//            is Result.Success -> {
//                fetchStudents()
//            }
//            is Result.Failure -> {
//                // Handle the error here
//            }
//        }
//    }
//}
