package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kv2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kv2 implements android.view.Choreographer.FrameCallback {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ kv2(androidx.profileinstaller.ProfileInstallerInitializer r1, android.content.Context r2) {
            r0 = this;
            r1 = 1
            r0.A = r1
            r0.<init>()
            r0.B = r2
            return
    }

    public /* synthetic */ kv2(defpackage.rj0 r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            return
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r4) {
            r3 = this;
            int r0 = r3.A
            java.lang.Object r3 = r3.B
            switch(r0) {
                case 0: goto L3e;
                default: goto L7;
            }
        L7:
            android.content.Context r3 = (android.content.Context) r3
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 < r5) goto L18
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            android.os.Handler r4 = defpackage.j2.e(r4)
            goto L21
        L18:
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r5)
        L21:
            java.util.Random r5 = new java.util.Random
            r5.<init>()
            r0 = 1000(0x3e8, float:1.401E-42)
            r1 = 1
            int r0 = java.lang.Math.max(r0, r1)
            int r5 = r5.nextInt(r0)
            qq r0 = new qq
            r1 = 2
            r0.<init>(r3, r1)
            int r5 = r5 + 5000
            long r1 = (long) r5
            r4.postDelayed(r0, r1)
            return
        L3e:
            rj0 r3 = (defpackage.rj0) r3
            xe1 r0 = defpackage.xk1.a
            jv2 r0 = defpackage.e04.a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.I(r0, r4)
            return
    }
}
