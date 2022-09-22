package LAB6
// shift register example
import chisel3._

class shift_register11 ( val init : Int ) extends Module {
val io = IO (new Bundle {
val in = Input (Bool())
val out = Output (Bool())
})
val flag1 = WireInit(0.U)
val flag2 = WireInit(0.U)
val state = RegInit ( init . U (4. W )) // register initialization
val state2 = WireInit(0.U)
val nextState = WireInit(0.U)
// serial data in at LSB
when (flag1 === 0.U){ 
    flag2 := 1.B
    nextState := ( state << 1) | io . in
}.elsewhen (flag2 === 1.U && flag1 === 0.U){
   state2 := nextState
}
io.out := state2
}
// println ((new chisel3.stage.ChiselStage).emitVerilog (new shift_register))