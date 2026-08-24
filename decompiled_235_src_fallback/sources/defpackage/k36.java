package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k36  reason: default package */
/* loaded from: classes.dex */
public final class k36 extends defpackage.s41 implements defpackage.ne2 {
    public final defpackage.ne2 R;
    public final defpackage.l61 X;
    public final int Y;
    public defpackage.l61 Z;
    public defpackage.r41 d0;

    public k36(defpackage.ne2 r4, defpackage.l61 r5) {
            r3 = this;
            zu0 r0 = defpackage.zu0.L
            vt1 r1 = defpackage.vt1.A
            r3.<init>(r0, r1)
            r3.R = r4
            r3.X = r5
            r4 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            ep3 r1 = new ep3
            r2 = 13
            r1.<init>(r2, r4)
            java.lang.Object r4 = r5.x(r1, r0)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r3.Y = r4
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r2, defpackage.r41 r3) {
            r1 = this;
            java.lang.Object r1 = r1.v(r3, r2)     // Catch: java.lang.Throwable -> Lc
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            if (r1 != r2) goto L9
            return r1
        L9:
            jg7 r1 = defpackage.jg7.a
            return r1
        Lc:
            r2 = move-exception
            nm1 r0 = new nm1
            l61 r3 = r3.b()
            r0.<init>(r3, r2)
            r1.Z = r0
            throw r2
    }

    @Override // defpackage.s41, defpackage.r41
    public final defpackage.l61 b() {
            r0 = this;
            l61 r0 = r0.Z
            if (r0 != 0) goto L6
            vt1 r0 = defpackage.vt1.A
        L6:
            return r0
    }

    @Override // defpackage.d20, defpackage.y61
    public final defpackage.y61 f() {
            r1 = this;
            r41 r1 = r1.d0
            boolean r0 = r1 instanceof defpackage.y61
            if (r0 == 0) goto L9
            y61 r1 = (defpackage.y61) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.StackTraceElement r() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r4) {
            r3 = this;
            java.lang.Throwable r0 = defpackage.hm5.a(r4)
            if (r0 == 0) goto L11
            nm1 r1 = new nm1
            l61 r2 = r3.b()
            r1.<init>(r2, r0)
            r3.Z = r1
        L11:
            r41 r3 = r3.d0
            if (r3 == 0) goto L18
            r3.i(r4)
        L18:
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            return r3
    }

    public final java.lang.Object v(defpackage.r41 r5, java.lang.Object r6) {
            r4 = this;
            l61 r0 = r5.b()
            defpackage.yh2.o(r0)
            l61 r1 = r4.Z
            if (r1 == r0) goto L80
            boolean r2 = r1 instanceof defpackage.nm1
            if (r2 != 0) goto L53
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            z5 r2 = new z5
            r3 = 29
            r2.<init>(r4, r3)
            java.lang.Object r1 = r0.x(r2, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r2 = r4.Y
            if (r1 != r2) goto L2c
            r4.Z = r0
            goto L80
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Flow invariant is violated:\n\t\tFlow was collected in "
            r6.<init>(r1)
            l61 r4 = r4.X
            r6.append(r4)
            java.lang.String r4 = ",\n\t\tbut emission happened in "
            r6.append(r4)
            r6.append(r0)
            java.lang.String r4 = ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L53:
            nm1 r1 = (defpackage.nm1) r1
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception "
            r5.<init>(r0)
            java.lang.Throwable r0 = r1.B
            r5.append(r0)
            java.lang.String r0 = ", but then emission attempt of value '"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r6 = "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = defpackage.rs6.R(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L80:
            r4.d0 = r5
            fo2 r5 = defpackage.m36.a
            ne2 r0 = r4.R
            r0.getClass()
            java.lang.Object r5 = r5.e(r0, r6, r4)
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            boolean r6 = defpackage.nb3.k(r5, r6)
            if (r6 != 0) goto L98
            r6 = 0
            r4.d0 = r6
        L98:
            return r5
    }
}
