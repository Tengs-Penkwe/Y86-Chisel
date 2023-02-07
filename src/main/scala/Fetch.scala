package fiveStage

import chisel3._
import chisel3.util._

class Fetch_Decode extends Module {
  val io = IO(new Bundle {
    val predPC  = Input(UInt(64.W))
    
    val stat    = Output(UInt(2.W)) 
    val icode   = Output(UInt(8.W))
    val ifun    = Output(UInt(8.W))
    val rA      = Output(UInt(4.W))
    val rB      = Output(UInt(4.W))
    val valC    = Output(UInt(64.W))
    val valP    = Output(UInt(64.W))
  })
}

class Fetch extends Module {
  val io = IO(new Bundle {
    val predPC  = Input(UInt(64.W))

  })

  val next_pc = io.predPC 

  val memory = Module(new Memory());
  memory.io.f_pc = io.predPC;
  
  val instruction = memory()
}

class Memory extends Module {
  val io = IO(new Bundle {
    val f_pc = Input(UInt(64.W))
    
    // val imem_error = Output(UInt(1.W))
    // val instr_valid = Output(UInt(1.W))
    val icode   = Output(UInt(8.W))
    val ifun    = Output(UInt(8.W))
    val rA      = Output(UInt(4.W))
    val rB      = Output(UInt(4.W))
    val valC    = Output(UInt(64.W))
  })


}

