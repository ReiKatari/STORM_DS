package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs3  reason: default package */
/* loaded from: classes.dex */
public final class hs3 implements js3 {
    public final e95 a;
    public final ls3 b;

    public hs3(e95 e95Var) {
        e95Var.getClass();
        this.a = e95Var;
        this.b = new ls3(e95Var.a, e95Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hs3) && nb3.k(this.a, ((hs3) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.js3
    public final ls3 getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TrackerHidden(event=" + this.a + ")";
    }
}
