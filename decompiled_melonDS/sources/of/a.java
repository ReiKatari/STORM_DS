package of;

import af.f;
import af.h;
import java.util.UUID;
import nc.k;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {
    @va.b("runtimeConsoleType")

    /* renamed from: a  reason: collision with root package name */
    private final f f10967a;
    @va.b("runtimeMicSource")

    /* renamed from: b  reason: collision with root package name */
    private final h f10968b;
    @va.b("layoutId")

    /* renamed from: c  reason: collision with root package name */
    private final String f10969c;
    @va.b("gbaSlotConfig")

    /* renamed from: d  reason: collision with root package name */
    private final c f10970d;
    @va.b("customName")

    /* renamed from: e  reason: collision with root package name */
    private final String f10971e;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* renamed from: of.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0019a {
    }

    public a(f fVar, h hVar, String str, c cVar, String str2) {
        fVar.getClass();
        hVar.getClass();
        this.f10967a = fVar;
        this.f10968b = hVar;
        this.f10969c = str;
        this.f10970d = cVar;
        this.f10971e = str2;
    }

    public static a a(a aVar, f fVar) {
        h hVar = aVar.f10968b;
        String str = aVar.f10969c;
        c cVar = aVar.f10970d;
        String str2 = aVar.f10971e;
        aVar.getClass();
        fVar.getClass();
        hVar.getClass();
        cVar.getClass();
        return new a(fVar, hVar, str, cVar, str2);
    }

    public final af.a b() {
        UUID uuid;
        f fVar = this.f10967a;
        h hVar = this.f10968b;
        String str = this.f10969c;
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        return new af.a(fVar, hVar, uuid, this.f10970d.a(), this.f10971e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f10967a == aVar.f10967a && this.f10968b == aVar.f10968b && k.a(this.f10969c, aVar.f10969c) && k.a(this.f10970d, aVar.f10970d) && k.a(this.f10971e, aVar.f10971e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f10968b.hashCode() + (this.f10967a.hashCode() * 31)) * 31;
        String str = this.f10969c;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (this.f10970d.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        String str2 = this.f10971e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        f fVar = this.f10967a;
        h hVar = this.f10968b;
        String str = this.f10969c;
        c cVar = this.f10970d;
        String str2 = this.f10971e;
        StringBuilder sb2 = new StringBuilder("RomConfigDto(runtimeConsoleType=");
        sb2.append(fVar);
        sb2.append(", runtimeMicSource=");
        sb2.append(hVar);
        sb2.append(", layoutId=");
        sb2.append(str);
        sb2.append(", gbaSlotConfig=");
        sb2.append(cVar);
        sb2.append(", customName=");
        return d.s(sb2, str2, ")");
    }
}
