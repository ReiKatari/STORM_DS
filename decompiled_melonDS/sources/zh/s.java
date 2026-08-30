package zh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final r f15135a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15136b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15137c;

    public s(r rVar, String str, String str2) {
        rVar.getClass();
        this.f15135a = rVar;
        this.f15136b = str;
        this.f15137c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f15135a == sVar.f15135a && nc.k.a(this.f15136b, sVar.f15136b) && nc.k.a(this.f15137c, sVar.f15137c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f15135a.hashCode() * 31;
        int i2 = 0;
        String str = this.f15136b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        String str2 = this.f15137c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i10 + i2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RomGbaSlotConfigUiModel(type=");
        sb2.append(this.f15135a);
        sb2.append(", gbaRomPath=");
        sb2.append(this.f15136b);
        sb2.append(", gbaSavePath=");
        return w.d.s(sb2, this.f15137c, ")");
    }
}
