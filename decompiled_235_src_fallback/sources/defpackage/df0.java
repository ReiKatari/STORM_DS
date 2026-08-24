package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: df0  reason: default package */
/* loaded from: classes.dex */
public final class df0 {
    public final int a;

    public /* synthetic */ df0(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static java.lang.String a(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraError("
            r0.<init>(r1)
            if (r2 != 0) goto Ld
            java.lang.String r2 = "ERROR_UNDETERMINED"
            goto L63
        Ld:
            r1 = 1
            if (r2 != r1) goto L13
            java.lang.String r2 = "ERROR_CAMERA_IN_USE"
            goto L63
        L13:
            r1 = 2
            if (r2 != r1) goto L19
            java.lang.String r2 = "ERROR_CAMERA_LIMIT_EXCEEDED"
            goto L63
        L19:
            r1 = 3
            if (r2 != r1) goto L1f
            java.lang.String r2 = "ERROR_CAMERA_DISABLED"
            goto L63
        L1f:
            r1 = 4
            if (r2 != r1) goto L25
            java.lang.String r2 = "ERROR_CAMERA_DEVICE"
            goto L63
        L25:
            r1 = 5
            if (r2 != r1) goto L2b
            java.lang.String r2 = "ERROR_CAMERA_SERVICE"
            goto L63
        L2b:
            r1 = 6
            if (r2 != r1) goto L31
            java.lang.String r2 = "ERROR_CAMERA_DISCONNECTED"
            goto L63
        L31:
            r1 = 7
            if (r2 != r1) goto L37
            java.lang.String r2 = "ERROR_ILLEGAL_ARGUMENT_EXCEPTION"
            goto L63
        L37:
            r1 = 8
            if (r2 != r1) goto L3e
            java.lang.String r2 = "ERROR_SECURITY_EXCEPTION"
            goto L63
        L3e:
            r1 = 9
            if (r2 != r1) goto L45
            java.lang.String r2 = "ERROR_GRAPH_CONFIG"
            goto L63
        L45:
            r1 = 10
            if (r2 != r1) goto L4c
            java.lang.String r2 = "ERROR_DO_NOT_DISTURB_ENABLED"
            goto L63
        L4c:
            r1 = 11
            if (r2 != r1) goto L53
            java.lang.String r2 = "ERROR_UNKNOWN_EXCEPTION"
            goto L63
        L53:
            r1 = 12
            if (r2 != r1) goto L5a
            java.lang.String r2 = "ERROR_CAMERA_OPENER"
            goto L63
        L5a:
            r1 = 13
            if (r2 != r1) goto L61
            java.lang.String r2 = "ERROR_CAMERA_OPEN_TIMEOUT"
            goto L63
        L61:
            java.lang.String r2 = "ERROR_UNKNOWN"
        L63:
            r1 = 41
            java.lang.String r2 = defpackage.lb1.q(r0, r2, r1)
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.df0
            if (r0 != 0) goto L5
            goto Ld
        L5:
            df0 r2 = (defpackage.df0) r2
            int r2 = r2.a
            int r1 = r1.a
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            int r0 = r0.a
            java.lang.String r0 = a(r0)
            return r0
    }
}
