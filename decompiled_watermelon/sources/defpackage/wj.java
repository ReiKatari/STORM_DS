package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wj  reason: default package */
/* loaded from: classes.dex */
public final class wj extends nk6 implements aj2 {
    public final /* synthetic */ int X = 1;
    public int Y;
    public long Z;
    public String c0;
    public long d0;
    public final /* synthetic */ long e0;
    public final /* synthetic */ long f0;
    public Object g0;
    public Object h0;
    public final /* synthetic */ Object i0;
    public final /* synthetic */ Object j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(hv1 hv1Var, long j, dy4 dy4Var, z15 z15Var, rg5 rg5Var, String str, long j2, long j3, long j4, j11 j11Var) {
        super(2, j11Var);
        this.g0 = hv1Var;
        this.Z = j;
        this.h0 = dy4Var;
        this.i0 = z15Var;
        this.j0 = rg5Var;
        this.c0 = str;
        this.d0 = j2;
        this.e0 = j3;
        this.f0 = j4;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((wj) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((wj) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.j0;
        Object obj3 = this.i0;
        switch (i) {
            case 0:
                return new wj((xj) obj3, (String) obj2, this.e0, this.f0, j11Var);
            default:
                return new wj((hv1) this.g0, this.Z, (dy4) this.h0, (z15) obj3, (rg5) obj2, this.c0, this.d0, this.e0, this.f0, j11Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
        if (r0 == r1) goto L16;
     */
    /* JADX WARN: Finally extract failed */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(xj xjVar, String str, long j, long j2, j11 j11Var) {
        super(2, j11Var);
        this.i0 = xjVar;
        this.j0 = str;
        this.e0 = j;
        this.f0 = j2;
    }
}
