package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yf6  reason: default package */
/* loaded from: classes.dex */
public final class yf6 {
    public final wf6 a;
    public final xf6 b;

    public yf6(wf6 wf6Var, xf6 xf6Var) {
        wf6Var.getClass();
        xf6Var.getClass();
        this.a = wf6Var;
        this.b = xf6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf6)) {
            return false;
        }
        yf6 yf6Var = (yf6) obj;
        if (nb3.k(this.a, yf6Var.a) && nb3.k(this.b, yf6Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RenderConfigurationInputs(core=" + this.a + ", coverageFix=" + this.b + ")";
    }
}
