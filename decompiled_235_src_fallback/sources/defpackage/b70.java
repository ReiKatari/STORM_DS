package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b70  reason: default package */
/* loaded from: classes.dex */
public final class b70 implements defpackage.a70, defpackage.pv7 {
    public static final defpackage.b70 A = null;
    public static final defpackage.b70 B = null;

    static {
            b70 r0 = new b70
            r0.<init>()
            defpackage.b70.A = r0
            b70 r0 = new b70
            r0.<init>()
            defpackage.b70.B = r0
            return
    }

    @Override // defpackage.pv7
    public defpackage.lv7 c(android.app.Activity r3, defpackage.rh1 r4) {
            r2 = this;
            r4.getClass()
            lv7 r2 = new lv7
            w60 r0 = new w60
            z60 r1 = defpackage.a70.a
            r1.getClass()
            a70 r1 = defpackage.z60.a()
            android.graphics.Rect r1 = r1.f(r3)
            r0.<init>(r1)
            float r3 = r4.l(r3)
            r2.<init>(r0, r3)
            return r2
    }

    @Override // defpackage.pv7
    public defpackage.lv7 e(android.content.Context r1, defpackage.rh1 r2) {
            r0 = this;
            r2.getClass()
            java.lang.Class<android.view.WindowManager> r0 = android.view.WindowManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            lv7 r2 = new lv7
            android.view.WindowMetrics r0 = r0.getCurrentWindowMetrics()
            android.graphics.Rect r0 = r0.getBounds()
            r0.getClass()
            r2.<init>(r0, r1)
            return r2
    }

    @Override // defpackage.a70
    public android.graphics.Rect f(android.app.Activity r1) {
            r0 = this;
            java.lang.Class<android.view.WindowManager> r0 = android.view.WindowManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.WindowMetrics r0 = r0.getCurrentWindowMetrics()
            android.graphics.Rect r0 = r0.getBounds()
            r0.getClass()
            return r0
    }
}
