package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tq4  reason: default package */
/* loaded from: classes.dex */
public final class tq4 extends vq4 {
    public final i05 a;

    public tq4(i05 i05Var) {
        i05Var.getClass();
        this.a = i05Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tq4) && b53.x(this.a, ((tq4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GameMasteredPopup(event=" + this.a + ")";
    }
}
