public static String scrambleWord(String word){
  /* To be implemented in part (a) */
  for(int i = 0; i < word.length(); i++)
    word = "";
    word += word.substring(i + 1, i + 1);
    
  return word;
}


public static void scrambleOrRemove(List<String> wordList){
  /* To be implemented in part (b) */
  for(String x: wordList)
    if(!x == word.scrambleWord())
      wordList.remove(x);
    

  








}
