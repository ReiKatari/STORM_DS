package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: ki5  reason: default package */
/* loaded from: classes.dex */
public final class ki5 {
    public static final defpackage.ji5 Companion = null;
    public static final defpackage.go3[] j = null;
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final boolean g;
    public final boolean h;
    public final java.util.List i;

    static {
            ji5 r0 = new ji5
            r0.<init>()
            defpackage.ki5.Companion = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            pi3 r1 = new pi3
            r2 = 28
            r1.<init>(r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            r1 = 9
            go3[] r1 = new defpackage.go3[r1]
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r3
            r2 = 2
            r1[r2] = r3
            r2 = 3
            r1[r2] = r3
            r2 = 4
            r1[r2] = r3
            r2 = 5
            r1[r2] = r3
            r2 = 6
            r1[r2] = r3
            r2 = 7
            r1[r2] = r3
            r2 = 8
            r1[r2] = r0
            defpackage.ki5.j = r1
            return
    }

    public /* synthetic */ ki5(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10, boolean r11, java.util.List r12) {
            r2 = this;
            r2.<init>()
            r0 = r3 & 1
            java.lang.String r1 = ""
            if (r0 != 0) goto Lc
            r2.a = r1
            goto Le
        Lc:
            r2.a = r4
        Le:
            r4 = r3 & 2
            if (r4 != 0) goto L15
            r2.b = r1
            goto L17
        L15:
            r2.b = r5
        L17:
            r4 = r3 & 4
            if (r4 != 0) goto L1e
            r2.c = r1
            goto L20
        L1e:
            r2.c = r6
        L20:
            r4 = r3 & 8
            r5 = 0
            if (r4 != 0) goto L28
            r2.d = r5
            goto L2a
        L28:
            r2.d = r7
        L2a:
            r4 = r3 & 16
            if (r4 != 0) goto L31
            r2.e = r5
            goto L33
        L31:
            r2.e = r8
        L33:
            r4 = r3 & 32
            if (r4 != 0) goto L3a
            r2.f = r1
            goto L3c
        L3a:
            r2.f = r9
        L3c:
            r4 = r3 & 64
            r5 = 0
            if (r4 != 0) goto L44
            r2.g = r5
            goto L46
        L44:
            r2.g = r10
        L46:
            r4 = r3 & 128(0x80, float:1.8E-43)
            if (r4 != 0) goto L4d
            r2.h = r5
            goto L4f
        L4d:
            r2.h = r11
        L4f:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L58
            yt1 r3 = defpackage.yt1.A
            r2.i = r3
            return
        L58:
            r2.i = r12
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ki5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ki5 r5 = (defpackage.ki5) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.d
            java.lang.String r3 = r5.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.e
            java.lang.String r3 = r5.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.f
            java.lang.String r3 = r5.f
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            boolean r1 = r4.g
            boolean r3 = r5.g
            if (r1 == r3) goto L55
            return r2
        L55:
            boolean r1 = r4.h
            boolean r3 = r5.h
            if (r1 == r3) goto L5c
            return r2
        L5c:
            java.util.List r4 = r4.i
            java.util.List r5 = r5.i
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L67
            return r2
        L67:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            r2 = 0
            java.lang.String r3 = r4.d
            if (r3 != 0) goto L1c
            r3 = r2
            goto L20
        L1c:
            int r3 = r3.hashCode()
        L20:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.e
            if (r3 != 0) goto L27
            goto L2b
        L27:
            int r2 = r3.hashCode()
        L2b:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.f
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r2 = r4.g
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.h
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.util.List r4 = r4.i
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", body="
            java.lang.String r2 = "ReleaseDto(tagName="
            java.lang.String r3 = r5.a
            java.lang.String r4 = r5.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", createdAt="
            java.lang.String r2 = ", publishedAt="
            java.lang.String r3 = r5.c
            java.lang.String r4 = r5.d
            defpackage.i61.B(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", htmlUrl="
            java.lang.String r2 = ", draft="
            java.lang.String r3 = r5.e
            java.lang.String r4 = r5.f
            defpackage.i61.B(r0, r3, r1, r4, r2)
            boolean r1 = r5.g
            r0.append(r1)
            java.lang.String r1 = ", prerelease="
            r0.append(r1)
            boolean r1 = r5.h
            r0.append(r1)
            java.lang.String r1 = ", assets="
            r0.append(r1)
            java.util.List r5 = r5.i
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
