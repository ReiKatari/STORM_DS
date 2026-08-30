package p8;

import java.util.HashSet;
import java.util.UUID;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f11480a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f11481b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f11482c;

    /* renamed from: d  reason: collision with root package name */
    public final h f11483d;

    /* renamed from: e  reason: collision with root package name */
    public final h f11484e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11485f;

    /* renamed from: g  reason: collision with root package name */
    public final int f11486g;

    /* renamed from: h  reason: collision with root package name */
    public final e f11487h;

    /* renamed from: i  reason: collision with root package name */
    public final long f11488i;

    /* renamed from: j  reason: collision with root package name */
    public final d0 f11489j;

    /* renamed from: k  reason: collision with root package name */
    public final long f11490k;

    /* renamed from: l  reason: collision with root package name */
    public final int f11491l;

    public f0(UUID uuid, e0 e0Var, HashSet hashSet, h hVar, h hVar2, int i2, int i10, e eVar, long j2, d0 d0Var, long j10, int i11) {
        e0Var.getClass();
        hVar.getClass();
        hVar2.getClass();
        this.f11480a = uuid;
        this.f11481b = e0Var;
        this.f11482c = hashSet;
        this.f11483d = hVar;
        this.f11484e = hVar2;
        this.f11485f = i2;
        this.f11486g = i10;
        this.f11487h = eVar;
        this.f11488i = j2;
        this.f11489j = d0Var;
        this.f11490k = j10;
        this.f11491l = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f0.class.equals(obj.getClass())) {
            f0 f0Var = (f0) obj;
            if (this.f11485f == f0Var.f11485f && this.f11486g == f0Var.f11486g && this.f11480a.equals(f0Var.f11480a) && this.f11481b == f0Var.f11481b && nc.k.a(this.f11483d, f0Var.f11483d) && this.f11487h.equals(f0Var.f11487h) && this.f11488i == f0Var.f11488i && nc.k.a(this.f11489j, f0Var.f11489j) && this.f11490k == f0Var.f11490k && this.f11491l == f0Var.f11491l && this.f11482c.equals(f0Var.f11482c)) {
                return nc.k.a(this.f11484e, f0Var.f11484e);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.f11481b.hashCode();
        int hashCode2 = this.f11483d.hashCode();
        int hashCode3 = this.f11482c.hashCode();
        int hashCode4 = this.f11484e.hashCode();
        int hashCode5 = this.f11487h.hashCode();
        int f8 = w.d.f(this.f11488i, (hashCode5 + ((((((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f11480a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f11485f) * 31) + this.f11486g) * 31)) * 31, 31);
        d0 d0Var = this.f11489j;
        if (d0Var != null) {
            i2 = d0Var.hashCode();
        } else {
            i2 = 0;
        }
        return Integer.hashCode(this.f11491l) + w.d.f(this.f11490k, (f8 + i2) * 31, 31);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f11480a + "', state=" + this.f11481b + ", outputData=" + this.f11483d + ", tags=" + this.f11482c + ", progress=" + this.f11484e + ", runAttemptCount=" + this.f11485f + ", generation=" + this.f11486g + ", constraints=" + this.f11487h + ", initialDelayMillis=" + this.f11488i + ", periodicityInfo=" + this.f11489j + ", nextScheduleTimeMillis=" + this.f11490k + "}, stopReason=" + this.f11491l;
    }
}
