package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dd0  reason: default package */
/* loaded from: classes.dex */
public final class dd0 {
    public final boolean a;
    public final sb b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (r0.contains(r3) == true) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dd0(boolean r6, defpackage.sb r7, int r8, boolean r9, int r10) {
        /*
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
            sb r7 = new sb
            ed0 r0 = defpackage.ed0.AT_LEAST
            r7.<init>(r2, r0)
        L1a:
            r0 = r10 & 16
            if (r0 == 0) goto L1f
            r8 = r2
        L1f:
            r0 = r10 & 32
            if (r0 == 0) goto L70
            java.util.Map r0 = defpackage.fb0.c
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 27
            if (r0 > r3) goto L2c
            goto L70
        L2c:
            java.lang.String r3 = android.os.Build.HARDWARE
            java.lang.String r4 = "samsungexynos7870"
            boolean r4 = defpackage.b53.x(r3, r4)
            if (r4 == 0) goto L37
            goto L70
        L37:
            java.lang.String r4 = "qcom"
            boolean r3 = defpackage.gh6.g0(r3, r4, r1)
            if (r3 == 0) goto L43
            r3 = 31
            if (r0 <= r3) goto L70
        L43:
            java.util.Map r0 = defpackage.fb0.d
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
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd0.<init>(boolean, sb, int, boolean, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dd0) {
                dd0 dd0Var = (dd0) obj;
                if (this.a == dd0Var.a && b53.x(this.b, dd0Var.b) && this.c == dd0Var.c && this.d == dd0Var.d && this.e == dd0Var.e && this.f == dd0Var.f) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = ej6.c(Boolean.hashCode(false) * 31, this.a, 31);
        return Boolean.hashCode(this.f) + ej6.c(ej6.c(wh1.a(this.c, (this.b.hashCode() + c) * 961, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Flags(configureBlankSessionOnStop=false, abortCapturesOnStop=");
        sb.append(this.a);
        sb.append(", awaitRepeatingRequestBeforeCapture=");
        sb.append(this.b);
        sb.append(", awaitRepeatingRequestOnDisconnect=null, finalizeSessionOnCloseBehavior=");
        sb.append((Object) ("FinalizeSessionOnCloseBehavior(value=" + this.c + ')'));
        sb.append(", closeCaptureSessionOnDisconnect=");
        sb.append(this.d);
        sb.append(", closeCameraDeviceOnClose=");
        sb.append(this.e);
        sb.append(", enableRestartDelays=");
        return ej6.h(sb, this.f, ')');
    }
}
