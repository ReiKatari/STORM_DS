package defpackage;

import java.util.HashSet;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jw7  reason: default package */
/* loaded from: classes.dex */
public final class jw7 {
    public final UUID a;
    public final iw7 b;
    public final HashSet c;
    public final xb1 d;
    public final xb1 e;
    public final int f;
    public final int g;
    public final p21 h;
    public final long i;
    public final hw7 j;
    public final long k;
    public final int l;

    public jw7(UUID uuid, iw7 iw7Var, HashSet hashSet, xb1 xb1Var, xb1 xb1Var2, int i, int i2, p21 p21Var, long j, hw7 hw7Var, long j2, int i3) {
        iw7Var.getClass();
        xb1Var.getClass();
        xb1Var2.getClass();
        this.a = uuid;
        this.b = iw7Var;
        this.c = hashSet;
        this.d = xb1Var;
        this.e = xb1Var2;
        this.f = i;
        this.g = i2;
        this.h = p21Var;
        this.i = j;
        this.j = hw7Var;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jw7.class.equals(obj.getClass())) {
            jw7 jw7Var = (jw7) obj;
            if (this.f == jw7Var.f && this.g == jw7Var.g && this.a.equals(jw7Var.a) && this.b == jw7Var.b && nb3.k(this.d, jw7Var.d) && this.h.equals(jw7Var.h) && this.i == jw7Var.i && nb3.k(this.j, jw7Var.j) && this.k == jw7Var.k && this.l == jw7Var.l && this.c.equals(jw7Var.c)) {
                return nb3.k(this.e, jw7Var.e);
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
        int c = i61.c(this.i, (hashCode5 + ((((((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, 31);
        hw7 hw7Var = this.j;
        if (hw7Var != null) {
            i = hw7Var.hashCode();
        } else {
            i = 0;
        }
        return Integer.hashCode(this.l) + i61.c(this.k, (c + i) * 31, 31);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
