package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dz1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dz1 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.sz1 B;

    public /* synthetic */ dz1(defpackage.sz1 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r4 = this;
            int r0 = r4.A
            jg7 r1 = defpackage.jg7.a
            r2 = 0
            r3 = 0
            sz1 r4 = r4.B
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L26;
                case 2: goto L1d;
                case 3: goto L14;
                default: goto Lb;
            }
        Lb:
            r4.N = r3
            sz1$c r0 = defpackage.sz1.c.DISABLED
            r4.O = r0
            r4.K = r2
            return r1
        L14:
            r4.N = r3
            sz1$c r0 = defpackage.sz1.c.DISABLED
            r4.O = r0
            r4.K = r2
            return r1
        L1d:
            r4.N = r3
            sz1$c r0 = defpackage.sz1.c.DISABLED
            r4.O = r0
            r4.K = r2
            return r1
        L26:
            of6 r4 = r4.T0
            jy1 r0 = defpackage.jy1.a
            r4.k(r0)
            return r1
        L2e:
            android.content.Context r4 = r4.b
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Throwable -> L3f
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r4.versionName     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r4 = move-exception
            em5 r0 = new em5
            r0.<init>(r4)
            r4 = r0
        L46:
            boolean r0 = r4 instanceof defpackage.em5
            if (r0 == 0) goto L4c
            goto L4d
        L4c:
            r3 = r4
        L4d:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L53
            java.lang.String r3 = ""
        L53:
            boolean r4 = defpackage.qs6.v0(r3)
            if (r4 == 0) goto L5b
            java.lang.String r3 = "unknown"
        L5b:
            return r3
    }
}
