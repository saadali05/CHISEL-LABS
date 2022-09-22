package LAB6

// Up - down counter example
import chisel3 . _
import chisel3 . util . _
class up_down_counter ( val max1 : Int = 10) extends Module {
val io = IO (new Bundle {
val out = Output ( UInt ( log2Ceil ( max1 ) . W ) )
val up_down = Input ( Bool () )
})
// Start code here
// val count123 = RegInit(0.U(log2Ceil (max1).W))
val cnt = RegInit(0.U)
when(io.up_down === 1.B){
    cnt := cnt + 1.U
}.otherwise {
    cnt := 0.U
}
io.out := cnt
// End your code here
}

//println (( new chisel3 . stage . ChiselStage ) . emitVerilog (new up_down_counter(4)))