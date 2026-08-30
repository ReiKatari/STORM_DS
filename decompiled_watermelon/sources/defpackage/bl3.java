package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bl3  reason: default package */
/* loaded from: classes.dex */
public final class bl3 implements il3 {
    public final mz4 a;
    public final kl3 b;

    public bl3(mz4 mz4Var) {
        mz4Var.getClass();
        this.a = mz4Var;
        this.b = new kl3(mz4Var.a, mz4Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bl3) && b53.x(this.a, ((bl3) obj).a)) {
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
        return "Canceled(event=" + this.a + ")";
    }
}
