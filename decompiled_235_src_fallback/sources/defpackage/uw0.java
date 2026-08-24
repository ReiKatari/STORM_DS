package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.pd4("composable")
/* renamed from: uw0  reason: default package */
/* loaded from: classes.dex */
public final class uw0 extends defpackage.qd4 {
    public final defpackage.vs4 c;

    public uw0() {
            r1 = this;
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vs4 r0 = defpackage.np2.Y(r0)
            r1.c = r0
            return
    }

    @Override // defpackage.qd4
    public final defpackage.ic4 a() {
            r2 = this;
            tw0 r0 = new tw0
            zv0 r1 = defpackage.dw0.a
            r0.<init>(r2, r1)
            return r0
    }

    @Override // defpackage.qd4
    public final void d(java.util.List r6, defpackage.ad4 r7) {
            r5 = this;
            java.util.Iterator r6 = r6.iterator()
        L4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L9a
            java.lang.Object r7 = r6.next()
            sb4 r7 = (defpackage.sb4) r7
            vb4 r0 = r5.b()
            de5 r1 = r0.e
            r7.getClass()
            tp6 r2 = r0.c
            java.lang.Object r3 = r2.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L2f
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L2f
            goto L6a
        L2f:
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r3.next()
            sb4 r4 = (defpackage.sb4) r4
            if (r4 != r7) goto L33
            rp6 r3 = r1.A
            java.lang.Object r3 = r3.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L57
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L57
            goto L6a
        L57:
            java.util.Iterator r3 = r3.iterator()
        L5b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r3.next()
            sb4 r4 = (defpackage.sb4) r4
            if (r4 != r7) goto L5b
            goto L4
        L6a:
            rp6 r1 = r1.A
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = defpackage.gt0.R0(r1)
            sb4 r1 = (defpackage.sb4) r1
            r3 = 0
            if (r1 == 0) goto L88
            java.lang.Object r4 = r2.getValue()
            java.util.Set r4 = (java.util.Set) r4
            java.util.LinkedHashSet r1 = defpackage.ii2.L(r4, r1)
            r2.m(r3, r1)
        L88:
            java.lang.Object r1 = r2.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = defpackage.ii2.L(r1, r7)
            r2.m(r3, r1)
            r0.f(r7)
            goto L4
        L9a:
            vs4 r5 = r5.c
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.setValue(r6)
            return
    }

    @Override // defpackage.qd4
    public final void e(defpackage.sb4 r2, boolean r3) {
            r1 = this;
            vb4 r0 = r1.b()
            r0.e(r2, r3)
            vs4 r1 = r1.c
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setValue(r2)
            return
    }

    public final void g(defpackage.sb4 r4) {
            r3 = this;
            vb4 r3 = r3.b()
            r4.getClass()
            tp6 r0 = r3.c
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = defpackage.ii2.L(r1, r4)
            r2 = 0
            r0.m(r2, r1)
            rc4 r3 = r3.h
            zb4 r3 = r3.b
            r3.getClass()
            pu r3 = r3.f
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L2c
            tt3 r3 = defpackage.tt3.STARTED
            r4.a(r3)
            return
        L2c:
            java.lang.String r3 = "Cannot transition entry that is not in the back stack"
            defpackage.i.m(r3)
            return
    }
}
