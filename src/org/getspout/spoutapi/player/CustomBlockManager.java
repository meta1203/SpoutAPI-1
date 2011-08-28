package org.getspout.spoutapi.player;

public interface CustomBlockManager {
	
	// Creates a custom block, sends the PacketBlockTextures packet, and @returns the block's
	// id.
	public int createCustomBlock(byte stepSound, int[] textures, int material);
	
	// Sends the PacketBlockTextures packet to the specified player
	public void sendPacket(SpoutPlayer spoutPlayer);
	
	// Removes all custom blocks.
	public void clearBlocks();
	
}
