package LAB2

import chisel3._
import org.scalatest._
import chiseltest._

class ASS1Test extends FreeSpec with ChiselScalatestTester{
    "Mux_5_to_1" in {
        test (new Mux_5to1()){c=>
        c.io.s0.poke(1.B)
		c.io.s1.poke(0.B)
        c.io.s2.poke(0.B)
		// c.io.s3.poke(1.B)
        // c.io.select.poke(1.B)
		c.clock.step(100)
		// c.io.out3.expect(24.U)
		}
	}
} 