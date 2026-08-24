package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jx3  reason: default package */
/* loaded from: classes.dex */
public final class jx3 extends mx3 {
    public final xb1 a;

    public jx3(xb1 xb1Var) {
        this.a = xb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jx3.class == obj.getClass()) {
            return this.a.equals(((jx3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (jx3.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }

    public jx3() {
        this(xb1.b);
    }
}
