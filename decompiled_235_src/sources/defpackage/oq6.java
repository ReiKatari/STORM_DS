package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oq6  reason: default package */
/* loaded from: classes.dex */
public final class oq6 implements nk7 {
    public final Object a;

    public oq6(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.nk7
    public final Object a(xv4 xv4Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof oq6) && nb3.k(this.a, ((oq6) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
