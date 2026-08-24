package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ha7  reason: default package */
/* loaded from: classes.dex */
public final class ha7 {
    public final defpackage.i92 a;
    public final defpackage.pj6 b;
    public final defpackage.sl0 c;
    public final defpackage.z56 d;
    public final boolean e;
    public final java.util.Map f;

    public /* synthetic */ ha7(defpackage.i92 r3, defpackage.pj6 r4, defpackage.sl0 r5, defpackage.z56 r6, java.util.LinkedHashMap r7, int r8) {
            r2 = this;
            r0 = r8 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r0 = r8 & 2
            if (r0 == 0) goto Lb
            r4 = r1
        Lb:
            r0 = r8 & 4
            if (r0 == 0) goto L10
            r5 = r1
        L10:
            r0 = r8 & 8
            if (r0 == 0) goto L15
            r6 = r1
        L15:
            r0 = r8 & 32
            if (r0 == 0) goto L1b
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            r8 = r8 & 64
            if (r8 == 0) goto L22
            zt1 r7 = defpackage.zt1.A
        L22:
            r8 = r7
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
    }

    public ha7(defpackage.i92 r1, defpackage.pj6 r2, defpackage.sl0 r3, defpackage.z56 r4, boolean r5, java.util.Map r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ha7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ha7 r5 = (defpackage.ha7) r5
            i92 r1 = r4.a
            i92 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            pj6 r1 = r4.b
            pj6 r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            sl0 r1 = r4.c
            sl0 r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            z56 r1 = r4.d
            z56 r3 = r5.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L3f
            return r2
        L3f:
            java.util.Map r4 = r4.f
            java.util.Map r5 = r5.f
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L4a
            return r2
        L4a:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            i92 r1 = r4.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 31
            int r1 = r1 * r2
            pj6 r3 = r4.b
            if (r3 != 0) goto L14
            r3 = r0
            goto L18
        L14:
            int r3 = r3.hashCode()
        L18:
            int r1 = r1 + r3
            int r1 = r1 * r2
            sl0 r3 = r4.c
            if (r3 != 0) goto L20
            r3 = r0
            goto L24
        L20:
            int r3 = r3.hashCode()
        L24:
            int r1 = r1 + r3
            int r1 = r1 * r2
            z56 r3 = r4.d
            if (r3 != 0) goto L2b
            goto L2f
        L2b:
            int r0 = r3.hashCode()
        L2f:
            int r1 = r1 + r0
            int r1 = r1 * 961
            boolean r0 = r4.e
            int r0 = defpackage.xg6.e(r1, r0, r2)
            java.util.Map r4 = r4.f
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TransitionData(fade="
            r0.<init>(r1)
            i92 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", slide="
            r0.append(r1)
            pj6 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", changeSize="
            r0.append(r1)
            sl0 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", scale="
            r0.append(r1)
            z56 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", veil=null, hold="
            r0.append(r1)
            boolean r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", effectsMap="
            r0.append(r1)
            java.util.Map r2 = r2.f
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
