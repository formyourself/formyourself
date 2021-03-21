import org.apache.spark.sql.SparkSession

object HelloworldBigData {
/* Premier programme Scala */
  val ma_var_imm : String = "Nacer" /* Variable immutable */
  private val une_var_imm : String = "Formation Big Data" /* une variable privée est accessible uniquement dans l'objet où elle est déclarée */

def main(args: Array[String]): Unit = {
  println("Hello World : mon premier programme en Scala")

  var test_mu : Int = 15
  test_mu = test_mu +10
  println(test_mu)
  val test_immu : Int = 20
  println("Votre texte contient : " + comptage_caracters("mon bebe souffre des gaz ;( ") + " caractéres")
  getResultat( 10)
  getResultat( "Léo")

}
  // ma premiére fonction //

  def comptage_caracters (Texte: String) : Int ={
    Texte.trim.length()
  }

  def getResultat (parametre: Any) : Unit = {
    if (parametre ==10){
      println("Votre valeur est un entier")
    } else { println("votre valeur n'est pas un entier ")}
  }

}
