package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cm4  reason: default package */
/* loaded from: classes.dex */
public final class cm4 extends defpackage.a55 {
    public boolean g0;

    @Override // defpackage.a55, defpackage.sc1
    public final defpackage.ux0 c(defpackage.wb6 r5) {
            r4 = this;
            r5.getClass()
            np2 r0 = r5.e()
            bt6 r1 = defpackage.bt6.e
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 != 0) goto L39
            bt6 r1 = defpackage.bt6.h
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 != 0) goto L39
            boolean r0 = r0 instanceof defpackage.dz4
            if (r0 == 0) goto L1c
            goto L39
        L1c:
            fc6 r4 = new fc6
            np2 r5 = r5.e()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Type "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " cannot be directly child of oneof element"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L39:
            long r0 = r4.h0()
            r2 = 19500(0x4c2c, double:9.6343E-320)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L4c
            wb6 r2 = r4.X
            boolean r2 = defpackage.nb3.k(r2, r5)
            if (r2 == 0) goto L4c
            return r4
        L4c:
            boolean r2 = defpackage.mp2.N(r0)
            if (r2 != 0) goto L60
            a55 r2 = new a55
            e55 r3 = r4.R
            e55 r0 = defpackage.uj2.k(r3, r0)
            o45 r4 = r4.L
            r2.<init>(r4, r0, r5)
            return r2
        L60:
            fc6 r4 = new fc6
            java.lang.String r5 = "An oneof element cannot be directly child of another oneof element"
            r4.<init>(r5)
            throw r4
    }

    @Override // defpackage.a55, defpackage.ux0
    public final int q(defpackage.wb6 r1) {
            r0 = this;
            r1.getClass()
            boolean r1 = r0.g0
            if (r1 == 0) goto L9
            r0 = -1
            return r0
        L9:
            r1 = 1
            r0.g0 = r1
            r0 = 0
            return r0
    }
}
