package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zo6  reason: default package */
/* loaded from: classes.dex */
public final class zo6 extends defpackage.k8 implements defpackage.g44 {
    public android.content.Context L;
    public androidx.appcompat.widget.ActionBarContextView R;
    public defpackage.u63 X;
    public java.lang.ref.WeakReference Y;
    public boolean Z;
    public defpackage.i44 d0;

    @Override // defpackage.g44
    public final void H(defpackage.i44 r1) {
            r0 = this;
            r0.g()
            androidx.appcompat.widget.ActionBarContextView r0 = r0.R
            g8 r0 = r0.R
            if (r0 == 0) goto Lc
            r0.l()
        Lc:
            return
    }

    @Override // defpackage.k8
    public final void a() {
            r1 = this;
            boolean r0 = r1.Z
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.Z = r0
            u63 r0 = r1.X
            r0.x(r1)
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
            i44 r0 = r0.d0
            return r0
    }

    @Override // defpackage.k8
    public final android.view.MenuInflater d() {
            r1 = this;
            ku6 r0 = new ku6
            androidx.appcompat.widget.ActionBarContextView r1 = r1.R
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.k8
    public final java.lang.CharSequence e() {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.R
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // defpackage.k8
    public final java.lang.CharSequence f() {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.R
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // defpackage.k8
    public final void g() {
            r2 = this;
            u63 r0 = r2.X
            i44 r1 = r2.d0
            r0.y(r2, r1)
            return
    }

    @Override // defpackage.k8
    public final boolean h() {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.R
            boolean r0 = r0.r0
            return r0
    }

    @Override // defpackage.k8
    public final void i(android.view.View r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r1.R
            r0.setCustomView(r2)
            if (r2 == 0) goto Ld
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            goto Le
        Ld:
            r0 = 0
        Le:
            r1.Y = r0
            return
    }

    @Override // defpackage.k8
    public final void j(int r2) {
            r1 = this;
            android.content.Context r0 = r1.L
            java.lang.String r2 = r0.getString(r2)
            r1.k(r2)
            return
    }

    @Override // defpackage.k8
    public final void k(java.lang.CharSequence r1) {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.R
            r0.setSubtitle(r1)
            return
    }

    @Override // defpackage.k8
    public final void l(int r2) {
            r1 = this;
            android.content.Context r0 = r1.L
            java.lang.String r2 = r0.getString(r2)
            r1.m(r2)
            return
    }

    @Override // defpackage.k8
    public final void m(java.lang.CharSequence r1) {
            r0 = this;
            androidx.appcompat.widget.ActionBarContextView r0 = r0.R
            r0.setTitle(r1)
            return
    }

    @Override // defpackage.g44
    public final boolean n(defpackage.i44 r1, android.view.MenuItem r2) {
            r0 = this;
            u63 r1 = r0.X
            java.lang.Object r1 = r1.B
            eb r1 = (defpackage.eb) r1
            boolean r0 = r1.J(r0, r2)
            return r0
    }

    @Override // defpackage.k8
    public final void o(boolean r1) {
            r0 = this;
            r0.B = r1
            androidx.appcompat.widget.ActionBarContextView r0 = r0.R
            r0.setTitleOptional(r1)
            return
    }
}
