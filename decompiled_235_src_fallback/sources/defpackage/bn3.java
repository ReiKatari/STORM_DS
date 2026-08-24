package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bn3  reason: default package */
/* loaded from: classes.dex */
public final class bn3 implements defpackage.f34 {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.f34 b;
    public final /* synthetic */ defpackage.gn3 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ defpackage.f34 e;

    public /* synthetic */ bn3(defpackage.f34 r1, defpackage.gn3 r2, int r3, defpackage.f34 r4, int r5) {
            r0 = this;
            r0.a = r5
            r0.c = r2
            r0.d = r3
            r0.e = r4
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.f34
    public final void a() {
            r17 = this;
            r0 = r17
            int r1 = r0.a
            f34 r2 = r0.e
            int r3 = r0.d
            gn3 r0 = r0.c
            switch(r1) {
                case 0: goto L1e;
                default: goto Ld;
            }
        Ld:
            r0.R = r3
            r2.a()
            sm3 r1 = r0.A
            sm3 r1 = r1.e0
            if (r1 != 0) goto L1d
            int r1 = r0.R
            r0.g(r1)
        L1d:
            return
        L1e:
            r0.X = r3
            r2.a()
            ua4 r1 = r0.i0
            ja4 r2 = r0.h0
            long[] r3 = r2.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L8e
            r6 = 0
        L2f:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L89
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L49:
            if (r11 >= r9) goto L87
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L83
            int r12 = r6 << 3
            int r12 = r12 + r11
            java.lang.Object[] r13 = r2.b
            r13 = r13[r12]
            java.lang.Object[] r14 = r2.c
            r14 = r14[r12]
            nt6 r14 = (defpackage.nt6) r14
            int r15 = r1.i(r13)
            if (r15 < 0) goto L6b
            int r5 = r0.X
            if (r15 < r5) goto L83
        L6b:
            if (r15 < 0) goto L75
            java.lang.Object[] r5 = r1.A
            r16 = r5[r15]
            java.lang.Object r16 = defpackage.mt6.b
            r5[r15] = r16
        L75:
            ja4 r5 = r0.f0
            boolean r5 = r5.b(r13)
            if (r5 == 0) goto L80
            r14.dispose()
        L80:
            r2.l(r12)
        L83:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L49
        L87:
            if (r9 != r10) goto L8e
        L89:
            if (r6 == r4) goto L8e
            int r6 = r6 + 1
            goto L2f
        L8e:
            int r1 = r0.R
            r0.g(r1)
            return
    }

    @Override // defpackage.f34
    public final java.util.Map b() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            f34 r1 = r1.b
            java.util.Map r1 = r1.b()
            return r1
        Lc:
            f34 r1 = r1.b
            java.util.Map r1 = r1.b()
            return r1
    }

    @Override // defpackage.f34
    public final defpackage.qn2 c() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            f34 r1 = r1.b
            qn2 r1 = r1.c()
            return r1
        Lc:
            f34 r1 = r1.b
            qn2 r1 = r1.c()
            return r1
    }

    @Override // defpackage.f34
    public final int getHeight() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            f34 r1 = r1.b
            int r1 = r1.getHeight()
            return r1
        Lc:
            f34 r1 = r1.b
            int r1 = r1.getHeight()
            return r1
    }

    @Override // defpackage.f34
    public final int getWidth() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            f34 r1 = r1.b
            int r1 = r1.getWidth()
            return r1
        Lc:
            f34 r1 = r1.b
            int r1 = r1.getWidth()
            return r1
    }
}
