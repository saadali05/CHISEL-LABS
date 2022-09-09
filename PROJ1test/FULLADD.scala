package PROJ1

import chisel3._
import org.scalatest._
import chiseltest._

class FULLADDtest extends FreeSpec with ChiselScalatestTester{

	"FULLADD GATE" in {
		test (new FULLADD()){c =>
			c.io.a.poke(8.U)
			c.io.b.poke(1.U)
            c.io.cin.poke(0.U)
			c.clock.step(10)
			c.io.sum.expect(9.U)
            c.io.cout.expect(0.U)
		}
	}
} 