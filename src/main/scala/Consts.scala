package icenet

import chisel3._

object IceNetConsts {
  val NET_IF_WIDTH = 64
  val NET_LEN_BITS = 16
  val ETH_MAX_WORDS = 190
  val ETH_HEAD_WORDS = 2
  val ETH_MAC_BITS = 48
  val ETH_TYPE_BITS = 16
  val ETH_PAD_BITS = 16
}

class EthernetHeader extends Bundle {
  val ethType = UInt(IceNetConsts.ETH_TYPE_BITS.W)
  val srcmac = UInt(IceNetConsts.ETH_MAC_BITS.W)
  val dstmac = UInt(IceNetConsts.ETH_MAC_BITS.W)
  val padding = UInt(IceNetConsts.ETH_PAD_BITS.W)
}
