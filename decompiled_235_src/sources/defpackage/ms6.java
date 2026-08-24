package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ms6  reason: default package */
/* loaded from: classes.dex */
public final class ms6 implements bp {
    public final String a;

    public /* synthetic */ ms6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ms6) {
            if (!this.a.equals(((ms6) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return i61.k(')', "StringAnnotation(value=", this.a);
    }
}
