package dd;

import androidx.preference.Preference;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e implements s {
    public final cc.g A;
    public final int B;
    public final bd.a L;

    public e(cc.g gVar, int i2, bd.a aVar) {
        this.A = gVar;
        this.B = i2;
        this.L = aVar;
    }

    @Override // dd.s
    public final cd.h b(cc.g gVar, int i2, bd.a aVar) {
        cc.g gVar2 = this.A;
        cc.g H = gVar.H(gVar2);
        bd.a aVar2 = bd.a.SUSPEND;
        bd.a aVar3 = this.L;
        int i10 = this.B;
        if (aVar == aVar2) {
            if (i10 != -3) {
                if (i2 != -3) {
                    if (i10 != -2) {
                        if (i2 != -2) {
                            i2 += i10;
                            if (i2 < 0) {
                                i2 = Preference.DEFAULT_ORDER;
                            }
                        }
                    }
                }
                i2 = i10;
            }
            aVar = aVar3;
        }
        if (nc.k.a(H, gVar2) && i2 == i10 && aVar == aVar3) {
            return this;
        }
        return f(H, i2, aVar);
    }

    @Override // cd.h
    public Object c(cd.i iVar, cc.c cVar) {
        Object g10 = zc.x.g(new a2.o(iVar, this, (cc.c) null, 12), cVar);
        if (g10 == dc.a.COROUTINE_SUSPENDED) {
            return g10;
        }
        return yb.y.f14813a;
    }

    public String d() {
        return null;
    }

    public abstract Object e(bd.v vVar, cc.c cVar);

    public abstract e f(cc.g gVar, int i2, bd.a aVar);

    public cd.h g() {
        return null;
    }

    public bd.l h(zc.u uVar) {
        int i2 = this.B;
        if (i2 == -3) {
            i2 = -2;
        }
        zc.w wVar = zc.w.ATOMIC;
        a5.o oVar = new a5.o(25, null, this);
        bd.v vVar = new bd.v(zc.x.w(uVar, this.A), ij.a.s(i2, 4, this.L));
        wVar.invoke(oVar, vVar, vVar);
        return vVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d4 = d();
        if (d4 != null) {
            arrayList.add(d4);
        }
        cc.h hVar = cc.h.A;
        cc.g gVar = this.A;
        if (gVar != hVar) {
            arrayList.add("context=" + gVar);
        }
        int i2 = this.B;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        bd.a aVar = bd.a.SUSPEND;
        bd.a aVar2 = this.L;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return w.d.r(sb2, zb.l.Y(arrayList, ", ", null, null, null, 62), ']');
    }
}
