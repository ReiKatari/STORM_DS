package xa;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class n extends ua.u {

    /* renamed from: a  reason: collision with root package name */
    public static final n f14501a = new n();

    private n() {
    }

    public static ua.j d(cb.a aVar, cb.b bVar) {
        int i2 = m.f14500a[bVar.ordinal()];
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        aVar.Z();
                        return ua.l.A;
                    }
                    m9.o.h(bVar, "Unexpected token: ");
                    return null;
                }
                return new ua.n(Boolean.valueOf(aVar.I()));
            }
            return new ua.n(new wa.k(aVar.b0()));
        }
        return new ua.n(aVar.b0());
    }

    public static ua.j e(cb.a aVar, cb.b bVar) {
        int i2 = m.f14500a[bVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            aVar.i();
            return new ua.m();
        }
        aVar.d();
        return new ua.i();
    }

    public static void f(cb.c cVar, ua.j jVar) {
        boolean parseBoolean;
        if (jVar != null && !(jVar instanceof ua.l)) {
            boolean z10 = jVar instanceof ua.n;
            if (z10) {
                if (z10) {
                    ua.n nVar = (ua.n) jVar;
                    Serializable serializable = nVar.A;
                    if (serializable instanceof Number) {
                        cVar.X(nVar.c());
                        return;
                    } else if (serializable instanceof Boolean) {
                        if (serializable instanceof Boolean) {
                            parseBoolean = ((Boolean) serializable).booleanValue();
                        } else {
                            parseBoolean = Boolean.parseBoolean(nVar.a());
                        }
                        cVar.Z(parseBoolean);
                        return;
                    } else {
                        cVar.Y(nVar.a());
                        return;
                    }
                }
                m9.o.h(jVar, "Not a JSON Primitive: ");
                return;
            }
            boolean z11 = jVar instanceof ua.i;
            if (z11) {
                cVar.i();
                if (z11) {
                    ArrayList arrayList = ((ua.i) jVar).A;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        f(cVar, (ua.j) obj);
                    }
                    cVar.v();
                    return;
                }
                m9.o.h(jVar, "Not a JSON Array: ");
                return;
            }
            boolean z12 = jVar instanceof ua.m;
            if (z12) {
                cVar.m();
                if (z12) {
                    Iterator it = ((wa.m) ((ua.m) jVar).A.entrySet()).iterator();
                    while (((wa.l) it).hasNext()) {
                        wa.n b10 = ((wa.l) it).b();
                        cVar.z((String) b10.getKey());
                        f(cVar, (ua.j) b10.getValue());
                    }
                    cVar.w();
                    return;
                }
                m9.o.h(jVar, "Not a JSON Object: ");
                return;
            }
            m9.o.q(jVar.getClass(), "Couldn't write ");
            return;
        }
        cVar.F();
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        String str;
        boolean z10;
        cb.b d02 = aVar.d0();
        ua.j e6 = e(aVar, d02);
        if (e6 == null) {
            return d(aVar, d02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.F()) {
                if (e6 instanceof ua.m) {
                    str = aVar.X();
                } else {
                    str = null;
                }
                cb.b d03 = aVar.d0();
                ua.j e10 = e(aVar, d03);
                if (e10 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (e10 == null) {
                    e10 = d(aVar, d03);
                }
                if (e6 instanceof ua.i) {
                    ((ua.i) e6).A.add(e10);
                } else {
                    ((ua.m) e6).A.put(str, e10);
                }
                if (z10) {
                    arrayDeque.addLast(e6);
                    e6 = e10;
                }
            } else {
                if (e6 instanceof ua.i) {
                    aVar.v();
                } else {
                    aVar.w();
                }
                if (arrayDeque.isEmpty()) {
                    return e6;
                }
                e6 = (ua.j) arrayDeque.removeLast();
            }
        }
    }

    @Override // ua.u
    public final /* bridge */ /* synthetic */ void c(cb.c cVar, Object obj) {
        f(cVar, (ua.j) obj);
    }
}
