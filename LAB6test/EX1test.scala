package LAB6

import chisel3._
import org.scalatest._
import chiseltest._

class shtregtest extends FreeSpec with ChiselScalatestTester{
    "shift_register" in {test (new shift_register11(6)){c=>
    c.io.in.poke(1.B)
    c.clock.step(20)
    c.io.out.expect(0.B)
    }
    }
}