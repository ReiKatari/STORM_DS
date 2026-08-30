package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ni5  reason: default package */
/* loaded from: classes.dex */
public final class ni5 extends nk6 implements aj2 {
    public int X;
    public int Y;
    public final /* synthetic */ ri5 Z;
    public final /* synthetic */ int c0;
    public final /* synthetic */ int d0;
    public final /* synthetic */ int e0;
    public final /* synthetic */ ki3 f0;
    public final /* synthetic */ pk3 g0;
    public final /* synthetic */ za6 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni5(ri5 ri5Var, int i, int i2, int i3, ki3 ki3Var, pk3 pk3Var, za6 za6Var, j11 j11Var) {
        super(2, j11Var);
        this.Z = ri5Var;
        this.c0 = i;
        this.d0 = i2;
        this.e0 = i3;
        this.f0 = ki3Var;
        this.g0 = pk3Var;
        this.h0 = za6Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((ni5) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new ni5(this.Z, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, j11Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (defpackage.pk3.l(r10.g0, r1, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
        if (defpackage.ki3.j(r10.f0, r1, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (defpackage.dt3.Q(r10.Z, r10.d0, r10.f0, r10.g0, r10.h0, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        return r0;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r11) {
        /*
            r10 = this;
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r10.Y
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1b
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            defpackage.me2.a0(r11)
            goto L86
        L15:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            return r2
        L1b:
            int r1 = r10.X
            defpackage.me2.a0(r11)
            goto L70
        L21:
            defpackage.me2.a0(r11)
            ri5 r11 = r10.Z
            tp5 r1 = r11.f
            int[] r6 = defpackage.mi5.a
            int r1 = r1.ordinal()
            r1 = r6[r1]
            int r7 = r10.d0
            int r8 = r10.c0
            if (r1 == r5) goto L3f
            if (r1 != r4) goto L3b
        L38:
            int r8 = r8 + r7
            r1 = r8
            goto L46
        L3b:
            defpackage.i.c()
            return r2
        L3f:
            int r1 = r10.e0
            int r7 = r7 - r1
            if (r7 >= 0) goto L38
            r7 = 0
            goto L38
        L46:
            tp5 r11 = r11.f
            int r11 = r11.ordinal()
            r11 = r6[r11]
            if (r11 == r5) goto L63
            if (r11 != r4) goto L5f
            r10.X = r1
            r10.Y = r4
            pk3 r11 = r10.g0
            java.lang.Object r11 = defpackage.pk3.l(r11, r1, r10)
            if (r11 != r0) goto L70
            goto L85
        L5f:
            defpackage.i.c()
            return r2
        L63:
            r10.X = r1
            r10.Y = r5
            ki3 r11 = r10.f0
            java.lang.Object r11 = defpackage.ki3.j(r11, r1, r10)
            if (r11 != r0) goto L70
            goto L85
        L70:
            r10.X = r1
            r10.Y = r3
            ri5 r4 = r10.Z
            int r5 = r10.d0
            ki3 r6 = r10.f0
            pk3 r7 = r10.g0
            za6 r8 = r10.h0
            r9 = r10
            java.lang.Object r10 = defpackage.dt3.Q(r4, r5, r6, r7, r8, r9)
            if (r10 != r0) goto L86
        L85:
            return r0
        L86:
            o27 r10 = defpackage.o27.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni5.v(java.lang.Object):java.lang.Object");
    }
}
