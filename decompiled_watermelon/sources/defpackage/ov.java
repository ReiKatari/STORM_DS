package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ov  reason: default package */
/* loaded from: classes.dex */
public final class ov extends pv {
    public final qi4 a;
    public final hi6 b;

    public ov(qi4 qi4Var, hi6 hi6Var) {
        this.a = qi4Var;
        this.b = hi6Var;
    }

    @Override // defpackage.pv
    public final qi4 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ov) {
                ov ovVar = (ov) obj;
                if (!this.a.equals(ovVar.a) || !this.b.equals(ovVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ')';
    }
}
