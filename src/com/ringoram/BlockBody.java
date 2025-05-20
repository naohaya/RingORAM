package com.ringoram;

public class BlockBody {
	private byte[] data;

	public BlockBody() {
		this.data = new byte[Configs.BLOCK_DATA_LEN];
	}

	public BlockBody(byte[] data) {
		this.data = data;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
}