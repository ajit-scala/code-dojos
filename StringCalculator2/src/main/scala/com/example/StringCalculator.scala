package com.example

object StringCalculator {
  def add(s: String) = {
    if(s.isEmpty)
      0
    else {
      val delimiters = {
        Set(",", "\n")
      }
      if(delimiters.exists(d => s.endsWith(d))) throw new IllegalArgumentException
      var sum = 0

      val numbers = s.split(delimiters.mkString("|"))
      for(n <- numbers) {
        sum += n.toInt
      }
      sum
    }
  }
}
