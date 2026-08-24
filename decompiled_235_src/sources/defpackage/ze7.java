package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ze7  reason: default package */
/* loaded from: classes.dex */
public final class ze7 implements Comparable {
    public final byte A;

    public /* synthetic */ ze7(byte b) {
        this.A = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return nb3.p(this.A & 255, ((ze7) obj).A & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ze7) {
            if (this.A != ((ze7) obj).A) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.A);
    }

    public final String toString() {
        return String.valueOf(this.A & 255);
    }
}
