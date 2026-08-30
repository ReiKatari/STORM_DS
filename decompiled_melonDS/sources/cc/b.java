package cc;

import ai.l;
import java.io.Serializable;
import mc.p;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements g, Serializable {
    public final g A;
    public final e B;

    public b(e eVar, g gVar) {
        gVar.getClass();
        eVar.getClass();
        this.A = gVar;
        this.B = eVar;
    }

    @Override // cc.g
    public final g H(g gVar) {
        gVar.getClass();
        if (gVar == h.A) {
            return this;
        }
        return (g) gVar.L(this, new l(8));
    }

    @Override // cc.g
    public final Object L(Object obj, p pVar) {
        return pVar.j(this.A.L(obj, pVar), this.B);
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i2 = 2;
                b bVar2 = bVar;
                int i10 = 2;
                while (true) {
                    g gVar = bVar2.A;
                    if (gVar instanceof b) {
                        bVar2 = (b) gVar;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 == null) {
                        break;
                    }
                    i10++;
                }
                b bVar3 = this;
                while (true) {
                    g gVar2 = bVar3.A;
                    if (gVar2 instanceof b) {
                        bVar3 = (b) gVar2;
                    } else {
                        bVar3 = null;
                    }
                    if (bVar3 == null) {
                        break;
                    }
                    i2++;
                }
                if (i10 == i2) {
                    b bVar4 = this;
                    while (true) {
                        e eVar = bVar4.B;
                        if (!k.a(bVar.t(eVar.getKey()), eVar)) {
                            z10 = false;
                            break;
                        }
                        g gVar3 = bVar4.A;
                        if (gVar3 instanceof b) {
                            bVar4 = (b) gVar3;
                        } else {
                            gVar3.getClass();
                            e eVar2 = (e) gVar3;
                            z10 = k.a(bVar.t(eVar2.getKey()), eVar2);
                            break;
                        }
                    }
                    if (z10) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.B.hashCode() + this.A.hashCode();
    }

    @Override // cc.g
    public final g m(f fVar) {
        fVar.getClass();
        e eVar = this.B;
        e t5 = eVar.t(fVar);
        g gVar = this.A;
        if (t5 != null) {
            return gVar;
        }
        g m = gVar.m(fVar);
        if (m == gVar) {
            return this;
        }
        if (m == h.A) {
            return eVar;
        }
        return new b(eVar, m);
    }

    @Override // cc.g
    public final e t(f fVar) {
        fVar.getClass();
        b bVar = this;
        while (true) {
            e t5 = bVar.B.t(fVar);
            if (t5 != null) {
                return t5;
            }
            g gVar = bVar.A;
            if (gVar instanceof b) {
                bVar = (b) gVar;
            } else {
                return gVar.t(fVar);
            }
        }
    }

    public final String toString() {
        return w.d.r(new StringBuilder("["), (String) L("", new l(7)), ']');
    }
}
