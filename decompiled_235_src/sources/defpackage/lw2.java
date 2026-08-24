package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lw2  reason: default package */
/* loaded from: classes.dex */
public final class lw2 {
    public final w60 a;
    public final gr1 b;
    public final gr1 c;

    public lw2(w60 w60Var, gr1 gr1Var, gr1 gr1Var2) {
        this.a = w60Var;
        this.b = gr1Var;
        this.c = gr1Var2;
        if (w60Var.b() == 0 && w60Var.a() == 0) {
            i.h("Bounds must be non zero");
            throw null;
        } else if (w60Var.a != 0 && w60Var.b != 0) {
            i.h("Bounding rectangle must start at the top or left window edge for folding features");
            throw null;
        }
    }

    public final gr1 a() {
        w60 w60Var = this.a;
        if (w60Var.b() > w60Var.a()) {
            return gr1.d0;
        }
        return gr1.Z;
    }

    public final boolean b() {
        gr1 gr1Var = gr1.h0;
        gr1 gr1Var2 = this.b;
        if (gr1Var2 == gr1Var || (gr1Var2 == gr1.g0 && this.c == gr1.f0)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (lw2.class.equals(cls)) {
            obj.getClass();
            lw2 lw2Var = (lw2) obj;
            if (this.a.equals(lw2Var.a) && this.b == lw2Var.b && this.c == lw2Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return lw2.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
