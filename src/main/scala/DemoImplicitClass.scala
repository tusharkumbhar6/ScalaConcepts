import StringImprovements._
import StudentImprovements._

object DemoImplicitClass {

  def main(args: Array[String]): Unit = {
    demoStringImplicit()
    demoStudentimmplicit()
  }

  def demoStringImplicit(): Unit = {
    val name1 = "tushar trimbak kumbhar"
    val name2 = "Ankita yadav"
    val name3 = "devansh Kumbhar"

    println(name1.capitalizeWords)
    println(name2.capitalizeWords)
    println(name3.capitalizeWords)
  }

  def demoStudentimmplicit(): Unit = {
    val st1 = new Student("Tushar", 33, 12)
    val st2 = new Student("Ankita", 30, 4)
    println(st1.birthYear)
    println(st2.birthYear)

  }
}

