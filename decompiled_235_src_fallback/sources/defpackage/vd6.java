package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd6  reason: default package */
/* loaded from: classes.dex */
public final class vd6 extends defpackage.ny0 {
    public final android.content.Context e;

    public vd6(android.content.Context r1, defpackage.uh7 r2, defpackage.ud4 r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.e = r1
            return
    }

    @Override // defpackage.ny0
    public final defpackage.ss0 g(java.io.InputStream r9) {
            r8 = this;
            boolean r0 = r9 instanceof java.io.FileInputStream
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.content.Context r8 = r8.e
            java.lang.Class<android.app.ActivityManager> r0 = android.app.ActivityManager.class
            java.lang.Object r8 = r8.getSystemService(r0)
            android.app.ActivityManager r8 = (android.app.ActivityManager) r8
            if (r8 == 0) goto L1d
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo
            r0.<init>()
            r8.getMemoryInfo(r0)
            long r2 = r0.totalMem
            goto L25
        L1d:
            java.lang.Runtime r8 = java.lang.Runtime.getRuntime()
            long r2 = r8.maxMemory()
        L25:
            java.lang.Runtime r8 = java.lang.Runtime.getRuntime()
            long r4 = r8.maxMemory()
            float r8 = (float) r2
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r8 = r8 * r0
            long r2 = (long) r8
            r6 = 3
            long r4 = r4 / r6
            long r2 = java.lang.Math.min(r2, r4)
            r4 = 1048576(0x100000, double:5.180654E-318)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L42
            r2 = r4
        L42:
            r4 = 1024(0x400, double:5.06E-321)
            long r2 = r2 / r4
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L4d
            r2 = r4
        L4d:
            int r8 = (int) r2
            rd6 r0 = new rd6
            r0.<init>()
            java.lang.String r2 = "unknown archive"
            r0.x = r2
            r0.y = r8
            java.io.FileInputStream r9 = (java.io.FileInputStream) r9
            java.nio.channels.FileChannel r8 = r9.getChannel()
            r0.w = r8
            java.nio.channels.FileChannel r8 = r0.w
            r9 = 1
            if (r8 == 0) goto L70
            java.lang.String r2 = r0.x
            sd6 r3 = new sd6
            int r0 = r0.y
            r3.<init>(r8, r2, r9, r0)
            goto Lad
        L70:
            f1 r8 = r0.t
            java.lang.String r2 = "origin == null"
            if (r8 == 0) goto La9
            java.nio.file.OpenOption[] r8 = r0.u
            int r8 = r8.length
            if (r8 != 0) goto L80
            java.nio.file.OpenOption[] r8 = new java.nio.file.OpenOption[r9]
            defpackage.q66.B()
        L80:
            f1 r8 = r0.t
            if (r8 != 0) goto L89
            defpackage.i.m(r2)
        L87:
            r3 = r1
            goto Lad
        L89:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.Class<f1> r0 = defpackage.f1.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.Object r8 = r8.t
            java.lang.Class r1 = r8.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Object[] r8 = new java.lang.Object[]{r0, r1, r8}
            java.lang.String r0 = "%s#getPath() for %s origin %s"
            java.lang.String r8 = java.lang.String.format(r0, r8)
            r9.<init>(r8)
            throw r9
        La9:
            defpackage.i.m(r2)
            goto L87
        Lad:
            int r8 = r3.R
            qa r0 = r3.L
            java.lang.Object r0 = r0.d0
            md6[] r0 = (defpackage.md6[]) r0
            int r2 = r0.length
            int r2 = r2 - r9
            if (r8 < r2) goto Lbb
            r0 = r1
            goto Lc7
        Lbb:
            int r8 = r8 + 1
            r3.R = r8
            r0 = r0[r8]
            java.lang.String r2 = r0.a
            r2 = 0
            r3.h(r8, r2)
        Lc7:
            if (r0 != 0) goto Lcb
            r0 = r1
            goto Lda
        Lcb:
            boolean r8 = r0.c
            if (r8 != 0) goto Lad
            java.lang.String r8 = r0.a
            r8.getClass()
            boolean r8 = defpackage.ny0.i(r8)
            if (r8 == 0) goto Lad
        Lda:
            if (r0 != 0) goto Le0
            r3.close()
            return r1
        Le0:
            ss0 r8 = new ss0     // Catch: java.lang.Exception -> Lfa
            java.io.InputStream r1 = r3.r(r0)     // Catch: java.lang.Exception -> Lfa
            r1.getClass()     // Catch: java.lang.Exception -> Lfa
            r2 = 3
            r8.<init>(r1, r3, r2)     // Catch: java.lang.Exception -> Lfa
            ss0 r1 = new ss0     // Catch: java.lang.Exception -> Lfa
            hj6 r2 = new hj6     // Catch: java.lang.Exception -> Lfa
            long r4 = r0.o     // Catch: java.lang.Exception -> Lfa
            r2.<init>(r4)     // Catch: java.lang.Exception -> Lfa
            r1.<init>(r8, r2, r9)     // Catch: java.lang.Exception -> Lfa
            return r1
        Lfa:
            r8 = move-exception
            r3.close()
            throw r8
    }
}
