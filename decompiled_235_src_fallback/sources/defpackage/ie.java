package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ie  reason: default package */
/* loaded from: classes.dex */
public final class ie extends defpackage.z64 implements defpackage.o70, defpackage.va6, defpackage.bh3, defpackage.jm3, defpackage.ub7 {
    public final defpackage.mc k0;
    public final /* synthetic */ defpackage.te l0;

    public ie(defpackage.te r2) {
            r1 = this;
            r1.l0 = r2
            r1.<init>()
            mc r2 = new mc
            r0 = 2
            r2.<init>(r1, r0)
            r1.k0 = r2
            return
    }

    @Override // defpackage.va6
    public final void A0(defpackage.gb6 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.bh3
    public final boolean B(android.view.KeyEvent r13) {
            r12 = this;
            int[] r0 = defpackage.wg2.a
            long r0 = defpackage.xk2.m(r13)
            long r2 = defpackage.kg3.b
            boolean r2 = defpackage.kg3.a(r0, r2)
            r3 = 5
            r4 = 6
            r5 = 0
            r6 = 3
            r7 = 4
            r8 = 1
            r9 = 2
            if (r2 == 0) goto L1c
            qg2 r0 = new qg2
            r0.<init>(r9)
            goto Lca
        L1c:
            long r10 = defpackage.kg3.c
            boolean r2 = defpackage.kg3.a(r0, r10)
            if (r2 == 0) goto L2b
            qg2 r0 = new qg2
            r0.<init>(r8)
            goto Lca
        L2b:
            long r10 = defpackage.kg3.r
            boolean r2 = defpackage.kg3.a(r0, r10)
            if (r2 == 0) goto L44
            boolean r0 = r13.isShiftPressed()
            if (r0 == 0) goto L3b
            r0 = r9
            goto L3c
        L3b:
            r0 = r8
        L3c:
            qg2 r1 = new qg2
            r1.<init>(r0)
            r0 = r1
            goto Lca
        L44:
            long r10 = defpackage.kg3.g
            boolean r2 = defpackage.kg3.a(r0, r10)
            if (r2 == 0) goto L53
            qg2 r0 = new qg2
            r0.<init>(r7)
            goto Lca
        L53:
            long r10 = defpackage.kg3.f
            boolean r2 = defpackage.kg3.a(r0, r10)
            if (r2 == 0) goto L62
            qg2 r0 = new qg2
            r0.<init>(r6)
            goto Lca
        L62:
            long r10 = defpackage.kg3.d
            boolean r2 = defpackage.kg3.a(r0, r10)
            if (r2 != 0) goto Lc5
            long r10 = defpackage.kg3.F
            boolean r2 = defpackage.kg3.a(r0, r10)
            if (r2 == 0) goto L73
            goto Lc5
        L73:
            long r10 = defpackage.kg3.e
            boolean r2 = defpackage.kg3.a(r0, r10)
            if (r2 != 0) goto Lbf
            long r10 = defpackage.kg3.G
            boolean r2 = defpackage.kg3.a(r0, r10)
            if (r2 == 0) goto L84
            goto Lbf
        L84:
            long r10 = defpackage.kg3.h
            boolean r2 = defpackage.kg3.a(r0, r10)
            if (r2 != 0) goto Lb8
            long r10 = defpackage.kg3.t
            boolean r2 = defpackage.kg3.a(r0, r10)
            if (r2 != 0) goto Lb8
            long r10 = defpackage.kg3.N
            boolean r2 = defpackage.kg3.a(r0, r10)
            if (r2 == 0) goto L9d
            goto Lb8
        L9d:
            long r10 = defpackage.kg3.a
            boolean r2 = defpackage.kg3.a(r0, r10)
            if (r2 != 0) goto Lb0
            long r10 = defpackage.kg3.w
            boolean r0 = defpackage.kg3.a(r0, r10)
            if (r0 == 0) goto Lae
            goto Lb0
        Lae:
            r0 = r5
            goto Lca
        Lb0:
            qg2 r0 = new qg2
            r1 = 8
            r0.<init>(r1)
            goto Lca
        Lb8:
            qg2 r0 = new qg2
            r1 = 7
            r0.<init>(r1)
            goto Lca
        Lbf:
            qg2 r0 = new qg2
            r0.<init>(r4)
            goto Lca
        Lc5:
            qg2 r0 = new qg2
            r0.<init>(r3)
        Lca:
            r1 = 0
            if (r0 == 0) goto L162
            int r2 = r0.a
            int r13 = defpackage.xk2.u(r13)
            if (r13 != r9) goto L162
            te r12 = r12.l0
            ah2 r13 = r12.getFocusOwner()
            eh2 r13 = (defpackage.eh2) r13
            r13.getClass()
            of5 r13 = r12.getEmbeddedViewFocusRect()
            ah2 r10 = r12.getFocusOwner()
            mc r11 = new mc
            r11.<init>(r0, r8)
            eh2 r10 = (defpackage.eh2) r10
            java.lang.Boolean r13 = r10.e(r2, r13, r11)
            if (r13 == 0) goto Lfa
            boolean r13 = r13.booleanValue()
            goto Lfb
        Lfa:
            r13 = r8
        Lfb:
            if (r13 == 0) goto Lfe
            return r8
        Lfe:
            if (r2 != r8) goto L101
            goto L103
        L101:
            if (r2 != r9) goto L162
        L103:
            if (r2 != r3) goto L10c
            r13 = 33
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            goto L134
        L10c:
            if (r2 != r4) goto L115
            r13 = 130(0x82, float:1.82E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            goto L134
        L115:
            if (r2 != r6) goto L11e
            r13 = 17
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            goto L134
        L11e:
            if (r2 != r7) goto L127
            r13 = 66
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            goto L134
        L127:
            if (r2 != r8) goto L12e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            goto L134
        L12e:
            if (r2 != r9) goto L134
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
        L134:
            if (r5 == 0) goto L13a
            int r9 = r5.intValue()
        L13a:
            android.view.FocusFinder r13 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r12.getRootView()
            r0.getClass()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r3 = r12.getView()
            android.view.View r13 = r13.findNextFocus(r0, r3, r9)
            if (r13 == 0) goto L157
            boolean r13 = r13.equals(r12)
            if (r13 == 0) goto L162
        L157:
            ah2 r12 = r12.getFocusOwner()
            eh2 r12 = (defpackage.eh2) r12
            boolean r12 = r12.h(r2)
            return r12
        L162:
            return r1
    }

    @Override // defpackage.o70
    public final java.lang.Object G(defpackage.eg4 r3, defpackage.le r4, defpackage.s41 r5) {
            r2 = this;
            r0 = 0
            long r0 = r3.P(r0)
            java.lang.Object r3 = r4.c()
            of5 r3 = (defpackage.of5) r3
            if (r3 == 0) goto L13
            of5 r3 = r3.i(r0)
            goto L14
        L13:
            r3 = 0
        L14:
            if (r3 == 0) goto L2d
            android.graphics.Rect r4 = new android.graphics.Rect
            float r5 = r3.a
            int r5 = (int) r5
            float r0 = r3.b
            int r0 = (int) r0
            float r1 = r3.c
            int r1 = (int) r1
            float r3 = r3.d
            int r3 = (int) r3
            r4.<init>(r5, r0, r1, r3)
            r3 = 0
            te r2 = r2.l0
            r2.requestRectangleOnScreen(r4, r3)
        L2d:
            jg7 r2 = defpackage.jg7.a
            return r2
    }

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r7, defpackage.x24 r8, long r9) {
            r6 = this;
            dx4 r8 = r8.y(r9)
            int r1 = r8.A
            int r2 = r8.B
            he r5 = new he
            r9 = 0
            r5.<init>(r8, r9)
            zt1 r3 = defpackage.zt1.A
            mc r4 = r6.k0
            r0 = r7
            f34 r6 = r0.o0(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // defpackage.bh3
    public final boolean k(android.view.KeyEvent r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.ub7
    public final java.lang.Object n() {
            r0 = this;
            java.lang.String r0 = "androidx.compose.ui.layout.WindowInsetsRulers"
            return r0
    }
}
