package LAB5

import chisel3 . _
import chisel3 . util . _
// import chisel3 . iotesters .{ ChiselFlatSpec , Driver , PeekPokeTester }

class Adder5 ( Width : Int ) extends Module {
require ( Width >= 0)
val io = IO (new Bundle {
    val in0 = Input (UInt(Width.W))
    val in1 = Input (UInt(Width.W))
    val out = Output (UInt(Width.W))
})
io.out := io.in0 + io.in1
}