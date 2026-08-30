package a1;

import ah.m1;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import j7.o1;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f93a;

    /* renamed from: b  reason: collision with root package name */
    public int f94b;

    /* renamed from: c  reason: collision with root package name */
    public int f95c;

    /* renamed from: d  reason: collision with root package name */
    public int f96d;

    /* renamed from: e  reason: collision with root package name */
    public int f97e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f98f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f99g;

    public s(int i2) {
        this.f93a = 0;
        this.f94b = i2;
        if (i2 > 0) {
            this.f98f = new m1(1, (byte) 0);
            this.f99g = new x8.e(9);
            return;
        }
        a0.j.h("maxSize <= 0");
        throw null;
    }

    public void a() {
        ArrayList arrayList = (ArrayList) this.f98f;
        View view = (View) arrayList.get(arrayList.size() - 1);
        this.f95c = ((StaggeredGridLayoutManager) this.f99g).f1668r.d(view);
        ((o1) view.getLayoutParams()).getClass();
    }

    public void b() {
        ((ArrayList) this.f98f).clear();
        this.f94b = Integer.MIN_VALUE;
        this.f95c = Integer.MIN_VALUE;
        this.f96d = 0;
    }

    public Object c(Object obj) {
        obj.getClass();
        return null;
    }

    public void d(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    public int e() {
        boolean z10 = ((StaggeredGridLayoutManager) this.f99g).f1673w;
        ArrayList arrayList = (ArrayList) this.f98f;
        if (z10) {
            return g(arrayList.size() - 1, -1);
        }
        return g(0, arrayList.size());
    }

    public int f() {
        boolean z10 = ((StaggeredGridLayoutManager) this.f99g).f1673w;
        ArrayList arrayList = (ArrayList) this.f98f;
        if (z10) {
            return g(0, arrayList.size());
        }
        return g(arrayList.size() - 1, -1);
    }

    public int g(int i2, int i10) {
        int i11;
        boolean z10;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f99g;
        int m = staggeredGridLayoutManager.f1668r.m();
        int i12 = staggeredGridLayoutManager.f1668r.i();
        if (i10 > i2) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        while (i2 != i10) {
            View view = (View) ((ArrayList) this.f98f).get(i2);
            int g10 = staggeredGridLayoutManager.f1668r.g(view);
            int d4 = staggeredGridLayoutManager.f1668r.d(view);
            boolean z11 = false;
            if (g10 <= i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (d4 >= m) {
                z11 = true;
            }
            if (z10 && z11 && (g10 < m || d4 > i12)) {
                return j7.u0.G(view);
            }
            i2 += i11;
        }
        return -1;
    }

    public Object h(Object obj) {
        Object put;
        obj.getClass();
        synchronized (((x8.e) this.f99g)) {
            m1 m1Var = (m1) this.f98f;
            m1Var.getClass();
            Object obj2 = m1Var.f798b.get(obj);
            if (obj2 != null) {
                this.f96d++;
                return obj2;
            }
            this.f97e++;
            Object c4 = c(obj);
            if (c4 == null) {
                return null;
            }
            synchronized (((x8.e) this.f99g)) {
                m1 m1Var2 = (m1) this.f98f;
                m1Var2.getClass();
                put = m1Var2.f798b.put(obj, c4);
                if (put != null) {
                    m1 m1Var3 = (m1) this.f98f;
                    m1Var3.getClass();
                    m1Var3.f798b.put(obj, put);
                } else {
                    this.f95c += n(obj, c4);
                }
            }
            if (put != null) {
                d(obj, c4, put);
                return put;
            }
            p(this.f94b);
            return c4;
        }
    }

    public int i(int i2) {
        int i10 = this.f95c;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (((ArrayList) this.f98f).size() == 0) {
            return i2;
        }
        a();
        return this.f95c;
    }

    public View j(int i2, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f99g;
        ArrayList arrayList = (ArrayList) this.f98f;
        View view = null;
        if (i10 == -1) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                View view2 = (View) arrayList.get(i11);
                if ((staggeredGridLayoutManager.f1673w && j7.u0.G(view2) <= i2) || ((!staggeredGridLayoutManager.f1673w && j7.u0.G(view2) >= i2) || !view2.hasFocusable())) {
                    break;
                }
                i11++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            View view3 = (View) arrayList.get(size2);
            if ((staggeredGridLayoutManager.f1673w && j7.u0.G(view3) >= i2) || ((!staggeredGridLayoutManager.f1673w && j7.u0.G(view3) <= i2) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }

    public int k(int i2) {
        ArrayList arrayList = (ArrayList) this.f98f;
        int i10 = this.f94b;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (arrayList.size() == 0) {
            return i2;
        }
        View view = (View) arrayList.get(0);
        this.f94b = ((StaggeredGridLayoutManager) this.f99g).f1668r.g(view);
        ((o1) view.getLayoutParams()).getClass();
        return this.f94b;
    }

    public Object l(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        synchronized (((x8.e) this.f99g)) {
            this.f95c += n(obj, obj2);
            m1 m1Var = (m1) this.f98f;
            m1Var.getClass();
            put = m1Var.f798b.put(obj, obj2);
            if (put != null) {
                this.f95c -= n(obj, put);
            }
        }
        if (put != null) {
            d(obj, put, obj2);
        }
        p(this.f94b);
        return put;
    }

    public Object m(Object obj) {
        Object remove;
        synchronized (((x8.e) this.f99g)) {
            m1 m1Var = (m1) this.f98f;
            m1Var.getClass();
            remove = m1Var.f798b.remove(obj);
            if (remove != null) {
                this.f95c -= n(obj, remove);
            }
        }
        if (remove != null) {
            d(obj, remove, null);
        }
        return remove;
    }

    public int n(Object obj, Object obj2) {
        int o5 = o(obj, obj2);
        if (o5 >= 0) {
            return o5;
        }
        throw new IllegalStateException("Negative size: " + obj + '=' + obj2);
    }

    public int o(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(int r6) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r5.f99g
            x8.e r0 = (x8.e) r0
            monitor-enter(r0)
            int r1 = r5.f95c     // Catch: java.lang.Throwable -> L1a
            if (r1 < 0) goto L6e
            java.lang.Object r1 = r5.f98f     // Catch: java.lang.Throwable -> L1a
            ah.m1 r1 = (ah.m1) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f798b     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            int r1 = r5.f95c     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L6e
            goto L1c
        L1a:
            r6 = move-exception
            goto L76
        L1c:
            int r1 = r5.f95c     // Catch: java.lang.Throwable -> L1a
            if (r1 <= r6) goto L6c
            java.lang.Object r1 = r5.f98f     // Catch: java.lang.Throwable -> L1a
            ah.m1 r1 = (ah.m1) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f798b     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2d
            goto L6c
        L2d:
            java.lang.Object r1 = r5.f98f     // Catch: java.lang.Throwable -> L1a
            ah.m1 r1 = (ah.m1) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f798b     // Catch: java.lang.Throwable -> L1a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1a
            r1.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = zb.l.S(r1)     // Catch: java.lang.Throwable -> L1a
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L46
            monitor-exit(r0)
            return
        L46:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = r5.f98f     // Catch: java.lang.Throwable -> L1a
            ah.m1 r3 = (ah.m1) r3     // Catch: java.lang.Throwable -> L1a
            r3.getClass()     // Catch: java.lang.Throwable -> L1a
            r2.getClass()     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r3 = r3.f798b     // Catch: java.lang.Throwable -> L1a
            r3.remove(r2)     // Catch: java.lang.Throwable -> L1a
            int r3 = r5.f95c     // Catch: java.lang.Throwable -> L1a
            int r4 = r5.n(r2, r1)     // Catch: java.lang.Throwable -> L1a
            int r3 = r3 - r4
            r5.f95c = r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            r0 = 0
            r5.d(r2, r1, r0)
            goto L0
        L6c:
            monitor-exit(r0)
            return
        L6e:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1a
        L76:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.s.p(int):void");
    }

    public String toString() {
        int i2;
        String str;
        switch (this.f93a) {
            case 0:
                synchronized (((x8.e) this.f99g)) {
                    try {
                        int i10 = this.f96d;
                        int i11 = this.f97e + i10;
                        if (i11 != 0) {
                            i2 = (i10 * 100) / i11;
                        } else {
                            i2 = 0;
                        }
                        str = "LruCache[maxSize=" + this.f94b + ",hits=" + this.f96d + ",misses=" + this.f97e + ",hitRate=" + i2 + "%]";
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public s(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f93a = 1;
        this.f99g = staggeredGridLayoutManager;
        this.f98f = new ArrayList();
        this.f94b = Integer.MIN_VALUE;
        this.f95c = Integer.MIN_VALUE;
        this.f96d = 0;
        this.f97e = i2;
    }
}
