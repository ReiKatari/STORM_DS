package fj;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l extends k {
    public final k B;

    public l(k kVar) {
        kVar.getClass();
        this.B = kVar;
    }

    @Override // fj.k
    public final List B(x xVar) {
        List<x> B = this.B.B(xVar);
        ArrayList arrayList = new ArrayList();
        for (x xVar2 : B) {
            xVar2.getClass();
            arrayList.add(xVar2);
        }
        zb.o.H(arrayList);
        return arrayList;
    }

    @Override // fj.k
    public final f5.e G(x xVar) {
        xVar.getClass();
        f5.e G = this.B.G(xVar);
        if (G == null) {
            return null;
        }
        x xVar2 = (x) G.f4857d;
        if (xVar2 == null) {
            return G;
        }
        Map map = (Map) G.f4862i;
        map.getClass();
        return new f5.e(G.f4855b, G.f4856c, xVar2, (Long) G.f4858e, (Long) G.f4859f, (Long) G.f4860g, (Long) G.f4861h, map);
    }

    @Override // fj.k
    public final s H(x xVar) {
        return this.B.H(xVar);
    }

    @Override // fj.k
    public final g0 J(x xVar) {
        xVar.getClass();
        return this.B.J(xVar);
    }

    @Override // fj.k, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B.close();
    }

    @Override // fj.k
    public final e0 d(x xVar) {
        xVar.getClass();
        return this.B.d(xVar);
    }

    @Override // fj.k
    public final void i(x xVar, x xVar2) {
        xVar.getClass();
        xVar2.getClass();
        this.B.i(xVar, xVar2);
    }

    @Override // fj.k
    public final void t(x xVar) {
        xVar.getClass();
        this.B.t(xVar);
    }

    public final String toString() {
        return nc.u.a(getClass()).c() + '(' + this.B + ')';
    }

    @Override // fj.k
    public final void v(x xVar) {
        xVar.getClass();
        this.B.v(xVar);
    }
}
