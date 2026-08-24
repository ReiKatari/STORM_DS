package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bn6  reason: default package */
/* loaded from: classes.dex */
public final class bn6 extends defpackage.s35 {
    public android.view.View B;

    @Override // defpackage.s35
    public final void E() {
            r3 = this;
            android.view.View r0 = r3.B
            if (r0 == 0) goto L19
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 >= r2) goto L19
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r1.isActive()
        L19:
            if (r0 == 0) goto L20
            android.view.WindowInsetsController r0 = defpackage.m2.m(r0)
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 == 0) goto L2a
            int r1 = defpackage.m2.a()
            defpackage.zm6.x(r0, r1)
        L2a:
            super.E()
            return
    }

    @Override // defpackage.s35
    public final void z() {
            r5 = this;
            android.view.View r0 = r5.B
            if (r0 == 0) goto L9
            android.view.WindowInsetsController r1 = defpackage.m2.m(r0)
            goto La
        L9:
            r1 = 0
        La:
            if (r1 == 0) goto L40
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r5.<init>(r2)
            an6 r3 = new an6
            r3.<init>(r5)
            defpackage.m2.v(r1, r3)
            boolean r5 = r5.get()
            if (r5 != 0) goto L35
            if (r0 == 0) goto L35
            android.content.Context r5 = r0.getContext()
            java.lang.String r4 = "input_method"
            java.lang.Object r5 = r5.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r5 = (android.view.inputmethod.InputMethodManager) r5
            android.os.IBinder r0 = r0.getWindowToken()
            r5.hideSoftInputFromWindow(r0, r2)
        L35:
            defpackage.m2.D(r1, r3)
            int r5 = defpackage.m2.a()
            defpackage.zm6.q(r1, r5)
            return
        L40:
            super.z()
            return
    }
}
