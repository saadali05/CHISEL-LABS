package LAB3

import chisel3._
import org.scalatest._
import chiseltest._

class decode12test extends FreeSpec with ChiselScalatestTester{
    "decoder_with_valid" in { 
        test (new decode12()){c=>
        c.io.in.poke(1.U)
        c.clock.step(50)
        c.io.out.bits.expect(2.U)
        c.io.out.valid.expect(1.B)
        
        }
    }
}