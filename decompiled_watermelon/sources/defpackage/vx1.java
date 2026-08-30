package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vx1  reason: default package */
/* loaded from: classes.dex */
public final class vx1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ hv1 Z;
    public long c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vx1(hv1 hv1Var, long j, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = hv1Var;
        this.c0 = j;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((vx1) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((vx1) t(j11Var, o31Var)).v(o27Var);
            case 2:
                return ((vx1) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((vx1) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new vx1(this.Z, this.c0, j11Var, 0);
            case 1:
                return new vx1(this.Z, this.c0, j11Var, 1);
            case 2:
                return new vx1(this.Z, this.c0, j11Var, 2);
            default:
                return new vx1(this.Z, j11Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0199, code lost:
        if (defpackage.hv1.Q(r6, r2, r11) == r7) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0120, code lost:
        if (r12 == r7) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0152, code lost:
        if (r12 == r7) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx1.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx1(hv1 hv1Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 3;
        this.Z = hv1Var;
    }
}
