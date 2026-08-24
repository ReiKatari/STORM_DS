package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mf0  reason: default package */
/* loaded from: classes.dex */
public final class mf0 {
    public final boolean a;
    public final defpackage.zb b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public mf0(boolean r6, defpackage.zb r7, int r8, boolean r9, int r10) {
            r5 = this;
            r0 = r10 & 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r6 < r0) goto Le
            r6 = r1
            goto Lf
        Le:
            r6 = r2
        Lf:
            r0 = r10 & 4
            if (r0 == 0) goto L1a
            zb r7 = new zb
            nf0 r0 = defpackage.nf0.AT_LEAST
            r7.<init>(r2, r0)
        L1a:
            r0 = r10 & 16
            if (r0 == 0) goto L1f
            r8 = r2
        L1f:
            r0 = r10 & 32
            if (r0 == 0) goto L70
            java.util.Map r0 = defpackage.nd0.c
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 27
            if (r0 > r3) goto L2c
            goto L70
        L2c:
            java.lang.String r3 = android.os.Build.HARDWARE
            java.lang.String r4 = "samsungexynos7870"
            boolean r4 = defpackage.nb3.k(r3, r4)
            if (r4 == 0) goto L37
            goto L70
        L37:
            java.lang.String r4 = "qcom"
            boolean r3 = defpackage.xs6.Z(r3, r4, r1)
            if (r3 == 0) goto L43
            r3 = 31
            if (r0 <= r3) goto L70
        L43:
            java.util.Map r0 = defpackage.nd0.d
            java.lang.String r3 = android.os.Build.BRAND
            r3.getClass()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            java.lang.Object r0 = r0.get(r3)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L6e
            java.lang.String r3 = android.os.Build.MODEL
            r3.getClass()
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            boolean r0 = r0.contains(r3)
            if (r0 != r1) goto L6e
            goto L70
        L6e:
            r0 = r2
            goto L71
        L70:
            r0 = r1
        L71:
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r9 = r2
        L76:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L7b
            r1 = r2
        L7b:
            r5.<init>()
            r5.a = r6
            r5.b = r7
            r5.c = r8
            r5.d = r0
            r5.e = r9
            r5.f = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof defpackage.mf0
            if (r0 != 0) goto L8
            goto L39
        L8:
            mf0 r3 = (defpackage.mf0) r3
            boolean r0 = r2.a
            boolean r1 = r3.a
            if (r0 == r1) goto L11
            goto L39
        L11:
            zb r0 = r2.b
            zb r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L1c
            goto L39
        L1c:
            int r0 = r2.c
            int r1 = r3.c
            if (r0 != r1) goto L39
            boolean r0 = r2.d
            boolean r1 = r3.d
            if (r0 == r1) goto L29
            goto L39
        L29:
            boolean r0 = r2.e
            boolean r1 = r3.e
            if (r0 == r1) goto L30
            goto L39
        L30:
            boolean r2 = r2.f
            boolean r3 = r3.f
            if (r2 == r3) goto L37
            goto L39
        L37:
            r2 = 1
            return r2
        L39:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.a
            int r0 = defpackage.xg6.e(r0, r2, r1)
            zb r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * 961
            int r0 = r3.c
            int r0 = defpackage.lb1.a(r0, r2, r1)
            boolean r2 = r3.d
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.e
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r3 = r3.f
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Flags(configureBlankSessionOnStop=false, abortCapturesOnStop="
            r0.<init>(r1)
            boolean r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", awaitRepeatingRequestBeforeCapture="
            r0.append(r1)
            zb r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", awaitRepeatingRequestOnDisconnect=null, finalizeSessionOnCloseBehavior="
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "FinalizeSessionOnCloseBehavior(value="
            r1.<init>(r2)
            int r2 = r3.c
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", closeCaptureSessionOnDisconnect="
            r0.append(r1)
            boolean r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", closeCameraDeviceOnClose="
            r0.append(r1)
            boolean r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", enableRestartDelays="
            r0.append(r1)
            boolean r3 = r3.f
            java.lang.String r3 = defpackage.xg6.r(r0, r3, r2)
            return r3
    }
}
