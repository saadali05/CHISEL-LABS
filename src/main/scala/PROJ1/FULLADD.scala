package PROJ1

import chisel3._
 
class FULLADD extends Module{
    val io = IO(new Bundle{
        val a = Input(UInt(4.W))
        val b = Input(UInt(4.W))
        val cin = Input(UInt(4.W))
        val sum = Output(UInt(4.W))
        val cout = Output(UInt(4.W))
    })
    io.sum := (io.a ^ io.b) ^ io.cin
    io.cout := (io.a & io.b) | ((io.a ^ io.b) & io.cin)
}
