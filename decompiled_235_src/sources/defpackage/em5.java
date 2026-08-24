package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: em5  reason: default package */
/* loaded from: classes.dex */
public final class em5 implements Serializable {
    public final Throwable A;

    public em5(Throwable th) {
        th.getClass();
        this.A = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof em5) {
            if (nb3.k(this.A, ((em5) obj).A)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.A + ')';
    }
}
