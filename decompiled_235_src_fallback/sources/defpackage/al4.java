package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: al4  reason: default package */
/* loaded from: classes.dex */
public final class al4 extends defpackage.ld4 {
    public final android.window.OnBackInvokedDispatcher c;
    public final int d;
    public final android.window.OnBackInvokedCallback e;
    public boolean f;

    public al4(android.window.OnBackInvokedDispatcher r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.d = r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 != r2) goto L14
            vp r1 = new vp
            r2 = 4
            r1.<init>(r0, r2)
            goto L19
        L14:
            bl4 r1 = new bl4
            r1.<init>(r0)
        L19:
            r0.e = r1
            return
    }

    @Override // defpackage.ld4
    public final void b(boolean r3) {
            r2 = this;
            android.window.OnBackInvokedCallback r0 = r2.e
            if (r3 == 0) goto L13
            boolean r1 = r2.f
            if (r1 != 0) goto L13
            android.window.OnBackInvokedDispatcher r3 = r2.c
            int r1 = r2.d
            defpackage.a81.o(r3, r1, r0)
            r3 = 1
            r2.f = r3
            return
        L13:
            if (r3 != 0) goto L21
            boolean r3 = r2.f
            if (r3 == 0) goto L21
            android.window.OnBackInvokedDispatcher r3 = r2.c
            defpackage.a81.q(r3, r0)
            r3 = 0
            r2.f = r3
        L21:
            return
    }
}
