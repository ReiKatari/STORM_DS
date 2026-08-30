package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qw  reason: default package */
/* loaded from: classes.dex */
public final class qw {
    public final ef0 a;
    public final rw b;

    public qw(ef0 ef0Var, rw rwVar) {
        if (ef0Var != null) {
            this.a = ef0Var;
            this.b = rwVar;
            return;
        }
        c44.i("Null type");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof qw) {
                qw qwVar = (qw) obj;
                if (this.a.equals(qwVar.a)) {
                    rw rwVar = qwVar.b;
                    rw rwVar2 = this.b;
                    if (rwVar2 == null) {
                        if (rwVar == null) {
                            return true;
                        }
                        return false;
                    } else if (rwVar2.equals(rwVar)) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        rw rwVar = this.b;
        if (rwVar == null) {
            hashCode = 0;
        } else {
            hashCode = rwVar.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        return "CameraState{type=" + this.a + ", error=" + this.b + "}";
    }
}
