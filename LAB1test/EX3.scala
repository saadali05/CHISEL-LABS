package LAB1

import chisel3._
import org.scalatest._
import chiseltest._

class CountertestMAX extends FreeSpec with ChiselScalatestTester{
    "Counter Test" in {
        test (new Counter(1.U)){c =>
        c.clock.step(10)
        c.io.result.expect(0.B)
		}
	}
} 