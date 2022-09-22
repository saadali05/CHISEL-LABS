package LAB6

// Counter with XOR example
import chisel3 . _
import chisel3 . util . _
class countxor (val max : Int) extends Module {
val io = IO (new Bundle {
val out = Output (UInt((log2Ceil (max).W)))
})
// Start Coding here
val count = RegInit(0.U(log2Ceil (max).W))
when((count(log2Ceil (max) - 1) ^ 0.B) === 1.B){
    count := 0.U
}.otherwise {
    count := count + 1.U
}
io.out := count 
// End your code here
}
// println ((new chisel3.stage.ChiselStage).emitVerilog(new counter_with_xor(n)))