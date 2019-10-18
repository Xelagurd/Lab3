package lab3;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class Spark {
    public static void main(String[] args) {
        /*а. Инициализируем Spark */
        SparkConf conf = new SparkConf().setAppName("Lab3");
        JavaSparkContext sc = new JavaSparkContext(conf);
        /*б. Загружаем исходные наборы данных в RDD*/
        JavaRDD<String> flFile = sc.textFile("664600583_T_ONTIME_sample.csv");
    }
}
