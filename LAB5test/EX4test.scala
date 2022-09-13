package LAB5

import chisel3._
import org.scalatest._
import chiseltest._

class Toptest extends FreeSpec with ChiselScalatestTester{
    "Operator" in {test (new Top(2,3,4)){c=>
    c.io.in(0).poke(1.B)
    c.io.in(1).poke(0.B)
    c.io.out.expect(18.U)
    c.clock.step(50)
    }
    }
}
