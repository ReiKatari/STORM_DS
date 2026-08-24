package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sx  reason: default package */
/* loaded from: classes.dex */
public final class sx {
    public final nh0 a;
    public final tx b;

    public sx(nh0 nh0Var, tx txVar) {
        if (nh0Var != null) {
            this.a = nh0Var;
            this.b = txVar;
            return;
        }
        u34.x("Null type");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof sx) {
                sx sxVar = (sx) obj;
                if (this.a.equals(sxVar.a)) {
                    tx txVar = sxVar.b;
                    tx txVar2 = this.b;
                    if (txVar2 == null) {
                        if (txVar == null) {
                            return true;
                        }
                        return false;
                    } else if (txVar2.equals(txVar)) {
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
        tx txVar = this.b;
        if (txVar == null) {
            hashCode = 0;
        } else {
            hashCode = txVar.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        return "CameraState{type=" + this.a + ", error=" + this.b + "}";
    }
}
