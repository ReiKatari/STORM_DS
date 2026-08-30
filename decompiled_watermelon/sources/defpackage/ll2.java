package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ll2  reason: default package */
/* loaded from: classes.dex */
public final class ll2 implements Iterator, f93 {
    public final /* synthetic */ int A;
    public int B;
    public Object L;
    public final Object R;

    public ll2(g24 g24Var) {
        this.A = 2;
        this.R = g24Var;
        this.B = -1;
        this.L = io2.W(new f24(g24Var, this, null));
    }

    public void a() {
        Object n;
        int i;
        int i2 = this.B;
        o72 o72Var = (o72) this.R;
        if (i2 == -2) {
            n = ((ki2) o72Var.b).c();
        } else {
            Object obj = this.L;
            obj.getClass();
            n = ((mi2) o72Var.c).n(obj);
        }
        this.L = n;
        if (n == null) {
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
                return ((c06) this.L).hasNext();
            case 2:
                return ((c06) this.L).hasNext();
            case 3:
                if (this.B >= ((Map) obj).size()) {
                    return false;
                }
                return true;
            default:
                sh6 sh6Var = (sh6) obj;
                Iterator it = (Iterator) this.L;
                while (this.B < sh6Var.b && it.hasNext()) {
                    it.next();
                    this.B++;
                }
                if (this.B >= sh6Var.c || !it.hasNext()) {
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
                vd6.b();
                return null;
            case 1:
                return ((c06) this.L).next();
            case 2:
                return ((c06) this.L).next();
            case 3:
                if (hasNext()) {
                    obj2 = this.L;
                    this.B++;
                    Object obj4 = ((Map) obj).get(obj2);
                    if (obj4 != null) {
                        this.L = ((cp3) obj4).b;
                    } else {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
                    }
                } else {
                    vd6.b();
                }
                return obj2;
            default:
                sh6 sh6Var = (sh6) obj;
                Iterator it = (Iterator) this.L;
                while (this.B < sh6Var.b && it.hasNext()) {
                    it.next();
                    this.B++;
                }
                int i2 = this.B;
                if (i2 < sh6Var.c) {
                    this.B = i2 + 1;
                    return it.next();
                }
                vd6.b();
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
                    ((a24) obj).B.h(i2);
                    this.B = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.B;
                if (i3 != -1) {
                    ((g24) obj).B.m(i3);
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

    public ll2(sh6 sh6Var) {
        this.A = 4;
        this.R = sh6Var;
        this.L = sh6Var.a.iterator();
    }

    public ll2(o72 o72Var) {
        this.A = 0;
        this.R = o72Var;
        this.B = -2;
    }

    public ll2(Object obj, Map map) {
        this.A = 3;
        this.L = obj;
        this.R = map;
    }

    public ll2(a24 a24Var) {
        this.A = 1;
        this.R = a24Var;
        this.B = -1;
        this.L = io2.W(new z14(a24Var, this, null));
    }
}
