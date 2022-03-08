package groovylab

class App {
    static void main(String[] args) {
        println Task01.sum(1,4) == 5
        println Task02.mulEvenOdd([4,5,6]) == [8,15,12]
        println Task03.isSublist([1,2,3], [2,3]) == true
        println Task04.fib(4) == 3
        println Task05.isIp("10.0.152.164") == true
        println Task06.adults([Kate: 24, Alan:16, Osvald: 18]) == [Kate: 24, Osvald: 18]
        println Task07.encryptThis("hello world") == "104olle 119drlo"
        println Task08.parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}") == "{\"Kate\":18,\"Osvald\":27}"
        println Task09.exec("date") == "Mon Dec  3 22:40:34 +03 2018"
        println Task10.urlText("http://httpstat.us/200") == "200 OK"
        println Task11.gstring("test", 2) == "1() 2(test) 3()"
        println TaskCalculator.exec("6(3+1)") == 24
        println TaskCalculator.exec("1+9/3") == 4
    }
}
