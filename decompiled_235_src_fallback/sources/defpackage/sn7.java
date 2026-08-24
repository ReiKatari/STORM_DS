package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sn7  reason: default package */
/* loaded from: classes.dex */
public abstract class sn7 {
    public static void a(android.view.WindowInsets r1, android.view.View r2) {
            r0 = 2131427956(0x7f0b0274, float:1.8477543E38)
            java.lang.Object r0 = r2.getTag(r0)
            android.view.View$OnApplyWindowInsetsListener r0 = (android.view.View.OnApplyWindowInsetsListener) r0
            if (r0 == 0) goto Le
            r0.onApplyWindowInsets(r2, r1)
        Le:
            return
    }

    public static defpackage.vu7 b(android.view.View r1, defpackage.vu7 r2, android.graphics.Rect r3) {
            android.view.WindowInsets r0 = r2.f()
            if (r0 == 0) goto Lf
            android.view.WindowInsets r2 = r1.computeSystemWindowInsets(r0, r3)
            vu7 r1 = defpackage.vu7.g(r1, r2)
            return r1
        Lf:
            r3.setEmpty()
            return r2
    }

    public static void c(android.view.View r2, defpackage.zk4 r3) {
            if (r3 == 0) goto L8
            rn7 r0 = new rn7
            r0.<init>(r2, r3)
            goto L9
        L8:
            r0 = 0
        L9:
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r3 >= r1) goto L15
            r3 = 2131427947(0x7f0b026b, float:1.8477525E38)
            r2.setTag(r3, r0)
        L15:
            r3 = 2131427946(0x7f0b026a, float:1.8477523E38)
            java.lang.Object r3 = r2.getTag(r3)
            if (r3 == 0) goto L1f
            return
        L1f:
            if (r0 == 0) goto L25
            r2.setOnApplyWindowInsetsListener(r0)
            return
        L25:
            r3 = 2131427956(0x7f0b0274, float:1.8477543E38)
            java.lang.Object r3 = r2.getTag(r3)
            android.view.View$OnApplyWindowInsetsListener r3 = (android.view.View.OnApplyWindowInsetsListener) r3
            r2.setOnApplyWindowInsetsListener(r3)
            return
    }
}
