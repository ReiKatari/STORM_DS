package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hm5  reason: default package */
/* loaded from: classes.dex */
public final class hm5 implements Serializable {
    public final Object A;

    public /* synthetic */ hm5(Object obj) {
        this.A = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof em5) {
            return ((em5) obj).A;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hm5) {
            if (!nb3.k(this.A, ((hm5) obj).A)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.A;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.A;
        if (obj instanceof em5) {
            return ((em5) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
