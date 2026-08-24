package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mw3  reason: default package */
/* loaded from: classes.dex */
public final class mw3 extends defpackage.ow3 {
    public static final java.lang.Class c = null;

    static {
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Class r0 = r0.getClass()
            defpackage.mw3.c = r0
            return
    }

    public static java.util.List d(java.lang.Object r3, long r4, int r6) {
            fh7 r0 = defpackage.gh7.d
            java.lang.Object r0 = r0.i(r4, r3)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L30
            boolean r1 = r0 instanceof defpackage.wr3
            if (r1 == 0) goto L18
            vr3 r0 = new vr3
            r0.<init>(r6)
            goto L2c
        L18:
            boolean r1 = r0 instanceof defpackage.w25
            if (r1 == 0) goto L27
            boolean r1 = r0 instanceof defpackage.z93
            if (r1 == 0) goto L27
            z93 r0 = (defpackage.z93) r0
            z93 r0 = r0.k(r6)
            goto L2c
        L27:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L2c:
            defpackage.gh7.o(r3, r4, r0)
            return r0
        L30:
            java.lang.Class r1 = defpackage.mw3.c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L4d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            defpackage.gh7.o(r3, r4, r1)
            return r1
        L4d:
            boolean r1 = r0 instanceof defpackage.rg7
            if (r1 == 0) goto L66
            vr3 r1 = new vr3
            rg7 r0 = (defpackage.rg7) r0
            vr3 r2 = r0.A
            int r2 = r2.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            defpackage.gh7.o(r3, r4, r1)
            return r1
        L66:
            boolean r1 = r0 instanceof defpackage.w25
            if (r1 == 0) goto L85
            boolean r1 = r0 instanceof defpackage.z93
            if (r1 == 0) goto L85
            r1 = r0
            z93 r1 = (defpackage.z93) r1
            r2 = r1
            j1 r2 = (defpackage.j1) r2
            boolean r2 = r2.A
            if (r2 != 0) goto L85
            int r0 = r0.size()
            int r0 = r0 + r6
            z93 r6 = r1.k(r0)
            defpackage.gh7.o(r3, r4, r6)
            return r6
        L85:
            return r0
    }

    @Override // defpackage.ow3
    public final void a(long r3, java.lang.Object r5) {
            r2 = this;
            fh7 r2 = defpackage.gh7.d
            java.lang.Object r2 = r2.i(r3, r5)
            java.util.List r2 = (java.util.List) r2
            boolean r0 = r2 instanceof defpackage.wr3
            if (r0 == 0) goto L13
            wr3 r2 = (defpackage.wr3) r2
            wr3 r2 = r2.u()
            goto L38
        L13:
            java.lang.Class r0 = defpackage.mw3.c
            java.lang.Class r1 = r2.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L20
            goto L33
        L20:
            boolean r0 = r2 instanceof defpackage.w25
            if (r0 == 0) goto L34
            boolean r0 = r2 instanceof defpackage.z93
            if (r0 == 0) goto L34
            z93 r2 = (defpackage.z93) r2
            j1 r2 = (defpackage.j1) r2
            boolean r3 = r2.A
            if (r3 == 0) goto L33
            r3 = 0
            r2.A = r3
        L33:
            return
        L34:
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
        L38:
            defpackage.gh7.o(r5, r3, r2)
            return
    }

    @Override // defpackage.ow3
    public final void b(java.lang.Object r3, long r4, java.lang.Object r6) {
            r2 = this;
            fh7 r2 = defpackage.gh7.d
            java.lang.Object r2 = r2.i(r4, r6)
            java.util.List r2 = (java.util.List) r2
            int r6 = r2.size()
            java.util.List r6 = d(r3, r4, r6)
            int r0 = r6.size()
            int r1 = r2.size()
            if (r0 <= 0) goto L1f
            if (r1 <= 0) goto L1f
            r6.addAll(r2)
        L1f:
            if (r0 <= 0) goto L22
            r2 = r6
        L22:
            defpackage.gh7.o(r3, r4, r2)
            return
    }

    @Override // defpackage.ow3
    public final java.util.List c(long r1, java.lang.Object r3) {
            r0 = this;
            r0 = 10
            java.util.List r0 = d(r3, r1, r0)
            return r0
    }
}
