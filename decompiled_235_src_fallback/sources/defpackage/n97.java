package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n97  reason: default package */
/* loaded from: classes.dex */
public final class n97 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public defpackage.dh5 Y;
    public defpackage.dh5 Z;
    public int d0;
    public /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ defpackage.o97 f0;

    public n97(defpackage.dh5 r2, defpackage.o97 r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.Z = r2
            r1.f0 = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public n97(defpackage.o97 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.f0 = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            n97 r2 = (defpackage.n97) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            zf1 r3 = (defpackage.zf1) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            n97 r2 = (defpackage.n97) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            o97 r1 = r2.f0
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            n97 r2 = new n97
            r2.<init>(r1, r3)
            r2.e0 = r4
            return r2
        Lf:
            n97 r0 = new n97
            dh5 r2 = r2.Z
            r0.<init>(r2, r1, r3)
            r0.e0 = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.X
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = 1
            o97 r3 = r14.f0
            jg7 r4 = defpackage.jg7.a
            r5 = 0
            switch(r0) {
                case 0: goto L91;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r14.d0
            r7 = 2
            if (r6 == 0) goto L33
            if (r6 == r2) goto L27
            if (r6 != r7) goto L21
            java.lang.Object r1 = r14.e0
            w61 r1 = (defpackage.w61) r1
            defpackage.oi2.Y(r15)     // Catch: java.util.concurrent.CancellationException -> L1f
        L1f:
            r15 = r1
            goto L3a
        L21:
            defpackage.i.m(r1)
            r4 = r5
            goto L90
        L27:
            dh5 r1 = r14.Z
            dh5 r5 = r14.Y
            java.lang.Object r6 = r14.e0
            w61 r6 = (defpackage.w61) r6
            defpackage.oi2.Y(r15)
            goto L5c
        L33:
            defpackage.oi2.Y(r15)
            java.lang.Object r15 = r14.e0
            w61 r15 = (defpackage.w61) r15
        L3a:
            boolean r1 = defpackage.g04.H(r15)
            if (r1 == 0) goto L90
            dh5 r1 = new dh5
            r1.<init>()
            v80 r5 = r3.q0
            r14.e0 = r15
            r14.Y = r1
            r14.Z = r1
            r14.d0 = r2
            r5.getClass()
            java.lang.Object r5 = defpackage.v80.L(r5, r14)
            if (r5 != r0) goto L59
            goto L8c
        L59:
            r6 = r15
            r15 = r5
            r5 = r1
        L5c:
            r1.A = r15
            java.lang.Object r15 = r5.A
            boolean r15 = r15 instanceof defpackage.g97
            if (r15 == 0) goto L8e
            ag1 r9 = r3.m0     // Catch: java.util.concurrent.CancellationException -> L8e
            xa4 r10 = defpackage.xa4.UserInput     // Catch: java.util.concurrent.CancellationException -> L8e
            n97 r11 = new n97     // Catch: java.util.concurrent.CancellationException -> L8e
            r12 = 0
            r11.<init>(r5, r3, r12)     // Catch: java.util.concurrent.CancellationException -> L8e
            r14.e0 = r6     // Catch: java.util.concurrent.CancellationException -> L8e
            r14.Y = r12     // Catch: java.util.concurrent.CancellationException -> L8e
            r14.Z = r12     // Catch: java.util.concurrent.CancellationException -> L8e
            r14.d0 = r7     // Catch: java.util.concurrent.CancellationException -> L8e
            r9.getClass()     // Catch: java.util.concurrent.CancellationException -> L8e
            b0 r8 = new b0     // Catch: java.util.concurrent.CancellationException -> L8e
            r13 = 21
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.util.concurrent.CancellationException -> L8e
            java.lang.Object r15 = defpackage.g04.C(r8, r14)     // Catch: java.util.concurrent.CancellationException -> L8e
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED     // Catch: java.util.concurrent.CancellationException -> L8e
            if (r15 != r1) goto L89
            goto L8a
        L89:
            r15 = r4
        L8a:
            if (r15 != r0) goto L8e
        L8c:
            r4 = r0
            goto L90
        L8e:
            r15 = r6
            goto L3a
        L90:
            return r4
        L91:
            dh5 r0 = r14.Z
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r14.d0
            if (r7 == 0) goto Laa
            if (r7 != r2) goto La5
            dh5 r1 = r14.Y
            java.lang.Object r7 = r14.e0
            zf1 r7 = (defpackage.zf1) r7
            defpackage.oi2.Y(r15)
            goto Lf7
        La5:
            defpackage.i.m(r1)
            r4 = r5
            goto Lfa
        Laa:
            defpackage.oi2.Y(r15)
            java.lang.Object r15 = r14.e0
            zf1 r15 = (defpackage.zf1) r15
            r7 = r15
        Lb2:
            java.lang.Object r15 = r0.A
            boolean r1 = r15 instanceof defpackage.h97
            if (r1 != 0) goto Lfa
            boolean r1 = r15 instanceof defpackage.f97
            if (r1 == 0) goto Lbf
            f97 r15 = (defpackage.f97) r15
            goto Lc0
        Lbf:
            r15 = r5
        Lc0:
            if (r15 == 0) goto Le3
            long r8 = r15.f
            float r1 = r15.g
            long r10 = r15.h
            float r15 = r15.i
            ag1 r12 = r7.a
            fj r12 = r12.a
            jk4 r13 = new jk4
            r13.<init>(r8)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            jk4 r8 = new jk4
            r8.<init>(r10)
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            r12.l(r13, r1, r8, r15)
        Le3:
            v80 r15 = r3.q0
            r14.e0 = r7
            r14.Y = r0
            r14.d0 = r2
            r15.getClass()
            java.lang.Object r15 = defpackage.v80.L(r15, r14)
            if (r15 != r6) goto Lf6
            r4 = r6
            goto Lfa
        Lf6:
            r1 = r0
        Lf7:
            r1.A = r15
            goto Lb2
        Lfa:
            return r4
    }
}
