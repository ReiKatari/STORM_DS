package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hl3  reason: default package */
/* loaded from: classes.dex */
public final class hl3 implements il3 {
    public final qz4 a;
    public final kl3 b;

    public hl3(qz4 qz4Var) {
        qz4Var.getClass();
        this.a = qz4Var;
        this.b = new kl3(qz4Var.a, qz4Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hl3) && b53.x(this.a, ((hl3) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.il3
    public final kl3 getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Updated(event=" + this.a + ")";
    }
}
