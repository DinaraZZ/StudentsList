package kz.studentslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var studentsList: TextView? = null
    private var pageDescription: TextView? = null
    private var sortByNames: Button? = null
    private var sortRandomly: Button? = null

    private val studentsArray = ArrayList<String>()
    private val sort = SortStudents()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students)
        initializeStudents()
        initializeViews()
        initializeLiseners()
    }

    private fun initializeViews() {
        studentsList = findViewById<TextView>(R.id.textView_students_activity_students_list)
        pageDescription = findViewById<TextView>(R.id.textView_students_activity_page_description)
        sortByNames = findViewById<Button>(R.id.button_students_activity_sort_by_names)
        sortRandomly = findViewById<Button>(R.id.button_students_activity_sort_randomly)

        pageDescription?.text = "This page shows the list of students"
        studentsList?.text = studentsArray.joinToString("\n")
    }

    private fun initializeStudents() {
        studentsArray.add("Anthony Pierce")
        studentsArray.add("Gladys Wilkins")
        studentsArray.add("Barrie Butler")
        studentsArray.add("Adelia Harmon")
        studentsArray.add("Charles Carter")
        studentsArray.add("Arlene Bridges")
        studentsArray.add("Richard Cobb")
        studentsArray.add("Helen Harrington")
        studentsArray.add("Emory McCoy")
        studentsArray.add("Katherine Osborne")
        studentsArray.add("Clifford Bennett")
        studentsArray.add("Judith York")
        studentsArray.add("Brice Wilkerson")
        studentsArray.add("Dorothy Mitchell")
        studentsArray.add("Peter Peters")
    }

    private fun initializeLiseners() {
        sortByNames?.setOnClickListener {
            studentsList?.text = sort.sortByNames(studentsArray)
        }

        sortRandomly?.setOnClickListener{
            studentsList?.text = sort.sortRandomly(studentsArray)
        }
    }
}