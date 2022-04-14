fun main(){
    var customer= currentAccount("Queenter","M-pesa",300.50)
    customer.balance
    println(customer.balance)


    details("0707747965",3000,"mpesa")



    var fruits = product("mango",20,50,"grocery")
    var detol = product("cabbage",50,100,"hygiene")
    var shoe = product("heels",40,400,"other")

    var shopping = listOf<product>(fruits,detol,shoe)
    println(shopping)

    school()

}
//Assessment 2
//1.Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format: “Account number x with balance y is
//operated by z”(5points)
//2.Create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
//(5points)
//3.A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
//(3 points)
//4.Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return

class  currentAccount(var accounNumber:String, var accountName:String, var balance:Double)

fun deposit(amount:Double){
    var deposition = 0.00
    deposition++
    println(deposition)



}
fun withdraw(amount:Double){
    var withdrawal = 0.00
    withdrawal--
    println(withdrawal)


}
fun details(x:String,y:Int,z:String){
    var documentation = "AccountNumbr $x with balance$y operated by $z "
    println(documentation)

}
class savingsAccount(var accountNumber:String, var accountName:String,var balance:Int)
fun withdrawal(withdraw:Int){


}
data class product(var name:String, var weight:Int, var price:Int, var category:String)
    fun shop(product: String){



    }





fun school(){
    var cohort="codehive"
    println(cohort[0].toString()+cohort[2]+cohort[4]+cohort[6])

}