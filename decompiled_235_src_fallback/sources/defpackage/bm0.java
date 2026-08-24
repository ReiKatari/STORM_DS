package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bm0  reason: default package */
/* loaded from: classes.dex */
public final class bm0 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;

    public bm0(defpackage.dh5 r2, defpackage.ne2 r3, java.lang.String[] r4, int[] r5) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.X = r3
            r1.L = r4
            r1.R = r5
            return
    }

    public /* synthetic */ bm0(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.A = r5
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r8, defpackage.r41 r9) {
            r7 = this;
            int r0 = r7.A
            java.lang.Object r1 = r7.X
            r2 = 1
            java.lang.Object r3 = r7.L
            java.lang.Object r4 = r7.R
            jg7 r5 = defpackage.jg7.a
            java.lang.Object r6 = r7.B
            switch(r0) {
                case 0: goto Lc0;
                case 1: goto L9c;
                case 2: goto L17;
                default: goto L10;
            }
        L10:
            int[] r8 = (int[]) r8
            java.lang.Object r7 = r7.b(r8, r9)
            return r7
        L17:
            t93 r8 = (defpackage.t93) r8
            bh5 r4 = (defpackage.bh5) r4
            bh5 r3 = (defpackage.bh5) r3
            bh5 r6 = (defpackage.bh5) r6
            boolean r7 = r8 instanceof defpackage.l25
            if (r7 == 0) goto L29
            int r7 = r6.A
            int r7 = r7 + r2
            r6.A = r7
            goto L68
        L29:
            boolean r7 = r8 instanceof defpackage.m25
            if (r7 == 0) goto L34
            int r7 = r6.A
            int r7 = r7 + (-1)
            r6.A = r7
            goto L68
        L34:
            boolean r7 = r8 instanceof defpackage.k25
            if (r7 == 0) goto L3f
            int r7 = r6.A
            int r7 = r7 + (-1)
            r6.A = r7
            goto L68
        L3f:
            boolean r7 = r8 instanceof defpackage.oy2
            if (r7 == 0) goto L49
            int r7 = r3.A
            int r7 = r7 + r2
            r3.A = r7
            goto L68
        L49:
            boolean r7 = r8 instanceof defpackage.py2
            if (r7 == 0) goto L54
            int r7 = r3.A
            int r7 = r7 + (-1)
            r3.A = r7
            goto L68
        L54:
            boolean r7 = r8 instanceof defpackage.sg2
            if (r7 == 0) goto L5e
            int r7 = r4.A
            int r7 = r7 + r2
            r4.A = r7
            goto L68
        L5e:
            boolean r7 = r8 instanceof defpackage.tg2
            if (r7 == 0) goto L68
            int r7 = r4.A
            int r7 = r7 + (-1)
            r4.A = r7
        L68:
            int r7 = r6.A
            r8 = 0
            if (r7 <= 0) goto L6f
            r7 = r2
            goto L70
        L6f:
            r7 = r8
        L70:
            int r9 = r3.A
            if (r9 <= 0) goto L76
            r9 = r2
            goto L77
        L76:
            r9 = r8
        L77:
            int r0 = r4.A
            if (r0 <= 0) goto L7d
            r0 = r2
            goto L7e
        L7d:
            r0 = r8
        L7e:
            od1 r1 = (defpackage.od1) r1
            boolean r3 = r1.l0
            if (r3 == r7) goto L87
            r1.l0 = r7
            r8 = r2
        L87:
            boolean r7 = r1.m0
            if (r7 == r9) goto L8e
            r1.m0 = r9
            r8 = r2
        L8e:
            boolean r7 = r1.n0
            if (r7 == r0) goto L95
            r1.n0 = r0
            goto L96
        L95:
            r2 = r8
        L96:
            if (r2 == 0) goto L9b
            defpackage.f04.I(r1)
        L9b:
            return r5
        L9c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            p27 r4 = (defpackage.p27) r4
            jt3 r6 = (defpackage.jt3) r6
            if (r7 == 0) goto Lbc
            boolean r7 = r6.b()
            if (r7 == 0) goto Lbc
            o37 r3 = (defpackage.o37) r3
            c37 r7 = r4.n()
            l33 r1 = (defpackage.l33) r1
            mk4 r8 = r4.b
            defpackage.hf.o0(r3, r6, r7, r1, r8)
            goto Lbf
        Lbc:
            defpackage.hf.N(r6)
        Lbf:
            return r5
        Lc0:
            boolean r0 = r9 instanceof defpackage.am0
            if (r0 == 0) goto Ld3
            r0 = r9
            am0 r0 = (defpackage.am0) r0
            int r1 = r0.d0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r1 & r3
            if (r4 == 0) goto Ld3
            int r1 = r1 - r3
            r0.d0 = r1
            goto Ld8
        Ld3:
            am0 r0 = new am0
            r0.<init>(r7, r9)
        Ld8:
            java.lang.Object r9 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.d0
            r4 = 0
            if (r3 == 0) goto Lf2
            if (r3 != r2) goto Leb
            java.lang.Object r8 = r0.X
            bm0 r7 = r0.R
            defpackage.oi2.Y(r9)
            goto L115
        Leb:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r5 = r4
            goto L132
        Lf2:
            defpackage.oi2.Y(r9)
            dh5 r6 = (defpackage.dh5) r6
            java.lang.Object r9 = r6.A
            rc3 r9 = (defpackage.rc3) r9
            if (r9 == 0) goto L115
            fq0 r3 = new fq0
            java.lang.String r6 = "Child of the scoped flow was cancelled"
            r3.<init>(r6)
            r9.h(r3)
            r0.R = r7
            r0.X = r8
            r0.d0 = r2
            java.lang.Object r9 = r9.c0(r0)
            if (r9 != r1) goto L115
            r5 = r1
            goto L132
        L115:
            java.lang.Object r9 = r7.B
            dh5 r9 = (defpackage.dh5) r9
            java.lang.Object r0 = r7.L
            w61 r0 = (defpackage.w61) r0
            a71 r1 = defpackage.a71.UNDISPATCHED
            zl0 r3 = new zl0
            java.lang.Object r6 = r7.R
            cm0 r6 = (defpackage.cm0) r6
            java.lang.Object r7 = r7.X
            ne2 r7 = (defpackage.ne2) r7
            r3.<init>(r6, r7, r8, r4)
            ap6 r7 = defpackage.hv.L(r0, r4, r1, r3, r2)
            r9.A = r7
        L132:
            return r5
    }

    public java.lang.Object b(int[] r14, defpackage.r41 r15) {
            r13 = this;
            java.lang.Object r0 = r13.L
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.X
            ne2 r1 = (defpackage.ne2) r1
            java.lang.Object r2 = r13.B
            dh5 r2 = (defpackage.dh5) r2
            boolean r3 = r15 instanceof defpackage.fc7
            if (r3 == 0) goto L1f
            r3 = r15
            fc7 r3 = (defpackage.fc7) r3
            int r4 = r3.Z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1f
            int r4 = r4 - r5
            r3.Z = r4
            goto L24
        L1f:
            fc7 r3 = new fc7
            r3.<init>(r13, r15)
        L24:
            java.lang.Object r15 = r3.X
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.Z
            r6 = 0
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L40
            if (r5 == r8) goto L3a
            if (r5 != r7) goto L34
            goto L3a
        L34:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            return r6
        L3a:
            int[] r14 = r3.R
            defpackage.oi2.Y(r15)
            goto L98
        L40:
            defpackage.oi2.Y(r15)
            java.lang.Object r15 = r2.A
            if (r15 != 0) goto L56
            java.util.Set r13 = defpackage.fv.V0(r0)
            r3.R = r14
            r3.Z = r8
            java.lang.Object r13 = r1.a(r13, r3)
            if (r13 != r4) goto L98
            goto L97
        L56:
            java.lang.Object r13 = r13.R
            int[] r13 = (int[]) r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r5 = r0.length
            r8 = 0
            r9 = r8
        L62:
            if (r8 >= r5) goto L83
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r2.A
            if (r12 == 0) goto L7d
            int[] r12 = (int[]) r12
            r9 = r13[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L79
            r15.add(r10)
        L79:
            int r8 = r8 + 1
            r9 = r11
            goto L62
        L7d:
            java.lang.String r13 = "Required value was null."
            defpackage.i.m(r13)
            return r6
        L83:
            boolean r13 = r15.isEmpty()
            if (r13 != 0) goto L98
            java.util.Set r13 = defpackage.gt0.p1(r15)
            r3.R = r14
            r3.Z = r7
            java.lang.Object r13 = r1.a(r13, r3)
            if (r13 != r4) goto L98
        L97:
            return r4
        L98:
            r2.A = r14
            jg7 r13 = defpackage.jg7.a
            return r13
    }
}
