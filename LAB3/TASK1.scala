package LAB3

import chisel3 . _
import chisel3 . util . _

class LM_IO_Interface_BranchControl extends Bundle {
val fnct3 = Input (UInt(3.W))
val branch = Input (Bool())
val arg_x = Input (UInt(32.W))
val arg_y = Input (UInt(32.W))
val br_taken = Output (Bool())
}

class BranchControl extends Module {
val io = IO (new LM_IO_Interface_BranchControl )
val newval = Wire(Bool())
newval := 0.U
// Start Coding here
switch (io.fnct3){
    is ("b000".U){newval := io.arg_x === io.arg_y } // equal
    is ("b001".U){newval := io.arg_x =/= io.arg_y } // not equal
    is ("b010".U){newval := io.arg_x >= io.arg_y } // greater equal
    is ("b100".U){newval := io.arg_x <= io.arg_y } // lesser equal
}
io.br_taken := newval && io.branch 
// End your code here
// Well , you can actually write classes too . So , technically you have nolimit ; )
}
// println (( new chisel3 . stage . ChiselStage ) . emitVerilog (new Branch_Control ) )
