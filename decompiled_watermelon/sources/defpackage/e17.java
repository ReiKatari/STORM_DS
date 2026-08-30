package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e17  reason: default package */
/* loaded from: classes.dex */
public final class e17 implements Comparable {
    public final byte A;

    public /* synthetic */ e17(byte b) {
        this.A = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return b53.E(this.A & 255, ((e17) obj).A & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e17) {
            if (this.A != ((e17) obj).A) {
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
