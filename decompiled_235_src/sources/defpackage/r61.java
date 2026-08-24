package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r61  reason: default package */
/* loaded from: classes.dex */
public final class r61 extends r0 {
    public static final q61 L = new Object();
    public final String B;

    public r61(String str) {
        super(L);
        this.B = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r61) && nb3.k(this.B, ((r61) obj).B)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    public final String toString() {
        return lb1.q(new StringBuilder("CoroutineName("), this.B, ')');
    }
}
