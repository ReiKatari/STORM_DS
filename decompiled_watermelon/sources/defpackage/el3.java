package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: el3  reason: default package */
/* loaded from: classes.dex */
public final class el3 implements il3 {
    public final sz4 a;
    public final kl3 b;

    public el3(sz4 sz4Var) {
        sz4Var.getClass();
        this.a = sz4Var;
        this.b = new kl3(sz4Var.a, sz4Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof el3) && b53.x(this.a, ((el3) obj).a)) {
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
        return "Scoreboard(event=" + this.a + ")";
    }
}
