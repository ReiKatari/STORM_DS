package a7;

import a6.a1;
import java.util.List;
import java.util.ListIterator;
import u1.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a  reason: collision with root package name */
    public m f603a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f604b;

    public abstract x a();

    public final m b() {
        m mVar = this.f603a;
        if (mVar != null) {
            return mVar;
        }
        a0.j.p("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, f0 f0Var) {
        jc.f fVar = new jc.f(new jc.h(1, new uc.j(new a1(4, list), new a2.c(3, this, f0Var), 1), new h1(3)), (byte) 0);
        while (fVar.hasNext()) {
            b().f((i) fVar.next());
        }
    }

    public void e(i iVar, boolean z10) {
        List list = (List) b().f599e.A.getValue();
        if (list.contains(iVar)) {
            ListIterator listIterator = list.listIterator(list.size());
            i iVar2 = null;
            while (f()) {
                iVar2 = (i) listIterator.previous();
                if (nc.k.a(iVar2, iVar)) {
                    break;
                }
            }
            if (iVar2 != null) {
                b().d(iVar2, z10);
                return;
            }
            return;
        }
        a0.j.j("popBackStack was called with ", iVar, " which does not exist in back stack ", list);
    }

    public boolean f() {
        return true;
    }

    public x c(x xVar) {
        return xVar;
    }
}
