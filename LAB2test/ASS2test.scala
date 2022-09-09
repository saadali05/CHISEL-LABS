package LAB2

import chisel3._
import org.scalatest._
import chiseltest._

class barrelshifttest extends FreeSpec with ChiselScalatestTester{
    "barrel_shift" in {
        test(new Barrelshifter()){c=>
        c.io.se0.poke(1.B)
		c.io.se1.poke(1.B)
        c.io.in0.poke(0.B)
        c.io.in1.poke(1.B)
        c.io.in2.poke(0.B)
        c.io.in3.poke(1.B)
        c.io.shift_type.poke(0.B)
        c.io.out0.expect(0.B)
        c.io.out1.expect(1.B)
        c.io.out2.expect(0.B)
        c.io.out3.expect(1.B)
		c.clock.step(100)
		}
	}
} 