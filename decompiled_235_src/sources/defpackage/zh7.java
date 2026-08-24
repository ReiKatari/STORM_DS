package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zh7  reason: default package */
/* loaded from: classes.dex */
public final class zh7 implements bp {
    public final String a;

    public zh7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zh7) {
                if (!this.a.equals(((zh7) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lb1.q(new StringBuilder("UrlAnnotation(url="), this.a, ')');
    }
}
