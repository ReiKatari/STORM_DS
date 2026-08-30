package af;

import java.util.UUID;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final f f707a;

    /* renamed from: b  reason: collision with root package name */
    public final h f708b;

    /* renamed from: c  reason: collision with root package name */
    public final UUID f709c;

    /* renamed from: d  reason: collision with root package name */
    public final a.a f710d;

    /* renamed from: e  reason: collision with root package name */
    public final String f711e;

    public a(f fVar, h hVar, UUID uuid, a.a aVar, String str) {
        fVar.getClass();
        hVar.getClass();
        aVar.getClass();
        this.f707a = fVar;
        this.f708b = hVar;
        this.f709c = uuid;
        this.f710d = aVar;
        this.f711e = str;
    }

    public static a a(a aVar, f fVar, h hVar, UUID uuid, a.a aVar2, String str, int i2) {
        if ((i2 & 1) != 0) {
            fVar = aVar.f707a;
        }
        f fVar2 = fVar;
        if ((i2 & 2) != 0) {
            hVar = aVar.f708b;
        }
        h hVar2 = hVar;
        if ((i2 & 4) != 0) {
            uuid = aVar.f709c;
        }
        UUID uuid2 = uuid;
        if ((i2 & 8) != 0) {
            aVar2 = aVar.f710d;
        }
        a.a aVar3 = aVar2;
        if ((i2 & 16) != 0) {
            str = aVar.f711e;
        }
        aVar.getClass();
        fVar2.getClass();
        hVar2.getClass();
        aVar3.getClass();
        return new a(fVar2, hVar2, uuid2, aVar3, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f707a == aVar.f707a && this.f708b == aVar.f708b && k.a(this.f709c, aVar.f709c) && k.a(this.f710d, aVar.f710d) && k.a(this.f711e, aVar.f711e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f708b.hashCode() + (this.f707a.hashCode() * 31)) * 31;
        int i2 = 0;
        UUID uuid = this.f709c;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        int hashCode3 = (this.f710d.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        String str = this.f711e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RomConfig(runtimeConsoleType=");
        sb2.append(this.f707a);
        sb2.append(", runtimeMicSource=");
        sb2.append(this.f708b);
        sb2.append(", layoutId=");
        sb2.append(this.f709c);
        sb2.append(", gbaSlotConfig=");
        sb2.append(this.f710d);
        sb2.append(", customName=");
        return w.d.s(sb2, this.f711e, ")");
    }

    public /* synthetic */ a(int i2) {
        this(f.DEFAULT, h.DEFAULT, null, d.f715b, (i2 & 16) != 0 ? null : "Layton Custom");
    }
}
