package LAB3

import chisel3._
import org.scalatest._
import chiseltest._

class ALUtest extends FreeSpec with ChiselScalatestTester{
    "ALU" in { test (new ALU()){c=>
    c.io.in_A.poke("b0010".U)
    c.io.in_B.poke("b0011".U)
    c.io.alu_Op.poke("b0110".U)
    c.clock.step(50)
    c.io.out.expect(16.U)
    c.io.sum.expect(0.U)
    }
    }
}