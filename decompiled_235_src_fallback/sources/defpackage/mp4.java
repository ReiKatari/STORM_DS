package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mp4  reason: default package */
/* loaded from: classes.dex */
public final class mp4 {
    public final int a;

    public /* synthetic */ mp4(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.mp4
            if (r0 != 0) goto L5
            goto Ld
        L5:
            mp4 r2 = (defpackage.mp4) r2
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
            r2 = this;
            int r2 = r2.a
            if (r2 == 0) goto L28
            r0 = 1
            if (r2 == r0) goto L25
            r0 = 2
            if (r2 == r0) goto L22
            switch(r2) {
                case 10: goto L1f;
                case 11: goto L1c;
                case 12: goto L19;
                case 13: goto L16;
                default: goto Ld;
            }
        Ld:
            java.lang.String r0 = "OutputStatus(value="
            r1 = 41
            java.lang.String r2 = defpackage.xg6.o(r0, r2, r1)
            return r2
        L16:
            java.lang.String r2 = "ERROR_OUTPUT_DROPPED"
            return r2
        L19:
            java.lang.String r2 = "ERROR_OUTPUT_MISSING"
            return r2
        L1c:
            java.lang.String r2 = "ERROR_OUTPUT_ABORTED"
            return r2
        L1f:
            java.lang.String r2 = "ERROR_OUTPUT_FAILED"
            return r2
        L22:
            java.lang.String r2 = "UNAVAILABLE"
            return r2
        L25:
            java.lang.String r2 = "AVAILABLE"
            return r2
        L28:
            java.lang.String r2 = "PENDING"
            return r2
    }
}
