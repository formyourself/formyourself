object HelloworldBigData {
/* Premier programme Scala */
  val ma_var_imm : String = "Nacer" /* Variable immutable */
  private val une_var_imm : String = "Formation Big Data" /* une variable privée est accessible uniquement dans l'objet où elle est déclarée */

def main(args: Array[String]): Unit = {
  println("Hello World : mon premier programme en Scala")

  var test_mu : Int = 15
  test_mu = test_mu +10
  print(test_mu)
  val test_immu : Int = 20

}
}
