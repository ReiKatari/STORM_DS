package u9;

import android.animation.TimeInterpolator;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f13516a;

    /* renamed from: b  reason: collision with root package name */
    public long f13517b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f13518c;

    /* renamed from: d  reason: collision with root package name */
    public int f13519d;

    /* renamed from: e  reason: collision with root package name */
    public int f13520e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f13518c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return a.f13511b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f13516a != cVar.f13516a || this.f13517b != cVar.f13517b || this.f13519d != cVar.f13519d || this.f13520e != cVar.f13520e) {
            return false;
        }
        return a().getClass().equals(cVar.a().getClass());
    }

    public final int hashCode() {
        long j2 = this.f13516a;
        long j10 = this.f13517b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f13519d) * 31) + this.f13520e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(c.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f13516a);
        sb2.append(" duration: ");
        sb2.append(this.f13517b);
        sb2.append(" interpolator: ");
        sb2.append(a().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f13519d);
        sb2.append(" repeatMode: ");
        return d.q(sb2, this.f13520e, "}\n");
    }
}
