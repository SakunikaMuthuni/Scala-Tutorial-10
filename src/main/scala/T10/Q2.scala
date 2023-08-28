package T10

object Q2 {
  def countLetterOccurrences(words: List[String]): List[Int] = {
    words.map(word => word.length);
  }

  def calculateTotalCountLetters(lengthList : List[Int]): Int = {
    lengthList.reduce((count,len) => count+len);
  }

  def main(args: Array[String]): Unit = {
    val wordList=List("Apple","banana","cherry","date","elderberry");
    println("List :"+wordList);

    val wordLengths=countLetterOccurrences(wordList);
    println("List :"+wordLengths);

    val count=calculateTotalCountLetters(wordLengths);
    println("Count of letters :"+count);

  }

}
