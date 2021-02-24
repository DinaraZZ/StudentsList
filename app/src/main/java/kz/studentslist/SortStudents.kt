package kz.studentslist

import java.util.*
import kotlin.collections.ArrayList

class SortStudents {
    fun sortByNames(studentsList: ArrayList<String>): String{
        var sortedArray = studentsList.toArray()
        Arrays.sort(sortedArray)
        return sortedArray.joinToString("\n")
    }

    fun sortRandomly(studentsList: ArrayList<String>): String{
        var sortedArray = studentsList.toMutableList()
        sortedArray.shuffle()
        return sortedArray.joinToString("\n")
    }
}