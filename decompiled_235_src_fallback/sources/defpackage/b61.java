package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b61  reason: default package */
/* loaded from: classes.dex */
public final class b61 extends defpackage.e74 {
    public final defpackage.p97 a;
    public final defpackage.c37 b;
    public final defpackage.jt3 c;
    public final boolean d;
    public final boolean e;
    public final defpackage.mk4 f;
    public final defpackage.p27 g;
    public final defpackage.l33 h;
    public final defpackage.nh2 i;

    public b61(defpackage.p97 r1, defpackage.c37 r2, defpackage.jt3 r3, boolean r4, boolean r5, defpackage.mk4 r6, defpackage.p27 r7, defpackage.l33 r8, defpackage.nh2 r9) {
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
            r0.i = r9
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r3 = this;
            e61 r0 = new e61
            r0.<init>()
            p97 r1 = r3.a
            r0.m0 = r1
            c37 r1 = r3.b
            r0.n0 = r1
            jt3 r1 = r3.c
            r0.o0 = r1
            boolean r1 = r3.d
            r0.p0 = r1
            boolean r1 = r3.e
            r0.q0 = r1
            mk4 r1 = r3.f
            r0.r0 = r1
            p27 r1 = r3.g
            r0.s0 = r1
            l33 r2 = r3.h
            r0.t0 = r2
            nh2 r3 = r3.i
            r0.u0 = r3
            c61 r3 = new c61
            r2 = 4
            r3.<init>(r0, r2)
            r1.g = r3
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L3
            goto L5e
        L3:
            boolean r0 = r4 instanceof defpackage.b61
            r1 = 0
            if (r0 != 0) goto L9
            goto L5d
        L9:
            b61 r4 = (defpackage.b61) r4
            p97 r0 = r3.a
            p97 r2 = r4.a
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L16
            goto L5d
        L16:
            c37 r0 = r3.b
            c37 r2 = r4.b
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L21
            goto L5d
        L21:
            jt3 r0 = r3.c
            jt3 r2 = r4.c
            if (r0 == r2) goto L28
            return r1
        L28:
            boolean r0 = r3.d
            boolean r2 = r4.d
            if (r0 == r2) goto L2f
            goto L5d
        L2f:
            boolean r0 = r3.e
            boolean r2 = r4.e
            if (r0 == r2) goto L36
            goto L5d
        L36:
            mk4 r0 = r3.f
            mk4 r2 = r4.f
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L41
            goto L5d
        L41:
            p27 r0 = r3.g
            p27 r2 = r4.g
            if (r0 == r2) goto L48
            return r1
        L48:
            l33 r0 = r3.h
            l33 r2 = r4.h
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L53
            goto L5d
        L53:
            nh2 r3 = r3.i
            nh2 r4 = r4.i
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L5e
        L5d:
            return r1
        L5e:
            r3 = 1
            return r3
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r10) {
            r9 = this;
            e61 r10 = (defpackage.e61) r10
            boolean r0 = r10.p0
            boolean r1 = r10.q0
            l33 r2 = r10.t0
            p27 r3 = r10.s0
            p97 r4 = r9.a
            r10.m0 = r4
            c37 r4 = r9.b
            r10.n0 = r4
            jt3 r5 = r9.c
            r10.o0 = r5
            boolean r5 = r9.d
            r10.p0 = r5
            mk4 r6 = r9.f
            r10.r0 = r6
            p27 r6 = r9.g
            r10.s0 = r6
            l33 r7 = r9.h
            r10.t0 = r7
            nh2 r8 = r9.i
            r10.u0 = r8
            if (r5 != r0) goto L40
            if (r5 != r0) goto L40
            boolean r0 = defpackage.nb3.k(r7, r2)
            if (r0 == 0) goto L40
            boolean r9 = r9.e
            if (r9 != r1) goto L40
            long r0 = r4.b
            boolean r9 = defpackage.k47.c(r0)
            if (r9 != 0) goto L43
        L40:
            defpackage.bl2.G(r10)
        L43:
            if (r6 == r3) goto L4d
            c61 r9 = new c61
            r0 = 0
            r9.<init>(r10, r0)
            r6.g = r9
        L4d:
            return
    }

    public final int hashCode() {
            r3 = this;
            p97 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            c37 r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            jt3 r0 = r3.c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            r2 = 0
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.d
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.e
            int r0 = defpackage.xg6.e(r0, r2, r1)
            mk4 r2 = r3.f
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            p27 r0 = r3.g
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            l33 r2 = r3.h
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            nh2 r3 = r3.i
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CoreTextFieldSemanticsModifier(transformedText="
            r0.<init>(r1)
            p97 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", value="
            r0.append(r1)
            c37 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            jt3 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", readOnly=false, enabled="
            r0.append(r1)
            boolean r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", isPassword="
            r0.append(r1)
            boolean r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", offsetMapping="
            r0.append(r1)
            mk4 r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", manager="
            r0.append(r1)
            p27 r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", imeOptions="
            r0.append(r1)
            l33 r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", focusRequester="
            r0.append(r1)
            nh2 r2 = r2.i
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
