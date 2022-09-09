package LAB3

import chisel3._
import org.scalatest._
import chiseltest._

class BranchControltest extends FreeSpec with ChiselScalatestTester{
    "BranchControl" in { test (new BranchControl()){c=>
    c.io.fnct3.poke("b000".U)
    c.io.branch.poke(1.B)
    c.io.arg_x.poke("b0110".U)
    c.io.arg_y.poke("b0100".U)
    c.clock.step(50)
    c.io.br_taken.expect(0.B)
    }
    }
}