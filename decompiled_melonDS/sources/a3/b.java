package a3;

import a1.x;
import d1.q1;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.m0;
import n2.s;
import p1.f0;
import y3.u0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f147a;

    public b(int i2) {
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f147a = s.w(Boolean.FALSE);
                return;
            case 2:
                x xVar = a1.m.f66a;
                this.f147a = new x();
                return;
            default:
                this.f147a = new ArrayList();
                return;
        }
    }

    public boolean a(int i2, m0 m0Var, Object obj) {
        ArrayList arrayList = m0Var.f9955a;
        if (arrayList == null) {
            b(i2, m0Var, null);
            return true;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof n2.a) {
                if (obj2.equals(obj)) {
                    b(0, m0Var, obj2);
                    return true;
                }
            } else if (obj2 instanceof m0) {
                if (a(i2, (m0) obj2, obj)) {
                    b(0, m0Var, obj2);
                    return true;
                }
            } else {
                wa.b.e(obj2, "Unexpected child source info ");
                return false;
            }
        }
        return false;
    }

    public void b(int i2, m0 m0Var, Object obj) {
        ((ArrayList) this.f147a).add(new c(i2, null, null));
    }

    public abstract Object c();

    public List d(f0 f0Var, int i2, long j2) {
        x xVar = (x) this.f147a;
        List list = (List) xVar.b(i2);
        if (list != null) {
            return list;
        }
        List a10 = f0Var.a(i2);
        int size = a10.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((u0) a10.get(i10)).e(j2));
        }
        xVar.i(i2, arrayList);
        return arrayList;
    }

    public abstract Object e();

    public void f(int i2, Object obj, m0 m0Var, Object obj2) {
        if (!nc.k.a(obj, n2.l.f9953a)) {
            return;
        }
        b(i2, m0Var, null);
    }

    public abstract void g(Object obj);

    public abstract void h(q1 q1Var);

    public abstract void i();
}
