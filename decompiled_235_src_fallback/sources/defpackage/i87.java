package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i87  reason: default package */
/* loaded from: classes.dex */
public final class i87 extends defpackage.ak7 {
    public final defpackage.l87 l;
    public final android.view.Window.Callback m;
    public final defpackage.h87 n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final java.util.ArrayList r;
    public final defpackage.g15 s;

    public i87(androidx.appcompat.widget.Toolbar r4, java.lang.CharSequence r5, defpackage.ar r6) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.r = r0
            g15 r0 = new g15
            r1 = 25
            r0.<init>(r3, r1)
            r3.s = r0
            h87 r0 = new h87
            r0.<init>(r3)
            l87 r1 = new l87
            r2 = 0
            r1.<init>(r4, r2)
            r3.l = r1
            r6.getClass()
            r3.m = r6
            r1.k = r6
            r4.setOnMenuItemClickListener(r0)
            boolean r6 = r1.g
            if (r6 != 0) goto L44
            r1.h = r5
            int r6 = r1.b
            r6 = r6 & 8
            if (r6 == 0) goto L44
            r4.setTitle(r5)
            boolean r6 = r1.g
            if (r6 == 0) goto L44
            android.view.View r4 = r4.getRootView()
            defpackage.ao7.o(r4, r5)
        L44:
            h87 r4 = new h87
            r4.<init>(r3)
            r3.n = r4
            return
    }

    @Override // defpackage.ak7
    public final void A0(boolean r1) {
            r0 = this;
            return
    }

    @Override // defpackage.ak7
    public final void B0(boolean r2) {
            r1 = this;
            l87 r1 = r1.l
            int r2 = r1.b
            r2 = r2 & (-5)
            r0 = 4
            r2 = r2 | r0
            r1.a(r2)
            return
    }

    @Override // defpackage.ak7
    public final void C0(boolean r1) {
            r0 = this;
            return
    }

    @Override // defpackage.ak7
    public final void D0(java.lang.String r3) {
            r2 = this;
            r0 = 1
            l87 r2 = r2.l
            r2.g = r0
            androidx.appcompat.widget.Toolbar r0 = r2.a
            r2.h = r3
            int r1 = r2.b
            r1 = r1 & 8
            if (r1 == 0) goto L1d
            r0.setTitle(r3)
            boolean r2 = r2.g
            if (r2 == 0) goto L1d
            android.view.View r2 = r0.getRootView()
            defpackage.ao7.o(r2, r3)
        L1d:
            return
    }

    @Override // defpackage.ak7
    public final void E0(java.lang.CharSequence r3) {
            r2 = this;
            l87 r2 = r2.l
            boolean r0 = r2.g
            if (r0 != 0) goto L1e
            androidx.appcompat.widget.Toolbar r0 = r2.a
            r2.h = r3
            int r1 = r2.b
            r1 = r1 & 8
            if (r1 == 0) goto L1e
            r0.setTitle(r3)
            boolean r2 = r2.g
            if (r2 == 0) goto L1e
            android.view.View r2 = r0.getRootView()
            defpackage.ao7.o(r2, r3)
        L1e:
            return
    }

    @Override // defpackage.ak7
    public final boolean L() {
            r0 = this;
            l87 r0 = r0.l
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.A
            if (r0 == 0) goto L14
            g8 r0 = r0.s0
            if (r0 == 0) goto L14
            boolean r0 = r0.e()
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final android.view.Menu L0() {
            r4 = this;
            boolean r0 = r4.p
            l87 r1 = r4.l
            if (r0 != 0) goto L22
            g60 r0 = new g60
            r2 = 0
            r0.<init>(r4, r2)
            h87 r2 = new h87
            r2.<init>(r4)
            androidx.appcompat.widget.Toolbar r3 = r1.a
            r3.M0 = r0
            r3.N0 = r2
            androidx.appcompat.widget.ActionMenuView r3 = r3.A
            if (r3 == 0) goto L1f
            r3.t0 = r0
            r3.u0 = r2
        L1f:
            r0 = 1
            r4.p = r0
        L22:
            androidx.appcompat.widget.Toolbar r4 = r1.a
            android.view.Menu r4 = r4.getMenu()
            return r4
    }

    @Override // defpackage.ak7
    public final boolean M() {
            r1 = this;
            l87 r1 = r1.l
            androidx.appcompat.widget.Toolbar r1 = r1.a
            d87 r1 = r1.L0
            if (r1 == 0) goto L16
            o44 r0 = r1.B
            if (r0 == 0) goto L16
            if (r1 != 0) goto Lf
            r0 = 0
        Lf:
            if (r0 == 0) goto L14
            r0.collapseActionView()
        L14:
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    @Override // defpackage.ak7
    public final void P(boolean r2) {
            r1 = this;
            boolean r0 = r1.q
            if (r2 != r0) goto L5
            goto Lf
        L5:
            r1.q = r2
            java.util.ArrayList r1 = r1.r
            int r2 = r1.size()
            if (r2 > 0) goto L10
        Lf:
            return
        L10:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            r1.getClass()
            defpackage.u34.a()
            return
    }

    @Override // defpackage.ak7
    public final int V() {
            r0 = this;
            l87 r0 = r0.l
            int r0 = r0.b
            return r0
    }

    @Override // defpackage.ak7
    public final android.content.Context f0() {
            r0 = this;
            l87 r0 = r0.l
            androidx.appcompat.widget.Toolbar r0 = r0.a
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // defpackage.ak7
    public final java.lang.CharSequence h0() {
            r0 = this;
            l87 r0 = r0.l
            androidx.appcompat.widget.Toolbar r0 = r0.a
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // defpackage.ak7
    public final void j0() {
            r1 = this;
            r0 = 8
            l87 r1 = r1.l
            androidx.appcompat.widget.Toolbar r1 = r1.a
            r1.setVisibility(r0)
            return
    }

    @Override // defpackage.ak7
    public final boolean k0() {
            r2 = this;
            l87 r0 = r2.l
            androidx.appcompat.widget.Toolbar r1 = r0.a
            g15 r2 = r2.s
            r1.removeCallbacks(r2)
            androidx.appcompat.widget.Toolbar r0 = r0.a
            java.util.WeakHashMap r1 = defpackage.ao7.a
            r0.postOnAnimation(r2)
            r2 = 1
            return r2
    }

    @Override // defpackage.ak7
    public final void p0() {
            r0 = this;
            return
    }

    @Override // defpackage.ak7
    public final void q0() {
            r1 = this;
            l87 r0 = r1.l
            androidx.appcompat.widget.Toolbar r0 = r0.a
            g15 r1 = r1.s
            r0.removeCallbacks(r1)
            return
    }

    @Override // defpackage.ak7
    public final boolean r0(int r4, android.view.KeyEvent r5) {
            r3 = this;
            android.view.Menu r3 = r3.L0()
            r0 = 0
            if (r3 == 0) goto L20
            int r1 = r5.getDeviceId()
            android.view.KeyCharacterMap r1 = android.view.KeyCharacterMap.load(r1)
            int r1 = r1.getKeyboardType()
            r2 = 1
            if (r1 == r2) goto L17
            goto L18
        L17:
            r2 = r0
        L18:
            r3.setQwertyMode(r2)
            boolean r3 = r3.performShortcut(r4, r5, r0)
            return r3
        L20:
            return r0
    }

    @Override // defpackage.ak7
    public final boolean s0(android.view.KeyEvent r2) {
            r1 = this;
            int r2 = r2.getAction()
            r0 = 1
            if (r2 != r0) goto La
            r1.t0()
        La:
            return r0
    }

    @Override // defpackage.ak7
    public final boolean t0() {
            r0 = this;
            l87 r0 = r0.l
            androidx.appcompat.widget.Toolbar r0 = r0.a
            boolean r0 = r0.w()
            return r0
    }
}
