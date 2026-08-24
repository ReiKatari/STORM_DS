package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rr2  reason: default package */
/* loaded from: classes.dex */
public final class rr2 implements Iterator, zf3 {
    public final /* synthetic */ int A;
    public int B;
    public Object L;
    public final Object R;

    public rr2(ma4 ma4Var) {
        this.A = 2;
        this.R = ma4Var;
        this.B = -1;
        this.L = qo2.C(new la4(ma4Var, this, null));
    }

    public void a() {
        Object g;
        int i;
        int i2 = this.B;
        qd2 qd2Var = (qd2) this.R;
        if (i2 == -2) {
            g = ((on2) qd2Var.b).c();
        } else {
            qn2 qn2Var = qd2Var.c;
            Object obj = this.L;
            obj.getClass();
            g = qn2Var.g(obj);
        }
        this.L = g;
        if (g == null) {
            i = 0;
        } else {
            i = 1;
        }
        this.B = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A;
        Object obj = this.R;
        switch (i) {
            case 0:
                if (this.B < 0) {
                    a();
                }
                if (this.B != 1) {
                    return false;
                }
                return true;
            case 1:
                return ((rb6) this.L).hasNext();
            case 2:
                return ((rb6) this.L).hasNext();
            case 3:
                if (this.B >= ((Map) obj).size()) {
                    return false;
                }
                return true;
            default:
                jt6 jt6Var = (jt6) obj;
                Iterator it = (Iterator) this.L;
                while (this.B < jt6Var.b && it.hasNext()) {
                    it.next();
                    this.B++;
                }
                if (this.B >= jt6Var.c || !it.hasNext()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A;
        Object obj = this.R;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (this.B < 0) {
                    a();
                }
                if (this.B != 0) {
                    Object obj3 = this.L;
                    obj3.getClass();
                    this.B = -1;
                    return obj3;
                }
                fa6.c();
                return null;
            case 1:
                return ((rb6) this.L).next();
            case 2:
                return ((rb6) this.L).next();
            case 3:
                if (hasNext()) {
                    obj2 = this.L;
                    this.B++;
                    Object obj4 = ((Map) obj).get(obj2);
                    if (obj4 != null) {
                        this.L = ((ew3) obj4).b;
                    } else {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                    }
                } else {
                    fa6.c();
                }
                return obj2;
            default:
                jt6 jt6Var = (jt6) obj;
                Iterator it = (Iterator) this.L;
                while (this.B < jt6Var.b && it.hasNext()) {
                    it.next();
                    this.B++;
                }
                int i2 = this.B;
                if (i2 < jt6Var.c) {
                    this.B = i2 + 1;
                    return it.next();
                }
                fa6.c();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.A;
        Object obj = this.R;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.B;
                if (i2 != -1) {
                    ((ga4) obj).B.h(i2);
                    this.B = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.B;
                if (i3 != -1) {
                    ((ma4) obj).B.m(i3);
                    this.B = -1;
                    return;
                }
                return;
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public rr2(jt6 jt6Var) {
        this.A = 4;
        this.R = jt6Var;
        this.L = jt6Var.a.iterator();
    }

    public rr2(qd2 qd2Var) {
        this.A = 0;
        this.R = qd2Var;
        this.B = -2;
    }

    public rr2(Map map, Object obj) {
        this.A = 3;
        this.L = obj;
        this.R = map;
    }

    public rr2(ga4 ga4Var) {
        this.A = 1;
        this.R = ga4Var;
        this.B = -1;
        this.L = qo2.C(new fa4(ga4Var, this, null));
    }
}
