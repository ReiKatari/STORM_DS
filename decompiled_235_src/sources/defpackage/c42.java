package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c42  reason: default package */
/* loaded from: classes.dex */
public final class c42 {
    public final String a;

    public c42(String str) {
        if (str != null) {
            this.a = str;
        } else {
            u34.x("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c42)) {
            return false;
        }
        return this.a.equals(((c42) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return i61.n(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
