package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nw4  reason: default package */
/* loaded from: classes.dex */
public final class nw4 implements ow4 {
    public final m8 a;
    public final d34 b;

    public nw4(m8 m8Var, d34 d34Var) {
        this.a = m8Var;
        this.b = d34Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw4)) {
            return false;
        }
        nw4 nw4Var = (nw4) obj;
        if (this.a == nw4Var.a && this.b == nw4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(activeCamera=" + this.a + ", token=" + this.b + ')';
    }
}
