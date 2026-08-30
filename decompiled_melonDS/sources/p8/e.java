package p8;

import android.net.NetworkRequest;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: j  reason: collision with root package name */
    public static final e f11470j = new e();

    /* renamed from: a  reason: collision with root package name */
    public final w f11471a;

    /* renamed from: b  reason: collision with root package name */
    public final y8.f f11472b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11473c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11474d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11475e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11476f;

    /* renamed from: g  reason: collision with root package name */
    public final long f11477g;

    /* renamed from: h  reason: collision with root package name */
    public final long f11478h;

    /* renamed from: i  reason: collision with root package name */
    public final Set f11479i;

    public e(e eVar) {
        eVar.getClass();
        this.f11473c = eVar.f11473c;
        this.f11474d = eVar.f11474d;
        this.f11472b = eVar.f11472b;
        this.f11471a = eVar.f11471a;
        this.f11475e = eVar.f11475e;
        this.f11476f = eVar.f11476f;
        this.f11479i = eVar.f11479i;
        this.f11477g = eVar.f11477g;
        this.f11478h = eVar.f11478h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.f11472b.f14796a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !e.class.equals(obj.getClass())) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f11473c != eVar.f11473c || this.f11474d != eVar.f11474d || this.f11475e != eVar.f11475e || this.f11476f != eVar.f11476f || this.f11477g != eVar.f11477g || this.f11478h != eVar.f11478h || !nc.k.a(a(), eVar.a()) || this.f11471a != eVar.f11471a) {
            return false;
        }
        return nc.k.a(this.f11479i, eVar.f11479i);
    }

    public final int hashCode() {
        int i2;
        long j2 = this.f11477g;
        long j10 = this.f11478h;
        int hashCode = (this.f11479i.hashCode() + (((((((((((((this.f11471a.hashCode() * 31) + (this.f11473c ? 1 : 0)) * 31) + (this.f11474d ? 1 : 0)) * 31) + (this.f11475e ? 1 : 0)) * 31) + (this.f11476f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31;
        NetworkRequest a10 = a();
        if (a10 != null) {
            i2 = a10.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f11471a + ", requiresCharging=" + this.f11473c + ", requiresDeviceIdle=" + this.f11474d + ", requiresBatteryNotLow=" + this.f11475e + ", requiresStorageNotLow=" + this.f11476f + ", contentTriggerUpdateDelayMillis=" + this.f11477g + ", contentTriggerMaxDelayMillis=" + this.f11478h + ", contentUriTriggers=" + this.f11479i + ", }";
    }

    public e(y8.f fVar, w wVar, boolean z10, boolean z11, boolean z12, boolean z13, long j2, long j10, Set set) {
        wVar.getClass();
        this.f11472b = fVar;
        this.f11471a = wVar;
        this.f11473c = z10;
        this.f11474d = z11;
        this.f11475e = z12;
        this.f11476f = z13;
        this.f11477g = j2;
        this.f11478h = j10;
        this.f11479i = set;
    }

    public e() {
        w wVar = w.NOT_REQUIRED;
        wVar.getClass();
        this.f11472b = new y8.f(null);
        this.f11471a = wVar;
        this.f11473c = false;
        this.f11474d = false;
        this.f11475e = false;
        this.f11476f = false;
        this.f11477g = -1L;
        this.f11478h = -1L;
        this.f11479i = zb.s.A;
    }
}
