package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wy  reason: default package */
/* loaded from: classes.dex */
public final class wy {
    public final defpackage.ig1 a;
    public final java.util.List b;
    public final int c;
    public final int d;
    public final defpackage.yq1 e;

    public wy(defpackage.ig1 r1, java.util.List r2, int r3, int r4, defpackage.yq1 r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public static defpackage.s9 a(defpackage.ig1 r3) {
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            s9 r1 = new s9
            r1.<init>()
            r2 = 0
            if (r3 == 0) goto L24
            r1.a = r3
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            if (r3 == 0) goto L1e
            r1.b = r3
            r1.c = r0
            r1.d = r0
            yq1 r3 = defpackage.yq1.d
            r1.e = r3
            return r1
        L1e:
            java.lang.String r3 = "Null sharedSurfaces"
            defpackage.u34.x(r3)
            return r2
        L24:
            java.lang.String r3 = "Null surface"
            defpackage.u34.x(r3)
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof defpackage.wy
            if (r0 == 0) goto L35
            wy r3 = (defpackage.wy) r3
            ig1 r0 = r2.a
            ig1 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            java.util.List r0 = r2.b
            java.util.List r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            int r0 = r2.c
            int r1 = r3.c
            if (r0 != r1) goto L35
            int r0 = r2.d
            int r1 = r3.d
            if (r0 != r1) goto L35
            yq1 r2 = r2.e
            yq1 r3 = r3.e
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L35
        L33:
            r2 = 1
            return r2
        L35:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            ig1 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.util.List r2 = r3.b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            r2 = -721379959(0xffffffffd5009d89, float:-8.838381E12)
            int r0 = r0 * r2
            int r2 = r3.c
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.d
            r0 = r0 ^ r2
            int r0 = r0 * r1
            yq1 r3 = r3.e
            int r3 = r3.hashCode()
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OutputConfig{surface="
            r0.<init>(r1)
            ig1 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", sharedSurfaces="
            r0.append(r1)
            java.util.List r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", physicalCameraId=null, mirrorMode="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", surfaceGroupId="
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", dynamicRange="
            r0.append(r1)
            yq1 r2 = r2.e
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
