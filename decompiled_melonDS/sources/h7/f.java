package h7;

import android.content.Context;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Context B;

    public /* synthetic */ f(Context context, int i2) {
        this.A = i2;
        this.B = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r2 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.A
            switch(r0) {
                case 0: goto L99;
                case 1: goto L8a;
                default: goto L5;
            }
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L87
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            android.content.Context r5 = r11.B
            r3.<init>(r5, r4)
            android.content.pm.PackageManager r4 = r5.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto L87
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L5e
            a1.f r0 = l.m.Z
            r0.getClass()
            a1.a r2 = new a1.a
            r2.<init>(r0)
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            l.m r0 = (l.m) r0
            if (r0 == 0) goto L2d
            l.x r0 = (l.x) r0
            android.content.Context r0 = r0.f8467e0
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L4d
        L4c:
            r0 = 0
        L4d:
            if (r0 == 0) goto L63
            android.os.LocaleList r0 = l.l.a(r0)
            u5.c r2 = new u5.c
            u5.d r6 = new u5.d
            r6.<init>(r0)
            r2.<init>(r6)
            goto L65
        L5e:
            u5.c r2 = l.m.L
            if (r2 == 0) goto L63
            goto L65
        L63:
            u5.c r2 = u5.c.f13490b
        L65:
            u5.d r0 = r2.f13491a
            android.os.LocaleList r0 = r0.f13492a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L80
            java.lang.String r0 = m5.c.e(r5)
            java.lang.Object r2 = r5.getSystemService(r4)
            if (r2 == 0) goto L80
            android.os.LocaleList r0 = l.k.a(r0)
            l.l.b(r2, r0)
        L80:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        L87:
            l.m.Y = r1
            return
        L8a:
            h7.c r0 = new h7.c
            r1 = 0
            r0.<init>(r1)
            na.f r1 = h7.e.f6299a
            r2 = 0
            android.content.Context r3 = r11.B
            h7.e.t(r3, r0, r1, r2)
            return
        L99:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.<init>(r5, r6, r7, r9, r10)
            h7.f r0 = new h7.f
            r1 = 1
            android.content.Context r2 = r11.B
            r0.<init>(r2, r1)
            r4.execute(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.f.run():void");
    }
}
