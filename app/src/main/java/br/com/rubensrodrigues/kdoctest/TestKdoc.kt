package br.com.rubensrodrigues.kdoctest

class TestKdoc {

    /**
     * A Unit method that just sums 2 numbers
     */
    fun methodOne(){
        1+1
    }

    /**
     * This method returns the sum of 2 plus 2
     * @return [Int] sum of 2 plus 2
     */
    fun methodTwo(): Int{
        return 2+2
    }

    /**
     * Receives a number and returns it multiplied by 5
     * @param number the number that will be multiplied
     * @return [Int] the multiplication
     */
    fun methodThree(number: Int): Int{
        return 5*number
    }
}