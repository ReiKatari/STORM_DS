package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ci3  reason: default package */
/* loaded from: classes.dex */
public final class ci3 implements defpackage.pq1 {
    public final defpackage.bi3 a;

    public ci3(defpackage.bi3 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.to
    public final /* bridge */ /* synthetic */ defpackage.il7 a(defpackage.wc7 r1) {
            r0 = this;
            qm4 r0 = r0.f(r1)
            return r0
    }

    @Override // defpackage.pq1, defpackage.to
    public final /* bridge */ /* synthetic */ defpackage.kl7 a(defpackage.wc7 r1) {
            r0 = this;
            qm4 r0 = r0.f(r1)
            return r0
    }

    public final defpackage.qm4 f(defpackage.wc7 r20) {
            r19 = this;
            o94 r0 = new o94
            r1 = r19
            bi3 r1 = r1.a
            p94 r2 = r1.b
            int r3 = r2.e
            int r3 = r3 + 2
            r0.<init>(r3)
            p94 r3 = new p94
            int r4 = r2.e
            r3.<init>(r4)
            int[] r4 = r2.b
            java.lang.Object[] r5 = r2.c
            long[] r6 = r2.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L89
            r9 = 0
        L22:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L8b
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L3c:
            if (r14 >= r12) goto L81
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L70
            int r15 = r9 << 3
            int r15 = r15 + r14
            r8 = r4[r15]
            r15 = r5[r15]
            ai3 r15 = (defpackage.ai3) r15
            r0.a(r8)
            r16 = r13
            nl7 r13 = new nl7
            r17 = r4
            r18 = r5
            r4 = r20
            qn2 r5 = r4.a
            java.lang.Float r4 = r15.a
            java.lang.Object r4 = r5.g(r4)
            ap r4 = (defpackage.ap) r4
            hr1 r5 = r15.b
            r13.<init>(r4, r5)
            r3.i(r8, r13)
            goto L76
        L70:
            r17 = r4
            r18 = r5
            r16 = r13
        L76:
            long r10 = r10 >> r16
            int r14 = r14 + 1
            r13 = r16
            r4 = r17
            r5 = r18
            goto L3c
        L81:
            r17 = r4
            r18 = r5
            r4 = r13
            if (r12 != r4) goto L89
            goto L8f
        L89:
            r4 = 0
            goto L98
        L8b:
            r17 = r4
            r18 = r5
        L8f:
            if (r9 == r7) goto L89
            int r9 = r9 + 1
            r4 = r17
            r5 = r18
            goto L22
        L98:
            boolean r5 = r2.a(r4)
            if (r5 != 0) goto Lbf
            int r5 = r0.b
            if (r5 < 0) goto Lb8
            r6 = 1
            int r5 = r5 + r6
            r0.b(r5)
            int[] r5 = r0.a
            int r7 = r0.b
            if (r7 == 0) goto Lb0
            defpackage.fv.r0(r6, r4, r7, r5, r5)
        Lb0:
            r5[r4] = r4
            int r4 = r0.b
            int r4 = r4 + r6
            r0.b = r4
            goto Lbf
        Lb8:
            java.lang.String r0 = "Index must be between 0 and size"
            defpackage.e41.q(r0)
            r0 = 0
            return r0
        Lbf:
            int r4 = r1.a
            boolean r2 = r2.a(r4)
            if (r2 != 0) goto Lcc
            int r2 = r1.a
            r0.a(r2)
        Lcc:
            int r2 = r0.b
            if (r2 != 0) goto Ld1
            goto Lda
        Ld1:
            int[] r4 = r0.a
            r4.getClass()
            r5 = 0
            java.util.Arrays.sort(r4, r5, r2)
        Lda:
            qm4 r2 = new qm4
            int r1 = r1.a
            e41 r4 = defpackage.ir1.c
            r2.<init>(r0, r3, r1, r4)
            return r2
    }
}
