package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vc  reason: default package */
/* loaded from: classes.dex */
public final class vc implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;
    public final java.lang.Object L;
    public final java.lang.Object R;

    public /* synthetic */ vc(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    public vc(defpackage.ne2 r3, defpackage.l61 r4) {
            r2 = this;
            r0 = 8
            r2.A = r0
            r2.<init>()
            r2.B = r4
            java.lang.Object r4 = defpackage.k57.b(r4)
            r2.L = r4
            ve2 r4 = new ve2
            r0 = 0
            r1 = 1
            r4.<init>(r3, r0, r1)
            r2.R = r4
            return
    }

    public vc(defpackage.nl1 r2, defpackage.dh5 r3, defpackage.ne2 r4) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            r1.R = r4
            return
    }

    public vc(defpackage.w61 r1, defpackage.ss5 r2, defpackage.ip3 r3, defpackage.pr3 r4) {
            r0 = this;
            r1 = 7
            r0.A = r1
            r0.<init>()
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r18, defpackage.r41 r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.A
            r4 = 3
            r5 = 2
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1
            r9 = 0
            jg7 r10 = defpackage.jg7.a
            java.lang.Object r11 = r0.R
            java.lang.Object r12 = r0.L
            java.lang.Object r13 = r0.B
            switch(r3) {
                case 0: goto L1e8;
                case 1: goto L1b3;
                case 2: goto L154;
                case 3: goto L104;
                case 4: goto L87;
                case 5: goto L3b;
                case 6: goto L34;
                case 7: goto L29;
                default: goto L1b;
            }
        L1b:
            l61 r13 = (defpackage.l61) r13
            ve2 r11 = (defpackage.ve2) r11
            java.lang.Object r0 = defpackage.mb3.P(r13, r1, r12, r11, r2)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L28
            r10 = r0
        L28:
            return r10
        L29:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.c(r1, r2)
            return r0
        L34:
            fk3 r1 = (defpackage.fk3) r1
            java.lang.Object r0 = r0.b(r1, r2)
            return r0
        L3b:
            boolean r3 = r2 instanceof defpackage.lf2
            if (r3 == 0) goto L4c
            r3 = r2
            lf2 r3 = (defpackage.lf2) r3
            int r4 = r3.Y
            r14 = r4 & r7
            if (r14 == 0) goto L4c
            int r4 = r4 - r7
            r3.Y = r4
            goto L51
        L4c:
            lf2 r3 = new lf2
            r3.<init>(r0, r2)
        L51:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.Y
            if (r4 == 0) goto L66
            if (r4 == r8) goto L5d
            if (r4 != r5) goto L62
        L5d:
            defpackage.oi2.Y(r0)
        L60:
            r9 = r10
            goto L86
        L62:
            defpackage.i.m(r6)
            goto L86
        L66:
            defpackage.oi2.Y(r0)
            bh5 r13 = (defpackage.bh5) r13
            int r0 = r13.A
            int r0 = r0 + r8
            r13.A = r0
            ne2 r12 = (defpackage.ne2) r12
            if (r0 >= r8) goto L7d
            r3.Y = r8
            java.lang.Object r0 = r12.a(r1, r3)
            if (r0 != r2) goto L60
            goto L85
        L7d:
            r3.Y = r5
            x61 r0 = defpackage.iv7.a(r12, r1, r11, r3)
            if (r0 != r2) goto L60
        L85:
            r9 = r2
        L86:
            return r9
        L87:
            boolean r3 = r2 instanceof defpackage.if2
            if (r3 == 0) goto L98
            r3 = r2
            if2 r3 = (defpackage.if2) r3
            int r14 = r3.d0
            r15 = r14 & r7
            if (r15 == 0) goto L98
            int r14 = r14 - r7
            r3.d0 = r14
            goto L9d
        L98:
            if2 r3 = new if2
            r3.<init>(r0, r2)
        L9d:
            java.lang.Object r2 = r3.Y
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r14 = r3.d0
            if (r14 == 0) goto Lc1
            if (r14 == r8) goto Lab
            if (r14 == r5) goto Lb4
            if (r14 != r4) goto Lb0
        Lab:
            defpackage.oi2.Y(r2)
        Lae:
            r9 = r10
            goto L103
        Lb0:
            defpackage.i.m(r6)
            goto L103
        Lb4:
            java.lang.Object r0 = r3.X
            vc r1 = r3.R
            defpackage.oi2.Y(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto Le4
        Lc1:
            defpackage.oi2.Y(r2)
            zg5 r13 = (defpackage.zg5) r13
            boolean r2 = r13.A
            if (r2 == 0) goto Ld5
            ne2 r12 = (defpackage.ne2) r12
            r3.d0 = r8
            java.lang.Object r0 = r12.a(r1, r3)
            if (r0 != r7) goto Lae
            goto L102
        Ld5:
            eo2 r11 = (defpackage.eo2) r11
            r3.R = r0
            r3.X = r1
            r3.d0 = r5
            java.lang.Object r2 = r11.o(r1, r3)
            if (r2 != r7) goto Le4
            goto L102
        Le4:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto Lae
            java.lang.Object r2 = r0.B
            zg5 r2 = (defpackage.zg5) r2
            r2.A = r8
            java.lang.Object r0 = r0.L
            ne2 r0 = (defpackage.ne2) r0
            r3.R = r9
            r3.X = r9
            r3.d0 = r4
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r7) goto Lae
        L102:
            r9 = r7
        L103:
            return r9
        L104:
            dh5 r13 = (defpackage.dh5) r13
            nl1 r12 = (defpackage.nl1) r12
            boolean r3 = r2 instanceof defpackage.ml1
            if (r3 == 0) goto L119
            r3 = r2
            ml1 r3 = (defpackage.ml1) r3
            int r4 = r3.Y
            r5 = r4 & r7
            if (r5 == 0) goto L119
            int r4 = r4 - r7
            r3.Y = r4
            goto L11e
        L119:
            ml1 r3 = new ml1
            r3.<init>(r0, r2)
        L11e:
            java.lang.Object r0 = r3.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.Y
            if (r4 == 0) goto L131
            if (r4 != r8) goto L12d
            defpackage.oi2.Y(r0)
        L12b:
            r9 = r10
            goto L153
        L12d:
            defpackage.i.m(r6)
            goto L153
        L131:
            defpackage.oi2.Y(r0)
            qn2 r0 = r12.B
            java.lang.Object r0 = r0.g(r1)
            java.lang.Object r4 = r13.A
            gr1 r5 = defpackage.fh4.a
            if (r4 == r5) goto L146
            boolean r4 = defpackage.nb3.k(r4, r0)
            if (r4 != 0) goto L12b
        L146:
            r13.A = r0
            ne2 r11 = (defpackage.ne2) r11
            r3.Y = r8
            java.lang.Object r0 = r11.a(r1, r3)
            if (r0 != r2) goto L12b
            r9 = r2
        L153:
            return r9
        L154:
            r0 = r1
            t93 r0 = (defpackage.t93) r0
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            boolean r1 = r0 instanceof defpackage.oy2
            if (r1 == 0) goto L161
            r13.add(r0)
            goto L1a0
        L161:
            boolean r1 = r0 instanceof defpackage.py2
            if (r1 == 0) goto L16d
            py2 r0 = (defpackage.py2) r0
            oy2 r0 = r0.a
            r13.remove(r0)
            goto L1a0
        L16d:
            boolean r1 = r0 instanceof defpackage.sg2
            if (r1 == 0) goto L175
            r13.add(r0)
            goto L1a0
        L175:
            boolean r1 = r0 instanceof defpackage.tg2
            if (r1 == 0) goto L181
            tg2 r0 = (defpackage.tg2) r0
            sg2 r0 = r0.a
            r13.remove(r0)
            goto L1a0
        L181:
            boolean r1 = r0 instanceof defpackage.l25
            if (r1 == 0) goto L189
            r13.add(r0)
            goto L1a0
        L189:
            boolean r1 = r0 instanceof defpackage.m25
            if (r1 == 0) goto L195
            m25 r0 = (defpackage.m25) r0
            l25 r0 = r0.a
            r13.remove(r0)
            goto L1a0
        L195:
            boolean r1 = r0 instanceof defpackage.k25
            if (r1 == 0) goto L1a0
            k25 r0 = (defpackage.k25) r0
            l25 r0 = r0.a
            r13.remove(r0)
        L1a0:
            java.lang.Object r0 = defpackage.gt0.R0(r13)
            t93 r0 = (defpackage.t93) r0
            w61 r12 = (defpackage.w61) r12
            xd1 r1 = new xd1
            ie2 r11 = (defpackage.ie2) r11
            r1.<init>(r11, r0, r9, r8)
            defpackage.hv.L(r12, r9, r9, r1, r4)
            return r10
        L1b3:
            r0 = r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            ga7 r12 = (defpackage.ga7) r12
            q35 r13 = (defpackage.q35) r13
            if (r0 == 0) goto L1df
            qa4 r11 = (defpackage.qa4) r11
            java.lang.Object r0 = r11.getValue()
            eo2 r0 = (defpackage.eo2) r0
            gx0 r1 = r12.a
            java.lang.Object r1 = r1.f()
            vs4 r2 = r12.d
            java.lang.Object r2 = r2.getValue()
            java.lang.Object r0 = r0.o(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L1e0
        L1df:
            r0 = 0
        L1e0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r13.setValue(r0)
            return r10
        L1e8:
            dh5 r13 = (defpackage.dh5) r13
            boolean r3 = r2 instanceof defpackage.uc
            if (r3 == 0) goto L1fb
            r3 = r2
            uc r3 = (defpackage.uc) r3
            int r4 = r3.Z
            r5 = r4 & r7
            if (r5 == 0) goto L1fb
            int r4 = r4 - r7
            r3.Z = r4
            goto L200
        L1fb:
            uc r3 = new uc
            r3.<init>(r0, r2)
        L200:
            java.lang.Object r0 = r3.X
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r3.Z
            if (r4 == 0) goto L214
            if (r4 != r8) goto L210
            java.lang.Object r1 = r3.R
            defpackage.oi2.Y(r0)
            goto L231
        L210:
            defpackage.i.m(r6)
            goto L248
        L214:
            defpackage.oi2.Y(r0)
            java.lang.Object r0 = r13.A
            rc3 r0 = (defpackage.rc3) r0
            if (r0 == 0) goto L231
            pc r4 = new pc
            r4.<init>()
            r0.h(r4)
            r3.R = r1
            r3.Z = r8
            java.lang.Object r0 = r0.c0(r3)
            if (r0 != r2) goto L231
            r9 = r2
            goto L248
        L231:
            r4 = r1
            r5 = r12
            w61 r5 = (defpackage.w61) r5
            a71 r0 = defpackage.a71.UNDISPATCHED
            b0 r2 = new b0
            r3 = r11
            eo2 r3 = (defpackage.eo2) r3
            r7 = 2
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            ap6 r0 = defpackage.hv.L(r5, r6, r0, r2, r8)
            r13.A = r0
            r9 = r10
        L248:
            return r9
    }

    public java.lang.Object b(defpackage.fk3 r7, defpackage.r41 r8) {
            r6 = this;
            java.lang.Object r0 = r6.L
            android.content.res.Resources r0 = (android.content.res.Resources) r0
            boolean r1 = r8 instanceof defpackage.do3
            if (r1 == 0) goto L17
            r1 = r8
            do3 r1 = (defpackage.do3) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.Z = r2
            goto L1c
        L17:
            do3 r1 = new do3
            r1.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r1.X
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2d
            fk3 r7 = r1.R
            defpackage.oi2.Y(r8)
            goto L5e
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            r6 = 0
            return r6
        L34:
            defpackage.oi2.Y(r8)
            java.lang.Object r8 = r6.B
            gl6 r8 = (defpackage.gl6) r8
            java.lang.String r3 = r7.b
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r5 = 2131952283(0x7f13029b, float:1.9541004E38)
            java.lang.String r3 = r0.getString(r5, r3)
            r3.getClass()
            r5 = 2131952778(0x7f13048a, float:1.9542008E38)
            java.lang.String r0 = r0.getString(r5)
            r1.R = r7
            r1.Z = r4
            r4 = 4
            java.lang.Object r8 = defpackage.gl6.b(r8, r3, r0, r1, r4)
            if (r8 != r2) goto L5e
            return r2
        L5e:
            ll6 r8 = (defpackage.ll6) r8
            ll6 r0 = defpackage.ll6.ActionPerformed
            if (r8 != r0) goto L6b
            java.lang.Object r6 = r6.R
            qn2 r6 = (defpackage.qn2) r6
            r6.g(r7)
        L6b:
            jg7 r6 = defpackage.jg7.a
            return r6
    }

    public java.lang.Object c(boolean r7, defpackage.r41 r8) {
            r6 = this;
            boolean r7 = r8 instanceof defpackage.js5
            if (r7 == 0) goto L13
            r7 = r8
            js5 r7 = (defpackage.js5) r7
            int r0 = r7.Y
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.Y = r0
            goto L18
        L13:
            js5 r7 = new js5
            r7.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r7.R
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r7.Y
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L31
            if (r1 == r2) goto L27
            if (r1 != r4) goto L2b
        L27:
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L76
            goto L76
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L31:
            defpackage.oi2.Y(r8)
            java.lang.Object r8 = r6.B
            ss5 r8 = (defpackage.ss5) r8
            java.lang.Object r1 = r6.L
            ip3 r1 = (defpackage.ip3) r1
            java.lang.Object r6 = r6.R
            pr3 r6 = (defpackage.pr3) r6
            n06 r8 = r8.f     // Catch: java.lang.Throwable -> L76
            int[] r5 = defpackage.is5.a     // Catch: java.lang.Throwable -> L76
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L76
            r8 = r5[r8]     // Catch: java.lang.Throwable -> L76
            if (r8 == r2) goto L65
            if (r8 != r4) goto L5f
            xa4 r8 = defpackage.xa4.PreventUserInput     // Catch: java.lang.Throwable -> L76
            wg r1 = new wg     // Catch: java.lang.Throwable -> L76
            r2 = 7
            r1.<init>(r4, r3, r2)     // Catch: java.lang.Throwable -> L76
            r7.Y = r4     // Catch: java.lang.Throwable -> L76
            java.lang.Object r6 = r6.d(r8, r1, r7)     // Catch: java.lang.Throwable -> L76
            if (r6 != r0) goto L76
            goto L75
        L5f:
            ug r6 = new ug     // Catch: java.lang.Throwable -> L76
            r6.<init>()     // Catch: java.lang.Throwable -> L76
            throw r6     // Catch: java.lang.Throwable -> L76
        L65:
            xa4 r6 = defpackage.xa4.PreventUserInput     // Catch: java.lang.Throwable -> L76
            wg r8 = new wg     // Catch: java.lang.Throwable -> L76
            r5 = 6
            r8.<init>(r4, r3, r5)     // Catch: java.lang.Throwable -> L76
            r7.Y = r2     // Catch: java.lang.Throwable -> L76
            java.lang.Object r6 = r1.d(r6, r8, r7)     // Catch: java.lang.Throwable -> L76
            if (r6 != r0) goto L76
        L75:
            return r0
        L76:
            jg7 r6 = defpackage.jg7.a
            return r6
    }
}
