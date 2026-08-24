package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j54  reason: default package */
/* loaded from: classes.dex */
public final class j54 implements defpackage.j66 {
    public final defpackage.c1 a;
    public final defpackage.ng7 b;
    public final defpackage.i82 c;

    public j54(defpackage.ng7 r1, defpackage.i82 r2, defpackage.c1 r3) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r2.getClass()
            r0.c = r2
            r0.a = r3
            return
    }

    @Override // defpackage.j66
    public final void a(java.lang.Object r3) {
            r2 = this;
            ng7 r0 = r2.b
            r0.getClass()
            r0 = r3
            pr2 r0 = (defpackage.pr2) r0
            mg7 r0 = r0.unknownFields
            r1 = 0
            r0.e = r1
            i82 r2 = r2.c
            r2.getClass()
            defpackage.xg6.A(r3)
            r2 = 0
            throw r2
    }

    @Override // defpackage.j66
    public final boolean b(java.lang.Object r1) {
            r0 = this;
            i82 r0 = r0.c
            r0.getClass()
            defpackage.xg6.A(r1)
            r0 = 0
            throw r0
    }

    @Override // defpackage.j66
    public final boolean c(defpackage.pr2 r1, defpackage.pr2 r2) {
            r0 = this;
            ng7 r0 = r0.b
            r0.getClass()
            mg7 r0 = r1.unknownFields
            mg7 r1 = r2.unknownFields
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L11
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    @Override // defpackage.j66
    public final void d(java.lang.Object r2, defpackage.ls0 r3, defpackage.g82 r4) {
            r1 = this;
            ng7 r3 = r1.b
            r3.getClass()
            r3 = r2
            pr2 r3 = (defpackage.pr2) r3
            mg7 r4 = r3.unknownFields
            mg7 r0 = defpackage.mg7.f
            if (r4 != r0) goto L14
            mg7 r4 = defpackage.mg7.b()
            r3.unknownFields = r4
        L14:
            i82 r1 = r1.c
            r1.getClass()
            r2.getClass()
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
    }

    @Override // defpackage.j66
    public final void e(java.lang.Object r1, defpackage.os0 r2) {
            r0 = this;
            i82 r0 = r0.c
            r0.getClass()
            defpackage.xg6.A(r1)
            r0 = 0
            throw r0
    }

    @Override // defpackage.j66
    public final int f(defpackage.pr2 r1) {
            r0 = this;
            ng7 r0 = r0.b
            r0.getClass()
            mg7 r0 = r1.unknownFields
            int r0 = r0.hashCode()
            return r0
    }

    @Override // defpackage.j66
    public final void g(defpackage.pr2 r1, defpackage.pr2 r2) {
            r0 = this;
            ng7 r0 = r0.b
            defpackage.m66.x(r0, r1, r2)
            return
    }

    @Override // defpackage.j66
    public final void h(java.lang.Object r1, byte[] r2, int r3, int r4, defpackage.ou r5) {
            r0 = this;
            r0 = r1
            pr2 r0 = (defpackage.pr2) r0
            mg7 r2 = r0.unknownFields
            mg7 r3 = defpackage.mg7.f
            if (r2 != r3) goto Lf
            mg7 r2 = defpackage.mg7.b()
            r0.unknownFields = r2
        Lf:
            java.lang.ClassCastException r0 = defpackage.i61.i(r1)
            throw r0
    }

    @Override // defpackage.j66
    public final int i(defpackage.c1 r7) {
            r6 = this;
            ng7 r6 = r6.b
            r6.getClass()
            pr2 r7 = (defpackage.pr2) r7
            mg7 r6 = r7.unknownFields
            int r7 = r6.d
            r0 = -1
            if (r7 == r0) goto Lf
            return r7
        Lf:
            r7 = 0
            r0 = r7
        L11:
            int r1 = r6.a
            if (r7 >= r1) goto L3b
            int[] r1 = r6.b
            r1 = r1[r7]
            r2 = 3
            int r1 = r1 >>> r2
            java.lang.Object[] r3 = r6.c
            r3 = r3[r7]
            ea0 r3 = (defpackage.ea0) r3
            r4 = 1
            int r4 = defpackage.ms0.h(r4)
            r5 = 2
            int r4 = r4 * r5
            int r5 = defpackage.ms0.h(r5)
            int r1 = defpackage.ms0.i(r1)
            int r1 = r1 + r5
            int r1 = r1 + r4
            int r2 = defpackage.ms0.a(r2, r3)
            int r2 = r2 + r1
            int r0 = r0 + r2
            int r7 = r7 + 1
            goto L11
        L3b:
            r6.d = r0
            return r0
    }

    @Override // defpackage.j66
    public final java.lang.Object j() {
            r1 = this;
            c1 r1 = r1.a
            pr2 r1 = (defpackage.pr2) r1
            r1.getClass()
            or2 r0 = defpackage.or2.NEW_BUILDER
            java.lang.Object r1 = r1.f(r0)
            mr2 r1 = (defpackage.mr2) r1
            pr2 r1 = r1.b()
            return r1
    }
}
