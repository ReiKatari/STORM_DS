package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: em4  reason: default package */
/* loaded from: classes.dex */
public final class em4 extends defpackage.a55 {
    public final long g0;
    public boolean h0;
    public boolean i0;

    public em4(defpackage.o45 r1, defpackage.e55 r2, long r3, defpackage.wb6 r5) {
            r0 = this;
            r5.getClass()
            r0.<init>(r1, r2, r5)
            r0.g0 = r3
            return
    }

    @Override // defpackage.a55, defpackage.sc1
    public final defpackage.ux0 c(defpackage.wb6 r9) {
            r8 = this;
            r9.getClass()
            wb6 r0 = r8.X
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lc
            return r8
        Lc:
            cm4 r0 = new cm4
            o45 r1 = r8.L
            e55 r8 = r8.R
            r0.<init>(r1, r8, r9)
            int r8 = r9.f()
            r1 = 0
            r2 = 1
            java.lang.String r3 = "Implementation of oneOf type "
            if (r8 != r2) goto L5d
            r8 = 0
            java.util.List r4 = r9.i(r8)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L2d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L3f
            java.lang.Object r6 = r4.next()
            boolean r7 = r6 instanceof defpackage.r45
            if (r7 == 0) goto L2d
            r5.add(r6)
            goto L2d
        L3f:
            int r4 = r5.size()
            if (r4 != r2) goto L4a
            java.lang.Object r8 = r5.get(r8)
            goto L4b
        L4a:
            r8 = r1
        L4b:
            r45 r8 = (defpackage.r45) r8
            if (r8 == 0) goto L53
            r8.number()
            return r0
        L53:
            java.lang.String r8 = r9.a()
            java.lang.String r9 = " should have @ProtoNumber annotation"
            defpackage.u34.A(r8, r9, r3)
            return r1
        L5d:
            java.lang.String r8 = r9.a()
            java.lang.String r0 = " should contain only 1 element, but get "
            int r9 = r9.f()
            defpackage.u34.k(r3, r8, r0, r9)
            return r1
    }

    @Override // defpackage.a55, defpackage.ux0
    public final int q(defpackage.wb6 r2) {
            r1 = this;
            r2.getClass()
            boolean r2 = r1.h0
            r0 = 1
            if (r2 != 0) goto Lc
            r1.h0 = r0
            r1 = 0
            return r1
        Lc:
            boolean r2 = r1.i0
            if (r2 != 0) goto L13
            r1.i0 = r0
            return r0
        L13:
            r1 = -1
            return r1
    }

    @Override // defpackage.a55
    public final java.lang.String u0(long r7) {
            r6 = this;
            r0 = 19501(0x4c2d, double:9.635E-320)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L69
            o45 r7 = r6.L
            jd1 r7 = r7.b
            long r0 = r6.g0
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 & r2
            int r8 = (int) r0
            wb6 r6 = r6.X
            r6.getClass()
            r7.getClass()
            java.util.List r7 = defpackage.mp2.y(r6, r7)
            java.util.Iterator r7 = r7.iterator()
        L21:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r7.next()
            r1 = r0
            wb6 r1 = (defpackage.wb6) r1
            r4 = 0
            long r4 = defpackage.mp2.t(r1, r4)
            long r4 = r4 & r2
            int r1 = (int) r4
            if (r1 != r8) goto L21
            goto L39
        L38:
            r0 = 0
        L39:
            wb6 r0 = (defpackage.wb6) r0
            if (r0 == 0) goto L44
            java.lang.String r7 = r0.a()
            if (r7 == 0) goto L44
            return r7
        L44:
            fc6 r7 = new fc6
            java.lang.String r6 = r6.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot find a subclass of "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " annotated with @ProtoNumber("
            r0.append(r6)
            r0.append(r8)
            java.lang.String r6 = ")."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L69:
            java.lang.String r6 = super.u0(r7)
            return r6
    }

    @Override // defpackage.a55
    public final long x0(defpackage.wb6 r1, int r2) {
            r0 = this;
            r1.getClass()
            if (r2 != 0) goto L8
            r0 = 19501(0x4c2d, double:9.635E-320)
            return r0
        L8:
            r0 = 0
            long r0 = defpackage.mp2.t(r1, r0)
            return r0
    }
}
