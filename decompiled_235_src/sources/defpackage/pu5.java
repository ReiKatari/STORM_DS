package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pu5  reason: default package */
/* loaded from: classes.dex */
public final class pu5 extends tu5 {
    public final Boolean a;

    public pu5(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pu5) && nb3.k(this.a, ((pu5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "ThreadedRenderingUpdate(threadedRendering=" + this.a + ")";
    }
}
