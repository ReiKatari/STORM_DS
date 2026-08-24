package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SEE2Context {
    public static final int size = 4;
    private int count;
    private int shift;
    private int summ;

    public SEE2Context() {
            r0 = this;
            r0.<init>()
            return
    }

    public int getCount() {
            r0 = this;
            int r0 = r0.count
            return r0
    }

    public int getMean() {
            r2 = this;
            int r0 = r2.summ
            int r1 = r2.shift
            int r1 = r0 >>> r1
            int r0 = r0 - r1
            r2.summ = r0
            if (r1 != 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            int r1 = r1 + r2
            return r1
    }

    public int getShift() {
            r0 = this;
            int r0 = r0.shift
            return r0
    }

    public int getSumm() {
            r0 = this;
            int r0 = r0.summ
            return r0
    }

    public void incSumm(int r2) {
            r1 = this;
            int r0 = r1.getSumm()
            int r0 = r0 + r2
            r1.setSumm(r0)
            return
    }

    public void init(int r2) {
            r1 = this;
            r0 = 3
            r1.shift = r0
            int r2 = r2 << r0
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            r1.summ = r2
            r2 = 4
            r1.count = r2
            return
    }

    public void setCount(int r1) {
            r0 = this;
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.count = r1
            return
    }

    public void setShift(int r1) {
            r0 = this;
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.shift = r1
            return
    }

    public void setSumm(int r2) {
            r1 = this;
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            r1.summ = r2
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SEE2Context[\n  size=4\n  summ="
            r0.<init>(r1)
            int r1 = r2.summ
            r0.append(r1)
            java.lang.String r1 = "\n  shift="
            r0.append(r1)
            int r1 = r2.shift
            r0.append(r1)
            java.lang.String r1 = "\n  count="
            r0.append(r1)
            int r2 = r2.count
            java.lang.String r1 = "\n]"
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
    }

    public void update() {
            r2 = this;
            int r0 = r2.shift
            r1 = 7
            if (r0 >= r1) goto L1b
            int r1 = r2.count
            int r1 = r1 + (-1)
            r2.count = r1
            if (r1 != 0) goto L1b
            int r1 = r2.summ
            int r1 = r1 + r1
            r2.summ = r1
            int r1 = r0 + 1
            r2.shift = r1
            r1 = 3
            int r0 = r1 << r0
            r2.count = r0
        L1b:
            int r0 = r2.summ
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r2.summ = r0
            int r0 = r2.count
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2.count = r0
            int r0 = r2.shift
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2.shift = r0
            return
    }
}
