package LAB2

import chisel3._
import chisel3.util._

// Mux IO interface class

class Mux_2to1_IO extends Bundle {
val in_A = Input (UInt(3.W ) )
val in_B = Input (UInt(3.W ) )
val select = Input (Bool() )
val out = Output (UInt() )
}

class Mux_2to1 extends Module {
val io = IO (new Mux_2to1_IO )
val newV = Fill (32,io.select.asUInt)
// update the output
//io.out := Mux ( io.select , io.in_A , io.in_B )
io.out := io.in_A & (~newV) | io.in_B & newV
}