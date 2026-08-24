package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o47  reason: default package */
/* loaded from: classes.dex */
public final class o47 extends defpackage.e74 {
    public final java.lang.String a;
    public final defpackage.s47 b;
    public final defpackage.ki2 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final defpackage.lt0 h;

    public o47(java.lang.String r1, defpackage.s47 r2, defpackage.ki2 r3, int r4, boolean r5, int r6, int r7, defpackage.lt0 r8) {
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
            r2 = this;
            r47 r0 = new r47
            r0.<init>()
            java.lang.String r1 = r2.a
            r0.k0 = r1
            s47 r1 = r2.b
            r0.l0 = r1
            ki2 r1 = r2.c
            r0.m0 = r1
            int r1 = r2.d
            r0.n0 = r1
            boolean r1 = r2.e
            r0.o0 = r1
            int r1 = r2.f
            r0.p0 = r1
            int r1 = r2.g
            r0.q0 = r1
            lt0 r2 = r2.h
            r0.r0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.o47
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o47 r5 = (defpackage.o47) r5
            lt0 r1 = r5.h
            lt0 r3 = r4.h
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            s47 r1 = r4.b
            s47 r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            ki2 r1 = r4.c
            ki2 r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            int r1 = r4.d
            int r3 = r5.d
            if (r1 != r3) goto L54
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L45
            return r2
        L45:
            int r1 = r4.f
            int r3 = r5.f
            if (r1 == r3) goto L4c
            return r2
        L4c:
            int r4 = r4.g
            int r5 = r5.g
            if (r4 == r5) goto L53
            return r2
        L53:
            return r0
        L54:
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r47 r1 = (defpackage.r47) r1
            lt0 r2 = r1.r0
            lt0 r3 = r0.h
            boolean r2 = defpackage.nb3.k(r3, r2)
            r1.r0 = r3
            r3 = 0
            r4 = 1
            s47 r5 = r0.b
            if (r2 == 0) goto L2a
            s47 r2 = r1.l0
            if (r5 == r2) goto L25
            nn6 r6 = r5.a
            nn6 r2 = r2.a
            boolean r2 = r6.b(r2)
            if (r2 == 0) goto L2a
            goto L28
        L25:
            r5.getClass()
        L28:
            r2 = r3
            goto L2b
        L2a:
            r2 = r4
        L2b:
            java.lang.String r6 = r1.k0
            java.lang.String r7 = r0.a
            boolean r6 = defpackage.nb3.k(r6, r7)
            r8 = 0
            if (r6 == 0) goto L37
            goto L3c
        L37:
            r1.k0 = r7
            r1.w0 = r8
            r3 = r4
        L3c:
            s47 r6 = r1.l0
            boolean r6 = r6.c(r5)
            r6 = r6 ^ r4
            r1.l0 = r5
            int r5 = r1.q0
            int r7 = r0.g
            if (r5 == r7) goto L4e
            r1.q0 = r7
            r6 = r4
        L4e:
            int r5 = r1.p0
            int r7 = r0.f
            if (r5 == r7) goto L57
            r1.p0 = r7
            r6 = r4
        L57:
            boolean r5 = r1.o0
            boolean r7 = r0.e
            if (r5 == r7) goto L60
            r1.o0 = r7
            r6 = r4
        L60:
            ki2 r5 = r1.m0
            ki2 r7 = r0.c
            boolean r5 = defpackage.nb3.k(r5, r7)
            if (r5 != 0) goto L6d
            r1.m0 = r7
            r6 = r4
        L6d:
            int r5 = r1.n0
            int r0 = r0.d
            if (r5 != r0) goto L75
            r4 = r6
            goto L77
        L75:
            r1.n0 = r0
        L77:
            if (r2 != 0) goto L7d
            if (r3 != 0) goto L7d
            if (r4 == 0) goto L7f
        L7d:
            r1.u0 = r8
        L7f:
            if (r3 != 0) goto L83
            if (r4 == 0) goto L9a
        L83:
            bs4 r9 = r1.R0()
            java.lang.String r10 = r1.k0
            s47 r11 = r1.l0
            ki2 r12 = r1.m0
            int r13 = r1.n0
            boolean r14 = r1.o0
            int r15 = r1.p0
            int r0 = r1.q0
            r16 = r0
            r9.f(r10, r11, r12, r13, r14, r15, r16)
        L9a:
            boolean r0 = r1.j0
            if (r0 != 0) goto L9f
            goto Lb9
        L9f:
            if (r3 != 0) goto La7
            if (r2 == 0) goto Laa
            p47 r0 = r1.v0
            if (r0 == 0) goto Laa
        La7:
            defpackage.bl2.G(r1)
        Laa:
            if (r3 != 0) goto Lae
            if (r4 == 0) goto Lb4
        Lae:
            defpackage.xk2.w(r1)
            defpackage.f04.I(r1)
        Lb4:
            if (r2 == 0) goto Lb9
            defpackage.f04.I(r1)
        Lb9:
            return
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            s47 r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            ki2 r0 = r3.c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.d
            int r0 = defpackage.lb1.a(r2, r0, r1)
            boolean r2 = r3.e
            int r0 = defpackage.xg6.e(r0, r2, r1)
            int r2 = r3.f
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.g
            int r0 = r0 + r2
            int r0 = r0 * r1
            lt0 r3 = r3.h
            if (r3 == 0) goto L36
            int r3 = r3.hashCode()
            goto L37
        L36:
            r3 = 0
        L37:
            int r0 = r0 + r3
            return r0
    }
}
