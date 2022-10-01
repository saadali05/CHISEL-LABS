package LAB8

import chisel3._
import org.scalatest._
import chiseltest._

class Forwardingtest extends FreeSpec with ChiselScalatestTester{
	"Forwarding" in {test (new Forwarding()){c =>
		c.io.rdAddr.poke(2.U)
		c.io.wrAddr.poke(4.U)
        c.io.wrData.poke(6.U)
		c.io.wr_en.poke(1.B)
        c.clock.step(20)
		}
	}
} 