package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gf0  reason: default package */
/* loaded from: classes.dex */
public final class gf0 {
    public final ud0 a;
    public final rw b;

    public gf0(ud0 ud0Var, rw rwVar) {
        ud0Var.getClass();
        this.a = ud0Var;
        this.b = rwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf0)) {
            return false;
        }
        gf0 gf0Var = (gf0) obj;
        if (this.a == gf0Var.a && b53.x(this.b, gf0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        rw rwVar = this.b;
        if (rwVar == null) {
            hashCode = 0;
        } else {
            hashCode = rwVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "CombinedCameraState(state=" + this.a + ", error=" + this.b + ')';
    }
}
