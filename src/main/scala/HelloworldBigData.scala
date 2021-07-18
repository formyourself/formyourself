import scala.collection.immutable._
import scala.collection.mutable._
import scala.math.Numeric.BigDecimalAsIfIntegral.mkNumericOps

object HelloworldBigData {
  /* Premier programme Scala */
  val ma_var_imm: String = "Nacer"
  /* Variable immutable */
  private val une_var_imm: String = "Formation Big Data"
  /* une variable privée est accessible uniquement dans l'objet où elle est
                                                            déclarée dans notre cas  il s'agit de l'objet : HelloworldBigData */

  class person (var nom :String, var prenom :String, var age :Int)



  def main(args: Array[String]): Unit = {
    println("Hello World : mon premier programme en Scala")

    var test_mu: Int = 15
    test_mu = test_mu + 10
    println(test_mu)
    val test_immu: Int = 20
    println(
      "Votre texte contient : " + comptage_caracters(
        "mon bebe souffre des gaz ;( ") + " caractéres")
    getResultat(10)
    getResultat("Léo")
    testWheile(10)
    testFor()
    collectionScala()
    collectiontuple()
  }

  // ma premiére fonction //

  def comptage_caracters(Texte: String): Int = {
    Texte.trim.length()
  }

  // ma premiere procedure
  def getResultat(parametre: Any): Unit = {
    if (parametre == 10) {
      println("Votre valeur est un entier")
    } else {
      println("votre valeur n'est pas un entier ")
    }

  }

  // Structures conditionelles
  def testWheile(valeur_cond: Int): Unit = {
    var i: Int = 0
    while (i < valeur_cond) {
      println("itération while N° " + i)
      i = i + 1
    }
  }

  def testFor(): Unit = {
    var i: Int = 0
    for (i <- 5 to 15 by 2) {
      println("itération For N° " + i)
    }
  }

  // Les collection en Scala
  def collectionScala(): Unit = {
    val maList: List[Int] = List(1, 2, 410, 45, 15)

    val maListS: List[String] = List("nacer", "Léo", "Aylan")
    val chaine: String = "Ma chaines"
    //println(chaine.toList)
    val plage_v: List[Int] = List.range(1, 15, 2)
    //println(plage_v)

    for (i <- maListS) {
      println(i)
    }
    for (i <- plage_v) {
      println(i)
    }

    val maliste2: List[Int] = plage_v.map((e:Int) => e * 2)
    val maliste3: List[Int] = plage_v.map(_ * 2)
    val maliste4: List[Int] = plage_v.filter(_> 5)
    maliste4.foreach((e =>  println("liste 5 element :  "+ e )))
    val maliste5: List[String] = maListS.map(_.toUpperCase())
    for (r <- maliste5) {
      println(r)
    }
    // Manipulation des collections à l'aide des fonctions anonymes

    val resultat: List[String] = maListS.filter(e => e.endsWith("n"))
    for (r <- resultat) {
      println(r)
    }
  }

  def collectiontuple(): Unit = {

    val tuple_test = (45,"JVC",false)
    println(tuple_test._2)
  }
  val nouvelle_personne : person = new person ("BRIK","NACER",32)
  val tuple2 = ("Test",nouvelle_personne,67)

 val tuple_tolist :List [Char] =tuple2.toString().toList
  tuple_tolist.foreach( println(_))
}
