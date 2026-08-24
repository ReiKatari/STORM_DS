package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: le  reason: default package */
/* loaded from: classes.dex */
public final class le extends defpackage.aj3 implements defpackage.on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ le(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r10 = this;
            int r0 = r10.B
            r1 = 0
            r2 = 1
            r3 = 0
            jg7 r4 = defpackage.jg7.a
            java.lang.Object r5 = r10.R
            java.lang.Object r10 = r10.L
            switch(r0) {
                case 0: goto L212;
                case 1: goto L14f;
                case 2: goto L125;
                case 3: goto L11b;
                case 4: goto Lfd;
                case 5: goto Lf2;
                case 6: goto Lea;
                case 7: goto L60;
                case 8: goto L1e;
                case 9: goto L16;
                default: goto Le;
            }
        Le:
            ut3 r10 = (defpackage.ut3) r10
            wb4 r5 = (defpackage.wb4) r5
            r10.c(r5)
            return r4
        L16:
            p0 r10 = (defpackage.p0) r10
            wh6 r5 = (defpackage.wh6) r5
            r10.removeOnAttachStateChangeListener(r5)
            return r4
        L1e:
            qn2 r10 = (defpackage.qn2) r10
            op5 r0 = defpackage.eg4.K0
            r10.g(r0)
            eg4 r5 = (defpackage.eg4) r5
            ke6 r10 = r5.B0
            ke6 r3 = r0.i0
            boolean r10 = defpackage.nb3.k(r10, r3)
            boolean r3 = r5.C0
            boolean r6 = r0.j0
            if (r3 == r6) goto L36
            r1 = r2
        L36:
            if (r10 == 0) goto L3a
            if (r1 == 0) goto L4f
        L3a:
            ke6 r3 = r0.i0
            r5.B0 = r3
            r5.C0 = r6
            boolean r3 = r5.D0
            if (r3 == 0) goto L4f
            if (r1 != 0) goto L4a
            if (r6 == 0) goto L4f
            if (r10 != 0) goto L4f
        L4a:
            sm3 r10 = r5.k0
            r10.F()
        L4f:
            r5.D0 = r2
            ke6 r10 = r0.i0
            long r1 = r0.k0
            kk3 r3 = r0.m0
            qh1 r5 = r0.l0
            mp2 r10 = r10.a(r1, r3, r5)
            r0.p0 = r10
            return r4
        L60:
            sm3 r10 = (defpackage.sm3) r10
            if0 r10 = r10.B0
            dh5 r5 = (defpackage.dh5) r5
            java.lang.Object r0 = r10.g
            z64 r0 = (defpackage.z64) r0
            int r0 = r0.R
            r0 = r0 & 8
            if (r0 == 0) goto Le9
            java.lang.Object r10 = r10.f
            vy6 r10 = (defpackage.vy6) r10
        L74:
            if (r10 == 0) goto Le9
            int r0 = r10.L
            r0 = r0 & 8
            if (r0 == 0) goto Le6
            r0 = r10
            r6 = r3
        L7e:
            if (r0 == 0) goto Le6
            boolean r7 = r0 instanceof defpackage.va6
            if (r7 == 0) goto La9
            va6 r0 = (defpackage.va6) r0
            boolean r7 = r0.J()
            if (r7 == 0) goto L95
            ta6 r7 = new ta6
            r7.<init>()
            r5.A = r7
            r7.R = r2
        L95:
            boolean r7 = r0.C0()
            if (r7 == 0) goto La1
            java.lang.Object r7 = r5.A
            ta6 r7 = (defpackage.ta6) r7
            r7.L = r2
        La1:
            java.lang.Object r7 = r5.A
            gb6 r7 = (defpackage.gb6) r7
            r0.A0(r7)
            goto Le1
        La9:
            int r7 = r0.L
            r7 = r7 & 8
            if (r7 == 0) goto Le1
            boolean r7 = r0 instanceof defpackage.zg1
            if (r7 == 0) goto Le1
            r7 = r0
            zg1 r7 = (defpackage.zg1) r7
            z64 r7 = r7.l0
            r8 = r1
        Lb9:
            if (r7 == 0) goto Lde
            int r9 = r7.L
            r9 = r9 & 8
            if (r9 == 0) goto Ldb
            int r8 = r8 + 1
            if (r8 != r2) goto Lc7
            r0 = r7
            goto Ldb
        Lc7:
            if (r6 != 0) goto Ld2
            ua4 r6 = new ua4
            r9 = 16
            z64[] r9 = new defpackage.z64[r9]
            r6.<init>(r9)
        Ld2:
            if (r0 == 0) goto Ld8
            r6.b(r0)
            r0 = r3
        Ld8:
            r6.b(r7)
        Ldb:
            z64 r7 = r7.Y
            goto Lb9
        Lde:
            if (r8 != r2) goto Le1
            goto L7e
        Le1:
            z64 r0 = defpackage.nc1.A(r6)
            goto L7e
        Le6:
            z64 r10 = r10.X
            goto L74
        Le9:
            return r4
        Lea:
            wx2 r10 = (defpackage.wx2) r10
            z64 r5 = (defpackage.z64) r5
            r10.d(r5)
            return r4
        Lf2:
            dh5 r10 = (defpackage.dh5) r10
            vh2 r5 = (defpackage.vh2) r5
            ih2 r0 = r5.T0()
            r10.A = r0
            return r4
        Lfd:
            go3 r5 = (defpackage.go3) r5
            java.lang.Object r0 = r5.getValue()
            bp7 r0 = (defpackage.bp7) r0
            boolean r1 = r0 instanceof defpackage.mw2
            if (r1 == 0) goto L10c
            r3 = r0
            mw2 r3 = (defpackage.mw2) r3
        L10c:
            if (r3 == 0) goto L114
            yo7 r0 = r3.getDefaultViewModelProviderFactory()
            if (r0 != 0) goto L11a
        L114:
            uo0 r10 = (defpackage.uo0) r10
            yo7 r0 = r10.getDefaultViewModelProviderFactory()
        L11a:
            return r0
        L11b:
            na0 r10 = (defpackage.na0) r10
            qn2 r10 = r10.m0
            oa0 r5 = (defpackage.oa0) r5
            r10.g(r5)
            return r4
        L125:
            on2 r10 = (defpackage.on2) r10
            if (r10 == 0) goto L134
            java.lang.Object r10 = r10.c()
            of5 r10 = (defpackage.of5) r10
            if (r10 != 0) goto L132
            goto L134
        L132:
            r3 = r10
            goto L14e
        L134:
            eg4 r5 = (defpackage.eg4) r5
            z64 r10 = r5.Y0()
            boolean r10 = r10.j0
            if (r10 == 0) goto L13f
            goto L140
        L13f:
            r5 = r3
        L140:
            if (r5 == 0) goto L14e
            long r0 = r5.L
            long r0 = defpackage.qo2.S(r0)
            r2 = 0
            of5 r3 = defpackage.kj2.b(r2, r0)
        L14e:
            return r3
        L14f:
            ze r5 = (defpackage.ze) r5
            o76 r10 = (defpackage.o76) r10
            e76 r0 = r10.X
            e76 r1 = r10.Y
            java.lang.Float r2 = r10.L
            java.lang.Float r3 = r10.R
            r6 = 0
            if (r0 == 0) goto L172
            if (r2 == 0) goto L172
            on2 r7 = r0.a
            java.lang.Object r7 = r7.c()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r2 = r2.floatValue()
            float r7 = r7 - r2
            goto L173
        L172:
            r7 = r6
        L173:
            if (r1 == 0) goto L189
            if (r3 == 0) goto L189
            on2 r2 = r1.a
            java.lang.Object r2 = r2.c()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r3 = r3.floatValue()
            float r2 = r2 - r3
            goto L18a
        L189:
            r2 = r6
        L18a:
            int r3 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r3 != 0) goto L193
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L193
            goto L1f9
        L193:
            int r2 = r10.A
            int r2 = r5.A(r2)
            g93 r3 = r5.s()
            int r6 = r5.g0
            java.lang.Object r3 = r3.b(r6)
            za6 r3 = (defpackage.za6) r3
            if (r3 == 0) goto L1b4
            v2 r6 = r5.i0     // Catch: java.lang.IllegalStateException -> L1b4
            if (r6 == 0) goto L1b4
            android.graphics.Rect r3 = r5.k(r3)     // Catch: java.lang.IllegalStateException -> L1b4
            android.view.accessibility.AccessibilityNodeInfo r6 = r6.a     // Catch: java.lang.IllegalStateException -> L1b4
            r6.setBoundsInScreen(r3)     // Catch: java.lang.IllegalStateException -> L1b4
        L1b4:
            g93 r3 = r5.s()
            int r6 = r5.h0
            java.lang.Object r3 = r3.b(r6)
            za6 r3 = (defpackage.za6) r3
            if (r3 == 0) goto L1cf
            v2 r6 = r5.j0     // Catch: java.lang.IllegalStateException -> L1cf
            if (r6 == 0) goto L1cf
            android.graphics.Rect r3 = r5.k(r3)     // Catch: java.lang.IllegalStateException -> L1cf
            android.view.accessibility.AccessibilityNodeInfo r6 = r6.a     // Catch: java.lang.IllegalStateException -> L1cf
            r6.setBoundsInScreen(r3)     // Catch: java.lang.IllegalStateException -> L1cf
        L1cf:
            te r3 = r5.R
            r3.invalidate()
            g93 r3 = r5.s()
            java.lang.Object r3 = r3.b(r2)
            za6 r3 = (defpackage.za6) r3
            if (r3 == 0) goto L1f9
            xa6 r3 = r3.a
            if (r3 == 0) goto L1f9
            sm3 r3 = r3.c
            if (r3 == 0) goto L1f9
            if (r0 == 0) goto L1ef
            p94 r6 = r5.l0
            r6.i(r2, r0)
        L1ef:
            if (r1 == 0) goto L1f6
            p94 r6 = r5.m0
            r6.i(r2, r1)
        L1f6:
            r5.w(r3)
        L1f9:
            if (r0 == 0) goto L205
            on2 r0 = r0.a
            java.lang.Object r0 = r0.c()
            java.lang.Float r0 = (java.lang.Float) r0
            r10.L = r0
        L205:
            if (r1 == 0) goto L211
            on2 r0 = r1.a
            java.lang.Object r0 = r0.c()
            java.lang.Float r0 = (java.lang.Float) r0
            r10.R = r0
        L211:
            return r4
        L212:
            te r10 = (defpackage.te) r10
            android.view.KeyEvent r5 = (android.view.KeyEvent) r5
            boolean r10 = defpackage.te.b(r10, r5)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
    }
}
