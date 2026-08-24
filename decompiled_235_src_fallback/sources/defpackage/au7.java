package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: au7  reason: default package */
/* loaded from: classes.dex */
public final class au7 {
    public defpackage.zt7 a;

    public au7(int r3, android.view.animation.Interpolator r4, long r5) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L15
            yt7 r0 = new yt7
            android.view.WindowInsetsAnimation r3 = defpackage.zm6.i(r3, r4, r5)
            r0.<init>(r3)
            r2.a = r0
            return
        L15:
            wt7 r0 = new wt7
            r0.<init>(r3, r4, r5)
            r2.a = r0
            return
    }
}
