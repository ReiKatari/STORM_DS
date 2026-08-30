package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fl3  reason: default package */
/* loaded from: classes.dex */
public final class fl3 implements il3 {
    public final oz4 a;
    public final kl3 b;

    public fl3(oz4 oz4Var) {
        oz4Var.getClass();
        this.a = oz4Var;
        this.b = new kl3(oz4Var.a, oz4Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fl3) && b53.x(this.a, ((fl3) obj).a)) {
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
        return "Started(event=" + this.a + ")";
    }
}
