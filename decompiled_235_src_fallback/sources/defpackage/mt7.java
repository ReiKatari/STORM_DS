package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mt7  reason: default package */
/* loaded from: classes.dex */
public final class mt7 extends defpackage.k8 implements defpackage.g44 {
    public final android.content.Context L;
    public final defpackage.i44 R;
    public defpackage.u63 X;
    public java.lang.ref.WeakReference Y;
    public final /* synthetic */ defpackage.nt7 Z;

    public mt7(defpackage.nt7 r1, android.content.Context r2, defpackage.u63 r3) {
            r0 = this;
            r0.<init>()
            r0.Z = r1
            r0.L = r2
            r0.X = r3
            i44 r1 = new i44
            r1.<init>(r2)
            r2 = 1
            r1.l = r2
            r0.R = r1
            r1.e = r0
            return
    }

    @Override // defpackage.g44
    public final void H(defpackage.i44 r1) {
            r0 = this;
            u63 r1 = r0.X
            if (r1 != 0) goto L5
            goto L13
        L5:
            r0.g()
            nt7 r0 = r0.Z
            androidx.appcompat.widget.ActionBarContextView r0 = r0.q
            g8 r0 = r0.R
            if (r0 == 0) goto L13
            r0.l()
        L13:
            return
    }

    @Override // defpackage.k8
    public final void a() {
            r3 = this;
            nt7 r0 = r3.Z
            mt7 r1 = r0.t
            if (r1 == r3) goto L7
            return
        L7:
            boolean r1 = r0.A
            boolean r2 = r0.B
            if (r1 != 0) goto L16
            if (r2 == 0) goto L10
            goto L16
        L10:
            u63 r1 = r3.X
            r1.x(r3)
            goto L1c
        L16:
            r0.u = r3
            u63 r1 = r3.X
            r0.v = r1
        L1c:
            r1 = 0
            r3.X = r1
            r3 = 0
            r0.L0(r3)
            androidx.appcompat.widget.ActionBarContextView r3 = r0.q
            android.view.View r2 = r3.j0
            if (r2 != 0) goto L2c
            r3.e()
        L2c:
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = r0.n
            boolean r2 = r0.G
            r3.setHideOnContentScrollEnabled(r2)
            r0.t = r1
            return
    }

    @Override // defpackage.k8
    public final android.view.View b() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.Y
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // defpackage.k8
    public final defpackage.i44 c() {
            r0 = this;
            i44 r0 = r0.R
            return r0
    }

    @Override // defpackage.k8
    public final android.view.MenuInflater d() {
            r1 = this;
            ku6 r0 = new ku6
            android.content.Context r1 = r1.L
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.k8
    public final java.lang.CharSequence e() {
            r0 = this;
            nt7 r0 = r0.Z
            androidx.appcompat.widget.ActionBarContextView r0 = r0.q
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // defpackage.k8
    public final java.lang.CharSequence f() {
            r0 = this;
            nt7 r0 = r0.Z
            androidx.appcompat.widget.ActionBarContextView r0 = r0.q
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // defpackage.k8
    public final void g() {
            r2 = this;
            nt7 r0 = r2.Z
            mt7 r0 = r0.t
            if (r0 == r2) goto L7
            return
        L7:
            i44 r0 = r2.R
            r0.w()
            u63 r1 = r2.X     // Catch: java.lang.Throwable -> L15
            r1.y(r2, r0)     // Catch: java.lang.Throwable -> L15
            r0.v()
            return
        L15:
            r2 = move-exception
            r0.v()
            throw r2
    }

    @Override // defpackage.k8
    public final boolean h() {
            r0 = this;
            nt7 r0 = r0.Z
            androidx.appcompat.widget.ActionBarContextView r0 = r0.q
            boolean r0 = r0.r0
            return r0
    }

    @Override // defpackage.k8
    public final void i(android.view.View r2) {
            r1 = this;
            nt7 r0 = r1.Z
            androidx.appcompat.widget.ActionBarContextView r0 = r0.q
            r0.setCustomView(r2)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.Y = r0
            return
    }

    @Override // defpackage.k8
    public final void j(int r2) {
            r1 = this;
            nt7 r0 = r1.Z
            android.content.Context r0 = r0.l
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.k(r2)
            return
    }

    @Override // defpackage.k8
    public final void k(java.lang.CharSequence r1) {
            r0 = this;
            nt7 r0 = r0.Z
            androidx.appcompat.widget.ActionBarContextView r0 = r0.q
            r0.setSubtitle(r1)
            return
    }

    @Override // defpackage.k8
    public final void l(int r2) {
            r1 = this;
            nt7 r0 = r1.Z
            android.content.Context r0 = r0.l
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.m(r2)
            return
    }

    @Override // defpackage.k8
    public final void m(java.lang.CharSequence r1) {
            r0 = this;
            nt7 r0 = r0.Z
            androidx.appcompat.widget.ActionBarContextView r0 = r0.q
            r0.setTitle(r1)
            return
    }

    @Override // defpackage.g44
    public final boolean n(defpackage.i44 r1, android.view.MenuItem r2) {
            r0 = this;
            u63 r1 = r0.X
            if (r1 == 0) goto Ld
            java.lang.Object r1 = r1.B
            eb r1 = (defpackage.eb) r1
            boolean r0 = r1.J(r0, r2)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // defpackage.k8
    public final void o(boolean r1) {
            r0 = this;
            r0.B = r1
            nt7 r0 = r0.Z
            androidx.appcompat.widget.ActionBarContextView r0 = r0.q
            r0.setTitleOptional(r1)
            return
    }
}
