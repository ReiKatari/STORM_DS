package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d0  reason: default package */
/* loaded from: classes.dex */
public final class d0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ l14 Z;
    public final /* synthetic */ jt4 c0;
    public final /* synthetic */ g0 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(l14 l14Var, jt4 jt4Var, g0 g0Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = l14Var;
        this.c0 = jt4Var;
        this.d0 = g0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((d0) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((d0) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new d0(this.Z, this.c0, this.d0, j11Var, 0);
            default:
                return new d0(this.Z, this.c0, this.d0, j11Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (defpackage.dk7.q(r4, r10) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r3.a(r8, r10) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        if (defpackage.dk7.q(r4, r10) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (r3.a(r8, r10) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
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
            int r0 = r10.X
            o27 r1 = defpackage.o27.a
            g0 r2 = r10.d0
            l14 r3 = r10.Z
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            r7 = 2
            jt4 r8 = r10.c0
            switch(r0) {
                case 0: goto L44;
                default: goto L12;
            }
        L12:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r9 = r10.Y
            if (r9 == 0) goto L29
            if (r9 == r6) goto L25
            if (r9 != r7) goto L20
            defpackage.me2.a0(r11)
            goto L41
        L20:
            defpackage.i.n(r5)
            r1 = r4
            goto L43
        L25:
            defpackage.me2.a0(r11)
            goto L37
        L29:
            defpackage.me2.a0(r11)
            long r4 = defpackage.fp0.a
            r10.Y = r6
            java.lang.Object r11 = defpackage.dk7.q(r4, r10)
            if (r11 != r0) goto L37
            goto L3f
        L37:
            r10.Y = r7
            java.lang.Object r10 = r3.a(r8, r10)
            if (r10 != r0) goto L41
        L3f:
            r1 = r0
            goto L43
        L41:
            r2.w0 = r8
        L43:
            return r1
        L44:
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r9 = r10.Y
            if (r9 == 0) goto L5b
            if (r9 == r6) goto L57
            if (r9 != r7) goto L52
            defpackage.me2.a0(r11)
            goto L73
        L52:
            defpackage.i.n(r5)
            r1 = r4
            goto L75
        L57:
            defpackage.me2.a0(r11)
            goto L69
        L5b:
            defpackage.me2.a0(r11)
            long r4 = defpackage.fp0.a
            r10.Y = r6
            java.lang.Object r11 = defpackage.dk7.q(r4, r10)
            if (r11 != r0) goto L69
            goto L71
        L69:
            r10.Y = r7
            java.lang.Object r10 = r3.a(r8, r10)
            if (r10 != r0) goto L73
        L71:
            r1 = r0
            goto L75
        L73:
            r2.A0 = r8
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d0.v(java.lang.Object):java.lang.Object");
    }
}
