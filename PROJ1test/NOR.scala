package PROJ1

import chisel3._
import org.scalatest._
import chiseltest._

class NORtest extends FreeSpec with ChiselScalatestTester{

	"NOR GATE" in {
		test (new NOR()){c =>
			c.io.a.poke(8.U)
			c.io.b.poke(1.U)
			c.clock.step(10)
			c.io.c.expect(6.U)
		}
	}
} 