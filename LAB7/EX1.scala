package LAB7

import chisel3 . _
import chisel3 . util . _
 
class ORLAB7 extends Module{
    val io = IO(new Bundle{
        val a = Flipped ( Decoupled ( UInt (8. W ) ) )
        val b = Flipped ( Decoupled ( UInt (8. W ) ) )
        val out = Decoupled ( UInt (8. W ) )
    })
    val queue1 = Queue ( io . a , 2)
    val queue2 = Queue ( io . b , 2)
    io . out <> queue1
    io . out <> queue2
}