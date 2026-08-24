package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g94  reason: default package */
/* loaded from: classes.dex */
public final class g94 {
    public final defpackage.ja4 a;

    public /* synthetic */ g94(defpackage.ja4 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static final java.lang.Object a(defpackage.ja4 r5) {
            r0 = 0
            java.lang.Object r1 = r5.g(r0)
            if (r1 != 0) goto L8
            return r0
        L8:
            boolean r2 = r1 instanceof defpackage.ca4
            if (r2 == 0) goto L3d
            ca4 r1 = (defpackage.ca4) r1
            boolean r2 = r1.h()
            if (r2 != 0) goto L37
            int r2 = r1.b
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r4 = r1.f(r2)
            r1.k(r2)
            r4.getClass()
            boolean r2 = r1.h()
            if (r2 == 0) goto L2b
            r5.k(r0)
        L2b:
            int r2 = r1.b
            if (r2 != r3) goto L36
            java.lang.Object r1 = r1.e()
            r5.m(r0, r1)
        L36:
            return r4
        L37:
            java.lang.String r5 = "List is empty."
            defpackage.fa6.e(r5)
            return r0
        L3d:
            r5.k(r0)
            return r1
    }

    public static final defpackage.ca4 b(defpackage.ja4 r14) {
            boolean r0 = r14.i()
            if (r0 == 0) goto Lc
            ca4 r14 = defpackage.uh4.b
            r14.getClass()
            return r14
        Lc:
            ca4 r0 = new ca4
            r0.<init>()
            java.lang.Object[] r1 = r14.c
            long[] r14 = r14.a
            int r2 = r14.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1c:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L36:
            if (r9 >= r7) goto L5a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L56
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof defpackage.ca4
            if (r11 == 0) goto L50
            ca4 r10 = (defpackage.ca4) r10
            r0.b(r10)
            goto L56
        L50:
            r10.getClass()
            r0.a(r10)
        L56:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L5a:
            if (r7 != r8) goto L61
        L5c:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1c
        L61:
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.g94
            if (r0 != 0) goto L5
            goto L11
        L5:
            g94 r2 = (defpackage.g94) r2
            ja4 r2 = r2.a
            ja4 r1 = r1.a
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            ja4 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MultiValueMap(map="
            r0.<init>(r1)
            ja4 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
