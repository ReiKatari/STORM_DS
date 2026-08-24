package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qg  reason: default package */
/* loaded from: classes.dex */
public final class qg extends defpackage.dm5 implements defpackage.eo2 {
    public final /* synthetic */ int L;
    public int R;
    public /* synthetic */ java.lang.Object X;
    public final /* synthetic */ java.lang.Object Y;

    public /* synthetic */ qg(java.lang.Object r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.L = r3
            r0.Y = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.L
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L34;
                case 1: goto L25;
                case 2: goto L16;
                default: goto L7;
            }
        L7:
            rb6 r3 = (defpackage.rb6) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            qg r2 = (defpackage.qg) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            mw6 r3 = (defpackage.mw6) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            qg r2 = (defpackage.qg) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L25:
            mw6 r3 = (defpackage.mw6) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            qg r2 = (defpackage.qg) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L34:
            mw6 r3 = (defpackage.mw6) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            qg r2 = (defpackage.qg) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.L
            java.lang.Object r2 = r2.Y
            switch(r0) {
                case 0: goto L28;
                case 1: goto L1d;
                case 2: goto L12;
                default: goto L7;
            }
        L7:
            qg r0 = new qg
            android.view.View r2 = (android.view.View) r2
            r1 = 3
            r0.<init>(r2, r3, r1)
            r0.X = r4
            return r0
        L12:
            qg r0 = new qg
            w51 r2 = (defpackage.w51) r2
            r1 = 2
            r0.<init>(r2, r3, r1)
            r0.X = r4
            return r0
        L1d:
            qg r0 = new qg
            qn2 r2 = (defpackage.qn2) r2
            r1 = 1
            r0.<init>(r2, r3, r1)
            r0.X = r4
            return r0
        L28:
            qg r0 = new qg
            sg r2 = (defpackage.sg) r2
            r1 = 0
            r0.<init>(r2, r3, r1)
            r0.X = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.L
            r1 = 2
            jg7 r2 = defpackage.jg7.a
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            java.lang.Object r5 = r13.Y
            r6 = 0
            switch(r0) {
                case 0: goto L103;
                case 1: goto Lac;
                case 2: goto L70;
                default: goto Le;
            }
        Le:
            android.view.View r5 = (android.view.View) r5
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r13.R
            if (r7 == 0) goto L2b
            if (r7 == r4) goto L23
            if (r7 != r1) goto L1e
            defpackage.oi2.Y(r14)
            goto L6f
        L1e:
            defpackage.i.m(r3)
            r2 = r6
            goto L6f
        L23:
            java.lang.Object r3 = r13.X
            rb6 r3 = (defpackage.rb6) r3
            defpackage.oi2.Y(r14)
            goto L3e
        L2b:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r13.X
            r3 = r14
            rb6 r3 = (defpackage.rb6) r3
            r13.X = r3
            r13.R = r4
            x61 r14 = r3.c(r13, r5)
            if (r14 != r0) goto L3e
            goto L6e
        L3e:
            boolean r14 = r5 instanceof android.view.ViewGroup
            if (r14 == 0) goto L6f
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r13.X = r6
            r13.R = r1
            r3.getClass()
            r97 r14 = new r97
            w0 r4 = new w0
            r6 = 10
            r4.<init>(r5, r6)
            r14.<init>(r4)
            java.util.Iterator r4 = r14.B
            boolean r4 = r4.hasNext()
            if (r4 != 0) goto L61
            r13 = r2
            goto L68
        L61:
            r3.L = r14
            r3.A = r1
            r3.R = r13
            r13 = r0
        L68:
            if (r13 != r0) goto L6b
            goto L6c
        L6b:
            r13 = r2
        L6c:
            if (r13 != r0) goto L6f
        L6e:
            r2 = r0
        L6f:
            return r2
        L70:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r13.R
            if (r1 == 0) goto L84
            if (r1 != r4) goto L80
            java.lang.Object r1 = r13.X
            mw6 r1 = (defpackage.mw6) r1
            defpackage.oi2.Y(r14)
            goto L9a
        L80:
            defpackage.i.m(r3)
            goto L99
        L84:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r13.X
            mw6 r14 = (defpackage.mw6) r14
            r1 = r14
        L8c:
            py4 r14 = defpackage.py4.Initial
            r13.X = r1
            r13.R = r4
            java.lang.Object r14 = r1.c(r14, r13)
            if (r14 != r0) goto L9a
            r6 = r0
        L99:
            return r6
        L9a:
            oy4 r14 = (defpackage.oy4) r14
            r2 = r5
            w51 r2 = (defpackage.w51) r2
            boolean r14 = defpackage.ma6.a(r14)
            r14 = r14 ^ r4
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r2.g(r14)
            goto L8c
        Lac:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r13.R
            if (r7 == 0) goto Lc7
            if (r7 == r4) goto Lbf
            if (r7 != r1) goto Lba
            defpackage.oi2.Y(r14)
            goto Lfb
        Lba:
            defpackage.i.m(r3)
            r2 = r6
            goto L102
        Lbf:
            java.lang.Object r3 = r13.X
            mw6 r3 = (defpackage.mw6) r3
            defpackage.oi2.Y(r14)
            goto Lda
        Lc7:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r13.X
            r3 = r14
            mw6 r3 = (defpackage.mw6) r3
            r13.X = r3
            r13.R = r4
            java.lang.Object r14 = defpackage.ln2.f(r3, r13)
            if (r14 != r0) goto Lda
            goto Lf9
        Lda:
            vy4 r14 = (defpackage.vy4) r14
            r14.a()
            qn2 r5 = (defpackage.qn2) r5
            long r7 = r14.c
            jk4 r14 = new jk4
            r14.<init>(r7)
            r5.g(r14)
            r13.X = r6
            r13.R = r1
            do1 r14 = defpackage.hz6.a
            py4 r14 = defpackage.py4.Main
            java.lang.Object r14 = defpackage.hz6.i(r3, r14, r13)
            if (r14 != r0) goto Lfb
        Lf9:
            r2 = r0
            goto L102
        Lfb:
            vy4 r14 = (defpackage.vy4) r14
            if (r14 == 0) goto L102
            r14.a()
        L102:
            return r2
        L103:
            sg r5 = (defpackage.sg) r5
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r13.R
            if (r7 == 0) goto L125
            if (r7 == r4) goto L11d
            if (r7 != r1) goto L117
            java.lang.Object r3 = r13.X
            mw6 r3 = (defpackage.mw6) r3
            defpackage.oi2.Y(r14)
            goto L150
        L117:
            defpackage.i.m(r3)
            r2 = r6
            goto L1b1
        L11d:
            java.lang.Object r3 = r13.X
            mw6 r3 = (defpackage.mw6) r3
            defpackage.oi2.Y(r14)
            goto L138
        L125:
            defpackage.oi2.Y(r14)
            java.lang.Object r14 = r13.X
            r3 = r14
            mw6 r3 = (defpackage.mw6) r3
            r13.X = r3
            r13.R = r4
            java.lang.Object r14 = defpackage.hz6.b(r3, r13, r1)
            if (r14 != r0) goto L138
            goto L14e
        L138:
            vy4 r14 = (defpackage.vy4) r14
            long r7 = r14.a
            r5.h = r7
            long r7 = r14.c
            r5.b = r7
        L142:
            r13.X = r3
            r13.R = r1
            py4 r14 = defpackage.py4.Main
            java.lang.Object r14 = r3.c(r14, r13)
            if (r14 != r0) goto L150
        L14e:
            r2 = r0
            goto L1b1
        L150:
            oy4 r14 = (defpackage.oy4) r14
            java.util.List r14 = r14.a
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = r14.size()
            r4.<init>(r7)
            int r7 = r14.size()
            r8 = 0
            r9 = r8
        L163:
            if (r9 >= r7) goto L176
            java.lang.Object r10 = r14.get(r9)
            r11 = r10
            vy4 r11 = (defpackage.vy4) r11
            boolean r11 = r11.d
            if (r11 == 0) goto L173
            r4.add(r10)
        L173:
            int r9 = r9 + 1
            goto L163
        L176:
            int r14 = r4.size()
        L17a:
            if (r8 >= r14) goto L191
            java.lang.Object r7 = r4.get(r8)
            r9 = r7
            vy4 r9 = (defpackage.vy4) r9
            long r9 = r9.a
            long r11 = r5.h
            boolean r9 = defpackage.nj2.o(r9, r11)
            if (r9 == 0) goto L18e
            goto L192
        L18e:
            int r8 = r8 + 1
            goto L17a
        L191:
            r7 = r6
        L192:
            vy4 r7 = (defpackage.vy4) r7
            if (r7 != 0) goto L19d
            java.lang.Object r14 = defpackage.gt0.J0(r4)
            r7 = r14
            vy4 r7 = (defpackage.vy4) r7
        L19d:
            if (r7 == 0) goto L1a7
            long r8 = r7.a
            r5.h = r8
            long r7 = r7.c
            r5.b = r7
        L1a7:
            boolean r14 = r4.isEmpty()
            if (r14 == 0) goto L142
            r13 = -1
            r5.h = r13
        L1b1:
            return r2
    }
}
