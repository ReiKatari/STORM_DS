package defpackage;

import android.net.NetworkRequest;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p21  reason: default package */
/* loaded from: classes.dex */
public final class p21 {
    public static final p21 j = new p21();
    public final kf4 a;
    public final af4 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public p21(p21 p21Var) {
        p21Var.getClass();
        this.c = p21Var.c;
        this.d = p21Var.d;
        this.b = p21Var.b;
        this.a = p21Var.a;
        this.e = p21Var.e;
        this.f = p21Var.f;
        this.i = p21Var.i;
        this.g = p21Var.g;
        this.h = p21Var.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p21.class.equals(obj.getClass())) {
            return false;
        }
        p21 p21Var = (p21) obj;
        if (this.c != p21Var.c || this.d != p21Var.d || this.e != p21Var.e || this.f != p21Var.f || this.g != p21Var.g || this.h != p21Var.h || !nb3.k(a(), p21Var.a()) || this.a != p21Var.a) {
            return false;
        }
        return nb3.k(this.i, p21Var.i);
    }

    public final int hashCode() {
        int i;
        long j2 = this.g;
        long j3 = this.h;
        int hashCode = (this.i.hashCode() + (((((((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest a = a();
        if (a != null) {
            i = a.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public p21(af4 af4Var, kf4 kf4Var, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        kf4Var.getClass();
        this.b = af4Var;
        this.a = kf4Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public p21() {
        kf4 kf4Var = kf4.NOT_REQUIRED;
        kf4Var.getClass();
        this.b = new af4(null);
        this.a = kf4Var;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = du1.A;
    }
}
