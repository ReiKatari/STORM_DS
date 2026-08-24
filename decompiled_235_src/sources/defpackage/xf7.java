package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xf7  reason: default package */
/* loaded from: classes.dex */
public final class xf7 implements Comparable {
    public final short A;

    public /* synthetic */ xf7(short s) {
        this.A = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return nb3.p(this.A & 65535, ((xf7) obj).A & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xf7) {
            if (this.A != ((xf7) obj).A) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.A);
    }

    public final String toString() {
        return String.valueOf(this.A & 65535);
    }
}
