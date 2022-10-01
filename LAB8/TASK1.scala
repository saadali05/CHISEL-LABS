// package Lab8
// import chisel3 . _
// import chisel3 . util . _
// class memory_assignment extends Module {
// val io = IO (new Bundle {
//     val write = Input (Bool())
//     val memory_out = Vec (4 , Output ( UInt (32. W ) ) )
//     val requestor = Vec (4 , Flipped ( Decoupled ( UInt (32. W ) ) ) )
//     val readaddr = Input ( UInt (5. W ) )
//     val writeaddr = Input ( UInt (5. W ) )
// })
// val producer =  Vec (4 , Output ( UInt (32. W ) ) )
// // Start your code from here
// val que0 = Queue(io.requestor(0),2)
// val que1 = Queue(io.requestor(1),2)
// val que2 = Queue(io.requestor(2),2)
// val que3 = Queue(io.requestor(3),2)
// val arb_priority = Module (new Arbiter ( UInt () , 4) )
// // connect the inputs to different producers
// arb_priority . io . que0 <> producer0 . io . out
// arb_priority . io . que1 <> producer1 . io . out
// arb_priority . io . que2 <> producer2 . io . out
// arb_priority . io . que3 <> producer2 . io . out
// // connect the output to consumer
// consumer . io . requestor <> arb_priority . io . out
// io . memory_out := mem.read ( io . readaddr  , io . out)
// // End your code here
// }