package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nu3  reason: default package */
/* loaded from: classes.dex */
public final class nu3 extends defpackage.qo7 {
    public final defpackage.p94 b;

    public nu3() {
            r1 = this;
            r1.<init>()
            p94 r0 = defpackage.h93.a
            p94 r0 = new p94
            r0.<init>()
            r1.b = r0
            return
    }

    @Override // defpackage.qo7
    public final void d() {
            r15 = this;
            p94 r15 = r15.b
            int[] r0 = r15.b
            java.lang.Object[] r1 = r15.c
            long[] r15 = r15.a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L6e
            r3 = 0
            r4 = r3
        Lf:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L69
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L29:
            if (r9 >= r7) goto L67
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L63
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r1[r10]
            ca4 r10 = (defpackage.ca4) r10
            java.lang.Object[] r11 = r10.a
            int r10 = r10.b
            r12 = r3
        L42:
            if (r12 >= r10) goto L63
            r13 = r11[r12]
            mu3 r13 = (defpackage.mu3) r13
            tj0 r14 = r13.d
            if (r14 == 0) goto L4f
            r14.cancel()
        L4f:
            r14 = 0
            r13.d = r14
            s63 r13 = r13.a
            java.lang.Object r13 = r13.B
            k04 r13 = (defpackage.k04) r13
            r14 = 1
            r13.B = r14
            r13.A = r3
            r13.a()
            int r12 = r12 + 1
            goto L42
        L63:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L29
        L67:
            if (r7 != r8) goto L6e
        L69:
            if (r4 == r2) goto L6e
            int r4 = r4 + 1
            goto Lf
        L6e:
            return
    }
}
