package lab3;

import org.apache.spark.SparkConf;

public class Spark {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("Lab3");
        JavaSparkContext sc = new JavaSparkContext(conf);
    }
}
