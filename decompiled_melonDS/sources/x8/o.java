package x8;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import p8.d0;
import p8.e0;
import p8.f0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f14403a;

    /* renamed from: b  reason: collision with root package name */
    public final e0 f14404b;

    /* renamed from: c  reason: collision with root package name */
    public final p8.h f14405c;

    /* renamed from: d  reason: collision with root package name */
    public final long f14406d;

    /* renamed from: e  reason: collision with root package name */
    public final long f14407e;

    /* renamed from: f  reason: collision with root package name */
    public final long f14408f;

    /* renamed from: g  reason: collision with root package name */
    public final p8.e f14409g;

    /* renamed from: h  reason: collision with root package name */
    public final int f14410h;

    /* renamed from: i  reason: collision with root package name */
    public final p8.a f14411i;

    /* renamed from: j  reason: collision with root package name */
    public final long f14412j;

    /* renamed from: k  reason: collision with root package name */
    public final long f14413k;

    /* renamed from: l  reason: collision with root package name */
    public final int f14414l;
    public final int m;

    /* renamed from: n  reason: collision with root package name */
    public final long f14415n;

    /* renamed from: o  reason: collision with root package name */
    public final int f14416o;

    /* renamed from: p  reason: collision with root package name */
    public final List f14417p;

    /* renamed from: q  reason: collision with root package name */
    public final List f14418q;

    public o(String str, e0 e0Var, p8.h hVar, long j2, long j10, long j11, p8.e eVar, int i2, p8.a aVar, long j12, long j13, int i10, int i11, long j14, int i12, List list, List list2) {
        str.getClass();
        e0Var.getClass();
        hVar.getClass();
        aVar.getClass();
        this.f14403a = str;
        this.f14404b = e0Var;
        this.f14405c = hVar;
        this.f14406d = j2;
        this.f14407e = j10;
        this.f14408f = j11;
        this.f14409g = eVar;
        this.f14410h = i2;
        this.f14411i = aVar;
        this.f14412j = j12;
        this.f14413k = j13;
        this.f14414l = i10;
        this.m = i11;
        this.f14415n = j14;
        this.f14416o = i12;
        this.f14417p = list;
        this.f14418q = list2;
    }

    public final f0 a() {
        p8.h hVar;
        d0 d0Var;
        int i2;
        long j2;
        long j10;
        boolean z10;
        boolean z11;
        List list = this.f14418q;
        if (!list.isEmpty()) {
            hVar = (p8.h) list.get(0);
        } else {
            hVar = p8.h.f11493b;
        }
        p8.h hVar2 = hVar;
        UUID fromString = UUID.fromString(this.f14403a);
        fromString.getClass();
        HashSet hashSet = new HashSet(this.f14417p);
        long j11 = this.f14407e;
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i10 != 0) {
            d0Var = new d0(j11, this.f14408f);
        } else {
            d0Var = null;
        }
        e0 e0Var = e0.ENQUEUED;
        int i11 = this.f14410h;
        long j12 = this.f14406d;
        e0 e0Var2 = this.f14404b;
        if (e0Var2 == e0Var) {
            wa.b bVar = p.f14419z;
            if (e0Var2 == e0Var && i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            j2 = j12;
            j10 = p7.k.e(z10, i11, this.f14411i, this.f14412j, this.f14413k, this.f14414l, z11, j2, this.f14408f, j11, this.f14415n);
            i2 = i11;
        } else {
            i2 = i11;
            j2 = j12;
            j10 = Long.MAX_VALUE;
        }
        return new f0(fromString, this.f14404b, hashSet, this.f14405c, hVar2, i2, this.m, this.f14409g, j2, d0Var, j10, this.f14416o);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (!nc.k.a(this.f14403a, oVar.f14403a) || this.f14404b != oVar.f14404b || !nc.k.a(this.f14405c, oVar.f14405c) || this.f14406d != oVar.f14406d || this.f14407e != oVar.f14407e || this.f14408f != oVar.f14408f || !this.f14409g.equals(oVar.f14409g) || this.f14410h != oVar.f14410h || this.f14411i != oVar.f14411i || this.f14412j != oVar.f14412j || this.f14413k != oVar.f14413k || this.f14414l != oVar.f14414l || this.m != oVar.m || this.f14415n != oVar.f14415n || this.f14416o != oVar.f14416o || !this.f14417p.equals(oVar.f14417p) || !this.f14418q.equals(oVar.f14418q)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f14404b.hashCode();
        int hashCode2 = this.f14405c.hashCode();
        int f8 = w.d.f(this.f14408f, w.d.f(this.f14407e, w.d.f(this.f14406d, (hashCode2 + ((hashCode + (this.f14403a.hashCode() * 31)) * 31)) * 31, 31), 31), 31);
        int c4 = w.d.c(this.f14410h, (this.f14409g.hashCode() + f8) * 31, 31);
        int c10 = w.d.c(this.f14416o, w.d.f(this.f14415n, w.d.c(this.m, w.d.c(this.f14414l, w.d.f(this.f14413k, w.d.f(this.f14412j, (this.f14411i.hashCode() + c4) * 31, 31), 31), 31), 31), 31), 31);
        return this.f14418q.hashCode() + ((this.f14417p.hashCode() + c10) * 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.f14403a + ", state=" + this.f14404b + ", output=" + this.f14405c + ", initialDelay=" + this.f14406d + ", intervalDuration=" + this.f14407e + ", flexDuration=" + this.f14408f + ", constraints=" + this.f14409g + ", runAttemptCount=" + this.f14410h + ", backoffPolicy=" + this.f14411i + ", backoffDelayDuration=" + this.f14412j + ", lastEnqueueTime=" + this.f14413k + ", periodCount=" + this.f14414l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.f14415n + ", stopReason=" + this.f14416o + ", tags=" + this.f14417p + ", progress=" + this.f14418q + ')';
    }
}
