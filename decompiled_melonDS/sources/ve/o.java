package ve;

import java.util.List;
import oe.a0;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f13823a;

    /* renamed from: b  reason: collision with root package name */
    public final b f13824b;

    /* renamed from: c  reason: collision with root package name */
    public final bf.a f13825c;

    /* renamed from: d  reason: collision with root package name */
    public final List f13826d;

    /* renamed from: e  reason: collision with root package name */
    public final i f13827e;

    public o(a0 a0Var, b bVar, bf.a aVar, List list, i iVar) {
        a0Var.getClass();
        bVar.getClass();
        aVar.getClass();
        list.getClass();
        iVar.getClass();
        this.f13823a = a0Var;
        this.f13824b = bVar;
        this.f13825c = aVar;
        this.f13826d = list;
        this.f13827e = iVar;
    }

    public static o a(o oVar, a0 a0Var, bf.a aVar, i iVar, int i2) {
        List list;
        if ((i2 & 1) != 0) {
            a0Var = oVar.f13823a;
        }
        a0 a0Var2 = a0Var;
        b bVar = oVar.f13824b;
        if ((i2 & 4) != 0) {
            aVar = oVar.f13825c;
        }
        bf.a aVar2 = aVar;
        if ((i2 & 8) != 0) {
            list = oVar.f13826d;
        } else {
            list = q.A;
        }
        List list2 = list;
        if ((i2 & 16) != 0) {
            iVar = oVar.f13827e;
        }
        i iVar2 = iVar;
        oVar.getClass();
        a0Var2.getClass();
        bVar.getClass();
        aVar2.getClass();
        list2.getClass();
        iVar2.getClass();
        return new o(a0Var2, bVar, aVar2, list2, iVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (nc.k.a(this.f13823a, oVar.f13823a) && nc.k.a(this.f13824b, oVar.f13824b) && this.f13825c == oVar.f13825c && nc.k.a(this.f13826d, oVar.f13826d) && nc.k.a(this.f13827e, oVar.f13827e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13824b.hashCode();
        int hashCode2 = this.f13825c.hashCode();
        int hashCode3 = this.f13826d.hashCode();
        return this.f13827e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f13823a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "UILayoutVariant(uiSize=" + this.f13823a + ", uiInsets=" + this.f13824b + ", orientation=" + this.f13825c + ", folds=" + this.f13826d + ", displays=" + this.f13827e + ")";
    }
}
