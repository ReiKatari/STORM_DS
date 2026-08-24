package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c87  reason: default package */
/* loaded from: classes.dex */
public abstract class c87 {
    public static android.window.OnBackInvokedDispatcher a(android.view.View r0) {
            android.window.OnBackInvokedDispatcher r0 = r0.findOnBackInvokedDispatcher()
            return r0
    }

    public static android.window.OnBackInvokedCallback b(java.lang.Runnable r2) {
            java.util.Objects.requireNonNull(r2)
            vp r0 = new vp
            r1 = 5
            r0.<init>(r2, r1)
            return r0
    }

    public static void c(java.lang.Object r1, java.lang.Object r2) {
            android.window.OnBackInvokedDispatcher r1 = (android.window.OnBackInvokedDispatcher) r1
            r0 = 1000000(0xf4240, float:1.401298E-39)
            android.window.OnBackInvokedCallback r2 = (android.window.OnBackInvokedCallback) r2
            r1.registerOnBackInvokedCallback(r0, r2)
            return
    }

    public static void d(java.lang.Object r0, java.lang.Object r1) {
            android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
            android.window.OnBackInvokedCallback r1 = (android.window.OnBackInvokedCallback) r1
            r0.unregisterOnBackInvokedCallback(r1)
            return
    }
}
