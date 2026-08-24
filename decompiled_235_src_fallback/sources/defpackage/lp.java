package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lp  reason: default package */
/* loaded from: classes.dex */
public final class lp {
    public static final defpackage.lp a = null;

    static {
            lp r0 = new lp
            r0.<init>()
            defpackage.lp.a = r0
            return
    }

    public final int a(android.view.Window r2) {
            r1 = this;
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.WindowManager r0 = r2.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r1 = r1.heightPixels
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.View r2 = r2.getDecorView()
            r2.getWindowVisibleDisplayFrame(r0)
            int r2 = r0.top
            int r0 = r0.bottom
            if (r0 <= r1) goto L26
            int r0 = r0 - r1
            goto L27
        L26:
            r0 = 0
        L27:
            int r2 = r2 + r0
            int r1 = r1 - r2
            return r1
    }
}
