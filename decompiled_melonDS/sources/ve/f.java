package ve;

import java.util.Map;
import java.util.UUID;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: h  reason: collision with root package name */
    public static final UUID f13797h = new UUID(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final UUID f13798a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13799b;

    /* renamed from: c  reason: collision with root package name */
    public final e f13800c;

    /* renamed from: d  reason: collision with root package name */
    public final d f13801d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13802e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13803f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f13804g;

    public f(UUID uuid, String str, e eVar, d dVar, boolean z10, int i2, Map map) {
        eVar.getClass();
        dVar.getClass();
        this.f13798a = uuid;
        this.f13799b = str;
        this.f13800c = eVar;
        this.f13801d = dVar;
        this.f13802e = z10;
        this.f13803f = i2;
        this.f13804g = map;
    }

    public static f a(f fVar, UUID uuid, String str, d dVar, boolean z10, int i2, Map map, int i10) {
        if ((i10 & 1) != 0) {
            uuid = fVar.f13798a;
        }
        UUID uuid2 = uuid;
        if ((i10 & 2) != 0) {
            str = fVar.f13799b;
        }
        String str2 = str;
        e eVar = fVar.f13800c;
        if ((i10 & 8) != 0) {
            dVar = fVar.f13801d;
        }
        d dVar2 = dVar;
        if ((i10 & 16) != 0) {
            z10 = fVar.f13802e;
        }
        boolean z11 = z10;
        if ((i10 & 32) != 0) {
            i2 = fVar.f13803f;
        }
        int i11 = i2;
        if ((i10 & 64) != 0) {
            map = fVar.f13804g;
        }
        eVar.getClass();
        dVar2.getClass();
        return new f(uuid2, str2, eVar, dVar2, z11, i11, map);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (!nc.k.a(this.f13798a, fVar.f13798a) || !nc.k.a(this.f13799b, fVar.f13799b) || this.f13800c != fVar.f13800c || this.f13801d != fVar.f13801d || this.f13802e != fVar.f13802e || this.f13803f != fVar.f13803f || !this.f13804g.equals(fVar.f13804g)) {
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
        int i2 = 0;
        UUID uuid = this.f13798a;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.f13799b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return this.f13804g.hashCode() + w.d.c(this.f13803f, w.d.e((this.f13801d.hashCode() + ((this.f13800c.hashCode() + ((i10 + i2) * 31)) * 31)) * 31, this.f13802e, 31), 31);
    }

    public final String toString() {
        return "LayoutConfiguration(id=" + this.f13798a + ", name=" + this.f13799b + ", type=" + this.f13800c + ", orientation=" + this.f13801d + ", useCustomOpacity=" + this.f13802e + ", opacity=" + this.f13803f + ", layoutVariants=" + this.f13804g + ")";
    }
}
