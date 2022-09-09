package LAB2

import chisel3._
import org.scalatest._
import chiseltest._

class Mux_2to1_IOtest extends FreeSpec with ChiselScalatestTester{
    "Mux_2to1_IO" in {
        test (new Mux_2to1()){c=>
        c.io.in_A.poke(8.U)
		c.io.in_B.poke(15.U)
        c.io.select.poke(0.B)
		c.clock.step(100)
		c.io.out.expect(0.U)
		}
	}
} 