package LAB3

import chisel3._
import org.scalatest._
import chiseltest._

class Decoder2to4test extends FreeSpec with ChiselScalatestTester{
    "Decoder2to4" in { test (new Decoder2to4()){c=>
        c.io.in.poke(13.B)
		c.io.out.poke(1101.B)
        c.clock.step(100)
        c.io.out.expect(13.U)
    }
    }
}