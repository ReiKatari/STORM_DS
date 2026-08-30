package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cl3  reason: default package */
/* loaded from: classes.dex */
public final class cl3 implements il3 {
    public final tz4 a;
    public final kl3 b;

    public cl3(tz4 tz4Var) {
        tz4Var.getClass();
        this.a = tz4Var;
        this.b = new kl3(tz4Var.a, tz4Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cl3) && b53.x(this.a, ((cl3) obj).a)) {
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
        return "Failed(event=" + this.a + ")";
    }
}
