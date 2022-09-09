package LAB1

import chisel3._

class updown (n : Int) extends Module {
val io = IO (new Bundle {
val result = Output (Bool())
})
val flag = WireInit(0.U)
val mynum = (n.asUInt)(n.W)
val count = RegInit (0.U (n.W))
dontTouch(count)
io.result := 0.B
when (flag === 0.U) { 
    count := count + 1.U 
}.elsewhen (flag === 1.U ){
    count := count + 1.U
}
when (count === mynum){
    flag := 1.U
}.elsewhen(count === 0.U){
    flag := 0.U
}
}
