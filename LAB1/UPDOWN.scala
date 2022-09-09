package LAB1

import chisel3._
import org.scalatest._
import chiseltest._

class updowntest extends FreeSpec with ChiselScalatestTester{
    "UP DOWN Counter" in {
        test (new updown(2)){c =>
        c.clock.step(100)
		}
	}
} 