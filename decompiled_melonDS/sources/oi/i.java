package oi;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f11048a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11049b;

    public i(int i2, int i10) {
        this.f11048a = i2;
        this.f11049b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f11048a == iVar.f11048a && this.f11049b == iVar.f11049b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11049b) + (Integer.hashCode(this.f11048a) * 31);
    }

    public final String toString() {
        return "RASubmitLeaderboardEntryResponse(rank=" + this.f11048a + ", numEntries=" + this.f11049b + ")";
    }
}
