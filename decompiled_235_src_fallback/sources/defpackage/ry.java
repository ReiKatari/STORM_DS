package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ry  reason: default package */
/* loaded from: classes.dex */
public final class ry {
    public final java.util.UUID a;
    public final int b;
    public final int c;
    public final android.graphics.Rect d;
    public final android.util.Size e;
    public final int f;
    public final boolean g;

    public ry(java.util.UUID r2, int r3, int r4, android.graphics.Rect r5, android.util.Size r6, int r7, boolean r8) {
            r1 = this;
            r1.<init>()
            r0 = 0
            if (r2 == 0) goto L25
            r1.a = r2
            r1.b = r3
            r1.c = r4
            if (r5 == 0) goto L1f
            r1.d = r5
            if (r6 == 0) goto L19
            r1.e = r6
            r1.f = r7
            r1.g = r8
            return
        L19:
            java.lang.String r1 = "Null getSize"
            defpackage.u34.x(r1)
            throw r0
        L1f:
            java.lang.String r1 = "Null getCropRect"
            defpackage.u34.x(r1)
            throw r0
        L25:
            java.lang.String r1 = "Null getUuid"
            defpackage.u34.x(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.ry
            if (r1 == 0) goto L41
            ry r4 = (defpackage.ry) r4
            java.util.UUID r1 = r3.a
            java.util.UUID r2 = r4.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L41
            int r1 = r3.b
            int r2 = r4.b
            if (r1 != r2) goto L41
            int r1 = r3.c
            int r2 = r4.c
            if (r1 != r2) goto L41
            android.graphics.Rect r1 = r3.d
            android.graphics.Rect r2 = r4.d
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L41
            android.util.Size r1 = r3.e
            android.util.Size r2 = r4.e
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L41
            int r1 = r3.f
            int r2 = r4.f
            if (r1 != r2) goto L41
            boolean r3 = r3.g
            boolean r4 = r4.g
            if (r3 != r4) goto L41
            return r0
        L41:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.util.UUID r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.b
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.c
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.graphics.Rect r2 = r3.d
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            android.util.Size r2 = r3.e
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.f
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r3 = r3.g
            r2 = 1237(0x4d5, float:1.733E-42)
            if (r3 == 0) goto L30
            r3 = 1231(0x4cf, float:1.725E-42)
            goto L31
        L30:
            r3 = r2
        L31:
            r3 = r3 ^ r0
            int r3 = r3 * r1
            r3 = r3 ^ r2
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OutConfig{getUuid="
            r0.<init>(r1)
            java.util.UUID r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", getTargets="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", getFormat="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", getCropRect="
            r0.append(r1)
            android.graphics.Rect r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", getSize="
            r0.append(r1)
            android.util.Size r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", getRotationDegrees="
            r0.append(r1)
            int r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", isMirroring="
            r0.append(r1)
            boolean r2 = r2.g
            java.lang.String r1 = ", shouldRespectInputCropRect=false}"
            java.lang.String r2 = defpackage.i61.o(r0, r2, r1)
            return r2
    }
}
