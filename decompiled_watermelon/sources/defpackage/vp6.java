package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vp6  reason: default package */
/* loaded from: classes.dex */
public final class vp6 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ bq6 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp6(bq6 bq6Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = bq6Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                long j = ((mb4) obj).a;
                return new vp6(this.Z, (j11) obj2, 0).v(o27Var);
            case 1:
                return ((vp6) t((j11) obj2, (o31) obj)).v(o27Var);
            default:
                return ((vp6) t((j11) obj2, (o31) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        bq6 bq6Var = this.Z;
        switch (i) {
            case 0:
                vp6 vp6Var = new vp6(bq6Var, j11Var, 0);
                long j = ((mb4) obj).a;
                return vp6Var;
            case 1:
                return new vp6(bq6Var, j11Var, 1);
            default:
                return new vp6(bq6Var, j11Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ce, code lost:
        if (r0 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x040e, code lost:
        if (r5.s(r45) == r1) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:?, code lost:
        return r1;
     */
    /* JADX WARN: Type inference failed for: r7v7, types: [y81, java.lang.Object] */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp6.v(java.lang.Object):java.lang.Object");
    }
}
