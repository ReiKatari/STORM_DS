package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yf0  reason: default package */
/* loaded from: classes.dex */
public final class yf0 {
    public final java.util.ArrayList a;
    public final defpackage.ky b;

    public yf0(java.util.ArrayList r1, defpackage.ky r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            java.lang.String r1 = "Camera ID set cannot be empty."
            defpackage.np2.s(r1, r0)
            return
    }

    public final java.lang.String a() {
            r2 = this;
            java.util.ArrayList r2 = r2.a
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            java.lang.String r0 = "getInternalId() is only available for single-camera identifiers."
            defpackage.np2.A(r0, r1)
            java.lang.Object r2 = defpackage.gt0.H0(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof defpackage.yf0
            if (r0 != 0) goto L8
            goto L1f
        L8:
            yf0 r3 = (defpackage.yf0) r3
            java.util.ArrayList r0 = r3.a
            java.util.ArrayList r1 = r2.a
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            ky r2 = r2.b
            ky r3 = r3.b
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.util.ArrayList r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            ky r1 = r1.b
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraIdentifier{cameraIds="
            r0.<init>(r1)
            r6 = 0
            r7 = 62
            java.util.ArrayList r2 = r8.a
            java.lang.String r3 = ","
            r4 = 0
            r5 = 0
            java.lang.String r1 = defpackage.gt0.P0(r2, r3, r4, r5, r6, r7)
            r0.append(r1)
            ky r8 = r8.b
            if (r8 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ", compatId="
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            goto L2c
        L2a:
            java.lang.String r8 = ""
        L2c:
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.String r8 = defpackage.lb1.q(r0, r8, r1)
            return r8
    }
}
