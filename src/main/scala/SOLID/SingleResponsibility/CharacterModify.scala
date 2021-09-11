package SOLID.SingleResponsibility

class CharacterModify(text : String) {

  def modifyCharactersAtOddIndex: String = {

    var resultantText : String = ""
    for( i <- 0 to text.length){
      if (i % 2 != 0)
        resultantText = resultantText + Integer.toString(i)
      else
        resultantText = resultantText + text.charAt(i)
    }
    resultantText
  }

}
