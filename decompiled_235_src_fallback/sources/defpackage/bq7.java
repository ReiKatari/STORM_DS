package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bq7  reason: default package */
/* loaded from: classes.dex */
public abstract class bq7 {
    public static void a(android.view.View r2, android.graphics.Rect r3, android.graphics.Rect r4) {
            android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
            r0.<init>()
            android.graphics.Insets r1 = android.graphics.Insets.of(r3)
            android.view.WindowInsets$Builder r0 = r0.setSystemWindowInsets(r1)
            android.view.WindowInsets r0 = r0.build()
            android.view.WindowInsets r2 = r2.computeSystemWindowInsets(r0, r4)
            android.graphics.Insets r2 = r2.getSystemWindowInsets()
            int r4 = r2.left
            int r0 = r2.top
            int r1 = r2.right
            int r2 = r2.bottom
            r3.set(r4, r0, r1, r2)
            return
    }
}
