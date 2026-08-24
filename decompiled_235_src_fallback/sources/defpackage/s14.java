package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s14  reason: default package */
/* loaded from: classes.dex */
public class s14 {
    public android.window.OnBackInvokedCallback a;

    public android.window.OnBackInvokedCallback a(defpackage.r14 r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            vp r1 = new vp
            r0 = 3
            r1.<init>(r2, r0)
            return r1
    }

    public void b(defpackage.r14 r2, android.view.View r3, boolean r4) {
            r1 = this;
            android.window.OnBackInvokedCallback r0 = r1.a
            if (r0 == 0) goto L5
            goto Lb
        L5:
            android.window.OnBackInvokedDispatcher r3 = defpackage.a81.k(r3)
            if (r3 != 0) goto Lc
        Lb:
            return
        Lc:
            android.window.OnBackInvokedCallback r2 = r1.a(r2)
            r1.a = r2
            if (r4 == 0) goto L18
            r1 = 1000000(0xf4240, float:1.401298E-39)
            goto L19
        L18:
            r1 = 0
        L19:
            defpackage.a81.o(r3, r1, r2)
            return
    }

    public void c(android.view.View r2) {
            r1 = this;
            android.window.OnBackInvokedCallback r0 = r1.a
            if (r0 != 0) goto L5
            goto Lb
        L5:
            android.window.OnBackInvokedDispatcher r2 = defpackage.a81.k(r2)
            if (r2 != 0) goto Lc
        Lb:
            return
        Lc:
            android.window.OnBackInvokedCallback r0 = r1.a
            defpackage.a81.q(r2, r0)
            r2 = 0
            r1.a = r2
            return
    }
}
