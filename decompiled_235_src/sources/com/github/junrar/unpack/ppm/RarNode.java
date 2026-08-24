package com.github.junrar.unpack.ppm;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RarNode extends Pointer {
    public static final int size = 4;
    private int next;

    public RarNode(byte[] bArr) {
        super(bArr);
    }

    public int getNext() {
        byte[] bArr = this.mem;
        if (bArr != null) {
            this.next = Raw.readIntLittleEndian(bArr, this.pos);
        }
        return this.next;
    }

    public void setNext(int i) {
        this.next = i;
        byte[] bArr = this.mem;
        if (bArr != null) {
            Raw.writeIntLittleEndian(bArr, this.pos, i);
        }
    }

    public String toString() {
        return "State[\n  pos=" + this.pos + "\n  size=4\n  next=" + getNext() + "\n]";
    }

    public void setNext(RarNode rarNode) {
        setNext(rarNode.getAddress());
    }
}
