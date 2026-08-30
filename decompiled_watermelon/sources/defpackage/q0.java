package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q0  reason: default package */
/* loaded from: classes.dex */
public abstract class q0 implements c31 {
    public final d31 A;

    public q0(d31 d31Var) {
        this.A = d31Var;
    }

    @Override // defpackage.e31
    public final /* bridge */ e31 C(e31 e31Var) {
        return se.O(this, e31Var);
    }

    @Override // defpackage.e31
    public /* bridge */ c31 I(d31 d31Var) {
        return se.z(this, d31Var);
    }

    @Override // defpackage.e31
    public final Object N(aj2 aj2Var, Object obj) {
        return aj2Var.j(obj, this);
    }

    @Override // defpackage.e31
    public /* bridge */ e31 T(d31 d31Var) {
        return se.J(this, d31Var);
    }

    @Override // defpackage.c31
    public final d31 getKey() {
        return this.A;
    }
}
