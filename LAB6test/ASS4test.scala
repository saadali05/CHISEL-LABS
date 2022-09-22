package LAB6

import chisel3._
import org.scalatest._
import chiseltest._

class coupdotest extends FreeSpec with ChiselScalatestTester{
    "up_down_counter" in {test (new up_down_counter(3)){c=>
    c.io.up_down.poke(1.B)
    c.clock.step(20)
    c.io.out.expect(0.B)
    }
    }
}