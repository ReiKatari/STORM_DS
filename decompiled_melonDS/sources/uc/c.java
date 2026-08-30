package uc;

import java.util.Iterator;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements f, d {

    /* renamed from: a  reason: collision with root package name */
    public final f f13542a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13543b;

    public c(f fVar, int i2) {
        fVar.getClass();
        this.f13542a = fVar;
        this.f13543b = i2;
        if (i2 >= 0) {
            return;
        }
        o.p(i2, "count must be non-negative, but was ");
        throw null;
    }

    @Override // uc.d
    public final f a(int i2) {
        int i10 = this.f13543b + i2;
        if (i10 < 0) {
            return new c(this, i2);
        }
        return new c(this.f13542a, i10);
    }

    @Override // uc.f
    public final Iterator iterator() {
        return new b(this);
    }
}
