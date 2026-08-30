package bg;

import android.net.Uri;
import java.util.UUID;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: g  reason: collision with root package name */
    public static final int f2211g = 8;
    @va.b("a")

    /* renamed from: a  reason: collision with root package name */
    private final af.f f2212a;
    @va.b("b")

    /* renamed from: b  reason: collision with root package name */
    private final af.h f2213b;
    @va.b("c")

    /* renamed from: c  reason: collision with root package name */
    private final UUID f2214c;
    @va.b("d")

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2215d;
    @va.b("e")

    /* renamed from: e  reason: collision with root package name */
    private final Uri f2216e;
    @va.b("f")

    /* renamed from: f  reason: collision with root package name */
    private final Uri f2217f;

    public c(af.f fVar, af.h hVar, UUID uuid, boolean z10, Uri uri, Uri uri2) {
        fVar.getClass();
        hVar.getClass();
        this.f2212a = fVar;
        this.f2213b = hVar;
        this.f2214c = uuid;
        this.f2215d = z10;
        this.f2216e = uri;
        this.f2217f = uri2;
    }

    public static /* synthetic */ c h(c cVar, af.f fVar, af.h hVar, UUID uuid, boolean z10, Uri uri, Uri uri2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fVar = cVar.f2212a;
        }
        if ((i2 & 2) != 0) {
            hVar = cVar.f2213b;
        }
        if ((i2 & 4) != 0) {
            uuid = cVar.f2214c;
        }
        if ((i2 & 8) != 0) {
            z10 = cVar.f2215d;
        }
        if ((i2 & 16) != 0) {
            uri = cVar.f2216e;
        }
        if ((i2 & 32) != 0) {
            uri2 = cVar.f2217f;
        }
        Uri uri3 = uri;
        Uri uri4 = uri2;
        return cVar.g(fVar, hVar, uuid, z10, uri3, uri4);
    }

    public final af.f a() {
        return this.f2212a;
    }

    public final af.h b() {
        return this.f2213b;
    }

    public final UUID c() {
        return this.f2214c;
    }

    public final boolean d() {
        return this.f2215d;
    }

    public final Uri e() {
        return this.f2216e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2212a == cVar.f2212a && this.f2213b == cVar.f2213b && k.a(this.f2214c, cVar.f2214c) && this.f2215d == cVar.f2215d && k.a(this.f2216e, cVar.f2216e) && k.a(this.f2217f, cVar.f2217f)) {
            return true;
        }
        return false;
    }

    public final Uri f() {
        return this.f2217f;
    }

    public final c g(af.f fVar, af.h hVar, UUID uuid, boolean z10, Uri uri, Uri uri2) {
        fVar.getClass();
        hVar.getClass();
        return new c(fVar, hVar, uuid, z10, uri, uri2);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f2213b.hashCode() + (this.f2212a.hashCode() * 31)) * 31;
        UUID uuid = this.f2214c;
        int i2 = 0;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        int e6 = w.d.e((hashCode3 + hashCode) * 31, this.f2215d, 31);
        Uri uri = this.f2216e;
        if (uri == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uri.hashCode();
        }
        int i10 = (e6 + hashCode2) * 31;
        Uri uri2 = this.f2217f;
        if (uri2 != null) {
            i2 = uri2.hashCode();
        }
        return i10 + i2;
    }

    public final Uri i() {
        return this.f2216e;
    }

    public final Uri j() {
        return this.f2217f;
    }

    public final UUID k() {
        return this.f2214c;
    }

    public final boolean l() {
        return this.f2215d;
    }

    public final af.f m() {
        return this.f2212a;
    }

    public final af.h n() {
        return this.f2213b;
    }

    public String toString() {
        af.f fVar = this.f2212a;
        af.h hVar = this.f2213b;
        UUID uuid = this.f2214c;
        boolean z10 = this.f2215d;
        Uri uri = this.f2216e;
        Uri uri2 = this.f2217f;
        return "RomConfig1(runtimeConsoleType=" + fVar + ", runtimeMicSource=" + hVar + ", layoutId=" + uuid + ", loadGbaCart=" + z10 + ", gbaCartPath=" + uri + ", gbaSavePath=" + uri2 + ")";
    }
}
