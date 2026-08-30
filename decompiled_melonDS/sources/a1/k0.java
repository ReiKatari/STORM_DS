package a1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 implements Iterator, oc.a {
    public final /* synthetic */ int A;
    public int B;
    public Object L;
    public final Object R;

    public k0(p0 p0Var) {
        this.A = 1;
        this.R = p0Var;
        this.B = -1;
        this.L = p7.m.y(new o0(p0Var, this, null));
    }

    public void a() {
        Object k10;
        int i2;
        int i10 = this.B;
        jc.h hVar = (jc.h) this.R;
        if (i10 == -2) {
            k10 = ((mc.a) hVar.f7805b).b();
        } else {
            Object obj = this.L;
            obj.getClass();
            k10 = ((mc.l) hVar.f7806c).k(obj);
        }
        this.L = k10;
        if (k10 == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.B = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                return ((uc.g) this.L).hasNext();
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((uc.g) this.L).hasNext();
            case 2:
                if (this.B < ((Map) this.R).size()) {
                    return true;
                }
                return false;
            default:
                if (this.B < 0) {
                    a();
                }
                if (this.B == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.A) {
            case 0:
                return ((uc.g) this.L).next();
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((uc.g) this.L).next();
            case 2:
                if (hasNext()) {
                    Object obj = this.L;
                    this.B++;
                    Object obj2 = ((Map) this.R).get(obj);
                    if (obj2 != null) {
                        this.L = ((t2.a) obj2).f13081b;
                        return obj;
                    }
                    throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                }
                fj.j.l();
                return null;
            default:
                if (this.B < 0) {
                    a();
                }
                if (this.B != 0) {
                    Object obj3 = this.L;
                    obj3.getClass();
                    this.B = -1;
                    return obj3;
                }
                fj.j.l();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                int i2 = this.B;
                if (i2 != -1) {
                    ((l0) this.R).B.h(i2);
                    this.B = -1;
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                int i10 = this.B;
                if (i10 != -1) {
                    ((p0) this.R).B.m(i10);
                    this.B = -1;
                    return;
                }
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public k0(jc.h hVar) {
        this.A = 3;
        this.R = hVar;
        this.B = -2;
    }

    public k0(Object obj, Map map) {
        this.A = 2;
        this.L = obj;
        this.R = map;
    }

    public k0(l0 l0Var) {
        this.A = 0;
        this.R = l0Var;
        this.B = -1;
        this.L = p7.m.y(new j0(l0Var, this, null));
    }
}
