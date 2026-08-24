package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed  reason: default package */
/* loaded from: classes.dex */
public final class ed extends yh2 {
    public final int d;

    public ed(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ed) && ((ed) obj).d == this.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d * 31;
    }
}
