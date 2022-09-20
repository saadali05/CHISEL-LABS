package LAB7

import chisel3._
import chisel3.util._
//import chisel3.iotesters.{ChiselFlatSpec , Driver , PeekPokeTester}

class MyQueue extends Module {
    val io = IO (new Bundle {
        val f1 = Input ( Bool () )
        val f2 = Input ( Bool () )
        val r1 = Input ( Bool () )
        val r2 = Input ( Bool () )
        val out = Output ( Bool () )})

// your code begin
val s0 :: s1 :: s2 :: s3 :: s4 :: s5:: Nil = Enum (6)
val state = RegInit ( s0 )
io.out := 0.B
switch (state) {
    is ( s0 ) {
        when ( !io.f1 && !io.f2) {
            state := s0
            io.out := 0.B
        }.elsewhen (io.f1 && !io.f2 ){
            state := s1
            io.out := 0.B
        }.elsewhen (!io.f1 && io.f2){
            state := s5
            io.out := 0.B
        }.elsewhen(io.f1 && io.f2){
            state := s1
        }}
    is ( s1 ) {
        when (!io.f1 && !io.r1 ) {
            state := s1
            io.out := 0.B  
        }.elsewhen(io.f1 === 1.B){
            state := s2
            io.out := 0.B
        }.elsewhen(!io.f1 && io.r1) {
            state := s0
        }}
    is ( s2 ) {
        when ( io.f2 &&io.r2 ) {
            state := s2
            io.out := 1.B
        }.elsewhen(io.f1 === 1.B){
            state := s3
            io.out := 1.B
        }.elsewhen(!io.f1 && io.r1){
            state := s1
            io.out := 1.B
        }}
    is ( s3 ) {
        state := s0
        }
    is ( s4 ) {
        when (io.r1) {
            state := s3
        }.elsewhen(!io.f2 && !io.r2){
            state := s4
            io.out := 1.B
        }.elsewhen(!io.f2 && io.r2){
            state := s5
            io.out := 1.B
        }}
    is ( s5 ) {
        when ( io . f2 ) {
            state := s4
        }.elsewhen(!io.f2 && !io.r2){
            state := s5
        }.elsewhen(!io.f2 && io.r2){
            state := s0
        }}
}
// your code end here
}