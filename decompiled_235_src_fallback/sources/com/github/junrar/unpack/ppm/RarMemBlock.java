package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RarMemBlock extends com.github.junrar.unpack.ppm.Pointer {
    public static final int size = 12;
    private int NU;
    private int next;
    private int prev;
    private int stamp;

    public RarMemBlock(byte[] r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public int getNU() {
            r2 = this;
            byte[] r0 = r2.mem
            if (r0 == 0) goto L12
            int r1 = r2.pos
            int r1 = r1 + 2
            short r0 = com.github.junrar.io.Raw.readShortLittleEndian(r0, r1)
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r2.NU = r0
        L12:
            int r2 = r2.NU
            return r2
    }

    public int getNext() {
            r2 = this;
            byte[] r0 = r2.mem
            if (r0 == 0) goto Le
            int r1 = r2.pos
            int r1 = r1 + 4
            int r0 = com.github.junrar.io.Raw.readIntLittleEndian(r0, r1)
            r2.next = r0
        Le:
            int r2 = r2.next
            return r2
    }

    public int getPrev() {
            r2 = this;
            byte[] r0 = r2.mem
            if (r0 == 0) goto Le
            int r1 = r2.pos
            int r1 = r1 + 8
            int r0 = com.github.junrar.io.Raw.readIntLittleEndian(r0, r1)
            r2.prev = r0
        Le:
            int r2 = r2.prev
            return r2
    }

    public int getStamp() {
            r2 = this;
            byte[] r0 = r2.mem
            if (r0 == 0) goto L10
            int r1 = r2.pos
            short r0 = com.github.junrar.io.Raw.readShortLittleEndian(r0, r1)
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r2.stamp = r0
        L10:
            int r2 = r2.stamp
            return r2
    }

    public void insertAt(com.github.junrar.unpack.ppm.RarMemBlock r3) {
            r2 = this;
            com.github.junrar.unpack.ppm.RarMemBlock r0 = new com.github.junrar.unpack.ppm.RarMemBlock
            byte[] r1 = r2.mem
            r0.<init>(r1)
            int r3 = r3.getAddress()
            r2.setPrev(r3)
            int r3 = r2.getPrev()
            r0.setAddress(r3)
            int r3 = r0.getNext()
            r2.setNext(r3)
            r0.setNext(r2)
            int r3 = r2.getNext()
            r0.setAddress(r3)
            r0.setPrev(r2)
            return
    }

    public void remove() {
            r2 = this;
            com.github.junrar.unpack.ppm.RarMemBlock r0 = new com.github.junrar.unpack.ppm.RarMemBlock
            byte[] r1 = r2.mem
            r0.<init>(r1)
            int r1 = r2.getPrev()
            r0.setAddress(r1)
            int r1 = r2.getNext()
            r0.setNext(r1)
            int r1 = r2.getNext()
            r0.setAddress(r1)
            int r2 = r2.getPrev()
            r0.setPrev(r2)
            return
    }

    public void setNU(int r2) {
            r1 = this;
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r2
            r1.NU = r0
            byte[] r0 = r1.mem
            if (r0 == 0) goto L12
            int r1 = r1.pos
            int r1 = r1 + 2
            short r2 = (short) r2
            com.github.junrar.io.Raw.writeShortLittleEndian(r0, r1, r2)
        L12:
            return
    }

    public void setNext(int r2) {
            r1 = this;
            r1.next = r2
            byte[] r0 = r1.mem
            if (r0 == 0) goto Ld
            int r1 = r1.pos
            int r1 = r1 + 4
            com.github.junrar.io.Raw.writeIntLittleEndian(r0, r1, r2)
        Ld:
            return
    }

    public void setNext(com.github.junrar.unpack.ppm.RarMemBlock r1) {
            r0 = this;
            int r1 = r1.getAddress()
            r0.setNext(r1)
            return
    }

    public void setPrev(int r2) {
            r1 = this;
            r1.prev = r2
            byte[] r0 = r1.mem
            if (r0 == 0) goto Ld
            int r1 = r1.pos
            int r1 = r1 + 8
            com.github.junrar.io.Raw.writeIntLittleEndian(r0, r1, r2)
        Ld:
            return
    }

    public void setPrev(com.github.junrar.unpack.ppm.RarMemBlock r1) {
            r0 = this;
            int r1 = r1.getAddress()
            r0.setPrev(r1)
            return
    }

    public void setStamp(int r2) {
            r1 = this;
            r1.stamp = r2
            byte[] r0 = r1.mem
            if (r0 == 0) goto Lc
            int r1 = r1.pos
            short r2 = (short) r2
            com.github.junrar.io.Raw.writeShortLittleEndian(r0, r1, r2)
        Lc:
            return
    }
}
