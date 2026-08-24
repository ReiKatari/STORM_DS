package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fy  reason: default package */
/* loaded from: classes.dex */
public final class fy {
    public final int a;
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public fy(int r1, java.lang.String r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            if (r2 == 0) goto L1a
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            return
        L1a:
            java.lang.String r0 = "Null mediaType"
            defpackage.u34.x(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.fy
            r2 = 0
            if (r1 == 0) goto L4c
            fy r5 = (defpackage.fy) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 != r3) goto L4c
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4c
            int r1 = r4.c
            int r3 = r5.c
            if (r1 != r3) goto L4c
            int r1 = r4.d
            int r3 = r5.d
            if (r1 != r3) goto L4c
            int r1 = r4.e
            int r3 = r5.e
            if (r1 != r3) goto L4c
            int r1 = r4.f
            int r3 = r5.f
            if (r1 != r3) goto L4c
            int r1 = r4.g
            int r3 = r5.g
            if (r1 != r3) goto L4c
            int r1 = r4.h
            int r3 = r5.h
            if (r1 != r3) goto L4c
            int r1 = r4.i
            int r3 = r5.i
            if (r1 != r3) goto L4c
            int r4 = r4.j
            int r5 = r5.j
            if (r4 != r5) goto L4c
            return r0
        L4c:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.c
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.d
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.e
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.f
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.g
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.h
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r2 = r3.i
            r0 = r0 ^ r2
            int r0 = r0 * r1
            int r3 = r3.j
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VideoProfileProxy{codec="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", mediaType="
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", bitrate="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", frameRate="
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", width="
            r0.append(r1)
            int r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            int r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", profile="
            r0.append(r1)
            int r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", bitDepth="
            r0.append(r1)
            int r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", chromaSubsampling="
            r0.append(r1)
            int r1 = r2.i
            r0.append(r1)
            java.lang.String r1 = ", hdrFormat="
            r0.append(r1)
            int r2 = r2.j
            java.lang.String r1 = "}"
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
    }
}
