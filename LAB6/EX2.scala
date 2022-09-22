package LAB6

// Optimized counter example
import chisel3. _
import chisel3.util._
class counter12 (val max : Int , val min : Int) extends Module {
val io = IO (new Bundle {
val out = Output (UInt(log2Ceil (max).W))
 })
// io.max := ((UInt),Boolean.32)
// io.min := ((UInt),Boolean)
val counter = RegInit (min.U (log2Ceil (max).W))
// If the max count is of power 2 and the min value = 0 ,
// then we can skip the comparator and the Mux
val count_buffer = Mux( (isPow2(max) &&(min == 0)).B , counter+1.U, Mux(counter ===
max.U, min.U, counter + 1.U)) 
counter := count_buffer
io . out := counter
}
// println (( new chisel3.stage.ChiselStage).emitVerilog (new counter (32)))