package org.getspout.spoutapi.packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class PacketBlockTextures implements SpoutPacket{
	
	private int id;
	private int[] texture = new int[6];
	private byte byteSS;
	
	public PacketBlockTextures() {
	}
	
	public PacketBlockTextures(int id, int[] texture, byte byteSS) {
		this.id = id;
		this.texture = texture;
		this.byteSS = byteSS;
	}
	
	@Override
	public int getNumBytes() {
		return 4*6 + 4 + 1 + 1;
	}

	@Override
	public void readData(DataInputStream input) throws IOException {
		// TODO Auto-generated method stub
		texture[0] = input.readInt();
		texture[1] = input.readInt();
		texture[2] = input.readInt();
		texture[3] = input.readInt();
		texture[4] = input.readInt();
		texture[5] = input.readInt();
		id = input.readInt();
		byteSS = input.readByte();
	}

	@Override
	public void writeData(DataOutputStream output) throws IOException {
		for (int x : texture) {
			output.writeInt(x);
		}
		output.writeInt(id);
		output.writeByte(byteSS);
	}

	@Override
	public void run(int playerId) {
	}

	@Override
	public void failure(int playerId) {
	}

	@Override
	public PacketType getPacketType() {
		return PacketType.PacketBlockTextures;
	}

	@Override
	public int getVersion() {
		return 0;
	}

}
