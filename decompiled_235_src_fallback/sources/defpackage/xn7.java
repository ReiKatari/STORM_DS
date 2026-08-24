package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xn7  reason: default package */
/* loaded from: classes.dex */
public abstract class xn7 {
    public static android.view.WindowInsets a(android.view.View r0, android.view.WindowInsets r1) {
            android.view.WindowInsets r0 = r0.dispatchApplyWindowInsets(r1)
            return r0
    }

    public static java.lang.CharSequence b(android.view.View r0) {
            java.lang.CharSequence r0 = r0.getStateDescription()
            return r0
    }

    public static void c(android.view.View r0, java.lang.CharSequence r1) {
            r0.setStateDescription(r1)
            return
    }
}
