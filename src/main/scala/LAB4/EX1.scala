package LAB3

import chisel3._
import chisel3.util._

class ExtendALU extends Bundle {
val out = Output ( UInt (2. W ) )
val in = Input ( UInt (4. W ) )
}