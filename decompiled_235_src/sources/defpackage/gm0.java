package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gm0  reason: default package */
/* loaded from: classes.dex */
public final class gm0 {
    public static final fm0 b = new Object();
    public final Object a;

    public static final Object a(Object obj) {
        if (!(obj instanceof fm0)) {
            return obj;
        }
        return null;
    }

    public static final void b(Object obj) {
        if (!(obj instanceof fm0)) {
            return;
        }
        if (obj instanceof em0) {
            Throwable th = ((em0) obj).a;
            if (th == null) {
                i.m("Trying to call 'getOrThrow' on a channel closed without a cause");
                return;
            }
            throw th;
        }
        i.m("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gm0) {
            if (!nb3.k(this.a, ((gm0) obj).a)) {
                return false;
            }
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
        Object obj = this.a;
        if (obj instanceof em0) {
            return ((em0) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
