package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eq implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Context B;

    public /* synthetic */ eq(Context context, int i) {
        this.A = i;
        this.B = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
        if (r2 != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.A
            r1 = 1
            android.content.Context r10 = r10.B
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L14;
                default: goto L8;
            }
        L8:
            jt r0 = new jt
            r0.<init>(r1)
            hm1 r1 = defpackage.pu4.a
            r2 = 0
            defpackage.pu4.b(r10, r0, r1, r2)
            return
        L14:
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r4 = 0
            r5 = 1
            r6 = 0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.<init>(r4, r5, r6, r8, r9)
            eq r0 = new eq
            r1 = 2
            r0.<init>(r10, r1)
            r3.execute(r0)
            return
        L2e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto Lad
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r10, r4)
            android.content.pm.PackageManager r4 = r10.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto Lad
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L84
            hu r0 = defpackage.hq.Z
            r0.getClass()
            au r2 = new au
            r2.<init>(r0)
        L53:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            hq r0 = (defpackage.hq) r0
            if (r0 == 0) goto L53
            tq r0 = (defpackage.tq) r0
            android.content.Context r0 = r0.f0
            if (r0 == 0) goto L53
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L73
        L72:
            r0 = 0
        L73:
            if (r0 == 0) goto L89
            android.os.LocaleList r0 = defpackage.gq.a(r0)
            gr3 r2 = new gr3
            hr3 r5 = new hr3
            r5.<init>(r0)
            r2.<init>(r5)
            goto L8b
        L84:
            gr3 r2 = defpackage.hq.L
            if (r2 == 0) goto L89
            goto L8b
        L89:
            gr3 r2 = defpackage.gr3.b
        L8b:
            hr3 r0 = r2.a
            android.os.LocaleList r0 = r0.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La6
            java.lang.String r0 = defpackage.jv3.U(r10)
            java.lang.Object r2 = r10.getSystemService(r4)
            if (r2 == 0) goto La6
            android.os.LocaleList r0 = defpackage.fq.a(r0)
            defpackage.gq.b(r2, r0)
        La6:
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            r10.setComponentEnabledSetting(r3, r1, r1)
        Lad:
            defpackage.hq.Y = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq.run():void");
    }
}
