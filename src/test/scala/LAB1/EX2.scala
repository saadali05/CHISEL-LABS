package LAB1

import chisel3._
import org.scalatest._
import chiseltest._

class CountertestMost extends FreeSpec with ChiselScalatestTester{
    "Counter test Most" in {
        test (new CounterMost(2)){c =>
        c.clock.step(20)
        c.io.result.expect(1.B)
		}
	}
} 