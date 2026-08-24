package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pr7  reason: default package */
/* loaded from: classes.dex */
public final class pr7 {
    public final boolean a;
    public final java.lang.String b;
    public final defpackage.na c;
    public final defpackage.sr7 d;
    public final java.lang.String e;
    public final java.util.List f;
    public final java.util.List g;
    public final defpackage.hm4 h;
    public final java.util.Map i;
    public final java.lang.String j;
    public final java.lang.String k;

    public pr7(boolean r1, java.lang.String r2, defpackage.na r3, defpackage.sr7 r4, java.lang.String r5, java.util.List r6, java.util.List r7, defpackage.hm4 r8, java.util.Map r9, java.lang.String r10, java.lang.String r11) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r6.getClass()
            r7.getClass()
            r9.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.k = r11
            return
    }

    public static defpackage.pr7 a(defpackage.pr7 r12, boolean r13, java.lang.String r14, defpackage.na r15, defpackage.sr7 r16, java.lang.String r17, java.util.List r18, java.util.List r19, defpackage.hm4 r20, java.util.Map r21, java.lang.String r22, java.lang.String r23, int r24) {
            r0 = r24
            r1 = r0 & 1
            if (r1 == 0) goto L8
            boolean r13 = r12.a
        L8:
            r1 = r13
            r13 = r0 & 2
            if (r13 == 0) goto Lf
            java.lang.String r14 = r12.b
        Lf:
            r2 = r14
            r13 = r0 & 4
            if (r13 == 0) goto L16
            na r15 = r12.c
        L16:
            r3 = r15
            r13 = r0 & 8
            if (r13 == 0) goto L1f
            sr7 r13 = r12.d
            r4 = r13
            goto L21
        L1f:
            r4 = r16
        L21:
            r13 = r0 & 16
            if (r13 == 0) goto L29
            java.lang.String r13 = r12.e
            r5 = r13
            goto L2b
        L29:
            r5 = r17
        L2b:
            r13 = r0 & 32
            if (r13 == 0) goto L33
            java.util.List r13 = r12.f
            r6 = r13
            goto L35
        L33:
            r6 = r18
        L35:
            r13 = r0 & 64
            if (r13 == 0) goto L3d
            java.util.List r13 = r12.g
            r7 = r13
            goto L3f
        L3d:
            r7 = r19
        L3f:
            r13 = r0 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L47
            hm4 r13 = r12.h
            r8 = r13
            goto L49
        L47:
            r8 = r20
        L49:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L51
            java.util.Map r13 = r12.i
            r9 = r13
            goto L53
        L51:
            r9 = r21
        L53:
            r13 = r0 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L5b
            java.lang.String r13 = r12.j
            r10 = r13
            goto L5d
        L5b:
            r10 = r22
        L5d:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L65
            java.lang.String r13 = r12.k
            r11 = r13
            goto L67
        L65:
            r11 = r23
        L67:
            r12.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r6.getClass()
            r7.getClass()
            r9.getClass()
            pr7 r0 = new pr7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L7b
        L4:
            boolean r0 = r3 instanceof defpackage.pr7
            if (r0 != 0) goto La
            goto L79
        La:
            pr7 r3 = (defpackage.pr7) r3
            boolean r0 = r2.a
            boolean r1 = r3.a
            if (r0 == r1) goto L14
            goto L79
        L14:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1f
            goto L79
        L1f:
            na r0 = r2.c
            na r1 = r3.c
            if (r0 == r1) goto L26
            goto L79
        L26:
            sr7 r0 = r2.d
            sr7 r1 = r3.d
            if (r0 == r1) goto L2d
            goto L79
        L2d:
            java.lang.String r0 = r2.e
            java.lang.String r1 = r3.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L38
            goto L79
        L38:
            java.util.List r0 = r2.f
            java.util.List r1 = r3.f
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L43
            goto L79
        L43:
            java.util.List r0 = r2.g
            java.util.List r1 = r3.g
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L4e
            goto L79
        L4e:
            hm4 r0 = r2.h
            hm4 r1 = r3.h
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L59
            goto L79
        L59:
            java.util.Map r0 = r2.i
            java.util.Map r1 = r3.i
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L64
            goto L79
        L64:
            java.lang.String r0 = r2.j
            java.lang.String r1 = r3.j
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L6f
            goto L79
        L6f:
            java.lang.String r2 = r2.k
            java.lang.String r3 = r3.k
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L7b
        L79:
            r2 = 0
            return r2
        L7b:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            boolean r0 = r4.a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            na r2 = r4.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            sr7 r0 = r4.d
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            r2 = 0
            java.lang.String r3 = r4.e
            if (r3 != 0) goto L26
            r3 = r2
            goto L2a
        L26:
            int r3 = r3.hashCode()
        L2a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.util.List r3 = r4.f
            int r0 = defpackage.i61.b(r0, r3, r1)
            java.util.List r3 = r4.g
            int r0 = defpackage.i61.b(r0, r3, r1)
            hm4 r3 = r4.h
            if (r3 != 0) goto L3e
            r3 = r2
            goto L42
        L3e:
            int r3 = r3.hashCode()
        L42:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.util.Map r3 = r4.i
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            int r3 = r3 * r1
            java.lang.String r0 = r4.j
            if (r0 != 0) goto L52
            r0 = r2
            goto L56
        L52:
            int r0 = r0.hashCode()
        L56:
            int r3 = r3 + r0
            int r3 = r3 * r1
            java.lang.String r4 = r4.k
            if (r4 != 0) goto L5d
            goto L61
        L5d:
            int r2 = r4.hashCode()
        L61:
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UiState(isSupported="
            r0.<init>(r1)
            boolean r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", gpuDescription="
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", gpuSeries="
            r0.append(r1)
            na r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", driverMode="
            r0.append(r1)
            sr7 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", selectedDriverId="
            r0.append(r1)
            java.lang.String r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", installedDrivers="
            r0.append(r1)
            java.util.List r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", onlineDrivers="
            r0.append(r1)
            java.util.List r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", recommendedDriver="
            r0.append(r1)
            hm4 r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", downloadProgress="
            r0.append(r1)
            java.util.Map r1 = r2.i
            r0.append(r1)
            java.lang.String r1 = ", activeDownloadingId="
            r0.append(r1)
            java.lang.String r1 = r2.j
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.k
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }
}
