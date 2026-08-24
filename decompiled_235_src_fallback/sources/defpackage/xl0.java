package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xl0  reason: default package */
/* loaded from: classes.dex */
public abstract class xl0 extends defpackage.wl0 {
    public final defpackage.le2 R;

    public xl0(int r1, defpackage.m80 r2, defpackage.l61 r3, defpackage.le2 r4) {
            r0 = this;
            r0.<init>(r3, r1, r2)
            r0.R = r4
            return
    }

    @Override // defpackage.wl0, defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r6, defpackage.r41 r7) {
            r5 = this;
            int r0 = r5.B
            r1 = -3
            if (r0 != r1) goto L71
            l61 r0 = r7.b()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            lw0 r2 = new lw0
            r3 = 21
            r4 = 0
            r2.<init>(r3, r4)
            l61 r3 = r5.A
            java.lang.Object r1 = r3.x(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L26
            l61 r1 = r0.N(r3)
            goto L2a
        L26:
            l61 r1 = defpackage.mb3.A(r0, r3, r4)
        L2a:
            boolean r2 = defpackage.nb3.k(r1, r0)
            if (r2 == 0) goto L39
            java.lang.Object r5 = r5.j(r6, r7)
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            if (r5 != r6) goto L7a
            return r5
        L39:
            d90 r2 = defpackage.d90.r0
            j61 r3 = r1.Z(r2)
            j61 r0 = r0.Z(r2)
            boolean r0 = defpackage.nb3.k(r3, r0)
            if (r0 == 0) goto L71
            l61 r0 = r7.b()
            boolean r2 = r6 instanceof defpackage.pb6
            if (r2 != 0) goto L5c
            boolean r2 = r6 instanceof defpackage.rg4
            if (r2 == 0) goto L56
            goto L5c
        L56:
            vc r2 = new vc
            r2.<init>(r6, r0)
            r6 = r2
        L5c:
            z r0 = new z
            r2 = 0
            r3 = 14
            r0.<init>(r5, r2, r3)
            java.lang.Object r5 = defpackage.k57.b(r1)
            java.lang.Object r5 = defpackage.mb3.P(r1, r6, r5, r0, r7)
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            if (r5 != r6) goto L7a
            return r5
        L71:
            java.lang.Object r5 = super.b(r6, r7)
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            if (r5 != r6) goto L7a
            return r5
        L7a:
            jg7 r5 = defpackage.jg7.a
            return r5
    }

    @Override // defpackage.wl0
    public final java.lang.Object e(defpackage.r35 r2, defpackage.r41 r3) {
            r1 = this;
            pb6 r0 = new pb6
            r0.<init>(r2)
            java.lang.Object r1 = r1.j(r0, r3)
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            if (r1 != r2) goto Le
            return r1
        Le:
            jg7 r1 = defpackage.jg7.a
            return r1
    }

    public abstract java.lang.Object j(defpackage.ne2 r1, defpackage.r41 r2);

    @Override // defpackage.wl0
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            le2 r1 = r2.R
            r0.append(r1)
            java.lang.String r1 = " -> "
            r0.append(r1)
            java.lang.String r2 = super.toString()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
