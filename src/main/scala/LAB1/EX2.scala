package LAB1

import chisel3._

class CounterMost (counterBits : Int) extends Module {
val io = IO (new Bundle {   
val result = Output (Bool())
})
val count = RegInit (0.U (counterBits.W ))
val last = 

when (count(counterBits-1) === (1.B)){
    count :=0.U
} . otherwise {
    count := count + 1.U
}
io.result := count (counterBits -1) 
println(s" $count")
}