package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n57  reason: default package */
/* loaded from: classes.dex */
public final class n57 implements k61 {
    public final ThreadLocal A;

    public n57(ThreadLocal threadLocal) {
        this.A = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n57) && nb3.k(this.A, ((n57) obj).A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.A + ')';
    }
}
