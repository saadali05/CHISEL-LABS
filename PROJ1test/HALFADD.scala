package PROJ1

import chisel3._
import org.scalatest._
import chiseltest._

class HALFADDtest extends FreeSpec with ChiselScalatestTester{

	"HALFADD GATE" in {
		test (new HALFADD()){c =>
			c.io.a.poke(8.U)
			c.io.b.poke(1.U)
			c.clock.step(10)
			c.io.sum.expect(9.U)
            c.io.cout.expect(0.U)
		}
	}
} 