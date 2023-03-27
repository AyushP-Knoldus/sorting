package com.knoldus
/*In the following program we are implementing selection sort technique on an unsorted list and sorting it in ascending order.
*                                                                                                         -Ayush Pathak*/

import scala.annotation.tailrec

class SelectionSort
{ //selectionSortTechnique takes unsorted list as an argument
  def selectionSortTechnique(unsortedList: List[Int]): List[Int] =
  { //Helper function which takes 2 lists-unsorted list and sorted list in which minimum element is appended after every recursive call
  @tailrec
  def selectionSortTechniqueHelper(unsortedList: List[Int], sortedList: List[Int]): List[Int] = unsortedList match
  {
    case Nil => sortedList//If unsorted list is empty return the sorted list
    case _ =>
      val minimumElement = unsortedList.min //store minimum element from the unsorted list
      val remaining = unsortedList.filter(_ != minimumElement)//filter method returns the remaining list after removing the minimum element
      selectionSortTechniqueHelper(remaining, sortedList :+ minimumElement)
  }

    selectionSortTechniqueHelper(unsortedList, Nil)//calling helper method with empty list
}
}
