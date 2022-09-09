package PROJ1

import chisel3._
 
class HALFADD extends Module{
    val io = IO(new Bundle{
        val a = Input(UInt(4.W))
        val b = Input(UInt(4.W))
        val sum = Output(UInt(4.W))
        val cout = Output(UInt(4.W))
    })
    io.sum := io.a ^ io.b
    io.cout := io.a & io.b
}
