package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eo5  reason: default package */
/* loaded from: classes.dex */
public final class eo5 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.vn5 X;
    public defpackage.yn5 Y;
    public java.util.Iterator Z;
    public int d0;
    public int e0;
    public /* synthetic */ java.lang.Object f0;
    public final /* synthetic */ defpackage.v80 g0;
    public final /* synthetic */ defpackage.ci0 h0;

    public eo5(defpackage.v80 r1, defpackage.ci0 r2, defpackage.r41 r3) {
            r0 = this;
            r0.g0 = r1
            r0.h0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ne2 r1 = (defpackage.ne2) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            eo5 r0 = (defpackage.eo5) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            eo5 r0 = new eo5
            v80 r1 = r2.g0
            ci0 r2 = r2.h0
            r0.<init>(r1, r2, r3)
            r0.f0 = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r15) {
            r14 = this;
            java.lang.Object r0 = r14.f0
            ne2 r0 = (defpackage.ne2) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r14.e0
            r3 = 1
            r4 = 0
            r5 = 3
            r6 = 2
            ci0 r7 = r14.h0
            r8 = 0
            switch(r2) {
                case 0: goto L36;
                case 1: goto L32;
                case 2: goto L2c;
                case 3: goto L25;
                case 4: goto L18;
                case 5: goto L32;
                case 6: goto L32;
                default: goto L12;
            }
        L12:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r14)
            return r8
        L18:
            int r2 = r14.d0
            java.util.Iterator r9 = r14.Z
            yn5 r10 = r14.Y
            vn5 r11 = r14.X
            defpackage.oi2.Y(r15)
            goto Lb0
        L25:
            vn5 r2 = r14.X
            defpackage.oi2.Y(r15)
            goto La3
        L2c:
            vn5 r2 = r14.X
            defpackage.oi2.Y(r15)
            goto L87
        L32:
            defpackage.oi2.Y(r15)
            goto L4d
        L36:
            defpackage.oi2.Y(r15)
        L39:
            r14.f0 = r0
            r14.X = r8
            r14.Y = r8
            r14.Z = r8
            r14.e0 = r3
            v80 r15 = r14.g0
            java.lang.Object r15 = defpackage.v80.L(r15, r14)
            if (r15 != r1) goto L4d
            goto L181
        L4d:
            java.lang.Object r15 = r7.g
            tp6 r15 = (defpackage.tp6) r15
            java.lang.Object r15 = r15.getValue()
            java.util.Collection r15 = (java.util.Collection) r15
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L39
            java.lang.Object r15 = r7.g
            tp6 r15 = (defpackage.tp6) r15
            java.lang.Object r15 = r15.getValue()
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r15 = defpackage.gt0.H0(r15)
            r2 = r15
            vn5 r2 = (defpackage.vn5) r2
            boolean r15 = r2 instanceof defpackage.tn5
            if (r15 == 0) goto L8a
            r15 = r2
            tn5 r15 = (defpackage.tn5) r15
            r14.f0 = r0
            r14.X = r2
            r14.Y = r8
            r14.Z = r8
            r14.e0 = r6
            java.lang.Object r15 = defpackage.ci0.a(r7, r15, r14)
            if (r15 != r1) goto L87
            goto L181
        L87:
            yn5 r15 = (defpackage.yn5) r15
            goto La5
        L8a:
            boolean r15 = r2 instanceof defpackage.un5
            if (r15 == 0) goto L182
            r15 = r2
            un5 r15 = (defpackage.un5) r15
            r14.f0 = r0
            r14.X = r2
            r14.Y = r8
            r14.Z = r8
            r14.e0 = r5
            java.lang.Object r15 = defpackage.ci0.f(r7, r15, r14)
            if (r15 != r1) goto La3
            goto L181
        La3:
            yn5 r15 = (defpackage.yn5) r15
        La5:
            java.util.List r9 = r15.a()
            java.util.Iterator r9 = r9.iterator()
            r10 = r15
            r11 = r2
            r2 = r4
        Lb0:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto Ld1
            java.lang.Object r15 = r9.next()
            ca5 r15 = (defpackage.ca5) r15
            r14.f0 = r0
            r14.X = r11
            r14.Y = r10
            r14.Z = r9
            r14.d0 = r2
            r12 = 4
            r14.e0 = r12
            java.lang.Object r15 = r0.a(r15, r14)
            if (r15 != r1) goto Lb0
            goto L181
        Ld1:
            boolean r15 = r10 instanceof defpackage.wn5
            r2 = 6
            if (r15 == 0) goto L154
            java.lang.Object r15 = r7.g
            tp6 r15 = (defpackage.tp6) r15
        Lda:
            java.lang.Object r9 = r15.getValue()
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            java.util.ArrayList r12 = defpackage.gt0.T0(r12, r11)
            r13 = r10
            wn5 r13 = (defpackage.wn5) r13
            vn5 r13 = r13.b
            java.util.ArrayList r12 = defpackage.gt0.U0(r13, r12)
            boolean r9 = r15.j(r9, r12)
            if (r9 == 0) goto Lda
            java.lang.Object r15 = r7.e
            ve4 r15 = (defpackage.ve4) r15
            ex6 r15 = r15.a
            java.lang.Object r15 = r15.getValue()
            le2 r15 = (defpackage.le2) r15
            m8 r9 = new m8
            r10 = 5
            r9.<init>(r6, r8, r10)
            cf2 r11 = new cf2
            r11.<init>(r15, r9, r3)
            m8 r15 = new m8
            r15.<init>(r6, r8, r2)
            cf2 r2 = new cf2
            r2.<init>(r11, r15, r3)
            java.lang.Object r15 = r7.h
            v80 r15 = (defpackage.v80) r15
            vl0 r15 = defpackage.f04.N(r15)
            le2[] r9 = new defpackage.le2[r6]
            r9[r4] = r2
            r9[r3] = r15
            dm0 r15 = defpackage.f04.J(r9)
            jd1 r2 = defpackage.oq1.B
            uq1 r2 = defpackage.uq1.MINUTES
            long r11 = defpackage.n16.L(r6, r2)
            xe2 r2 = new xe2
            r2.<init>(r11, r15, r8)
            g21 r15 = new g21
            r15.<init>(r2, r5)
            zw0 r2 = new zw0
            r2.<init>(r5, r8)
            wp0 r9 = new wp0
            r9.<init>(r3, r15, r2)
            r14.f0 = r0
            r14.X = r8
            r14.Y = r8
            r14.Z = r8
            r14.e0 = r10
            java.lang.Object r15 = defpackage.f04.D(r9, r14)
            if (r15 != r1) goto L4d
            goto L181
        L154:
            java.lang.Object r15 = r7.g
            tp6 r15 = (defpackage.tp6) r15
        L158:
            java.lang.Object r9 = r15.getValue()
            r10 = r9
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r10 = defpackage.gt0.T0(r10, r11)
            boolean r9 = r15.j(r9, r10)
            if (r9 == 0) goto L158
            boolean r15 = r10.isEmpty()
            if (r15 == 0) goto L4d
            r14.f0 = r0
            r14.X = r8
            r14.Y = r8
            r14.Z = r8
            r14.e0 = r2
            aa5 r15 = defpackage.aa5.a
            java.lang.Object r15 = r0.a(r15, r14)
            if (r15 != r1) goto L4d
        L181:
            return r1
        L182:
            defpackage.i.d()
            return r8
    }
}
