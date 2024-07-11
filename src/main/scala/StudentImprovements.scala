import java.time.LocalDate

object StudentImprovements {
  implicit class StudentAdditional(s: Student) {
    def birthYear: Int = {
      val currentYear = LocalDate.now().getYear
      val b = currentYear - s.age
      b
    }
  }
}
