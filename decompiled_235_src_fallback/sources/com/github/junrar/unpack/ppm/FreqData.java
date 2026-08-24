package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FreqData extends com.github.junrar.unpack.ppm.Pointer {
    public static final int size = 6;

    public FreqData(byte[] r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public int getStats() {
            r1 = this;
            byte[] r0 = r1.mem
            int r1 = r1.pos
            int r1 = r1 + 2
            int r1 = com.github.junrar.io.Raw.readIntLittleEndian(r0, r1)
            return r1
    }

    public int getSummFreq() {
            r1 = this;
            byte[] r0 = r1.mem
            int r1 = r1.pos
            short r1 = com.github.junrar.io.Raw.readShortLittleEndian(r0, r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            return r1
    }

    public void incSummFreq(int r2) {
            r1 = this;
            byte[] r0 = r1.mem
            int r1 = r1.pos
            com.github.junrar.io.Raw.incShortLittleEndian(r0, r1, r2)
            return
    }

    public com.github.junrar.unpack.ppm.FreqData init(byte[] r1) {
            r0 = this;
            r0.mem = r1
            r1 = 0
            r0.pos = r1
            return r0
    }

    public void setStats(int r2) {
            r1 = this;
            byte[] r0 = r1.mem
            int r1 = r1.pos
            int r1 = r1 + 2
            com.github.junrar.io.Raw.writeIntLittleEndian(r0, r1, r2)
            return
    }

    public void setStats(com.github.junrar.unpack.ppm.State r1) {
            r0 = this;
            int r1 = r1.getAddress()
            r0.setStats(r1)
            return
    }

    public void setSummFreq(int r2) {
            r1 = this;
            byte[] r0 = r1.mem
            int r1 = r1.pos
            short r2 = (short) r2
            com.github.junrar.io.Raw.writeShortLittleEndian(r0, r1, r2)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FreqData[\n  pos="
            r0.<init>(r1)
            int r1 = r2.pos
            r0.append(r1)
            java.lang.String r1 = "\n  size=6\n  summFreq="
            r0.append(r1)
            int r1 = r2.getSummFreq()
            r0.append(r1)
            java.lang.String r1 = "\n  stats="
            r0.append(r1)
            int r2 = r2.getStats()
            r0.append(r2)
            java.lang.String r2 = "\n]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
