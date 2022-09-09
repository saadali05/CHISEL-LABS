package LAB3

import chisel3._
import org.scalatest._
import chiseltest._

class ImmdValGentest extends FreeSpec with ChiselScalatestTester{
    "ImmdValGen" in { test (new ImmdValGen()){c=>
    c.io.instr.poke(3.U)
    c.clock.step(50)
    c.io.immd_se.expect(0.U)
    }
    }
}