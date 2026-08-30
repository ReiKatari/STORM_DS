package xa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends ua.u {

    /* renamed from: c  reason: collision with root package name */
    public static final p f14510c = new p(1, ua.r.DOUBLE);

    /* renamed from: a  reason: collision with root package name */
    public final ua.h f14511a;

    /* renamed from: b  reason: collision with root package name */
    public final ua.s f14512b;

    public t(ua.h hVar, ua.s sVar) {
        this.f14511a = hVar;
        this.f14512b = sVar;
    }

    public static Serializable e(cb.a aVar, cb.b bVar) {
        int i2 = s.f14509a[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            aVar.i();
            return new wa.o(true);
        }
        aVar.d();
        return new ArrayList();
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        String str;
        boolean z10;
        cb.b d02 = aVar.d0();
        Object e6 = e(aVar, d02);
        if (e6 == null) {
            return d(aVar, d02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.F()) {
                if (e6 instanceof Map) {
                    str = aVar.X();
                } else {
                    str = null;
                }
                cb.b d03 = aVar.d0();
                Serializable e10 = e(aVar, d03);
                if (e10 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (e10 == null) {
                    e10 = d(aVar, d03);
                }
                if (e6 instanceof List) {
                    ((List) e6).add(e10);
                } else {
                    ((Map) e6).put(str, e10);
                }
                if (z10) {
                    arrayDeque.addLast(e6);
                    e6 = e10;
                }
            } else {
                if (e6 instanceof List) {
                    aVar.v();
                } else {
                    aVar.w();
                }
                if (arrayDeque.isEmpty()) {
                    return e6;
                }
                e6 = arrayDeque.removeLast();
            }
        }
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        if (obj == null) {
            cVar.F();
            return;
        }
        Class<?> cls = obj.getClass();
        ua.h hVar = this.f14511a;
        hVar.getClass();
        ua.u c4 = hVar.c(new bb.a(cls));
        if (c4 instanceof t) {
            cVar.m();
            cVar.w();
            return;
        }
        c4.c(cVar, obj);
    }

    public final Serializable d(cb.a aVar, cb.b bVar) {
        int i2 = s.f14509a[bVar.ordinal()];
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        aVar.Z();
                        return null;
                    }
                    m9.o.h(bVar, "Unexpected token: ");
                    return null;
                }
                return Boolean.valueOf(aVar.I());
            }
            return this.f14512b.readNumber(aVar);
        }
        return aVar.b0();
    }
}
