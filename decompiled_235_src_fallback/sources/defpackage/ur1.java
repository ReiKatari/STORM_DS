package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ur1  reason: default package */
/* loaded from: classes.dex */
public final class ur1 extends defpackage.bs1 {
    @Override // defpackage.bs1
    public void b(defpackage.ix6 r1, defpackage.ix6 r2, android.view.Window r3, android.view.View r4, boolean r5, boolean r6) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0 = 0
            defpackage.kt7.a(r3, r0)
            if (r5 == 0) goto L15
            int r0 = r1.b
            goto L17
        L15:
            int r0 = r1.a
        L17:
            r3.setStatusBarColor(r0)
            int r0 = r2.b
            r3.setNavigationBarColor(r0)
            s35 r0 = new s35
            r0.<init>(r4)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L30
            av7 r1 = new av7
            r1.<init>(r3, r0)
            goto L49
        L30:
            r2 = 30
            if (r1 < r2) goto L3a
            zu7 r1 = new zu7
            r1.<init>(r3, r0)
            goto L49
        L3a:
            r2 = 26
            if (r1 < r2) goto L44
            xu7 r1 = new xu7
            r1.<init>(r3, r0)
            goto L49
        L44:
            wu7 r1 = new wu7
            r1.<init>(r3, r0)
        L49:
            r0 = r5 ^ 1
            r1.d(r0)
            return
    }
}
