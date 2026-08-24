package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xr1  reason: default package */
/* loaded from: classes.dex */
public class xr1 extends defpackage.wr1 {
    @Override // defpackage.vr1, defpackage.bs1
    public void b(defpackage.ix6 r1, defpackage.ix6 r2, android.view.Window r3, android.view.View r4, boolean r5, boolean r6) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0 = 0
            defpackage.kt7.a(r3, r0)
            int r1 = r1.a(r5)
            r3.setStatusBarColor(r1)
            int r1 = r2.a(r6)
            r3.setNavigationBarColor(r1)
            defpackage.yz0.n(r3)
            int r1 = r2.c
            r2 = 1
            if (r1 != 0) goto L27
            r0 = r2
        L27:
            defpackage.yz0.p(r3, r0)
            s35 r0 = new s35
            r0.<init>(r4)
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r1 < r4) goto L3b
            av7 r1 = new av7
            r1.<init>(r3, r0)
            goto L54
        L3b:
            r4 = 30
            if (r1 < r4) goto L45
            zu7 r1 = new zu7
            r1.<init>(r3, r0)
            goto L54
        L45:
            r4 = 26
            if (r1 < r4) goto L4f
            xu7 r1 = new xu7
            r1.<init>(r3, r0)
            goto L54
        L4f:
            wu7 r1 = new wu7
            r1.<init>(r3, r0)
        L54:
            r0 = r5 ^ 1
            r1.d(r0)
            r0 = r6 ^ 1
            r1.c(r0)
            return
    }
}
