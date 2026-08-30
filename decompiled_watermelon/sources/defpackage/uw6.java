package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uw6  reason: default package */
/* loaded from: classes.dex */
public final class uw6 {
    public final to a;
    public final pb4 b;

    public uw6(to toVar, pb4 pb4Var) {
        this.a = toVar;
        this.b = pb4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uw6) {
                uw6 uw6Var = (uw6) obj;
                if (!b53.x(this.a, uw6Var.a) || !this.b.equals(uw6Var.b)) {
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
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
