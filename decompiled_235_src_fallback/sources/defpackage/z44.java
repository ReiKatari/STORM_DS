package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z44  reason: default package */
/* loaded from: classes.dex */
public final class z44 extends defpackage.ax3 implements defpackage.n44 {
    public static final java.lang.reflect.Method z0 = null;
    public defpackage.os0 y0;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoSuchMethodException -> L19
            r1 = 28
            if (r0 > r1) goto L18
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r1 = "setTouchModal"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L19
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L19
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L19
            defpackage.z44.z0 = r0     // Catch: java.lang.NoSuchMethodException -> L19
        L18:
            return
        L19:
            java.lang.String r0 = "MenuPopupWindow"
            java.lang.String r1 = "Could not find method setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
            return
    }

    @Override // defpackage.n44
    public final void D(defpackage.i44 r1, defpackage.o44 r2) {
            r0 = this;
            os0 r0 = r0.y0
            if (r0 == 0) goto L7
            r0.D(r1, r2)
        L7:
            return
    }

    @Override // defpackage.n44
    public final void o(defpackage.i44 r1, android.view.MenuItem r2) {
            r0 = this;
            os0 r0 = r0.y0
            if (r0 == 0) goto L7
            r0.o(r1, r2)
        L7:
            return
    }

    @Override // defpackage.ax3
    public final defpackage.mp1 p(android.content.Context r2, boolean r3) {
            r1 = this;
            y44 r0 = new y44
            r0.<init>(r2, r3)
            r0.setHoverListener(r1)
            return r0
    }
}
