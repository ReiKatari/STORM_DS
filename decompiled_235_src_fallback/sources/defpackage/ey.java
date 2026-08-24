package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ey  reason: default package */
/* loaded from: classes.dex */
public final class ey {
    public final int a;
    public final int b;
    public final java.util.List c;
    public final java.util.List d;

    public ey(int r1, int r2, java.util.List r3, java.util.List r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r1 = 0
            if (r3 == 0) goto L17
            r0.c = r3
            if (r4 == 0) goto L11
            r0.d = r4
            return
        L11:
            java.lang.String r0 = "Null videoProfiles"
            defpackage.u34.x(r0)
            throw r1
        L17:
            java.lang.String r0 = "Null audioProfiles"
            defpackage.u34.x(r0)
            throw r1
    }

    public static defpackage.ey a(int r2, int r3, java.util.ArrayList r4, java.util.ArrayList r5) {
            ey r0 = new ey
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            java.util.List r4 = java.util.Collections.unmodifiableList(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
            java.util.List r5 = java.util.Collections.unmodifiableList(r1)
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ey
            r2 = 0
            if (r1 == 0) goto L2c
            ey r5 = (defpackage.ey) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 != r3) goto L2c
            int r1 = r4.b
            int r3 = r5.b
            if (r1 != r3) goto L2c
            java.util.List r1 = r4.c
            java.util.List r3 = r5.c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L2c
            java.util.List r4 = r4.d
            java.util.List r5 = r5.d
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L2c
            return r0
        L2c:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.b
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.List r2 = r3.c
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.List r3 = r3.d
            int r3 = r3.hashCode()
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ImmutableEncoderProfilesProxy{defaultDurationSeconds="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", recommendedFileFormat="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", audioProfiles="
            r0.append(r1)
            java.util.List r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", videoProfiles="
            r0.append(r1)
            java.util.List r2 = r2.d
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
