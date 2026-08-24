package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v76  reason: default package */
/* loaded from: classes.dex */
final class v76 extends defpackage.e74 {
    public final defpackage.f86 a;
    public final defpackage.lo4 b;
    public final boolean c;
    public final boolean d;
    public final defpackage.r94 e;

    public v76(defpackage.f86 r1, defpackage.lo4 r2, boolean r3, boolean r4, defpackage.r94 r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r9 = this;
            e86 r0 = new e86
            r94 r4 = r9.e
            r2 = 0
            r1 = 0
            r3 = 0
            lo4 r5 = r9.b
            f86 r6 = r9.a
            boolean r7 = r9.c
            boolean r8 = r9.d
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L36
        L3:
            boolean r0 = r3 instanceof defpackage.v76
            if (r0 != 0) goto L8
            goto L34
        L8:
            v76 r3 = (defpackage.v76) r3
            f86 r0 = r3.a
            f86 r1 = r2.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L15
            goto L34
        L15:
            lo4 r0 = r2.b
            lo4 r1 = r3.b
            if (r0 == r1) goto L1c
            goto L34
        L1c:
            boolean r0 = r2.c
            boolean r1 = r3.c
            if (r0 == r1) goto L23
            goto L34
        L23:
            boolean r0 = r2.d
            boolean r1 = r3.d
            if (r0 == r1) goto L2a
            goto L34
        L2a:
            r94 r2 = r2.e
            r94 r3 = r3.e
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L36
        L34:
            r2 = 0
            return r2
        L36:
            r2 = 1
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r10) {
            r9 = this;
            r0 = r10
            e86 r0 = (defpackage.e86) r0
            r94 r4 = r9.e
            r2 = 0
            r1 = 0
            r3 = 0
            lo4 r5 = r9.b
            f86 r6 = r9.a
            boolean r7 = r9.c
            boolean r8 = r9.d
            r0.m1(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public final int hashCode() {
            r4 = this;
            f86 r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            lo4 r2 = r4.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            r0 = 961(0x3c1, float:1.347E-42)
            int r2 = r2 * r0
            boolean r3 = r4.c
            int r2 = defpackage.xg6.e(r2, r3, r1)
            boolean r3 = r4.d
            int r0 = defpackage.xg6.e(r2, r3, r0)
            r94 r4 = r4.e
            if (r4 == 0) goto L28
            int r4 = r4.hashCode()
            goto L29
        L28:
            r4 = 0
        L29:
            int r0 = r0 + r4
            int r0 = r0 * r1
            return r0
    }
}
