package defpackage;

import android.net.NetworkRequest;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kz0  reason: default package */
/* loaded from: classes.dex */
public final class kz0 {
    public static final kz0 j = new kz0();
    public final v64 a;
    public final m64 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public kz0(kz0 kz0Var) {
        kz0Var.getClass();
        this.c = kz0Var.c;
        this.d = kz0Var.d;
        this.b = kz0Var.b;
        this.a = kz0Var.a;
        this.e = kz0Var.e;
        this.f = kz0Var.f;
        this.i = kz0Var.i;
        this.g = kz0Var.g;
        this.h = kz0Var.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kz0.class.equals(obj.getClass())) {
            return false;
        }
        kz0 kz0Var = (kz0) obj;
        if (this.c != kz0Var.c || this.d != kz0Var.d || this.e != kz0Var.e || this.f != kz0Var.f || this.g != kz0Var.g || this.h != kz0Var.h || !b53.x(a(), kz0Var.a()) || this.a != kz0Var.a) {
            return false;
        }
        return b53.x(this.i, kz0Var.i);
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

    public kz0(m64 m64Var, v64 v64Var, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        v64Var.getClass();
        this.b = m64Var;
        this.a = v64Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public kz0() {
        v64 v64Var = v64.NOT_REQUIRED;
        v64Var.getClass();
        this.b = new m64(null);
        this.a = v64Var;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = up1.A;
    }
}
