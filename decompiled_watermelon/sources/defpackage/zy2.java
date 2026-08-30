package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zy2  reason: default package */
/* loaded from: classes.dex */
public final class zy2 implements ho {
    public final jm1 a;
    public final ka5 b;

    public zy2(jm1 jm1Var, ka5 ka5Var) {
        this.a = jm1Var;
        this.b = ka5Var;
        if (jm1Var instanceof xy6) {
            xy6 xy6Var = (xy6) jm1Var;
            if (xy6Var.a == 0 && xy6Var.b == 0) {
                i.i("Animation to be infinitely repeated cannot have a 0-duration");
                throw null;
            }
        }
    }

    @Override // defpackage.ho
    public final j77 a(bz6 bz6Var) {
        return new n77(this.a.a(bz6Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zy2) {
            zy2 zy2Var = (zy2) obj;
            if (zy2Var.a.equals(this.a) && zy2Var.b == this.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Long.hashCode(0L) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }
}
