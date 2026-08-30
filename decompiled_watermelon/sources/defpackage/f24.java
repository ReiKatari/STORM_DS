package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f24  reason: default package */
/* loaded from: classes.dex */
public final class f24 extends jc5 implements aj2 {
    public ll2 L;
    public g24 R;
    public long[] X;
    public int Y;
    public int Z;
    public int c0;
    public int d0;
    public long e0;
    public int f0;
    public /* synthetic */ Object g0;
    public final /* synthetic */ g24 h0;
    public final /* synthetic */ ll2 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f24(g24 g24Var, ll2 ll2Var, j11 j11Var) {
        super(2, j11Var);
        this.h0 = g24Var;
        this.i0 = ll2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((f24) t((j11) obj2, (c06) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        f24 f24Var = new f24(this.h0, this.i0, j11Var);
        f24Var.g0 = obj;
        return f24Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:23:0x00a1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:20:0x0096). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0093 -> B:20:0x0096). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.f0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2d
            if (r2 != r5) goto L26
            int r2 = r0.d0
            int r6 = r0.c0
            long r7 = r0.e0
            int r9 = r0.Z
            int r10 = r0.Y
            long[] r11 = r0.X
            g24 r12 = r0.R
            ll2 r13 = r0.L
            java.lang.Object r14 = r0.g0
            c06 r14 = (defpackage.c06) r14
            defpackage.me2.a0(r22)
            goto L96
        L26:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            r0 = 0
            return r0
        L2d:
            defpackage.me2.a0(r22)
            java.lang.Object r2 = r0.g0
            c06 r2 = (defpackage.c06) r2
            g24 r6 = r0.h0
            e24 r7 = r6.B
            long[] r7 = r7.a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La6
            ll2 r9 = r0.i0
            r10 = 0
        L42:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La1
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L65:
            if (r2 >= r6) goto L99
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L96
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.B = r15
            e24 r3 = r12.B
            java.lang.Object[] r3 = r3.b
            r3 = r3[r15]
            r0.g0 = r14
            r0.L = r13
            r0.R = r12
            r0.X = r11
            r0.Y = r10
            r0.Z = r9
            r0.e0 = r7
            r0.c0 = r6
            r0.d0 = r2
            r0.f0 = r5
            p31 r3 = r14.c(r0, r3)
            if (r3 != r1) goto L96
            return r1
        L96:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L65
        L99:
            if (r6 != r4) goto La6
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La1:
            if (r10 == r8) goto La6
            int r10 = r10 + 1
            goto L42
        La6:
            o27 r0 = defpackage.o27.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f24.v(java.lang.Object):java.lang.Object");
    }
}
