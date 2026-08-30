package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dl3  reason: default package */
/* loaded from: classes.dex */
public final class dl3 implements il3 {
    public final pz4 a;
    public final kl3 b;

    public dl3(pz4 pz4Var) {
        pz4Var.getClass();
        this.a = pz4Var;
        this.b = new kl3(pz4Var.a, pz4Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dl3) && b53.x(this.a, ((dl3) obj).a)) {
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
        return "Pending(event=" + this.a + ")";
    }
}
