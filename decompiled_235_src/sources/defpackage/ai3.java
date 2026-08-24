package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ai3  reason: default package */
/* loaded from: classes.dex */
public final class ai3 {
    public final Float a;
    public hr1 b;

    public ai3(Float f, hr1 hr1Var) {
        this.a = f;
        this.b = hr1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ai3) {
            ai3 ai3Var = (ai3) obj;
            if (ai3Var.a.equals(this.a) && nb3.k(ai3Var.b, this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + lb1.a(0, this.a.hashCode() * 31, 31);
    }
}
