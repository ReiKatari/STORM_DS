package xa;

import java.lang.reflect.Field;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w extends v {

    /* renamed from: b  reason: collision with root package name */
    public final wa.p f14523b;

    public w(wa.p pVar, x xVar) {
        super(xVar);
        this.f14523b = pVar;
    }

    @Override // xa.v
    public final Object d() {
        return this.f14523b.d();
    }

    @Override // xa.v
    public final void f(Object obj, cb.a aVar, u uVar) {
        Field field = uVar.f14514b;
        Object b10 = uVar.f14519g.b(aVar);
        if (b10 == null && uVar.f14520h) {
            return;
        }
        if (uVar.f14516d) {
            z.b(obj, field);
        } else if (uVar.f14521i) {
            throw new RuntimeException("Cannot set value of 'static final' ".concat(za.c.d(field, false)));
        }
        field.set(obj, b10);
    }

    @Override // xa.v
    public final Object e(Object obj) {
        return obj;
    }
}
