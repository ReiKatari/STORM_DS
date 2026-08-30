package a7;

import a1.x0;
import a1.z0;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class z extends x implements Iterable, oc.a {
    public static final /* synthetic */ int Z = 0;
    public final d5.j Y;

    public z(c0 c0Var) {
        super(c0Var);
        this.Y = new d5.j(this);
    }

    @Override // a7.x
    public final w d(a4.n nVar) {
        w d4 = super.d(nVar);
        d5.j jVar = this.Y;
        jVar.getClass();
        return jVar.q(d4, nVar, false, (z) jVar.f3861c);
    }

    public final w e(a4.n nVar, x xVar) {
        return this.Y.q(super.d(nVar), nVar, true, xVar);
    }

    @Override // a7.x
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof z) && super.equals(obj)) {
                d5.j jVar = this.Y;
                int g10 = ((x0) jVar.f3862d).g();
                d5.j jVar2 = ((z) obj).Y;
                if (g10 == ((x0) jVar2.f3862d).g() && jVar.f3860b == jVar2.f3860b) {
                    x0 x0Var = (x0) jVar.f3862d;
                    x0Var.getClass();
                    Iterator it = ((uc.a) uc.h.I(new z0(0, x0Var))).iterator();
                    while (it.hasNext()) {
                        x xVar = (x) it.next();
                        if (!xVar.equals(((x0) jVar2.f3862d).c(xVar.B.f248a))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final w f(String str, boolean z10, x xVar) {
        w wVar;
        d5.j jVar = this.Y;
        jVar.getClass();
        z zVar = (z) jVar.f3861c;
        w l10 = zVar.B.l(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = zVar.iterator();
        while (true) {
            d7.h hVar = (d7.h) it;
            wVar = null;
            if (!hVar.hasNext()) {
                break;
            }
            x xVar2 = (x) hVar.next();
            if (!nc.k.a(xVar2, xVar)) {
                if (xVar2 instanceof z) {
                    wVar = ((z) xVar2).f(str, false, zVar);
                } else {
                    xVar2.getClass();
                    wVar = xVar2.B.l(str);
                }
            }
            if (wVar != null) {
                arrayList.add(wVar);
            }
        }
        w wVar2 = (w) zb.l.b0(arrayList);
        z zVar2 = zVar.L;
        if (zVar2 != null && z10 && !zVar2.equals(xVar)) {
            wVar = zVar2.f(str, true, zVar);
        }
        return (w) zb.l.b0(zb.k.v(new w[]{l10, wVar2, wVar}));
    }

    @Override // a7.x
    public final int hashCode() {
        d5.j jVar = this.Y;
        int i2 = jVar.f3860b;
        x0 x0Var = (x0) jVar.f3862d;
        int g10 = x0Var.g();
        for (int i10 = 0; i10 < g10; i10++) {
            i2 = (((i2 * 31) + x0Var.e(i10)) * 31) + ((x) x0Var.h(i10)).hashCode();
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        d5.j jVar = this.Y;
        jVar.getClass();
        return new d7.h(jVar);
    }

    @Override // a7.x
    public final String toString() {
        x xVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        d5.j jVar = this.Y;
        String str = (String) jVar.f3864f;
        jVar.getClass();
        if (str != null && !vc.h.j0(str)) {
            xVar = jVar.f(str, true);
        } else {
            xVar = null;
        }
        if (xVar == null) {
            xVar = jVar.e(jVar.f3860b);
        }
        sb2.append(" startDestination=");
        if (xVar == null) {
            String str2 = (String) jVar.f3864f;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = (String) jVar.f3863e;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(jVar.f3860b));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(xVar.toString());
            sb2.append("}");
        }
        return sb2.toString();
    }
}
