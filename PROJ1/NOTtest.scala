package PROJ1

import chisel3._
import org.scalatest._
import chiseltest._

class NOTtest extends FreeSpec with ChiselScalatestTester{

	"NOT GATE" in {
		test (new NOT()){c =>
			c.io.a.poke(1.B)
			c.clock.step(2)
			c.io.c.expect(0.B)
		}
	}
}