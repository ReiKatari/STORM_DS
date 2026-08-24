package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t14  reason: default package */
/* loaded from: classes.dex */
public final class t14 implements android.window.OnBackAnimationCallback {
    public final /* synthetic */ defpackage.r14 a;
    public final /* synthetic */ defpackage.u14 b;

    public t14(defpackage.u14 r1, defpackage.r14 r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    public final void onBackCancelled() {
            r1 = this;
            u14 r0 = r1.b
            android.window.OnBackInvokedCallback r0 = r0.a
            if (r0 == 0) goto Lb
            r14 r1 = r1.a
            r1.d()
        Lb:
            return
    }

    public final void onBackInvoked() {
            r0 = this;
            r14 r0 = r0.a
            r0.a()
            return
    }

    public final void onBackProgressed(android.window.BackEvent r2) {
            r1 = this;
            u14 r0 = r1.b
            android.window.OnBackInvokedCallback r0 = r0.a
            if (r0 == 0) goto L10
            b00 r0 = new b00
            r0.<init>(r2)
            r14 r1 = r1.a
            r1.b(r0)
        L10:
            return
    }

    public final void onBackStarted(android.window.BackEvent r2) {
            r1 = this;
            u14 r0 = r1.b
            android.window.OnBackInvokedCallback r0 = r0.a
            if (r0 == 0) goto L10
            b00 r0 = new b00
            r0.<init>(r2)
            r14 r1 = r1.a
            r1.c(r0)
        L10:
            return
    }
}
