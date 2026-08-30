package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ib3  reason: default package */
/* loaded from: classes.dex */
public final class ib3 {
    public final Float a;
    public bn1 b;

    public ib3(Float f, bn1 bn1Var) {
        this.a = f;
        this.b = bn1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ib3) {
            ib3 ib3Var = (ib3) obj;
            if (ib3Var.a.equals(this.a) && b53.x(ib3Var.b, this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + wh1.a(0, this.a.hashCode() * 31, 31);
    }
}
