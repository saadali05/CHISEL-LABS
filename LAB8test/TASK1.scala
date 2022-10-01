// package LAB8

// import chisel3._
// import org.scalatest._
// import chiseltest._

// class memtest extends FreeSpec with ChiselScalatestTester{
// 	"memory_assignment" in {test (new memory_assignment()){c =>
// 		c.io.write.bits.poke(1.B)
// 		c.io.requestor.bits.poke(8.U)
//         c.io.writeaddr.poke(4.U)
//         c.io.readaddr.poke(6.U)
// 		c.clock.step(20)
// 		}
// 	}
// } 