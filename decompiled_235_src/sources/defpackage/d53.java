package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d53  reason: default package */
/* loaded from: classes.dex */
public final class d53 implements to {
    public final pq1 a;
    public final ck5 b;

    public d53(pq1 pq1Var, ck5 ck5Var) {
        this.a = pq1Var;
        this.b = ck5Var;
        if (pq1Var instanceof sc7) {
            sc7 sc7Var = (sc7) pq1Var;
            if (sc7Var.a == 0 && sc7Var.b == 0) {
                i.h("Animation to be infinitely repeated cannot have a 0-duration");
                throw null;
            }
        }
    }

    @Override // defpackage.to
    public final il7 a(wc7 wc7Var) {
        return new ml7(this.a.a(wc7Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d53) {
            d53 d53Var = (d53) obj;
            if (d53Var.a.equals(this.a) && d53Var.b == this.b) {
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
