package LAB2

import chisel3._
import chisel3.util._

class barrelshift extends Bundle {
    val se0 = Input (Bool())
    val se1 = Input (Bool())
    val in0 = Input (Bool()) 
    val in1 = Input (Bool())
    val in2 = Input (Bool())
    val in3 = Input (Bool())
    val out0 = Output (UInt(32.W))
    val out1 = Output (UInt(32.W))
    val out2 = Output (UInt(32.W))
    val out3 = Output (UInt(32.W))
    // val in = Vec (4 , Input ( Bool () ) )
    // val sel = Vec (2 , Input ( Bool () ) )
    val shift_type = Input (Bool ())
    // val out = Vec (4 , Output ( Bool () ) )
}
class Barrelshifter extends Module {
    val io = IO (new barrelshift )
    val mux3 = Mux(io.shift_type, 0.U, io.in0 )
    val mux4 = Mux(io.shift_type, 0.U, io.in1)
    val mux5 = Mux(io.shift_type, 0.U, io.in2)
    io.out0 := (Mux ( io.se0 , io.in0 , io.in1 ) | Mux ( io.se1 , io.in2 , io.in3 ))
    io.out1 := (Mux (io.se0, io.in1, io.in2) | Mux (io.se1, mux3  ,io.in3 ))
    io.out2 := (Mux (io.se0, io.in2, io.in3) | Mux (io.se1, mux3 , mux4))
    io.out3 := Mux (io.se0, io.in3, mux3 ) | Mux (io.se1, mux4, mux5 )
}
