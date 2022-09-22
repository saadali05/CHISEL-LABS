package LAB6

import chisel3._
import org.scalatest._
import chiseltest._

class countxortest extends FreeSpec with ChiselScalatestTester{
    "count XOR" in {test (new countxor(3)){c=>
    c.clock.step(20)
    c.io.out.expect(2.U)
    }
    }
}