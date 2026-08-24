package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hr  reason: default package */
/* loaded from: classes.dex */
public abstract class hr extends defpackage.qv0 implements defpackage.mq {
    public defpackage.fr X;
    public final defpackage.gr Y;

    public hr(android.content.Context r5, int r6) {
            r4 = this;
            r0 = 1
            r1 = 2130969009(0x7f0401b1, float:1.7546688E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            gr r2 = new gr
            r2.<init>(r4)
            r4.Y = r2
            tq r4 = r4.f()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r4
            fr r5 = (defpackage.fr) r5
            r5.O0 = r6
            r4.f()
            return
    }

    @Override // defpackage.qv0, android.app.Dialog
    public final void addContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.e()
            tq r2 = r2.f()
            fr r2 = (defpackage.fr) r2
            r2.z()
            android.view.ViewGroup r0 = r2.v0
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r3, r4)
            ar r3 = r2.i0
            android.view.Window r2 = r2.h0
            android.view.Window$Callback r2 = r2.getCallback()
            r3.a(r2)
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
            r0 = this;
            super.dismiss()
            tq r0 = r0.f()
            r0.g()
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            gr r1 = r2.Y
            boolean r2 = defpackage.uj2.w(r1, r0, r2, r3)
            return r2
    }

    public final defpackage.tq f() {
            r3 = this;
            fr r0 = r3.X
            if (r0 != 0) goto L15
            zb6 r0 = defpackage.tq.A
            fr r0 = new fr
            android.content.Context r1 = r3.getContext()
            android.view.Window r2 = r3.getWindow()
            r0.<init>(r1, r2, r3, r3)
            r3.X = r0
        L15:
            fr r3 = r3.X
            return r3
    }

    @Override // android.app.Dialog
    public final android.view.View findViewById(int r1) {
            r0 = this;
            tq r0 = r0.f()
            fr r0 = (defpackage.fr) r0
            r0.z()
            android.view.Window r0 = r0.h0
            android.view.View r0 = r0.findViewById(r1)
            return r0
    }

    public final boolean g(android.view.KeyEvent r1) {
            r0 = this;
            boolean r0 = super.dispatchKeyEvent(r1)
            return r0
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
            r0 = this;
            tq r0 = r0.f()
            r0.d()
            return
    }

    @Override // defpackage.qv0, android.app.Dialog
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            tq r0 = r1.f()
            r0.c()
            super.onCreate(r2)
            tq r1 = r1.f()
            r1.f()
            return
    }

    @Override // defpackage.qv0, android.app.Dialog
    public final void onStop() {
            r1 = this;
            super.onStop()
            tq r1 = r1.f()
            fr r1 = (defpackage.fr) r1
            r1.D()
            ak7 r1 = r1.j0
            if (r1 == 0) goto L14
            r0 = 0
            r1.C0(r0)
        L14:
            return
    }

    @Override // defpackage.qv0, android.app.Dialog
    public void setContentView(int r1) {
            r0 = this;
            r0.e()
            tq r0 = r0.f()
            r0.k(r1)
            return
    }

    @Override // defpackage.qv0, android.app.Dialog
    public void setContentView(android.view.View r1) {
            r0 = this;
            r0.e()
            tq r0 = r0.f()
            r0.l(r1)
            return
    }

    @Override // defpackage.qv0, android.app.Dialog
    public void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r0.e()
            tq r0 = r0.f()
            r0.m(r1, r2)
            return
    }

    @Override // android.app.Dialog
    public final void setTitle(int r2) {
            r1 = this;
            super.setTitle(r2)
            tq r0 = r1.f()
            android.content.Context r1 = r1.getContext()
            java.lang.String r1 = r1.getString(r2)
            r0.o(r1)
            return
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            super.setTitle(r1)
            tq r0 = r0.f()
            r0.o(r1)
            return
    }
}
