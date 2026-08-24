package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hq4  reason: default package */
/* loaded from: classes.dex */
public final class hq4 extends defpackage.a55 {
    public int g0;

    @Override // defpackage.a55, defpackage.sc1
    public final defpackage.ux0 c(defpackage.wb6 r3) {
            r2 = this;
            r3.getClass()
            fc6 r2 = new fc6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Packing only supports primitive number types. The input type however was a struct: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // defpackage.a55, defpackage.ux0
    public final int q(defpackage.wb6 r2) {
            r1 = this;
            r2.getClass()
            e55 r2 = r1.R
            boolean r0 = r2.d
            if (r0 != 0) goto L14
            r90 r2 = r2.a
            int r0 = r2.A
            int r2 = r2.B
            int r0 = r0 - r2
            if (r0 != 0) goto L14
            r1 = -1
            return r1
        L14:
            int r2 = r1.g0
            int r0 = r2 + 1
            r1.g0 = r0
            return r2
    }

    @Override // defpackage.a55
    public final java.lang.String u0(long r1) {
            r0 = this;
            fc6 r0 = new fc6
            java.lang.String r1 = "Packing only supports primitive number types. The actual reading is for string."
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.a55
    public final long x0(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            r0 = 19500(0x4c2c, double:9.6343E-320)
            return r0
    }
}
