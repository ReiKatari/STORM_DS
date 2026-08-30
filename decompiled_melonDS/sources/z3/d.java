package z3;

import n2.f1;
import n2.s;
import p7.j;
import rd.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: b  reason: collision with root package name */
    public final k f14959b;

    /* renamed from: c  reason: collision with root package name */
    public final f1 f14960c = s.w(null);

    public d(k kVar) {
        this.f14959b = kVar;
    }

    @Override // p7.j
    public final boolean m(k kVar) {
        if (kVar == this.f14959b) {
            return true;
        }
        return false;
    }

    @Override // p7.j
    public final Object x(k kVar) {
        if (kVar != this.f14959b) {
            x3.a.c("Check failed.");
        }
        Object value = this.f14960c.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
