import org.apache.spark.sql._

object SparkBigData {

  var ss :SparkSession = null
  /**
   * fonction qui initialise et instancie une session spark
   * @param Env  : c'est une variable qui indique l'environnement sur lequel notre application est deployée
   *             si Env = True , alors l'appli est déployée en local , sinon elle est déployée sur un cluster
   */
  def Session_Spark (Env : Boolean = true) :SparkSession = {
    if (Env == true){
      System.setProperty("hadoop.home.dir","C:/Hadoop/hadoop-2.8.0")
      ss =SparkSession.builder()
        .master("local[*]")
        .enableHiveSupport()
        .config("Spark.serialize","org.apche.spark.serialize.KryoSerialize")
        .config("spark.sql.crossJoin.enabled","true")
        .enableHiveSupport()
        .getOrCreate()
    }
    else {
      val ss : SparkSession = SparkSession.builder()
        .appName("Mon apllication spark")
        .config("Spark.serialize","org.apche.spark.serialize.KryoSerialize")
        .config("spark.sql.crossJoin.enabled","true")
        .enableHiveSupport()
        .getOrCreate()
    }
    ss
  }
}