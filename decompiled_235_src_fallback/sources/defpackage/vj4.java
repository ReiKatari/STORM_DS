package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: vj4  reason: default package */
/* loaded from: classes.dex */
public final class vj4 {
    public static final defpackage.uj4 Companion = null;
    public static final defpackage.go3[] h = null;
    public final java.lang.String a;
    public final long b;
    public final java.util.List c;
    public final java.util.List d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final long g;

    static {
            uj4 r0 = new uj4
            r0.<init>()
            defpackage.vj4.Companion = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            pi3 r1 = new pi3
            r2 = 20
            r1.<init>(r2)
            go3 r1 = defpackage.kj2.M(r0, r1)
            pi3 r2 = new pi3
            r3 = 21
            r2.<init>(r3)
            go3 r0 = defpackage.kj2.M(r0, r2)
            r2 = 7
            go3[] r2 = new defpackage.go3[r2]
            r3 = 0
            r4 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r4
            r3 = 2
            r2[r3] = r1
            r1 = 3
            r2[r1] = r0
            r0 = 4
            r2[r0] = r4
            r0 = 5
            r2[r0] = r4
            r0 = 6
            r2[r0] = r4
            defpackage.vj4.h = r2
            return
    }

    public /* synthetic */ vj4(int r5, long r6, long r8, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.List r13, java.util.List r14) {
            r4 = this;
            r4.<init>()
            r0 = r5 & 1
            java.lang.String r1 = ""
            if (r0 != 0) goto Lc
            r4.a = r1
            goto Le
        Lc:
            r4.a = r10
        Le:
            r10 = r5 & 2
            r2 = 0
            if (r10 != 0) goto L17
            r4.b = r2
            goto L19
        L17:
            r4.b = r6
        L19:
            r6 = r5 & 4
            yt1 r7 = defpackage.yt1.A
            if (r6 != 0) goto L22
            r4.c = r7
            goto L24
        L22:
            r4.c = r13
        L24:
            r6 = r5 & 8
            if (r6 != 0) goto L2b
            r4.d = r7
            goto L2d
        L2b:
            r4.d = r14
        L2d:
            r6 = r5 & 16
            if (r6 != 0) goto L35
            r6 = 0
            r4.e = r6
            goto L37
        L35:
            r4.e = r11
        L37:
            r6 = r5 & 32
            if (r6 != 0) goto L3e
            r4.f = r1
            goto L40
        L3e:
            r4.f = r12
        L40:
            r5 = r5 & 64
            if (r5 != 0) goto L47
            r4.g = r2
            return
        L47:
            r4.g = r8
            return
    }

    public vj4(java.lang.String r1, long r2, java.util.List r4, java.util.List r5, java.lang.String r6, java.lang.String r7, long r8) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.g = r8
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.vj4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            vj4 r8 = (defpackage.vj4) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.b
            long r5 = r8.b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            return r2
        L20:
            java.util.List r1 = r7.c
            java.util.List r3 = r8.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            java.util.List r1 = r7.d
            java.util.List r3 = r8.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L36
            return r2
        L36:
            java.lang.String r1 = r7.e
            java.lang.String r3 = r8.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L41
            return r2
        L41:
            java.lang.String r1 = r7.f
            java.lang.String r3 = r8.f
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L4c
            return r2
        L4c:
            long r3 = r7.g
            long r7 = r8.g
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L55
            return r2
        L55:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.util.List r2 = r4.c
            int r0 = defpackage.i61.b(r0, r2, r1)
            java.util.List r2 = r4.d
            int r0 = defpackage.i61.b(r0, r2, r1)
            java.lang.String r2 = r4.e
            if (r2 != 0) goto L21
            r2 = 0
            goto L25
        L21:
            int r2 = r2.hashCode()
        L25:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.f
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r1 = r4.g
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OfflinePrefetchCacheFile(romHash="
            r0.<init>(r1)
            java.lang.String r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", gameId="
            r0.append(r1)
            long r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = ", achievements="
            r0.append(r1)
            java.util.List r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", leaderboards="
            r0.append(r1)
            java.util.List r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", richPresencePatch="
            java.lang.String r2 = ", iconUrl="
            java.lang.String r3 = r5.e
            java.lang.String r4 = r5.f
            defpackage.i61.B(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", fetchedAtEpochMs="
            java.lang.String r2 = ")"
            long r3 = r5.g
            java.lang.String r5 = defpackage.lb1.r(r0, r1, r3, r2)
            return r5
    }
}
