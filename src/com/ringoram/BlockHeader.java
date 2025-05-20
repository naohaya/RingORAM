package com.ringoram;

public class BlockHeader {
	private int blockIndex;
	private int leafId;

	public BlockHeader() {
		this.blockIndex = -1;
		this.leafId = -1;
	}

	public BlockHeader(int blockIndex, int leafId) {
		this.blockIndex = blockIndex;
		this.leafId = leafId;
	}

	public int getBlockIndex() {
		return blockIndex;
	}

	public void setBlockIndex(int blockIndex) {
		this.blockIndex = blockIndex;
	}

	public int getLeaf_id() {
		return leafId;
	}

	public void setLeaf_id(int leafId) {
		this.leafId = leafId;
	}
}