package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vh7  reason: default package */
/* loaded from: classes.dex */
public final class vh7 {
    public String a;
    public ih7 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh7)) {
            return false;
        }
        vh7 vh7Var = (vh7) obj;
        if (b53.x(this.a, vh7Var.a) && this.b == vh7Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
