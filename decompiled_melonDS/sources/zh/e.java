package zh;

import java.util.UUID;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final af.f f15120a;

    /* renamed from: b  reason: collision with root package name */
    public final af.h f15121b;

    /* renamed from: c  reason: collision with root package name */
    public final UUID f15122c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15123d;

    /* renamed from: e  reason: collision with root package name */
    public final s f15124e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15125f;

    public e(af.f fVar, af.h hVar, UUID uuid, String str, s sVar, String str2) {
        fVar.getClass();
        hVar.getClass();
        this.f15120a = fVar;
        this.f15121b = hVar;
        this.f15122c = uuid;
        this.f15123d = str;
        this.f15124e = sVar;
        this.f15125f = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f15120a != eVar.f15120a || this.f15121b != eVar.f15121b || !nc.k.a(this.f15122c, eVar.f15122c) || !nc.k.a(this.f15123d, eVar.f15123d) || !this.f15124e.equals(eVar.f15124e) || !nc.k.a(this.f15125f, eVar.f15125f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f15121b.hashCode() + (this.f15120a.hashCode() * 31)) * 31;
        int i2 = 0;
        UUID uuid = this.f15122c;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        String str = this.f15123d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode4 = (this.f15124e.hashCode() + ((i10 + hashCode2) * 31)) * 31;
        String str2 = this.f15125f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "RomConfigUiModel(runtimeConsoleType=" + this.f15120a + ", runtimeMicSource=" + this.f15121b + ", layoutId=" + this.f15122c + ", layoutName=" + this.f15123d + ", gbaSlotConfig=" + this.f15124e + ", customName=" + this.f15125f + ")";
    }
}
