package LAB3

import chisel3._
import org.scalatest._
import chiseltest._

class Encoder4to2test extends FreeSpec with ChiselScalatestTester{
    "Encoder4to2" in { test (new Encoder4to2()){c=>
    c.io.in.poke("b0010".U)
    // c.io.out.poke(1101.B)
    c.clock.step(50)
    c.io.out.expect(2.U)
    }
    }
}