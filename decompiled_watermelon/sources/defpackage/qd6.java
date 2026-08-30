package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qd6  reason: default package */
/* loaded from: classes.dex */
public final class qd6 implements ho {
    public final ho a;
    public final long b;

    public qd6(y72 y72Var, long j) {
        this.a = y72Var;
        this.b = j;
    }

    @Override // defpackage.ho
    public final j77 a(bz6 bz6Var) {
        return new rd6(this.a.a(bz6Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qd6)) {
            return false;
        }
        qd6 qd6Var = (qd6) obj;
        if (qd6Var.b != this.b || !b53.x(qd6Var.a, this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
