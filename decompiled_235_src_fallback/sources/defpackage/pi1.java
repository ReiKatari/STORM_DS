package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pi1  reason: default package */
/* loaded from: classes.dex */
public abstract class pi1 {
    public final android.content.Context a;

    public pi1(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final defpackage.mk3 a(android.view.Display r3, defpackage.lk3 r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L52
            int r0 = r3.getFlags()
            r0 = r0 & 4
            if (r0 == 0) goto L17
            r0 = 2030(0x7ee, float:2.845E-42)
            goto L19
        L17:
            r0 = 2037(0x7f5, float:2.854E-42)
        L19:
            android.content.Context r2 = r2.a
            android.content.Context r2 = r2.createDisplayContext(r3)
            android.content.Context r2 = defpackage.m2.e(r2, r0)
            r2.getClass()
            java.lang.Class<android.view.WindowManager> r0 = android.view.WindowManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            r2.getClass()
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.WindowMetrics r2 = defpackage.m2.n(r2)
            android.graphics.Rect r2 = defpackage.m2.g(r2)
            r2.getClass()
            int r0 = r2.width()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r2.height()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            vr4 r1 = new vr4
            r1.<init>(r0, r2)
            goto L6b
        L52:
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r3.getRealSize(r2)
            int r0 = r2.x
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r2.y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            vr4 r1 = new vr4
            r1.<init>(r0, r2)
        L6b:
            java.lang.Object r2 = r1.A
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r1.B
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            mk3 r1 = new mk3
            int r3 = r3.getDisplayId()
            r1.<init>(r3, r4, r2, r0)
            return r1
    }

    public abstract defpackage.ok3 b(android.view.Display r1, android.view.Display r2);
}
