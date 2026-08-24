package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cv7  reason: default package */
/* loaded from: classes.dex */
public final class cv7 {
    public final defpackage.bv7 a;

    public cv7(android.view.Window r3, android.view.View r4) {
            r2 = this;
            r2.<init>()
            s35 r0 = new s35
            r0.<init>(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r4 < r1) goto L16
            av7 r4 = new av7
            r4.<init>(r3, r0)
            r2.a = r4
            return
        L16:
            r1 = 30
            if (r4 < r1) goto L22
            zu7 r4 = new zu7
            r4.<init>(r3, r0)
            r2.a = r4
            return
        L22:
            r1 = 26
            if (r4 < r1) goto L2e
            xu7 r4 = new xu7
            r4.<init>(r3, r0)
            r2.a = r4
            return
        L2e:
            wu7 r4 = new wu7
            r4.<init>(r3, r0)
            r2.a = r4
            return
    }

    public final void a(boolean r1) {
            r0 = this;
            bv7 r0 = r0.a
            r0.d(r1)
            return
    }
}
