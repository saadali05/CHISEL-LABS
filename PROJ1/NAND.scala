package PROJ1

import chisel3._
import org.scalatest._
import chiseltest._

class NANDtest extends FreeSpec with ChiselScalatestTester{

	"NAND GATE" in {
		test (new NAND()){c =>
			c.io.a.poke(8.U)
			c.io.b.poke(1.U)
			c.clock.step(10)
			c.io.c.expect(15.U)
		}
	}
} 