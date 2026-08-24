package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k71  reason: default package */
/* loaded from: classes.dex */
public final class k71 extends lb4 {
    public final c40 o;

    public k71(c40 c40Var) {
        this.o = c40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k71) && nb3.k(this.o, ((k71) obj).o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.o.a);
    }

    @Override // defpackage.lb4
    public final int m(int i, int i2, kk3 kk3Var) {
        return this.o.a(i2, i, kk3Var);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.o + ')';
    }
}
