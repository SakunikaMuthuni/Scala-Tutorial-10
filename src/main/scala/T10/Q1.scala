package T10

object Q1 {
  def calculateAverage(temperature : List[Double]): List[Double] = {
    temperature.map(temperature => (temperature * (9.0/5.0)) + 32.0);
  }

  def averageFahrenheitTemperature(temperature : List[Double]): Double = {
    temperature.reduce((temp, temperature)=> temp+temperature)/temperature.length.toDouble;
  }

  def main(args : Array[String]): Unit = {
    val temp=List(0,10.0,20.0,30.0);
    val t=calculateAverage(temp);

    //print converted temperatures to two decimal points
    //The foreach method is used to iterate over elements in a collection and apply a function to each element.
    // In this case, you can use the foreach method to iterate over the list of calculated temperature values
    // and print each value with the desired formatting
    t.foreach(temperature => print(f"$temperature%.2f, "));
    println("\b\b");

    val avg=averageFahrenheitTemperature(t);
    println("Average :"+avg);

  }

}
