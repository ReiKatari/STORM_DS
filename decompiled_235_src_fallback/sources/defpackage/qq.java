package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qq implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ android.content.Context B;

    public /* synthetic */ qq(android.content.Context r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            int r0 = r10.A
            r1 = 1
            android.content.Context r10 = r10.B
            switch(r0) {
                case 0: goto L32;
                case 1: goto L2e;
                case 2: goto L14;
                default: goto L8;
            }
        L8:
            yt r0 = new yt
            r0.<init>(r1)
            w31 r1 = defpackage.u35.a
            r2 = 0
            defpackage.u35.b(r10, r0, r1, r2)
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
            qq r0 = new qq
            r1 = 3
            r0.<init>(r10, r1)
            r3.execute(r0)
            return
        L2e:
            defpackage.tq.p(r10)
            return
        L32:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto L8b
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r10, r4)
            android.content.pm.PackageManager r4 = r10.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto L8b
            if (r0 < r2) goto L60
            java.lang.Object r0 = defpackage.tq.b()
            if (r0 == 0) goto L65
            android.os.LocaleList r0 = defpackage.sq.a(r0)
            hy3 r2 = new hy3
            iy3 r4 = new iy3
            r4.<init>(r0)
            r2.<init>(r4)
            goto L67
        L60:
            hy3 r2 = defpackage.tq.L
            if (r2 == 0) goto L65
            goto L67
        L65:
            hy3 r2 = defpackage.hy3.b
        L67:
            iy3 r0 = r2.a
            android.os.LocaleList r0 = r0.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L84
            java.lang.String r0 = defpackage.lb4.G(r10)
            java.lang.String r2 = "locale"
            java.lang.Object r2 = r10.getSystemService(r2)
            if (r2 == 0) goto L84
            android.os.LocaleList r0 = defpackage.rq.a(r0)
            defpackage.sq.b(r2, r0)
        L84:
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            r10.setComponentEnabledSetting(r3, r1, r1)
        L8b:
            defpackage.tq.Y = r1
            return
    }
}
