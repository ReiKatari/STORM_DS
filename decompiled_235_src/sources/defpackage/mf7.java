package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mf7  reason: default package */
/* loaded from: classes.dex */
public final class mf7 implements Comparable {
    public final int A;

    public /* synthetic */ mf7(int i) {
        this.A = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return nb3.p(this.A ^ Integer.MIN_VALUE, ((mf7) obj).A ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mf7) {
            if (this.A != ((mf7) obj).A) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.A);
    }

    public final String toString() {
        return String.valueOf(this.A & 4294967295L);
    }
}
