package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xs1  reason: default package */
/* loaded from: classes.dex */
public final class xs1 implements defpackage.qe1 {
    public final /* synthetic */ defpackage.ut3 A;

    public xs1(androidx.emoji2.text.EmojiCompatInitializer r1, defpackage.ut3 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r2
            return
    }

    @Override // defpackage.qe1
    public final void onResume(defpackage.hu3 r4) {
            r3 = this;
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r4 < r0) goto Lf
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            android.os.Handler r4 = defpackage.sy0.a(r4)
            goto L18
        Lf:
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.<init>(r0)
        L18:
            sb r0 = new sb
            r1 = 2
            r0.<init>(r1)
            r1 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r0, r1)
            ut3 r4 = r3.A
            r4.c(r3)
            return
    }
}
