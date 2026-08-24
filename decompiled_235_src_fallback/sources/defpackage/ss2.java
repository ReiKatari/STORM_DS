package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ss2  reason: default package */
/* loaded from: classes.dex */
public final class ss2 implements defpackage.f13 {
    public final /* synthetic */ int A;
    public final defpackage.xk4 B;

    public ss2(android.content.Context r8) {
            r7 = this;
            r0 = 2
            r7.A = r0
            java.lang.StringBuilder r0 = defpackage.ck7.a
            java.io.File r0 = new java.io.File
            android.content.Context r8 = r8.getApplicationContext()
            java.io.File r8 = r8.getCacheDir()
            java.lang.String r1 = "picasso-cache"
            r0.<init>(r8, r1)
            boolean r8 = r0.exists()
            if (r8 != 0) goto L1d
            r0.mkdirs()
        L1d:
            r1 = 5242880(0x500000, double:2.590327E-317)
            android.os.StatFs r8 = new android.os.StatFs     // Catch: java.lang.IllegalArgumentException -> L36
            java.lang.String r3 = r0.getAbsolutePath()     // Catch: java.lang.IllegalArgumentException -> L36
            r8.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L36
            long r3 = r8.getBlockCountLong()     // Catch: java.lang.IllegalArgumentException -> L36
            long r5 = r8.getBlockSizeLong()     // Catch: java.lang.IllegalArgumentException -> L36
            long r3 = r3 * r5
            r5 = 50
            long r3 = r3 / r5
            goto L37
        L36:
            r3 = r1
        L37:
            r5 = 52428800(0x3200000, double:2.5903269E-316)
            long r3 = java.lang.Math.min(r3, r5)
            long r1 = java.lang.Math.max(r3, r1)
            wk4 r8 = new wk4
            r8.<init>()
            la0 r3 = new la0
            r3.<init>(r0, r1)
            r8.l = r3
            xk4 r0 = new xk4
            r0.<init>(r8)
            r7.<init>()
            r7.B = r0
            return
    }

    public ss2(defpackage.xk4 r1, int r2) {
            r0 = this;
            r0.A = r2
            r1.getClass()
            switch(r2) {
                case 1: goto L14;
                case 2: goto L8;
                case 3: goto Le;
                default: goto L8;
            }
        L8:
            r0.<init>()
            r0.B = r1
            return
        Le:
            r0.<init>()
            r0.B = r1
            return
        L14:
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // defpackage.f13
    public java.lang.Object j(java.lang.String r9, java.lang.String r10, java.lang.String r11, defpackage.s41 r12) {
            r8 = this;
            int r0 = r8.A
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L1a;
                default: goto L5;
            }
        L5:
            xe1 r0 = defpackage.xk1.a
            de1 r0 = defpackage.de1.L
            la r1 = new la
            r6 = 0
            r7 = 9
            r5 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r8 = defpackage.hv.d0(r0, r1, r12)
            return r8
        L1a:
            r4 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            xe1 r8 = defpackage.xk1.a
            de1 r8 = defpackage.de1.L
            la r0 = new la
            r5 = 0
            r6 = 7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.Object r8 = defpackage.hv.d0(r8, r0, r12)
            return r8
        L2e:
            r4 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            xe1 r8 = defpackage.xk1.a
            de1 r8 = defpackage.de1.L
            la r0 = new la
            r5 = 0
            r6 = 4
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.Object r8 = defpackage.hv.d0(r8, r0, r12)
            return r8
    }
}
