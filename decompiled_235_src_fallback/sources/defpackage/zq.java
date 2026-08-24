package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zq  reason: default package */
/* loaded from: classes.dex */
public abstract class zq {
    public static android.window.OnBackInvokedDispatcher a(android.app.Activity r0) {
            android.window.OnBackInvokedDispatcher r0 = defpackage.o2.o(r0)
            return r0
    }

    public static android.window.OnBackInvokedCallback b(java.lang.Object r2, defpackage.fr r3) {
            java.util.Objects.requireNonNull(r3)
            vp r0 = new vp
            r1 = 1
            r0.<init>(r3, r1)
            android.window.OnBackInvokedDispatcher r2 = defpackage.o2.p(r2)
            defpackage.o2.v(r2, r0)
            return r0
    }

    public static void c(java.lang.Object r0, java.lang.Object r1) {
            android.window.OnBackInvokedCallback r1 = defpackage.o2.l(r1)
            android.window.OnBackInvokedDispatcher r0 = defpackage.o2.p(r0)
            defpackage.o2.w(r0, r1)
            return
    }
}
