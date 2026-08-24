package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j35  reason: default package */
/* loaded from: classes.dex */
public final class j35 {
    public final int a;

    public j35(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j35)) {
            return false;
        }
        if (this.a != ((j35) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
