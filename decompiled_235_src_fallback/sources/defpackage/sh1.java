package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sh1  reason: default package */
/* loaded from: classes.dex */
public final class sh1 implements defpackage.rh1, defpackage.pv7 {
    public static final defpackage.sh1 A = null;
    public static final defpackage.sh1 B = null;

    static {
            sh1 r0 = new sh1
            r0.<init>()
            defpackage.sh1.A = r0
            sh1 r0 = new sh1
            r0.<init>()
            defpackage.sh1.B = r0
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
            boolean r0 = r1.isUiContext()
            java.lang.Class<android.view.WindowManager> r2 = android.view.WindowManager.class
            if (r0 == 0) goto L12
            java.lang.Object r0 = r1.getSystemService(r2)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            goto L1c
        L12:
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
        L1c:
            lv7 r1 = new lv7
            android.view.WindowMetrics r2 = r0.getCurrentWindowMetrics()
            android.graphics.Rect r2 = r2.getBounds()
            r2.getClass()
            android.view.WindowMetrics r0 = r0.getCurrentWindowMetrics()
            float r0 = r0.getDensity()
            r1.<init>(r2, r0)
            return r1
    }

    @Override // defpackage.rh1
    public float l(android.content.Context r1) {
            r0 = this;
            java.lang.Class<android.view.WindowManager> r0 = android.view.WindowManager.class
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.WindowMetrics r0 = r0.getCurrentWindowMetrics()
            float r0 = r0.getDensity()
            return r0
    }
}
