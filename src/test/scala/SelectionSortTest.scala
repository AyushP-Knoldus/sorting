package com.knoldus

class SelectionSortTest extends org.scalatest.funsuite.AnyFunSuite
{
  test("method selectionSortTechnique should return sorted list when list is passed ")
  {
    val unsortedList = List(5,7,3,4,1,10)
    val selectionSortObject= new SelectionSort
    assert(selectionSortObject.selectionSortTechnique(unsortedList) == List(1, 3, 4, 5, 7, 10))
  }
  test("method selectionSortTechnique should return sorted list when  non-unique unsorted list is passed ")
  {
    val unsortedList = List(5, 7, 3, 4, 1, 10)
    val selectionSortObject = new SelectionSort
    assert(selectionSortObject.selectionSortTechnique(unsortedList) == List(1, 3, 4, 5, 7, 10))
  }
}
