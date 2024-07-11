object StringImprovements {
  implicit class StringOpr(s: String) {
    def capitalizeWords: String = {
      s.split(" ").map(_.capitalize).mkString(" ")
    }
  }
}
