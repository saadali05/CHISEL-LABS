package LAB7

import chisel3._
import org.scalatest._
import chiseltest._

class MyQuetest extends FreeSpec with ChiselScalatestTester{
	"My_Queue 7 GATE" in {test (new MyQueue()){c =>
		c.io.f1.poke(1.B)
		c.io.f2.poke(1.B)
        c.io.r1.poke(0.B)
		c.io.r2.poke(1.B)
		// c.io.in.poke(1.B)
        c.clock.step(20)
		}
	}
}