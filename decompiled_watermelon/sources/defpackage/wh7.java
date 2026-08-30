package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wh7  reason: default package */
/* loaded from: classes.dex */
public final class wh7 {
    public final String a;
    public final ih7 b;
    public final g81 c;
    public final long d;
    public final long e;
    public final long f;
    public final kz0 g;
    public final int h;
    public final f00 i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public wh7(String str, ih7 ih7Var, g81 g81Var, long j, long j2, long j3, kz0 kz0Var, int i, f00 f00Var, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        str.getClass();
        ih7Var.getClass();
        g81Var.getClass();
        f00Var.getClass();
        this.a = str;
        this.b = ih7Var;
        this.c = g81Var;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = kz0Var;
        this.h = i;
        this.i = f00Var;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = list2;
    }

    public final jh7 a() {
        g81 g81Var;
        hh7 hh7Var;
        int i;
        long j;
        long j2;
        boolean z;
        boolean z2;
        List list = this.q;
        if (!list.isEmpty()) {
            g81Var = (g81) list.get(0);
        } else {
            g81Var = g81.b;
        }
        g81 g81Var2 = g81Var;
        UUID fromString = UUID.fromString(this.a);
        fromString.getClass();
        HashSet hashSet = new HashSet(this.p);
        long j3 = this.e;
        int i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i2 != 0) {
            hh7Var = new hh7(j3, this.f);
        } else {
            hh7Var = null;
        }
        ih7 ih7Var = ih7.ENQUEUED;
        int i3 = this.h;
        long j4 = this.d;
        ih7 ih7Var2 = this.b;
        if (ih7Var2 == ih7Var) {
            vd6 vd6Var = xh7.z;
            if (ih7Var2 == ih7Var && i3 > 0) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            j = j4;
            j2 = uh7.c(z, i3, this.i, this.j, this.k, this.l, z2, j, this.f, j3, this.n);
            i = i3;
        } else {
            i = i3;
            j = j4;
            j2 = Long.MAX_VALUE;
        }
        return new jh7(fromString, this.b, hashSet, this.c, g81Var2, i, this.m, this.g, j, hh7Var, j2, this.o);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wh7) {
                wh7 wh7Var = (wh7) obj;
                if (!b53.x(this.a, wh7Var.a) || this.b != wh7Var.b || !b53.x(this.c, wh7Var.c) || this.d != wh7Var.d || this.e != wh7Var.e || this.f != wh7Var.f || !this.g.equals(wh7Var.g) || this.h != wh7Var.h || this.i != wh7Var.i || this.j != wh7Var.j || this.k != wh7Var.k || this.l != wh7Var.l || this.m != wh7Var.m || this.n != wh7Var.n || this.o != wh7Var.o || !this.p.equals(wh7Var.p) || !this.q.equals(wh7Var.q)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int c = b31.c(this.f, b31.c(this.e, b31.c(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31), 31);
        int a = wh1.a(this.h, (this.g.hashCode() + c) * 31, 31);
        return this.q.hashCode() + b31.b(wh1.a(this.o, b31.c(this.n, wh1.a(this.m, wh1.a(this.l, b31.c(this.k, b31.c(this.j, (this.i.hashCode() + a) * 31, 31), 31), 31), 31), 31), 31), 31, this.p);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
    }
}
