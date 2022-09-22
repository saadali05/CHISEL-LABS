// package LAB6

// import chisel3._
// import chisel3.util._

// class counter12 () extends Module {
// val io = IO (new Bundle {
// val out = Output (1.B)
//  })
// // one shot timer implementation
// val timer_count0 = RegInit (0.U (8.W))
// val done0 = timer_count === 0.U
// val next0 = WireInit (0.U)
// val timer_count1 = RegInit (0.U (8.W))
// val done1 = timer_count === 0.U
// val next1 = WireInit (0.U)
// when (reload) {
// next := din // load the data from input
// }
// .elsewhen (!done) {
// next := timer_count - 1.U // decrement the timer
// }
// timer_count := next // update the timer