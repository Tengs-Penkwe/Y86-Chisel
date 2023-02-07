package fiveStage

import chisel3._
import chisel3.util._

class Decode extends Module {
  val io = IO(new Bundle {
    val stat    = Input(UInt(2.W))
    val icode   = Input(UInt(8.W))
    val valP    = Input(UInt(64.W))
  })

  if 

  
}


object Main extends App {
  // These lines generate the Verilog output
  new (chisel3.stage.ChiselStage).emitVerilog(
    new Blinky(1000),
    Array("--target-dir", "generated")
  )
}
