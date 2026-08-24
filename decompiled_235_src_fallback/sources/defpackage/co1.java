package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: co1  reason: default package */
/* loaded from: classes.dex */
public final class co1 extends defpackage.e74 {
    public static final defpackage.vn0 i = null;
    public final defpackage.go1 a;
    public final defpackage.lo4 b;
    public final boolean c;
    public final defpackage.r94 d;
    public final boolean e;
    public final defpackage.fo2 f;
    public final defpackage.fo2 g;
    public final boolean h;

    static {
            vn0 r0 = new vn0
            r1 = 23
            r0.<init>(r1)
            defpackage.co1.i = r0
            return
    }

    public co1(defpackage.go1 r1, defpackage.lo4 r2, boolean r3, defpackage.r94 r4, boolean r5, defpackage.do1 r6, defpackage.fo2 r7, boolean r8) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r5 = this;
            fo1 r0 = new fo1
            vn0 r1 = defpackage.co1.i
            boolean r2 = r5.c
            r94 r3 = r5.d
            lo4 r4 = r5.b
            r0.<init>(r1, r2, r3, r4)
            go1 r1 = r5.a
            r0.F0 = r1
            r0.G0 = r4
            boolean r1 = r5.e
            r0.H0 = r1
            fo2 r1 = r5.f
            r0.I0 = r1
            fo2 r1 = r5.g
            r0.J0 = r1
            boolean r5 = r5.h
            r0.K0 = r5
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class<co1> r2 = defpackage.co1.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L11
            return r1
        L11:
            co1 r5 = (defpackage.co1) r5
            go1 r2 = r4.a
            go1 r3 = r5.a
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L1e
            return r1
        L1e:
            lo4 r2 = r4.b
            lo4 r3 = r5.b
            if (r2 == r3) goto L25
            return r1
        L25:
            boolean r2 = r4.c
            boolean r3 = r5.c
            if (r2 == r3) goto L2c
            return r1
        L2c:
            r94 r2 = r4.d
            r94 r3 = r5.d
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L37
            return r1
        L37:
            boolean r2 = r4.e
            boolean r3 = r5.e
            if (r2 == r3) goto L3e
            return r1
        L3e:
            fo2 r2 = r4.f
            fo2 r3 = r5.f
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L49
            return r1
        L49:
            fo2 r2 = r4.g
            fo2 r3 = r5.g
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L54
            return r1
        L54:
            boolean r4 = r4.h
            boolean r5 = r5.h
            if (r4 == r5) goto L5b
            return r1
        L5b:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r7) {
            r6 = this;
            r0 = r7
            fo1 r0 = (defpackage.fo1) r0
            go1 r7 = r0.F0
            go1 r1 = r6.a
            boolean r7 = defpackage.nb3.k(r7, r1)
            r2 = 1
            if (r7 != 0) goto L12
            r0.F0 = r1
            r7 = r2
            goto L13
        L12:
            r7 = 0
        L13:
            lo4 r1 = r0.G0
            lo4 r4 = r6.b
            if (r1 == r4) goto L1c
            r0.G0 = r4
            r7 = r2
        L1c:
            boolean r1 = r0.K0
            boolean r3 = r6.h
            if (r1 == r3) goto L26
            r0.K0 = r3
            r5 = r2
            goto L27
        L26:
            r5 = r7
        L27:
            fo2 r7 = r6.f
            r0.I0 = r7
            fo2 r7 = r6.g
            r0.J0 = r7
            boolean r7 = r6.e
            r0.H0 = r7
            vn0 r1 = defpackage.co1.i
            boolean r2 = r6.c
            r94 r3 = r6.d
            r0.l1(r1, r2, r3, r4, r5)
            return
    }

    public final int hashCode() {
            r3 = this;
            go1 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            lo4 r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.c
            int r0 = defpackage.xg6.e(r2, r0, r1)
            r94 r2 = r3.d
            if (r2 == 0) goto L20
            int r2 = r2.hashCode()
            goto L21
        L20:
            r2 = 0
        L21:
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r3.e
            int r0 = defpackage.xg6.e(r0, r2, r1)
            fo2 r2 = r3.f
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            fo2 r0 = r3.g
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r3 = r3.h
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }
}
