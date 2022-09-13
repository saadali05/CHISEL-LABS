package LAB5

import chisel3._
import org.scalatest._
import chiseltest._

class ALU5test extends FreeSpec with ChiselScalatestTester{
    "ALU5" in { test (new ALU5(5)){c=>
    c.io.alu_oper.poke("b0110".U)
    c.io.arg_x.poke(5.U)
    c.io.arg_y.poke(5.U)
    c.io.alu_out.expect(0.U)
    c.clock.step(50)
    }
    }
}