//2.9
package LAB2

import chisel3._
import chisel3.util._

class mult_1Look extends Module {
    val io = IO (new Bundle {
    val in0 = Input ( Bool () )
    val in1 = Input ( Bool () )
    val in2 = Input ( Bool () )
    val in3 = Input ( Bool () )
    val in4 = Input ( Bool () )
    val in5 = Input ( Bool () )
    val in6 = Input ( Bool () )
    val in7 = Input ( Bool () )
    val select = Input ( UInt (3. W ) )
    val out1 = Output ( Bool () )
    val out2 = Output ( Bool () )
    val out3 = Output ( Bool () )
})
val newVar = Fill (32,io.select.asUInt)
io.out1 := MuxLookup ( io . select , false .B , Array (
    (0. U ) -> io . in0 ,
    (1. U ) -> io . in1 ,
    (2. U ) -> io . in2 ,
    (3. U ) -> io . in3 )
)
io.out2 :=  MuxLookup ( io . select , false .B , Array (
    (4. U ) -> io . in4 ,
    (5. U ) -> io . in5 ,
    (6. U ) -> io . in6 ,
    (7. U ) -> io . in7 )
)
io.out3 := io.out1 & (~io.select) | io.out2 & io.select
}
// println (( new chisel3 . stage . ChiselStage ) . emitVerilog (new MuxLookup () ) )
