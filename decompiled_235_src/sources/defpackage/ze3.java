package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ze3  reason: default package */
/* loaded from: classes.dex */
public final class ze3 extends ee3 {
    public final aw3 A;

    public ze3() {
        zh2 zh2Var = aw3.e0;
        this.A = new aw3(false);
    }

    public final void d(String str, ee3 ee3Var) {
        if (ee3Var == null) {
            ee3Var = ve3.A;
        }
        this.A.put(str, ee3Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof ze3) || !((ze3) obj).A.equals(this.A)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }
}
