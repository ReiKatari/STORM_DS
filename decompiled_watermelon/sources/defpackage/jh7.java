package defpackage;

import java.util.HashSet;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jh7  reason: default package */
/* loaded from: classes.dex */
public final class jh7 {
    public final UUID a;
    public final ih7 b;
    public final HashSet c;
    public final g81 d;
    public final g81 e;
    public final int f;
    public final int g;
    public final kz0 h;
    public final long i;
    public final hh7 j;
    public final long k;
    public final int l;

    public jh7(UUID uuid, ih7 ih7Var, HashSet hashSet, g81 g81Var, g81 g81Var2, int i, int i2, kz0 kz0Var, long j, hh7 hh7Var, long j2, int i3) {
        ih7Var.getClass();
        g81Var.getClass();
        g81Var2.getClass();
        this.a = uuid;
        this.b = ih7Var;
        this.c = hashSet;
        this.d = g81Var;
        this.e = g81Var2;
        this.f = i;
        this.g = i2;
        this.h = kz0Var;
        this.i = j;
        this.j = hh7Var;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jh7.class.equals(obj.getClass())) {
            jh7 jh7Var = (jh7) obj;
            if (this.f == jh7Var.f && this.g == jh7Var.g && this.a.equals(jh7Var.a) && this.b == jh7Var.b && b53.x(this.d, jh7Var.d) && this.h.equals(jh7Var.h) && this.i == jh7Var.i && b53.x(this.j, jh7Var.j) && this.k == jh7Var.k && this.l == jh7Var.l && this.c.equals(jh7Var.c)) {
                return b53.x(this.e, jh7Var.e);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.h.hashCode();
        int c = b31.c(this.i, (hashCode5 + ((((((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, 31);
        hh7 hh7Var = this.j;
        if (hh7Var != null) {
            i = hh7Var.hashCode();
        } else {
            i = 0;
        }
        return Integer.hashCode(this.l) + b31.c(this.k, (c + i) * 31, 31);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
