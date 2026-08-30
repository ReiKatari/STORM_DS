package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u84  reason: default package */
/* loaded from: classes.dex */
public final class u84 extends dz6 {
    public static final s84 b = new s84(0, new u84(wt6.LAZILY_PARSED_NUMBER));
    public final xt6 a;

    public u84(xt6 xt6Var) {
        this.a = xt6Var;
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        q83 n0 = o83Var.n0();
        int i = t84.a[n0.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                StringBuilder sb = new StringBuilder("Expecting number, got: ");
                sb.append(n0);
                String D = o83Var.D();
                sb.append("; at path ");
                sb.append(D);
                throw new RuntimeException(sb.toString());
            }
            return this.a.readNumber(o83Var);
        }
        o83Var.j0();
        return null;
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        b93Var.V((Number) obj);
    }
}
