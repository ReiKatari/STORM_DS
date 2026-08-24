package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hu6  reason: default package */
/* loaded from: classes.dex */
public final class hu6 extends android.view.ActionMode {
    public final android.content.Context a;
    public final defpackage.k8 b;

    public hu6(android.content.Context r1, defpackage.k8 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // android.view.ActionMode
    public final void finish() {
            r0 = this;
            k8 r0 = r0.b
            r0.a()
            return
    }

    @Override // android.view.ActionMode
    public final android.view.View getCustomView() {
            r0 = this;
            k8 r0 = r0.b
            android.view.View r0 = r0.b()
            return r0
    }

    @Override // android.view.ActionMode
    public final android.view.Menu getMenu() {
            r2 = this;
            e54 r0 = new e54
            k8 r1 = r2.b
            i44 r1 = r1.c()
            android.content.Context r2 = r2.a
            r0.<init>(r2, r1)
            return r0
    }

    @Override // android.view.ActionMode
    public final android.view.MenuInflater getMenuInflater() {
            r0 = this;
            k8 r0 = r0.b
            android.view.MenuInflater r0 = r0.d()
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getSubtitle() {
            r0 = this;
            k8 r0 = r0.b
            java.lang.CharSequence r0 = r0.e()
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.Object getTag() {
            r0 = this;
            k8 r0 = r0.b
            java.lang.Object r0 = r0.A
            return r0
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getTitle() {
            r0 = this;
            k8 r0 = r0.b
            java.lang.CharSequence r0 = r0.f()
            return r0
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
            r0 = this;
            k8 r0 = r0.b
            boolean r0 = r0.B
            return r0
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
            r0 = this;
            k8 r0 = r0.b
            r0.g()
            return
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
            r0 = this;
            k8 r0 = r0.b
            boolean r0 = r0.h()
            return r0
    }

    @Override // android.view.ActionMode
    public final void setCustomView(android.view.View r1) {
            r0 = this;
            k8 r0 = r0.b
            r0.i(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int r1) {
            r0 = this;
            k8 r0 = r0.b
            r0.j(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            k8 r0 = r0.b
            r0.k(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setTag(java.lang.Object r1) {
            r0 = this;
            k8 r0 = r0.b
            r0.A = r1
            return
    }

    @Override // android.view.ActionMode
    public final void setTitle(int r1) {
            r0 = this;
            k8 r0 = r0.b
            r0.l(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            k8 r0 = r0.b
            r0.m(r1)
            return
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean r1) {
            r0 = this;
            k8 r0 = r0.b
            r0.o(r1)
            return
    }
}
