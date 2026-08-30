package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r44  reason: default package */
/* loaded from: classes.dex */
public final class r44 extends nk6 implements aj2 {
    public final /* synthetic */ int X = 0;
    public int Y;
    public float Z;
    public /* synthetic */ Object c0;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r44(float f, by5 by5Var, l34 l34Var, j11 j11Var) {
        super(2, j11Var);
        this.Z = f;
        this.c0 = by5Var;
        this.d0 = l34Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((r44) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((r44) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((r44) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                return new r44(this.Z, (by5) this.c0, (l34) obj2, j11Var);
            case 1:
                return new r44((c80) this.c0, this.Z, (ho) obj2, j11Var);
            default:
                r44 r44Var = new r44((kx6) obj2, j11Var);
                r44Var.c0 = obj;
                return r44Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
        if (r11.v(r0, r11.b.getValue(), r11) == r6) goto L48;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r44.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r44(c80 c80Var, float f, ho hoVar, j11 j11Var) {
        super(2, j11Var);
        this.c0 = c80Var;
        this.Z = f;
        this.d0 = hoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r44(kx6 kx6Var, j11 j11Var) {
        super(2, j11Var);
        this.d0 = kx6Var;
    }
}
