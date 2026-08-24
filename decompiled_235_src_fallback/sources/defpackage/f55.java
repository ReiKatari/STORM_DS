package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f55  reason: default package */
/* loaded from: classes.dex */
public abstract class f55 {
    public int A;
    public java.lang.Object B;

    public f55() {
            r1 = this;
            r1.<init>()
            r0 = 8
            long[] r0 = new long[r0]
            r1.B = r0
            r0 = -1
            r1.A = r0
            return
    }

    public f55(int r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    public long h0() {
            r2 = this;
            int r0 = r2.A
            r1 = -1
            if (r0 != r1) goto L8
            r0 = 19500(0x4c2c, double:9.6343E-320)
            return r0
        L8:
            java.lang.Object r2 = r2.B
            long[] r2 = (long[]) r2
            r0 = r2[r0]
            return r0
    }

    public void i0(defpackage.au7 r1) {
            r0 = this;
            return
    }

    public void j0(defpackage.au7 r1) {
            r0 = this;
            return
    }

    public abstract defpackage.vu7 k0(defpackage.vu7 r1, java.util.List r2);

    public abstract defpackage.rr6 l0(defpackage.au7 r1, defpackage.rr6 r2);

    public long m0() {
            r3 = this;
            int r0 = r3.A
            r1 = -1
            if (r0 != r1) goto L8
            r0 = 19500(0x4c2c, double:9.6343E-320)
            return r0
        L8:
            java.lang.Object r1 = r3.B
            long[] r1 = (long[]) r1
            int r2 = r0 + (-1)
            r3.A = r2
            r0 = r1[r0]
            return r0
    }

    public void n0(long r4) {
            r3 = this;
            r0 = 19500(0x4c2c, double:9.6343E-320)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r3.A
            int r0 = r0 + 1
            r3.A = r0
            java.lang.Object r1 = r3.B
            long[] r1 = (long[]) r1
            int r2 = r1.length
            if (r0 < r2) goto L1d
            int r2 = r1.length
            int r2 = r2 * 2
            long[] r1 = java.util.Arrays.copyOf(r1, r2)
            r3.B = r1
        L1d:
            java.lang.Object r3 = r3.B
            long[] r3 = (long[]) r3
            r3[r0] = r4
            return
    }
}
