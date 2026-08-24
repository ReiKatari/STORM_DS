package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dm4  reason: default package */
/* loaded from: classes.dex */
public final class dm4 extends defpackage.c55 {
    public final defpackage.s35 Z;

    public dm4(defpackage.o45 r2, defpackage.s35 r3, defpackage.wb6 r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r1.<init>(r2, r3, r4)
            r1.Z = r3
            np2 r1 = r4.e()
            boolean r1 = r1 instanceof defpackage.dz4
            if (r1 == 0) goto L17
            return
        L17:
            java.lang.String r1 = r4.a()
            np2 r2 = r4.e()
            r3 = 46
            java.lang.String r4 = "The serializer of one of type "
            java.lang.String r0 = " should be using generic polymorphic serializer, but got "
            defpackage.e41.s(r4, r1, r0, r2, r3)
            r1 = 0
            throw r1
    }

    @Override // defpackage.c55, defpackage.x32
    public final defpackage.vx0 c(defpackage.wb6 r9) {
            r8 = this;
            r9.getClass()
            wb6 r0 = r8.Y
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto Lc
            return r8
        Lc:
            bm4 r0 = new bm4
            o45 r1 = r8.R
            r1.getClass()
            s35 r8 = r8.Z
            r8.getClass()
            r0.<init>(r1, r8, r9)
            int r8 = r9.f()
            r1 = 0
            r2 = 1
            java.lang.String r3 = "Implementation of oneOf type "
            if (r8 != r2) goto L60
            r8 = 0
            java.util.List r4 = r9.i(r8)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L33:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L45
            java.lang.Object r6 = r4.next()
            boolean r7 = r6 instanceof defpackage.r45
            if (r7 == 0) goto L33
            r5.add(r6)
            goto L33
        L45:
            int r4 = r5.size()
            if (r4 != r2) goto L50
            java.lang.Object r8 = r5.get(r8)
            goto L51
        L50:
            r8 = r1
        L51:
            r45 r8 = (defpackage.r45) r8
            if (r8 == 0) goto L56
            return r0
        L56:
            java.lang.String r8 = r9.a()
            java.lang.String r9 = " should have @ProtoNumber annotation"
            defpackage.u34.A(r8, r9, r3)
            return r1
        L60:
            java.lang.String r8 = r9.a()
            java.lang.String r0 = " should contain only 1 element, but get "
            int r9 = r9.f()
            defpackage.u34.k(r3, r8, r0, r9)
            return r1
    }

    @Override // defpackage.c55, defpackage.x32
    public final defpackage.x32 s(defpackage.wb6 r7) {
            r6 = this;
            r7.getClass()
            int r0 = r6.A
            if (r0 < 0) goto L27
            java.lang.Object r1 = r6.B
            long[] r1 = (long[]) r1
            int r2 = r0 + (-1)
            r6.A = r2
            r0 = r1[r0]
            r2 = 0
            long r2 = defpackage.mp2.t(r7, r2)
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r2 = r2 & r4
            int r7 = (int) r2
            r2 = 1152921500311879680(0xfffffff00000000, double:1.2882291396436117E-231)
            long r0 = r0 & r2
            long r2 = (long) r7
            long r0 = r0 | r2
            r6.n0(r0)
            return r6
        L27:
            fc6 r6 = new fc6
            java.lang.String r7 = "No tag in stack for requested element"
            r6.<init>(r7)
            throw r6
    }

    @Override // defpackage.c55
    public final void s0(long r3, java.lang.String r5) {
            r2 = this;
            r5.getClass()
            r0 = 19501(0x4c2d, double:9.635E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto Lc
            super.s0(r3, r5)
        Lc:
            return
    }

    @Override // defpackage.c55
    public final long u0(defpackage.wb6 r3, int r4) {
            r2 = this;
            r3.getClass()
            if (r4 == 0) goto L2b
            r2 = 1
            if (r4 != r2) goto Ld
            long r2 = defpackage.mp2.t(r3, r4)
            return r2
        Ld:
            fc6 r2 = new fc6
            java.lang.String r0 = "Unsupported index: "
            java.lang.String r1 = " in a oneOf type "
            java.lang.StringBuilder r4 = defpackage.xg6.t(r0, r4, r1)
            java.lang.String r3 = r3.a()
            r4.append(r3)
            java.lang.String r3 = ", which should be using generic polymorphic serializer"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L2b:
            r2 = 19501(0x4c2d, double:9.635E-320)
            return r2
    }
}
