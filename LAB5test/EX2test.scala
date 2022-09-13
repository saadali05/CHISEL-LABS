package LAB5

import chisel3._
import org.scalatest._
import chiseltest._

class eMuxtest extends FreeSpec with ChiselScalatestTester{
    "ALU5" in {test (new eMux(UInt(32.W))){c=>
    c.io.sel.poke(1.B)
    c.io.in1.poke(3.U)
    c.io.in2.poke(2.U)
    c.io.out.expect(3.U)
    c.clock.step(50)
    }
    }
}