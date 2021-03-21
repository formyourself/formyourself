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
  testWheile(10)
  testFor()
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
// Structures conditionelles
  def testWheile (valeur_cond : Int) :Unit = {
    var i : Int = 0
    while (i< valeur_cond) {
      println("itération while N° "+ i)
      i=i+1
    }
  }


  def testFor () :Unit = {
    var i : Int = 0
    for (i <- 5 to 15 by 2) {
      println("itération For N° "+ i)
    }
  }



}
