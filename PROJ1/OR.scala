package PROJ1

import chisel3._
 
class OR extends Module{
    val io = IO(new Bundle{
        val a = Input(UInt(4.W))
        val b = Input(UInt(4.W))
        val c = Output(UInt(4.W))
    })
    io.c := io.a | io.b
}
