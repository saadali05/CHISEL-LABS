// import chisel3 . _
// import chisel3 . util . _
// class shift_reg_with_parallel_load (val len : Int =1) extends Module {
// val io = IO (new Bundle {
//     val load_in = Vec (len ,Input (Bool ()))
//     val in = Input (Bool ())
//     val load = Input (Bool ())
//     val out = Vec ( len , Output ( Bool ()))
// })
// // Start Coding here

// val counter = RegInit (min.U (log2Ceil (max).W))
// // If the max count is of power 2 and the min value = 0 ,
// // then we can skip the comparator and the Mux
// val count_buffer = Mux( (isPow2(max) &&(min == 0)).B , counter+1.U, Mux(counter ===
// max.U, min.U, counter + 1.U)) 
// counter := count_buffer
// io . out := counter

// // End your code here
// // Well , you can actually write classes too . So , technically you have nolimit ; )
// }
// println (( new chisel3 . stage . ChiselStage ) . emitVerilog (new
// shift_reg_with_parallel_load ( n ) ) )