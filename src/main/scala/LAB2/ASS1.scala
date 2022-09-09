package LAB2

import chisel3._
import chisel3.util._

class LM_IO_Interface extends Bundle {
    val s0 = Input (Bool()) 
    val s1 = Input (Bool())
    val s2 = Input (Bool())
    val out = Output (UInt(32.W))
}
class Mux_5to1 extends Module {
val io = IO (new LM_IO_Interface )
// Start coding here
val selA = Cat(io.s2,io.s1,io.s0)
io.out := MuxCase (32.U , Array (
    (selA === (0.U)) -> (0.U) ,
    (selA === (1.U)) -> (8.U) ,
    (selA === (2.U)) -> (16.U) ,
    (selA === (3.U)) -> (24.U) )
)
// End your code here
}
// println (( new chisel3 . stage . ChiselStage ) . emitVerilog (new Mux_5to1 ) )