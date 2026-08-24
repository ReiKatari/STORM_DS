package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qv0  reason: default package */
/* loaded from: classes.dex */
public class qv0 extends android.app.Dialog implements defpackage.hu3, defpackage.jl4, defpackage.id4, defpackage.g56 {
    public defpackage.ku3 A;
    public final defpackage.e56 B;
    public final defpackage.ex6 L;
    public final defpackage.ex6 R;

    public qv0(android.content.Context r2, int r3) {
            r1 = this;
            r2.getClass()
            r1.<init>(r2, r3)
            f56 r2 = new f56
            t46 r3 = new t46
            r0 = 2
            r3.<init>(r1, r0)
            r2.<init>(r1, r3)
            e56 r3 = new e56
            r3.<init>(r2)
            r1.B = r3
            pv0 r2 = new pv0
            r3 = 0
            r2.<init>(r1, r3)
            ex6 r3 = new ex6
            r3.<init>(r2)
            r1.L = r3
            pv0 r2 = new pv0
            r3 = 1
            r2.<init>(r1, r3)
            ex6 r3 = new ex6
            r3.<init>(r2)
            r1.R = r3
            return
    }

    public static void c(defpackage.qv0 r0) {
            super.onBackPressed()
            return
    }

    @Override // defpackage.id4
    public final defpackage.eb a() {
            r0 = this;
            il4 r0 = r0.b()
            gl4 r0 = r0.c()
            eb r0 = r0.c
            return r0
    }

    @Override // android.app.Dialog
    public void addContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r1.getClass()
            r0.e()
            super.addContentView(r1, r2)
            return
    }

    @Override // defpackage.jl4
    public final defpackage.il4 b() {
            r0 = this;
            ex6 r0 = r0.R
            java.lang.Object r0 = r0.getValue()
            il4 r0 = (defpackage.il4) r0
            return r0
    }

    public final defpackage.ku3 d() {
            r2 = this;
            ku3 r0 = r2.A
            if (r0 != 0) goto Lc
            ku3 r0 = new ku3
            r1 = 1
            r0.<init>(r2, r1)
            r2.A = r0
        Lc:
            return r0
    }

    public final void e() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            r0.getClass()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            r0.getClass()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131428078(0x7f0b02ee, float:1.847779E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            r0.getClass()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            r0.setTag(r1, r2)
            android.view.Window r0 = r2.getWindow()
            r0.getClass()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            r1 = 2131428077(0x7f0b02ed, float:1.8477788E38)
            r0.setTag(r1, r2)
            return
    }

    @Override // defpackage.hu3
    public final defpackage.ut3 getLifecycle() {
            r0 = this;
            ku3 r0 = r0.d()
            return r0
    }

    @Override // defpackage.g56
    public final defpackage.d56 getSavedStateRegistry() {
            r0 = this;
            e56 r0 = r0.B
            d56 r0 = r0.b
            return r0
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
            r0 = this;
            ex6 r0 = r0.L
            java.lang.Object r0 = r0.getValue()
            vj1 r0 = (defpackage.vj1) r0
            r0.a()
            return
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L17
            il4 r0 = r2.b()
            android.window.OnBackInvokedDispatcher r1 = defpackage.o2.n(r2)
            r1.getClass()
            r0.d(r1)
        L17:
            e56 r0 = r2.B
            r0.b(r3)
            ku3 r2 = r2.d()
            st3 r3 = defpackage.st3.ON_CREATE
            r2.f(r3)
            return
    }

    @Override // android.app.Dialog
    public final android.os.Bundle onSaveInstanceState() {
            r1 = this;
            android.os.Bundle r0 = super.onSaveInstanceState()
            r0.getClass()
            e56 r1 = r1.B
            r1.c(r0)
            return r0
    }

    @Override // android.app.Dialog
    public void onStart() {
            r1 = this;
            super.onStart()
            ku3 r1 = r1.d()
            st3 r0 = defpackage.st3.ON_RESUME
            r1.f(r0)
            return
    }

    @Override // android.app.Dialog
    public void onStop() {
            r2 = this;
            ku3 r0 = r2.d()
            st3 r1 = defpackage.st3.ON_DESTROY
            r0.f(r1)
            r0 = 0
            r2.A = r0
            super.onStop()
            return
    }

    @Override // android.app.Dialog
    public void setContentView(int r1) {
            r0 = this;
            r0.e()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r1) {
            r0 = this;
            r1.getClass()
            r0.e()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2) {
            r0 = this;
            r1.getClass()
            r0.e()
            super.setContentView(r1, r2)
            return
    }
}
