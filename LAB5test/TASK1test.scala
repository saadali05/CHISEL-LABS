package LAB5

import chisel3._
import org.scalatest._
import chiseltest._

class Adder5test extends FreeSpec with ChiselScalatestTester{
    "Operator" in {test (new Adder5(32)){c=>
    c.io.in0.poke(12.U)
    c.io.in1.poke(15.U)
    c.clock.step(50)
    c.io.out.expect(27.U)
    
    }
    }
}