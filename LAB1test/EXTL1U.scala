package LAB1

import chisel3._
import org.scalatest._
import chiseltest._

class Countertest extends FreeSpec with ChiselScalatestTester{
    "Counter Test" in {
        test (new Counter(6.U)){c =>
        c.clock.step(100)
        c.io.result.expect(0.B)
		}
	}
} 