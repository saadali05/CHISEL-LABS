package LAB8

import chisel3._
import org.scalatest._
import chiseltest._

class Maskedtest extends FreeSpec with ChiselScalatestTester{
	"Masked Read Write Smem" in {test (new MaskedReadWriteSmem()){c =>
		c.io.enable.poke(1.B)
		c.io.write.poke(1.B)
        c.io.addr.poke(8.U)
		c.io.mask(0).poke(0.B)
        c.io.mask(1).poke(1.B)
        c.io.mask(2).poke(0.B)
        c.io.mask(3).poke(1.B)
        c.io.dataIn(0).poke(8.U)
        c.io.dataIn(1).poke(6.U)
        c.io.dataIn(2).poke(4.U)
        c.io.dataIn(3).poke(2.U)
		c.clock.step(20)
		}
	}
} 