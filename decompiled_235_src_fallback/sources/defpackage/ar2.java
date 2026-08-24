package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar2  reason: default package */
/* loaded from: classes.dex */
public final class ar2 {
    public final java.util.ArrayList a;
    public final int b;
    public int c;
    public final java.util.ArrayList d;
    public final defpackage.p94 e;
    public final defpackage.ex6 f;

    public ar2(int r6, java.util.ArrayList r7) {
            r5 = this;
            r5.<init>()
            r5.a = r7
            r5.b = r6
            if (r6 < 0) goto La
            goto Lf
        La:
            java.lang.String r6 = "Invalid start index"
            defpackage.r05.a(r6)
        Lf:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.d = r6
            p94 r6 = new p94
            r6.<init>()
            int r7 = r7.size()
            r0 = 0
            r1 = r0
        L21:
            if (r0 >= r7) goto L3b
            java.util.ArrayList r2 = r5.a
            java.lang.Object r2 = r2.get(r0)
            zg3 r2 = (defpackage.zg3) r2
            int r3 = r2.c
            int r2 = r2.d
            nu2 r4 = new nu2
            r4.<init>(r0, r1, r2)
            r6.i(r3, r4)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L21
        L3b:
            r5.e = r6
            a10 r6 = new a10
            r7 = 2
            r6.<init>(r5, r7)
            ex6 r7 = new ex6
            r7.<init>(r6)
            r5.f = r7
            return
    }

    public final boolean a(int r18, int r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            p94 r0 = r0.e
            r2 = r18
            java.lang.Object r2 = r0.b(r2)
            nu2 r2 = (defpackage.nu2) r2
            r3 = 0
            if (r2 == 0) goto L69
            int r4 = r2.b
            int r5 = r2.c
            int r5 = r1 - r5
            r2.c = r1
            if (r5 == 0) goto L67
            java.lang.Object[] r1 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L67
            r7 = r3
        L25:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L62
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r3
        L3f:
            if (r12 >= r10) goto L60
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r1[r13]
            nu2 r13 = (defpackage.nu2) r13
            int r14 = r13.b
            if (r14 < r4) goto L5c
            if (r13 == r2) goto L5c
            int r14 = r14 + r5
            if (r14 < 0) goto L5c
            r13.b = r14
        L5c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3f
        L60:
            if (r10 != r11) goto L67
        L62:
            if (r7 == r6) goto L67
            int r7 = r7 + 1
            goto L25
        L67:
            r0 = 1
            return r0
        L69:
            return r3
    }
}
