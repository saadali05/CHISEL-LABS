package LAB8

import chisel3._


class MaskedReadWrite1Smem extends Module {
    val width : Int = 8
    val io = IO (new Bundle {
    val enable = Input ( Bool () )
    val write = Input ( Bool () )
    val addr = Input ( UInt (10. W ) )
    val mask = Input ( Vec (2 , Bool () ) )
    val dataIn = Input ( Vec (2 , UInt ( width . W ) ) )
    val dataOut = Output ( Vec (2 , UInt ( width . W ) ) )
    })

// Create a 32 - bit wide memory that is byte - masked
val mem = SyncReadMem (1024 , Vec (2 , UInt ( width . W ) ) )
// Write with mask
mem . write ( io . addr , io . dataIn , io . mask )
io . dataOut := mem . read ( io . addr , io . enable )
}