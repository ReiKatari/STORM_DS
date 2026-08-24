package com.github.junrar.unpack.ppm;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RarMemBlock extends Pointer {
    public static final int size = 12;
    private int NU;
    private int next;
    private int prev;
    private int stamp;

    public RarMemBlock(byte[] bArr) {
        super(bArr);
    }

    public int getNU() {
        byte[] bArr = this.mem;
        if (bArr != null) {
            this.NU = Raw.readShortLittleEndian(bArr, this.pos + 2) & 65535;
        }
        return this.NU;
    }

    public int getNext() {
        byte[] bArr = this.mem;
        if (bArr != null) {
            this.next = Raw.readIntLittleEndian(bArr, this.pos + 4);
        }
        return this.next;
    }

    public int getPrev() {
        byte[] bArr = this.mem;
        if (bArr != null) {
            this.prev = Raw.readIntLittleEndian(bArr, this.pos + 8);
        }
        return this.prev;
    }

    public int getStamp() {
        byte[] bArr = this.mem;
        if (bArr != null) {
            this.stamp = Raw.readShortLittleEndian(bArr, this.pos) & 65535;
        }
        return this.stamp;
    }

    public void insertAt(RarMemBlock rarMemBlock) {
        RarMemBlock rarMemBlock2 = new RarMemBlock(this.mem);
        setPrev(rarMemBlock.getAddress());
        rarMemBlock2.setAddress(getPrev());
        setNext(rarMemBlock2.getNext());
        rarMemBlock2.setNext(this);
        rarMemBlock2.setAddress(getNext());
        rarMemBlock2.setPrev(this);
    }

    public void remove() {
        RarMemBlock rarMemBlock = new RarMemBlock(this.mem);
        rarMemBlock.setAddress(getPrev());
        rarMemBlock.setNext(getNext());
        rarMemBlock.setAddress(getNext());
        rarMemBlock.setPrev(getPrev());
    }

    public void setNU(int i) {
        this.NU = 65535 & i;
        byte[] bArr = this.mem;
        if (bArr != null) {
            Raw.writeShortLittleEndian(bArr, this.pos + 2, (short) i);
        }
    }

    public void setNext(int i) {
        this.next = i;
        byte[] bArr = this.mem;
        if (bArr != null) {
            Raw.writeIntLittleEndian(bArr, this.pos + 4, i);
        }
    }

    public void setPrev(int i) {
        this.prev = i;
        byte[] bArr = this.mem;
        if (bArr != null) {
            Raw.writeIntLittleEndian(bArr, this.pos + 8, i);
        }
    }

    public void setStamp(int i) {
        this.stamp = i;
        byte[] bArr = this.mem;
        if (bArr != null) {
            Raw.writeShortLittleEndian(bArr, this.pos, (short) i);
        }
    }

    public void setNext(RarMemBlock rarMemBlock) {
        setNext(rarMemBlock.getAddress());
    }

    public void setPrev(RarMemBlock rarMemBlock) {
        setPrev(rarMemBlock.getAddress());
    }
}
