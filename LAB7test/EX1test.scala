package LAB7

import chisel3._
import org.scalatest._
import chiseltest._

class ORLAB7test extends FreeSpec with ChiselScalatestTester{
	"OR LAB 7 GATE" in {test (new ORLAB7()){c =>
		c.io.a.bits.poke(8.U)
		c.io.b.bits.poke(1.U)
		c.clock.step(20)
		}
	}
} 