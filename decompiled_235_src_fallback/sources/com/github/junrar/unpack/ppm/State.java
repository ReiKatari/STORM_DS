package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class State extends com.github.junrar.unpack.ppm.Pointer {
    public static final int size = 6;

    public State(byte[] r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static void ppmdSwap(com.github.junrar.unpack.ppm.State r5, com.github.junrar.unpack.ppm.State r6) {
            byte[] r0 = r5.mem
            byte[] r1 = r6.mem
            int r5 = r5.pos
            int r6 = r6.pos
            r2 = 0
        L9:
            r3 = 6
            if (r2 >= r3) goto L1b
            r3 = r0[r5]
            r4 = r1[r6]
            r0[r5] = r4
            r1[r6] = r3
            int r2 = r2 + 1
            int r5 = r5 + 1
            int r6 = r6 + 1
            goto L9
        L1b:
            return
    }

    public com.github.junrar.unpack.ppm.State decAddress() {
            r1 = this;
            int r0 = r1.pos
            int r0 = r0 + (-6)
            r1.setAddress(r0)
            return r1
    }

    public int getFreq() {
            r1 = this;
            byte[] r0 = r1.mem
            int r1 = r1.pos
            int r1 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
    }

    public int getSuccessor() {
            r1 = this;
            byte[] r0 = r1.mem
            int r1 = r1.pos
            int r1 = r1 + 2
            int r1 = com.github.junrar.io.Raw.readIntLittleEndian(r0, r1)
            return r1
    }

    public int getSymbol() {
            r1 = this;
            byte[] r0 = r1.mem
            int r1 = r1.pos
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
    }

    public com.github.junrar.unpack.ppm.State incAddress() {
            r1 = this;
            int r0 = r1.pos
            int r0 = r0 + 6
            r1.setAddress(r0)
            return r1
    }

    public void incFreq(int r3) {
            r2 = this;
            byte[] r0 = r2.mem
            int r2 = r2.pos
            int r2 = r2 + 1
            r1 = r0[r2]
            int r1 = r1 + r3
            byte r3 = (byte) r1
            r0[r2] = r3
            return
    }

    public com.github.junrar.unpack.ppm.State init(byte[] r1) {
            r0 = this;
            r0.mem = r1
            r1 = 0
            r0.pos = r1
            return r0
    }

    public void setFreq(int r2) {
            r1 = this;
            byte[] r0 = r1.mem
            int r1 = r1.pos
            int r1 = r1 + 1
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    public void setSuccessor(int r2) {
            r1 = this;
            byte[] r0 = r1.mem
            int r1 = r1.pos
            int r1 = r1 + 2
            com.github.junrar.io.Raw.writeIntLittleEndian(r0, r1, r2)
            return
    }

    public void setSuccessor(com.github.junrar.unpack.ppm.PPMContext r1) {
            r0 = this;
            int r1 = r1.getAddress()
            r0.setSuccessor(r1)
            return
    }

    public void setSymbol(int r2) {
            r1 = this;
            byte[] r0 = r1.mem
            int r1 = r1.pos
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    public void setValues(com.github.junrar.unpack.ppm.State r4) {
            r3 = this;
            byte[] r0 = r4.mem
            int r4 = r4.pos
            byte[] r1 = r3.mem
            int r3 = r3.pos
            r2 = 6
            java.lang.System.arraycopy(r0, r4, r1, r3, r2)
            return
    }

    public void setValues(com.github.junrar.unpack.ppm.StateRef r2) {
            r1 = this;
            int r0 = r2.getSymbol()
            r1.setSymbol(r0)
            int r0 = r2.getFreq()
            r1.setFreq(r0)
            int r2 = r2.getSuccessor()
            r1.setSuccessor(r2)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "State[\n  pos="
            r0.<init>(r1)
            int r1 = r2.pos
            r0.append(r1)
            java.lang.String r1 = "\n  size=6\n  symbol="
            r0.append(r1)
            int r1 = r2.getSymbol()
            r0.append(r1)
            java.lang.String r1 = "\n  freq="
            r0.append(r1)
            int r1 = r2.getFreq()
            r0.append(r1)
            java.lang.String r1 = "\n  successor="
            r0.append(r1)
            int r2 = r2.getSuccessor()
            r0.append(r2)
            java.lang.String r2 = "\n]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
