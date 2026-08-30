package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gl3  reason: default package */
/* loaded from: classes.dex */
public final class gl3 implements il3 {
    public final uz4 a;
    public final kl3 b;

    public gl3(uz4 uz4Var) {
        uz4Var.getClass();
        this.a = uz4Var;
        this.b = new kl3(uz4Var.a, uz4Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gl3) && b53.x(this.a, ((gl3) obj).a)) {
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
        return "TrackerHidden(event=" + this.a + ")";
    }
}
