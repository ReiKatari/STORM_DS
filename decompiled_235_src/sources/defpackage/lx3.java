package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lx3  reason: default package */
/* loaded from: classes.dex */
public final class lx3 extends mx3 {
    public final xb1 a = xb1.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lx3.class == obj.getClass()) {
            return this.a.equals(((lx3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (lx3.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
