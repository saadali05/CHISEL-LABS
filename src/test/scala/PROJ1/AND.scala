package PROJ1

import chisel3._
import org.scalatest._
import chiseltest._

class ANDtest extends FreeSpec with ChiselScalatestTester{

	"AND GATE" in {
		test (new AND()){c =>
			c.io.a.poke(8.U)
			c.io.b.poke(1.U)
			c.clock.step(10)
			c.io.c.expect(0.U)
		}
	}
} 