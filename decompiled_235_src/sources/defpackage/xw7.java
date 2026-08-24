package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xw7  reason: default package */
/* loaded from: classes.dex */
public final class xw7 {
    public final String a;
    public final iw7 b;
    public final xb1 c;
    public final long d;
    public final long e;
    public final long f;
    public final p21 g;
    public final int h;
    public final w10 i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public xw7(String str, iw7 iw7Var, xb1 xb1Var, long j, long j2, long j3, p21 p21Var, int i, w10 w10Var, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        str.getClass();
        iw7Var.getClass();
        xb1Var.getClass();
        w10Var.getClass();
        this.a = str;
        this.b = iw7Var;
        this.c = xb1Var;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = p21Var;
        this.h = i;
        this.i = w10Var;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = list2;
    }

    public final jw7 a() {
        xb1 xb1Var;
        hw7 hw7Var;
        int i;
        long j;
        long j2;
        boolean z;
        boolean z2;
        List list = this.q;
        if (!list.isEmpty()) {
            xb1Var = (xb1) list.get(0);
        } else {
            xb1Var = xb1.b;
        }
        xb1 xb1Var2 = xb1Var;
        UUID fromString = UUID.fromString(this.a);
        fromString.getClass();
        HashSet hashSet = new HashSet(this.p);
        long j3 = this.e;
        int i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i2 != 0) {
            hw7Var = new hw7(j3, this.f);
        } else {
            hw7Var = null;
        }
        iw7 iw7Var = iw7.ENQUEUED;
        int i3 = this.h;
        long j4 = this.d;
        iw7 iw7Var2 = this.b;
        if (iw7Var2 == iw7Var) {
            fa6 fa6Var = yw7.z;
            if (iw7Var2 == iw7Var && i3 > 0) {
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
            j2 = vw7.c(z, i3, this.i, this.j, this.k, this.l, z2, j, this.f, j3, this.n);
            i = i3;
        } else {
            i = i3;
            j = j4;
            j2 = Long.MAX_VALUE;
        }
        return new jw7(fromString, this.b, hashSet, this.c, xb1Var2, i, this.m, this.g, j, hw7Var, j2, this.o);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xw7) {
                xw7 xw7Var = (xw7) obj;
                if (!nb3.k(this.a, xw7Var.a) || this.b != xw7Var.b || !nb3.k(this.c, xw7Var.c) || this.d != xw7Var.d || this.e != xw7Var.e || this.f != xw7Var.f || !this.g.equals(xw7Var.g) || this.h != xw7Var.h || this.i != xw7Var.i || this.j != xw7Var.j || this.k != xw7Var.k || this.l != xw7Var.l || this.m != xw7Var.m || this.n != xw7Var.n || this.o != xw7Var.o || !this.p.equals(xw7Var.p) || !this.q.equals(xw7Var.q)) {
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
        int c = i61.c(this.f, i61.c(this.e, i61.c(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31), 31);
        int a = lb1.a(this.h, (this.g.hashCode() + c) * 31, 31);
        return this.q.hashCode() + i61.b(lb1.a(this.o, i61.c(this.n, lb1.a(this.m, lb1.a(this.l, i61.c(this.k, i61.c(this.j, (this.i.hashCode() + a) * 31, 31), 31), 31), 31), 31), 31), this.p, 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
    }
}
