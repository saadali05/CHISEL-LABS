package LAB4

 import chisel3._
import chisel3.util._

trait Config {
// word length configuration parameter
val WLEN = 32
// ALU operation control signal width
val ALUOP_SIG_LEN = 4
}

object ALUOP1 {
// ALU Operations , may expand / modify in future
val ALU_ADD = 0. U (4.W)
val ALU_SUB = 1. U (4.W)
val ALU_AND = 2. U (4.W)
val ALU_OR = 3. U (4.W)
val ALU_XOR = 4. U (4.W)
val ALU_SLT = 5. U (4.W)
val ALU_SLL = 6. U (4.W)
val ALU_SLTU = 7. U (4.W)
val ALU_SRL = 8. U (4.W)
val ALU_SRA = 9. U (4.W)
val ALU_COPY_A = 10. U (4.W)
val ALU_COPY_B = 11. U (4.W)
val ALU_XXX = 15. U (4.W)
}
class ALUIO1 extends Bundle with Config {
val in_A = Input ( UInt ( WLEN . W ) )
val in_B = Input ( UInt ( WLEN . W ) )
val alu_Op = Input ( UInt ( ALUOP_SIG_LEN . W ) )
val out = Output ( UInt ( WLEN . W ) )
val sum = Output ( UInt ( WLEN . W ) )
}
import ALUOP1._
class ALU4 extends Module with Config {
val io = IO (new ALUIO1() )
val sum = io . in_A + Mux( io . alu_Op (0) , - io . in_B , io . in_B )
val cmp = Mux( io . in_A ( WLEN-1) === io . in_B ( WLEN -1) , sum (WLEN -1) ,
Mux( io . alu_Op (1) , io . in_B ( WLEN -1) , io . in_A (   WLEN -1) ) )
val shamt = io . in_B (4 ,0) . asUInt
val shin = Mux( io . alu_Op (3) , io . in_A , Reverse ( io . in_A ) )
val shiftr = ( Cat ( io . alu_Op (0) && shin (WLEN -1) , shin ) . asSInt >> shamt ) (WLEN-1 , 0)
val shiftl = Reverse ( shiftr )

io.out := 0.U
io.sum := 0.U
switch (io.alu_Op){
    is (ALU_ADD){ io.out := sum }
    is (ALU_SUB){io.out := sum}
    is (ALU_AND){io.out := io.in_A & io.in_B}
    is (ALU_SLT){io.out := cmp}
    is (ALU_SLTU){io.out := cmp}
    is (ALU_SRA){io.out := shiftr}
    is (ALU_SRL){io.out := shiftr}
    is (ALU_SLL){io.out := shiftl}
    is (ALU_OR){io.out := io.in_A | io.in_B}
    is (ALU_XOR){io.out := io.in_A ^ io.in_B}
    is (ALU_COPY_A){io.out := io.in_A }
    is (ALU_COPY_B){io.out := io.in_B }
}

// val out =
// Mux( io . alu_Op === ALU_ADD . U || io . alu_Op === ALU_SUB .U , sum ,
// Mux( io . alu_Op === ALU_SLT . U || io . alu_Op === ALU_SLTU .U , cmp ,
// Mux( io . alu_Op === ALU_SRA . U || io . alu_Op === ALU_SRL .U , shiftr ,
// Mux( io . alu_Op === ALU_SLL .U , shiftl ,
// Mux( io . alu_Op === ALU_AND .U , ( io . in_A & io . in_B ) ,
// Mux( io . alu_Op === ALU_OR .U , ( io . in_A | io . in_B ) ,
// Mux( io . alu_Op === ALU_XOR .U , ( io . in_A ^ io . in_B ) ,
// Mux( io . alu_Op === ALU_COPY_A .U , io . in_A ,
// Mux( io . alu_Op === ALU_COPY_A .U , io . in_B , 0. U ) ) ) ) ) ) ) ) )
// io . out := out
// io . sum := sum
}

// package LAB4

// import chisel3._ 
// import chisel3.util._ 


// object ALUOP1_ {
//     val ALU_ADD = 0.U(4.W)
//     val ALU_SUB = 1.U(4.W)
//     val ALU_AND = 2.U(4.W)
//     val ALU_OR  = 3.U(4.W)
//     val ALU_XOR = 4.U(4.W)
//     val ALU_SLT = 5.U(4.W)
//     val ALU_SLL = 6.U(4.W)
//     val ALU_SLTU= 7.U(4.W)
//     val ALU_SRL = 8.U(4.W)
//     val ALU_SRA = 9.U(4.W)
//     val ALU_COPY_A = 10.U(4.W)
//     val ALU_COPY_B = 11.U(4.W)
//     val ALU_XXX = 12.U(4.W) 
// }

// trait Config{
//     val WLEN = 32
//     val ALUOP_SIG_LEN = 4
// }

// import ALUOP1_._

// class ALUIO_ extends Bundle with Config{
//     val in_A = Input(UInt(WLEN.W))
//     val in_B = Input(UInt(WLEN.W))
//     val alu_Op = Input(UInt(ALUOP_SIG_LEN.W))
//     val out = Output(UInt(WLEN.W))
//     val sum = Output(UInt(WLEN.W))
// }

// class ALULAB4 extends Module with Config{
//     val io = IO(new ALUIO_)

//     val sum = io.in_A + Mux(io.alu_Op(0), -io.in_B, io.in_B)
//     val cmp = Mux(io.in_A(WLEN-1) === io.in_B(WLEN-1), sum(WLEN-1),
//                 Mux(io.alu_Op(1), io.in_B(WLEN-1), io.in_A(WLEN-1)))
//     val shamt = io.in_B(4,0).asUInt
//     val shin = Mux(io.alu_Op(3), io.in_A, Reverse(io.in_A))
//     val shiftr = (Cat(io.alu_Op(0) && shin(WLEN-1), shin).asSInt >> shamt)(WLEN-1,0)
//     val shitfl = Reverse(shiftr)
//     val out = 
//     Mux(io.alu_Op === ALU_ADD || io.alu_Op === ALU_SUB, sum, 
//     Mux(io.alu_Op === ALU_SLT || io.alu_Op === ALU_SLTU, cmp, 
//     Mux(io.alu_Op === ALU_SRA || io.alu_Op === ALU_SRL, shiftr,
//     Mux(io.alu_Op === ALU_SLL, shitfl, 
//     Mux(io.alu_Op === ALU_AND, (io.in_A & io.in_B),
//     Mux(io.alu_Op === ALU_OR, (io.in_A | io.in_B),
//     Mux(io.alu_Op === ALU_XOR, (io.in_A ^ io.in_B),
//     Mux(io.alu_Op === ALU_COPY_A, io.in_A, 
//     Mux(io.alu_Op === ALU_COPY_B, io.in_B, 0.U)))))))))


//     io.out := out
//     io.sum := sum
// }