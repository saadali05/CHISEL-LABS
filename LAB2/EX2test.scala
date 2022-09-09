package LAB2

import chisel3._
import org.scalatest._
import chiseltest._

class mult_1Looktest extends FreeSpec with ChiselScalatestTester{
    "Mux_Look_Up" in {
        test (new mult_1Look()){c=>
        c.io.in0.poke(1.B)
		c.io.in1.poke(1.B)
        c.io.in2.poke(1.B)
		c.io.in3.poke(1.B)
        c.io.in4.poke(1.B)
		c.io.in5.poke(1.B)
        c.io.in6.poke(1.B)
		c.io.in7.poke(1.B)
        c.io.select.poke(0.B)
		c.clock.step(100)
		c.io.out3.expect(1.B)
		}
	}
} 