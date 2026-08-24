package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RarNode extends com.github.junrar.unpack.ppm.Pointer {
    public static final int size = 4;
    private int next;

    public RarNode(byte[] r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public int getNext() {
            r2 = this;
            byte[] r0 = r2.mem
            if (r0 == 0) goto Lc
            int r1 = r2.pos
            int r0 = com.github.junrar.io.Raw.readIntLittleEndian(r0, r1)
            r2.next = r0
        Lc:
            int r2 = r2.next
            return r2
    }

    public void setNext(int r2) {
            r1 = this;
            r1.next = r2
            byte[] r0 = r1.mem
            if (r0 == 0) goto Lb
            int r1 = r1.pos
            com.github.junrar.io.Raw.writeIntLittleEndian(r0, r1, r2)
        Lb:
            return
    }

    public void setNext(com.github.junrar.unpack.ppm.RarNode r1) {
            r0 = this;
            int r1 = r1.getAddress()
            r0.setNext(r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "State[\n  pos="
            r0.<init>(r1)
            int r1 = r2.pos
            r0.append(r1)
            java.lang.String r1 = "\n  size=4\n  next="
            r0.append(r1)
            int r2 = r2.getNext()
            r0.append(r2)
            java.lang.String r2 = "\n]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
