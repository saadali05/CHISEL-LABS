// package LAB3

// import chisel3._
// import org.scalatest._
// import chiseltest._

// class decoder_with_validtest extends FreeSpec with ChiselScalatestTester{
//     "decoder_with_valid" in { test (new decoder_with_valid()){c=>
//     c.io.in.poke("b00".U)
//     // c.io..poke(1.B)
//     // c.io.arg_x.poke("b0110".U)
//     // c.io.arg_y.poke("b0100".U)
//     c.clock.step(50)
//     c.io.out.expect("b0000".U)
//     }
//     }
// }