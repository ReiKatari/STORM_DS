package f1;

import android.content.Context;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4595a;

    /* renamed from: b  reason: collision with root package name */
    public final x4.c f4596b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4597c;

    /* renamed from: d  reason: collision with root package name */
    public final l1.d1 f4598d;

    public j(Context context, x4.c cVar, long j2, l1.d1 d1Var) {
        this.f4595a = context;
        this.f4596b = cVar;
        this.f4597c = j2;
        this.f4598d = d1Var;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!j.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        j jVar = (j) obj;
        if (nc.k.a(this.f4595a, jVar.f4595a) && nc.k.a(this.f4596b, jVar.f4596b) && i3.s.c(this.f4597c, jVar.f4597c) && nc.k.a(this.f4598d, jVar.f4598d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4596b.hashCode();
        int i2 = i3.s.f6688i;
        return this.f4598d.hashCode() + w.d.f(this.f4597c, (hashCode + (this.f4595a.hashCode() * 31)) * 31, 31);
    }
}
