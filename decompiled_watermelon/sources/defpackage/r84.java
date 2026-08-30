package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r84  reason: default package */
/* loaded from: classes.dex */
public final class r84 implements m93 {
    public final m93 a;
    public final i06 b;

    public r84(m93 m93Var) {
        m93Var.getClass();
        this.a = m93Var;
        this.b = new i06(m93Var.e());
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        if (b91Var.i()) {
            return b91Var.n(this.a);
        }
        return null;
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        if (obj != null) {
            mz1Var.l(this.a, obj);
        } else {
            mz1Var.g();
        }
    }

    @Override // defpackage.m93
    public final h06 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r84.class == obj.getClass() && b53.x(this.a, ((r84) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
