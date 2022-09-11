package LAB4

import chisel3._
import org.scalatest._
import chiseltest._

class BranchControl1test extends FreeSpec with ChiselScalatestTester{
    "BranchControl" in { test (new BranchControl1()){c=>
    c.io.fnct3.poke("b000".U)
    c.io.branch.poke(1.B)
    c.io.arg_x.poke(15.U)
    c.io.arg_y.poke(5.U)
    c.clock.step(50)
    c.io.br_taken.expect(0.B)
    }
    }
}