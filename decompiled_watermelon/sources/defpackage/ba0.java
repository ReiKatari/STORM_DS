package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ba0  reason: default package */
/* loaded from: classes.dex */
public final class ba0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba0(um umVar, long j, j11 j11Var) {
        super(2, j11Var);
        this.X = 1;
        this.c0 = umVar;
        this.Z = j;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((ba0) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((ba0) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((ba0) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.c0;
        switch (i) {
            case 0:
                return new ba0(this.Z, (ca0) obj2, j11Var, 0);
            case 1:
                return new ba0((um) obj2, this.Z, j11Var);
            default:
                return new ba0(this.Z, (sk6) obj2, j11Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (defpackage.dk7.q(r3 - 8, r11) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (defpackage.dk7.q(8, r11) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return r0;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba0.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba0(long j, Object obj, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = j;
        this.c0 = obj;
    }
}
