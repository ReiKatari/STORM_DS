package defpackage;

import android.animation.TimeInterpolator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b04  reason: default package */
/* loaded from: classes.dex */
public final class b04 {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return jo.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b04)) {
            return false;
        }
        b04 b04Var = (b04) obj;
        if (this.a != b04Var.a || this.b != b04Var.b || this.d != b04Var.d || this.e != b04Var.e) {
            return false;
        }
        return a().getClass().equals(b04Var.a().getClass());
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(b04.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return wh1.m(sb, this.e, "}\n");
    }
}
