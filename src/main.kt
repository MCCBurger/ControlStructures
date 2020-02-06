fun main() {
    var temp =0.0


    println("Please input a temerature between 92.0 and 104.0")
    temp = readLine()!!.toDouble()
    while (temp <=92.0 || temp>=104){
        println("Incorrect input.......\nPlease input a number between 92.0 and 104")
        temp = readLine()!!.toDouble()
    }

    if(temp>99.5)
        println("Your temperature is: "+temp+ " and it is HIGH")
    else if(temp >=97.5)
        println("Your temperature is: "+temp+ " and it is NORMAL")
    else
        println("Your temperature is: "+temp+ " and it is LOW")
}