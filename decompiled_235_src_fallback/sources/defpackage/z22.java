package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z22  reason: default package */
/* loaded from: classes.dex */
public final class z22 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public java.lang.Object Z;
    public int d0;
    public java.lang.Object e0;
    public final /* synthetic */ java.lang.Object f0;
    public java.lang.Object g0;
    public final /* synthetic */ java.lang.Object h0;

    public z22(defpackage.ss5 r2, defpackage.ss4 r3, int r4, defpackage.ip3 r5, defpackage.pr3 r6, defpackage.r41 r7) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.e0 = r2
            r1.f0 = r3
            r1.d0 = r4
            r1.g0 = r5
            r1.h0 = r6
            r2 = 2
            r1.<init>(r2, r7)
            return
    }

    public z22(defpackage.sz1 r2, defpackage.c46 r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.f0 = r2
            r1.h0 = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            z22 r2 = (defpackage.z22) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            z22 r2 = (defpackage.z22) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.X
            java.lang.Object r1 = r10.h0
            java.lang.Object r2 = r10.f0
            switch(r0) {
                case 0: goto L24;
                default: goto L9;
            }
        L9:
            z22 r3 = new z22
            java.lang.Object r0 = r10.e0
            r4 = r0
            ss5 r4 = (defpackage.ss5) r4
            r5 = r2
            ss4 r5 = (defpackage.ss4) r5
            int r6 = r10.d0
            java.lang.Object r10 = r10.g0
            r7 = r10
            ip3 r7 = (defpackage.ip3) r7
            r8 = r1
            pr3 r8 = (defpackage.pr3) r8
            r9 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3.Z = r12
            return r3
        L24:
            r9 = r11
            z22 r10 = new z22
            sz1 r2 = (defpackage.sz1) r2
            c46 r1 = (defpackage.c46) r1
            r10.<init>(r2, r1, r9)
            return r10
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.X
            java.lang.Object r1 = r12.h0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.Object r3 = r12.f0
            jg7 r4 = defpackage.jg7.a
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L6c;
                default: goto Lf;
            }
        Lf:
            ss4 r3 = (defpackage.ss4) r3
            java.lang.Object r0 = r12.e0
            ss5 r0 = (defpackage.ss5) r0
            java.lang.Object r7 = r12.Z
            w61 r7 = (defpackage.w61) r7
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r12.Y
            if (r9 == 0) goto L2a
            if (r9 != r5) goto L25
            defpackage.oi2.Y(r13)
            goto L6b
        L25:
            defpackage.i.m(r2)
            r4 = r6
            goto L6b
        L2a:
            defpackage.oi2.Y(r13)
            java.util.List r13 = r0.a
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L6b
            int r13 = r3.h()
            if (r13 < 0) goto L6b
            int r13 = r12.d0
            sr5 r2 = new sr5
            r2.<init>(r0, r13, r3, r5)
            g21 r13 = defpackage.np2.f0(r2)
            le2 r13 = defpackage.f04.z(r13)
            vc r2 = new vc
            java.lang.Object r3 = r12.g0
            ip3 r3 = (defpackage.ip3) r3
            pr3 r1 = (defpackage.pr3) r1
            r2.<init>(r7, r0, r3, r1)
            r12.Z = r6
            r12.Y = r5
            a7 r0 = new a7
            r1 = 24
            r0.<init>(r2, r1)
            java.lang.Object r12 = r13.b(r0, r12)
            if (r12 != r8) goto L67
            goto L68
        L67:
            r12 = r4
        L68:
            if (r12 != r8) goto L6b
            r4 = r8
        L6b:
            return r4
        L6c:
            sz1 r3 = (defpackage.sz1) r3
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r12.d0
            r8 = 5
            r9 = 4
            r10 = 3
            r11 = 2
            if (r7 == 0) goto Ld6
            if (r7 == r5) goto Lc2
            if (r7 == r11) goto Lb4
            if (r7 == r10) goto La2
            if (r7 == r9) goto L97
            if (r7 == r8) goto L88
            defpackage.i.m(r2)
            r4 = r6
            goto L156
        L88:
            java.lang.Object r0 = r12.Z
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r12 = r12.e0
            sz1 r12 = (defpackage.sz1) r12
            dy1 r12 = (defpackage.dy1) r12
            defpackage.oi2.Y(r13)
            goto L155
        L97:
            java.lang.Object r12 = r12.e0
            sz1 r12 = (defpackage.sz1) r12
            dy1 r12 = (defpackage.dy1) r12
            defpackage.oi2.Y(r13)
            goto L156
        La2:
            int r1 = r12.Y
            java.lang.Object r2 = r12.Z
            dy1 r2 = (defpackage.dy1) r2
            java.lang.Object r2 = r12.e0
            sz1 r2 = (defpackage.sz1) r2
            defpackage.oi2.Y(r13)     // Catch: java.lang.Throwable -> Lb1
            goto L133
        Lb1:
            r13 = move-exception
            goto L143
        Lb4:
            int r1 = r12.Y
            java.lang.Object r2 = r12.Z
            dy1 r2 = (defpackage.dy1) r2
            java.lang.Object r2 = r12.e0
            sz1 r2 = (defpackage.sz1) r2
            defpackage.oi2.Y(r13)     // Catch: java.lang.Throwable -> Lb1
            goto L118
        Lc2:
            int r1 = r12.Y
            java.lang.Object r2 = r12.g0
            dy1 r2 = (defpackage.dy1) r2
            java.lang.Object r3 = r12.Z
            c46 r3 = (defpackage.c46) r3
            java.lang.Object r5 = r12.e0
            sz1 r5 = (defpackage.sz1) r5
            defpackage.oi2.Y(r13)
            r13 = r3
            r3 = r5
            goto L104
        Ld6:
            defpackage.oi2.Y(r13)
            tp6 r13 = r3.p0
            java.lang.Object r13 = r13.getValue()
            boolean r2 = r13 instanceof defpackage.dy1
            if (r2 == 0) goto Le7
            dy1 r13 = (defpackage.dy1) r13
            r2 = r13
            goto Le8
        Le7:
            r2 = r6
        Le8:
            if (r2 == 0) goto L156
            r13 = r1
            c46 r13 = (defpackage.c46) r13
            jh r1 = r3.v
            r12.e0 = r3
            r12.Z = r13
            r12.g0 = r2
            r7 = 0
            r12.Y = r7
            r12.d0 = r5
            r1.getClass()
            defpackage.jh.i()
            if (r4 != r0) goto L103
            goto L152
        L103:
            r1 = r7
        L104:
            pq5 r2 = r2.a     // Catch: java.lang.Throwable -> L141
            r12.e0 = r3     // Catch: java.lang.Throwable -> L141
            r12.Z = r6     // Catch: java.lang.Throwable -> L141
            r12.g0 = r6     // Catch: java.lang.Throwable -> L141
            r12.Y = r1     // Catch: java.lang.Throwable -> L141
            r12.d0 = r11     // Catch: java.lang.Throwable -> L141
            java.lang.Object r13 = r3.X0(r2, r13, r12)     // Catch: java.lang.Throwable -> L141
            if (r13 != r0) goto L117
            goto L152
        L117:
            r2 = r3
        L118:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> Lb1
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> Lb1
            if (r13 != 0) goto L133
            of6 r13 = r2.J0     // Catch: java.lang.Throwable -> Lb1
            v77 r3 = defpackage.v77.a     // Catch: java.lang.Throwable -> Lb1
            r12.e0 = r2     // Catch: java.lang.Throwable -> Lb1
            r12.Z = r6     // Catch: java.lang.Throwable -> Lb1
            r12.Y = r1     // Catch: java.lang.Throwable -> Lb1
            r12.d0 = r10     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r13 = r13.a(r3, r12)     // Catch: java.lang.Throwable -> Lb1
            if (r13 != r0) goto L133
            goto L152
        L133:
            r12.e0 = r6
            r12.Z = r6
            r12.Y = r1
            r12.d0 = r9
            r2.U0()
            if (r4 != r0) goto L156
            goto L152
        L141:
            r13 = move-exception
            r2 = r3
        L143:
            r12.e0 = r6
            r12.Z = r13
            r12.g0 = r6
            r12.Y = r1
            r12.d0 = r8
            r2.U0()
            if (r4 != r0) goto L154
        L152:
            r4 = r0
            goto L156
        L154:
            r0 = r13
        L155:
            throw r0
        L156:
            return r4
    }
}
