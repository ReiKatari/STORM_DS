package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pj  reason: default package */
/* loaded from: classes.dex */
public final class pj extends defpackage.aj3 implements defpackage.on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ pj(java.lang.Object r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r18 = this;
            r0 = r18
            int r1 = r0.B
            r2 = 0
            r3 = 0
            r4 = 1
            jg7 r5 = defpackage.jg7.a
            java.lang.Object r0 = r0.L
            switch(r1) {
                case 0: goto L1cb;
                case 1: goto L1ca;
                case 2: goto L1b0;
                case 3: goto L1a9;
                case 4: goto L1a6;
                case 5: goto L19d;
                case 6: goto L176;
                case 7: goto L16e;
                case 8: goto L168;
                case 9: goto L152;
                case 10: goto L143;
                case 11: goto L12b;
                case 12: goto L10f;
                case 13: goto L108;
                case 14: goto L101;
                case 15: goto Le4;
                case 16: goto Lcf;
                case 17: goto L9f;
                case 18: goto L2a;
                case 19: goto L20;
                case 20: goto L18;
                default: goto Le;
            }
        Le:
            dh5 r0 = (defpackage.dh5) r0
            java.lang.Object r0 = r0.A
            on2 r0 = (defpackage.on2) r0
            r0.c()
            return r5
        L18:
            gl7 r0 = (defpackage.gl7) r0
            vs4 r0 = r0.d0
            r0.setValue(r5)
            return r5
        L20:
            android.view.inputmethod.BaseInputConnection r1 = new android.view.inputmethod.BaseInputConnection
            r37 r0 = (defpackage.r37) r0
            android.view.View r0 = r0.a
            r1.<init>(r0, r3)
            return r1
        L2a:
            pt6 r0 = (defpackage.pt6) r0
            gn3 r0 = r0.a()
            sm3 r1 = r0.A
            java.util.List r2 = r1.o()
            aa4 r2 = (defpackage.aa4) r2
            java.lang.Object r2 = r2.B
            ua4 r2 = (defpackage.ua4) r2
            int r2 = r2.L
            int r6 = r0.j0
            if (r6 == r2) goto L9e
            ja4 r0 = r0.Y
            java.lang.Object[] r2 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + (-2)
            r7 = 7
            if (r6 < 0) goto L87
            r8 = r3
        L4f:
            r9 = r0[r8]
            long r11 = ~r9
            long r11 = r11 << r7
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L82
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r3
        L68:
            if (r13 >= r11) goto L80
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L7c
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            ym3 r14 = (defpackage.ym3) r14
            r14.d = r4
        L7c:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L68
        L80:
            if (r11 != r12) goto L87
        L82:
            if (r8 == r6) goto L87
            int r8 = r8 + 1
            goto L4f
        L87:
            sm3 r0 = r1.e0
            if (r0 == 0) goto L95
            wm3 r0 = r1.C0
            boolean r0 = r0.e
            if (r0 != 0) goto L9e
            defpackage.sm3.T(r1, r3, r7)
            goto L9e
        L95:
            boolean r0 = r1.q()
            if (r0 != 0) goto L9e
            defpackage.sm3.V(r1, r3, r7)
        L9e:
            return r5
        L9f:
            sg6 r0 = (defpackage.sg6) r0
            om6 r0 = r0.d0
            nm6 r0 = r0.d()
            yv4 r0 = r0.c
            java.util.Collection r0 = r0.values()
            r1 = r0
            l0 r1 = (defpackage.l0) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lce
            m14 r0 = (defpackage.m14) r0
            java.util.Iterator r0 = r0.iterator()
        Lbc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lce
            java.lang.Object r1 = r0.next()
            gf6 r1 = (defpackage.gf6) r1
            boolean r1 = r1.d()
            if (r1 == 0) goto Lbc
        Lce:
            return r5
        Lcf:
            rf5 r0 = (defpackage.rf5) r0
            r0.h = r2
            java.lang.String r1 = "OnPositionedDispatch"
            android.os.Trace.beginSection(r1)
            r0.a()     // Catch: java.lang.Throwable -> Ldf
            android.os.Trace.endSection()
            return r5
        Ldf:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        Le4:
            c05 r0 = (defpackage.c05) r0
            jk3 r1 = defpackage.c05.l(r0)
            if (r1 == 0) goto Lf3
            boolean r5 = r1.t()
            if (r5 == 0) goto Lf3
            r2 = r1
        Lf3:
            if (r2 == 0) goto Lfc
            q93 r0 = r0.m0getPopupContentSizebOM6tXw()
            if (r0 == 0) goto Lfc
            r3 = r4
        Lfc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L101:
            ge4 r0 = (defpackage.ge4) r0
            w61 r0 = r0.R0()
            return r0
        L108:
            eb r0 = (defpackage.eb) r0
            java.lang.Object r0 = r0.X
            w61 r0 = (defpackage.w61) r0
            return r0
        L10f:
            mu3 r0 = (defpackage.mu3) r0
            s63 r0 = r0.a
            java.lang.Object r0 = r0.B
            k04 r0 = (defpackage.k04) r0
            boolean r1 = r0.B
            if (r1 == 0) goto L11c
            goto L12a
        L11c:
            boolean r1 = r0.L
            if (r1 == 0) goto L125
            java.lang.String r1 = "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"
            defpackage.s05.a(r1)
        L125:
            r0.a()
            r0.L = r4
        L12a:
            return r5
        L12b:
            ym3 r0 = (defpackage.ym3) r0
            vs4 r1 = r0.g
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L142
            ey0 r0 = r0.c
            if (r0 == 0) goto L142
            r0.l()
        L142:
            return r5
        L143:
            sm3 r0 = (defpackage.sm3) r0
            wm3 r0 = r0.C0
            d34 r1 = r0.p
            r1.v0 = r4
            rz3 r0 = r0.q
            if (r0 == 0) goto L151
            r0.p0 = r4
        L151:
            return r5
        L152:
            bt r0 = (defpackage.bt) r0
            java.lang.Object r0 = r0.B
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            r0.getClass()
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            return r0
        L168:
            vh2 r0 = (defpackage.vh2) r0
            r0.T0()
            return r5
        L16e:
            ao r1 = new ao
            uo1 r0 = (defpackage.uo1) r0
            r1.<init>(r0, r4)
            return r1
        L176:
            mx0 r0 = (defpackage.mx0) r0
            r1 = 0
            boolean r3 = defpackage.q93.b(r1, r1)
            android.view.View r0 = r0.a
            if (r3 == 0) goto L187
            fi1 r0 = defpackage.n16.p(r0)
            goto L19c
        L187:
            android.content.Context r0 = r0.getContext()
            uh1 r0 = defpackage.ak7.s(r0)
            long r3 = defpackage.qo2.S(r1)
            long r3 = r0.q(r3)
            fi1 r0 = new fi1
            r0.<init>(r1, r3)
        L19c:
            return r0
        L19d:
            pj r0 = (defpackage.pj) r0
            java.lang.Object r0 = r0.c()
            bp7 r0 = (defpackage.bp7) r0
            return r0
        L1a6:
            uo0 r0 = (defpackage.uo0) r0
            return r0
        L1a9:
            on2 r0 = (defpackage.on2) r0
            java.lang.Object r0 = r0.c()
            return r0
        L1b0:
            ga7 r0 = (defpackage.ga7) r0
            gx0 r1 = r0.a
            java.lang.Object r1 = r1.f()
            z42 r2 = defpackage.z42.PostExit
            if (r1 != r2) goto L1c5
            vs4 r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            if (r0 != r2) goto L1c5
            r3 = r4
        L1c5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L1ca:
            return r5
        L1cb:
            rj r0 = (defpackage.rj) r0
            w61 r0 = r0.L
            defpackage.g04.x(r0, r2)
            return r5
    }
}
