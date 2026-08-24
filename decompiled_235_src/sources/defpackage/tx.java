package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tx  reason: default package */
/* loaded from: classes.dex */
public final class tx {
    public final int a;

    public tx(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof tx) && this.a == ((tx) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a ^ 1000003) * 1000003;
    }

    public final String toString() {
        return lb1.o(new StringBuilder("StateError{code="), this.a, ", cause=null}");
    }
}
