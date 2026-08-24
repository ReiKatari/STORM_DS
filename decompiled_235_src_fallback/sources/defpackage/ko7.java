package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ko7  reason: default package */
/* loaded from: classes.dex */
public abstract class ko7 {
    public static final java.lang.ThreadLocal a = null;
    public static final java.lang.ThreadLocal b = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.ko7.a = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.ko7.b = r0
            return
    }

    public static void a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.graphics.Matrix r4) {
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1e
            if (r0 == r2) goto L1e
            android.view.View r0 = (android.view.View) r0
            a(r2, r0, r4)
            int r2 = r0.getScrollX()
            int r2 = -r2
            float r2 = (float) r2
            int r0 = r0.getScrollY()
            int r0 = -r0
            float r0 = (float) r0
            r4.preTranslate(r2, r0)
        L1e:
            int r2 = r3.getLeft()
            float r2 = (float) r2
            int r0 = r3.getTop()
            float r0 = (float) r0
            r4.preTranslate(r2, r0)
            android.graphics.Matrix r2 = r3.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 != 0) goto L3c
            android.graphics.Matrix r2 = r3.getMatrix()
            r4.preConcat(r2)
        L3c:
            return
    }
}
