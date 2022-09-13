package LAB5

import chisel3._
import org.scalatest._
import chiseltest._

class Operatortest extends FreeSpec with ChiselScalatestTester{
    "Operator" in {test (new Operator(2,UInt(32.W))(_+_)){c=>
    c.io.in(0).poke("b1001".U)
    c.io.in(1).poke("b1001".U)
    c.io.out.expect(18.U)
    c.clock.step(50)
    }
    }
}