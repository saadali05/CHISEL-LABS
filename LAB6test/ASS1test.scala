package LAB6

import chisel3._
import org.scalatest._
import chiseltest._

class counter13test extends FreeSpec with ChiselScalatestTester{
    "counter12" in {test (new counter13(14,0)){c=>
    // c.io.in.poke(1.B)
    c.clock.step(20)
    c.io.out.expect(5.U)
    }
    }
}