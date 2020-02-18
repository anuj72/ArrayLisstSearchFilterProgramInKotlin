
fun main(){
    var x= readLine()
  var nums=ArrayList<String>()
    var id=ArrayList<String>()
    var email=ArrayList<String>()
    var filternums=ArrayList<String>()
    var filterId=ArrayList<String>()
    var filterEmail=ArrayList<String>()
    nums.add("apple")
    nums.add("banana")
    nums.add("papaya")
    nums.add("orange")
    email.add("abcd")
    email.add("efgh")
    email.add("ohik")
    email.add("lmn")
    id.add("1")
    id.add("2")
    id.add("3")
    id.add("4")

   println(nums)
  var filternum=filterValue(nums,id,email,filternums,filterId,filterEmail,x.toString())
    if(filternum.equals(true)){
        print("filterd value with index =$filternums,$filterId,$filterEmail") } }
  fun filterValue(
    nums: ArrayList<String>,
    id: ArrayList<String>,
    email: ArrayList<String>,
    filternums: ArrayList<String>,
    filterId: ArrayList<String>,
    filterEmail: ArrayList<String>,
    x:String
): Any {
    for(i in 0 until  nums.size){
        if(nums[i].startsWith("$x") || email[i].startsWith("$x")){
      filterId.add("$i")
      filternums.add("${nums[i]}")
      filterEmail.add("${email[i]}")
        }
    }
    return true
}


