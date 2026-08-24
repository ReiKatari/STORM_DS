package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mr0  reason: default package */
/* loaded from: classes.dex */
final class mr0 extends defpackage.e74 {
    public final defpackage.r94 a;
    public final defpackage.n43 b;
    public final boolean c;
    public final boolean d;
    public final java.lang.String e;
    public final defpackage.mq5 f;
    public final defpackage.on2 g;

    public mr0(defpackage.r94 r1, defpackage.n43 r2, boolean r3, boolean r4, java.lang.String r5, defpackage.mq5 r6, defpackage.on2 r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r8 = this;
            or0 r0 = new or0
            mq5 r6 = r8.f
            on2 r7 = r8.g
            r94 r1 = r8.a
            n43 r2 = r8.b
            boolean r3 = r8.c
            boolean r4 = r8.d
            java.lang.String r5 = r8.e
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L53
        L3:
            if (r3 != 0) goto L6
            goto L51
        L6:
            java.lang.Class<mr0> r0 = defpackage.mr0.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L51
        Lf:
            mr0 r3 = (defpackage.mr0) r3
            r94 r0 = r2.a
            r94 r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L1c
            goto L51
        L1c:
            n43 r0 = r2.b
            n43 r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L27
            goto L51
        L27:
            boolean r0 = r2.c
            boolean r1 = r3.c
            if (r0 == r1) goto L2e
            goto L51
        L2e:
            boolean r0 = r2.d
            boolean r1 = r3.d
            if (r0 == r1) goto L35
            goto L51
        L35:
            java.lang.String r0 = r2.e
            java.lang.String r1 = r3.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L40
            goto L51
        L40:
            mq5 r0 = r2.f
            mq5 r1 = r3.f
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L4b
            goto L51
        L4b:
            on2 r2 = r2.g
            on2 r3 = r3.g
            if (r2 == r3) goto L53
        L51:
            r2 = 0
            return r2
        L53:
            r2 = 1
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r9) {
            r8 = this;
            r0 = r9
            or0 r0 = (defpackage.or0) r0
            mq5 r6 = r8.f
            on2 r7 = r8.g
            r94 r1 = r8.a
            n43 r2 = r8.b
            boolean r3 = r8.c
            boolean r4 = r8.d
            java.lang.String r5 = r8.e
            r0.f1(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            r94 r1 = r4.a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            r2 = 31
            int r1 = r1 * r2
            n43 r3 = r4.b
            if (r3 == 0) goto L17
            int r3 = r3.hashCode()
            goto L18
        L17:
            r3 = r0
        L18:
            int r1 = r1 + r3
            int r1 = r1 * r2
            boolean r3 = r4.c
            int r1 = defpackage.xg6.e(r1, r3, r2)
            boolean r3 = r4.d
            int r1 = defpackage.xg6.e(r1, r3, r2)
            java.lang.String r3 = r4.e
            if (r3 == 0) goto L2f
            int r3 = r3.hashCode()
            goto L30
        L2f:
            r3 = r0
        L30:
            int r1 = r1 + r3
            int r1 = r1 * r2
            mq5 r3 = r4.f
            if (r3 == 0) goto L3c
            int r0 = r3.a
            int r0 = java.lang.Integer.hashCode(r0)
        L3c:
            int r1 = r1 + r0
            int r1 = r1 * r2
            on2 r4 = r4.g
            int r4 = r4.hashCode()
            int r4 = r4 + r1
            return r4
    }
}
