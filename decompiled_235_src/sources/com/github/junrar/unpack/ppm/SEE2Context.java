package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SEE2Context {
    public static final int size = 4;
    private int count;
    private int shift;
    private int summ;

    public int getCount() {
        return this.count;
    }

    public int getMean() {
        int i;
        int i2 = this.summ;
        int i3 = i2 >>> this.shift;
        this.summ = i2 - i3;
        if (i3 == 0) {
            i = 1;
        } else {
            i = 0;
        }
        return i3 + i;
    }

    public int getShift() {
        return this.shift;
    }

    public int getSumm() {
        return this.summ;
    }

    public void incSumm(int i) {
        setSumm(getSumm() + i);
    }

    public void init(int i) {
        this.shift = 3;
        this.summ = (i << 3) & 65535;
        this.count = 4;
    }

    public void setCount(int i) {
        this.count = i & 255;
    }

    public void setShift(int i) {
        this.shift = i & 255;
    }

    public void setSumm(int i) {
        this.summ = i & 65535;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SEE2Context[\n  size=4\n  summ=");
        sb.append(this.summ);
        sb.append("\n  shift=");
        sb.append(this.shift);
        sb.append("\n  count=");
        return lb1.o(sb, this.count, "\n]");
    }

    public void update() {
        int i = this.shift;
        if (i < 7) {
            int i2 = this.count - 1;
            this.count = i2;
            if (i2 == 0) {
                int i3 = this.summ;
                this.summ = i3 + i3;
                this.shift = i + 1;
                this.count = 3 << i;
            }
        }
        this.summ &= 65535;
        this.count &= 255;
        this.shift &= 255;
    }
}
