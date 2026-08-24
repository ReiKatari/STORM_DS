package com.github.junrar.unpack.ppm;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FreqData extends Pointer {
    public static final int size = 6;

    public FreqData(byte[] bArr) {
        super(bArr);
    }

    public int getStats() {
        return Raw.readIntLittleEndian(this.mem, this.pos + 2);
    }

    public int getSummFreq() {
        return Raw.readShortLittleEndian(this.mem, this.pos) & 65535;
    }

    public void incSummFreq(int i) {
        Raw.incShortLittleEndian(this.mem, this.pos, i);
    }

    public FreqData init(byte[] bArr) {
        this.mem = bArr;
        this.pos = 0;
        return this;
    }

    public void setStats(int i) {
        Raw.writeIntLittleEndian(this.mem, this.pos + 2, i);
    }

    public void setSummFreq(int i) {
        Raw.writeShortLittleEndian(this.mem, this.pos, (short) i);
    }

    public String toString() {
        return "FreqData[\n  pos=" + this.pos + "\n  size=6\n  summFreq=" + getSummFreq() + "\n  stats=" + getStats() + "\n]";
    }

    public void setStats(State state) {
        setStats(state.getAddress());
    }
}
