package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i91  reason: default package */
/* loaded from: classes.dex */
public final class i91 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ um Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ boolean c0;
    public final /* synthetic */ j91 d0;
    public final /* synthetic */ l33 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i91(um umVar, float f, boolean z, j91 j91Var, l33 l33Var, j11 j11Var) {
        super(2, j11Var);
        this.Y = umVar;
        this.Z = f;
        this.c0 = z;
        this.d0 = j91Var;
        this.e0 = l33Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((i91) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new i91(this.Y, this.Z, this.c0, this.d0, this.e0, j11Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r9.e(r8, r1) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (defpackage.co1.a(r9, r5, r2, r8.e0, r8) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r9) {
        /*
            r8 = this;
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r8.X
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 == r4) goto L14
            if (r1 != r3) goto Le
            goto L14
        Le:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            return r2
        L14:
            defpackage.me2.a0(r9)
            goto L7f
        L18:
            defpackage.me2.a0(r9)
            um r9 = r8.Y
            tj4 r1 = r9.e
            java.lang.Object r1 = r1.getValue()
            ji1 r1 = (defpackage.ji1) r1
            float r1 = r1.A
            float r5 = r8.Z
            boolean r1 = defpackage.ji1.b(r1, r5)
            if (r1 != 0) goto L7f
            boolean r1 = r8.c0
            if (r1 != 0) goto L41
            ji1 r1 = new ji1
            r1.<init>(r5)
            r8.X = r4
            java.lang.Object r8 = r9.e(r8, r1)
            if (r8 != r0) goto L7f
            goto L7e
        L41:
            tj4 r1 = r9.e
            java.lang.Object r1 = r1.getValue()
            ji1 r1 = (defpackage.ji1) r1
            float r1 = r1.A
            r4 = 1090519040(0x41000000, float:8.0)
            boolean r4 = defpackage.ji1.b(r1, r4)
            if (r4 == 0) goto L5b
            jt4 r2 = new jt4
            r6 = 0
            r2.<init>(r6)
            goto L74
        L5b:
            r4 = 1082130432(0x40800000, float:4.0)
            boolean r6 = defpackage.ji1.b(r1, r4)
            if (r6 == 0) goto L69
            ns2 r2 = new ns2
            r2.<init>()
            goto L74
        L69:
            boolean r1 = defpackage.ji1.b(r1, r4)
            if (r1 == 0) goto L74
            bc2 r2 = new bc2
            r2.<init>()
        L74:
            r8.X = r3
            l33 r1 = r8.e0
            java.lang.Object r8 = defpackage.co1.a(r9, r5, r2, r1, r8)
            if (r8 != r0) goto L7f
        L7e:
            return r0
        L7f:
            o27 r8 = defpackage.o27.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i91.v(java.lang.Object):java.lang.Object");
    }
}
