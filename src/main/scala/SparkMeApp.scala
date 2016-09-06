import org.apache.spark.sql.SparkSession

/**
  * Created by kshitiz.mahajan on 03/09/2016.
  */
object SparkMeApp extends App{
  println("Hello after doing the assembly")

  val spark: SparkSession = SparkSession.builder()
    .master("local")
    .appName("Word Count")
    .config("spark.some.config.option", "some-value")
  .getOrCreate()

  val dataset = spark.read.csv("people.csv")

  dataset.show

  dataset.write.json("people.json")

  spark.stop()

}
