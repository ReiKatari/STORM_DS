package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lv0  reason: default package */
/* loaded from: classes.dex */
public abstract class lv0 extends android.app.Activity implements defpackage.hu3, defpackage.xg3 {
    public final defpackage.ku3 A;

    public lv0() {
            r2 = this;
            r2.<init>()
            ku3 r0 = new ku3
            r1 = 1
            r0.<init>(r2, r1)
            r2.A = r0
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            r3.getClass()
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            boolean r1 = defpackage.uj2.v(r0, r3)
            if (r1 == 0) goto L16
            r2 = 1
            return r2
        L16:
            boolean r2 = defpackage.uj2.w(r2, r0, r2, r3)
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            r2.getClass()
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            boolean r0 = defpackage.uj2.v(r0, r2)
            if (r0 == 0) goto L16
            r1 = 1
            return r1
        L16:
            boolean r1 = super.dispatchKeyShortcutEvent(r2)
            return r1
    }

    @Override // defpackage.xg3
    public final boolean j(android.view.KeyEvent r1) {
            r0 = this;
            r1.getClass()
            boolean r0 = super.dispatchKeyEvent(r1)
            return r0
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            int r1 = defpackage.ik5.B
            defpackage.gk5.b(r0)
            return
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            r3.getClass()
            ku3 r0 = r2.A
            tt3 r1 = defpackage.tt3.CREATED
            r0.h(r1)
            super.onSaveInstanceState(r3)
            return
    }
}
