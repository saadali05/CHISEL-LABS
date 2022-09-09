package LAB3

import chisel3._
import chisel3.util._

class EncoderIO extends Bundle {
val out = Output ( UInt (2. W ) )
val in = Input ( UInt (4. W ) )
}
class Encoder4to2 extends Module {
val io = IO (new EncoderIO )
io.out := (0.U)
switch (io.in) {
    is ("b0000".U){
        io.out := 0.U
    }
    is ("b0001".U){
        io.out := 1.U
    }
    is ("b0010".U){
        io.out := 2.U
    }
    is ("b0011".U){
        io.out := 3.U
    }
    is ("b1010".U){
        io.out := 10.U
}
}
}