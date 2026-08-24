package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w21  reason: default package */
/* loaded from: classes.dex */
public final class w21 extends x21 {
    public final int a;

    public w21(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w21) && this.a == ((w21) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return xg6.q(new StringBuilder("ConstraintsNotMet(reason="), this.a, ')');
    }
}
