package nd;

import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a implements jd.a {
    @Override // jd.a
    public Object a(md.c cVar) {
        return j(cVar);
    }

    public abstract Object f();

    public abstract int g(Object obj);

    public abstract Iterator h(Object obj);

    public abstract int i(Object obj);

    public final Object j(md.c cVar) {
        Object f8 = f();
        int g10 = g(f8);
        md.a a10 = cVar.a(e());
        while (true) {
            int g11 = a10.g(e());
            if (g11 != -1) {
                k(a10, g11 + g10, f8);
            } else {
                a10.b(e());
                return m(f8);
            }
        }
    }

    public abstract void k(md.a aVar, int i2, Object obj);

    public abstract Object l(Object obj);

    public abstract Object m(Object obj);
}
