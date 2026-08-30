package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: us3  reason: default package */
/* loaded from: classes.dex */
public class us3 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public us3(int i) {
        this.a = 0;
        this.b = i;
        if (i > 0) {
            this.f = new e81(4, (byte) 0);
            this.g = new so1(12);
            return;
        }
        i.i("maxSize <= 0");
        throw null;
    }

    public void a() {
        ArrayList arrayList = (ArrayList) this.f;
        View view = (View) arrayList.get(arrayList.size() - 1);
        this.c = ((StaggeredGridLayoutManager) this.g).r.d(view);
        ((gd6) view.getLayoutParams()).getClass();
    }

    public void b() {
        ((ArrayList) this.f).clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
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
        boolean z = ((StaggeredGridLayoutManager) this.g).w;
        ArrayList arrayList = (ArrayList) this.f;
        if (z) {
            return g(arrayList.size() - 1, -1);
        }
        return g(0, arrayList.size());
    }

    public int f() {
        boolean z = ((StaggeredGridLayoutManager) this.g).w;
        ArrayList arrayList = (ArrayList) this.f;
        if (z) {
            return g(0, arrayList.size());
        }
        return g(arrayList.size() - 1, -1);
    }

    public int g(int i, int i2) {
        int i3;
        boolean z;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int m = staggeredGridLayoutManager.r.m();
        int i4 = staggeredGridLayoutManager.r.i();
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View view = (View) ((ArrayList) this.f).get(i);
            int g = staggeredGridLayoutManager.r.g(view);
            int d = staggeredGridLayoutManager.r.d(view);
            boolean z2 = false;
            if (g <= i4) {
                z = true;
            } else {
                z = false;
            }
            if (d >= m) {
                z2 = true;
            }
            if (z && z2 && (g < m || d > i4)) {
                return q65.G(view);
            }
            i += i3;
        }
        return -1;
    }

    public Object h(Object obj) {
        Object put;
        obj.getClass();
        synchronized (((so1) this.g)) {
            e81 e81Var = (e81) this.f;
            e81Var.getClass();
            Object obj2 = e81Var.b.get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.e++;
            Object c = c(obj);
            if (c == null) {
                return null;
            }
            synchronized (((so1) this.g)) {
                e81 e81Var2 = (e81) this.f;
                e81Var2.getClass();
                put = e81Var2.b.put(obj, c);
                if (put != null) {
                    e81 e81Var3 = (e81) this.f;
                    e81Var3.getClass();
                    e81Var3.b.put(obj, put);
                } else {
                    this.c += n(obj, c);
                }
            }
            if (put != null) {
                d(obj, c, put);
                return put;
            }
            p(this.b);
            return c;
        }
    }

    public int i(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        a();
        return this.c;
    }

    public View j(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        ArrayList arrayList = (ArrayList) this.f;
        View view = null;
        if (i2 == -1) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.w && q65.G(view2) <= i) || ((!staggeredGridLayoutManager.w && q65.G(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            View view3 = (View) arrayList.get(size2);
            if ((staggeredGridLayoutManager.w && q65.G(view3) >= i) || ((!staggeredGridLayoutManager.w && q65.G(view3) <= i) || !view3.hasFocusable())) {
                break;
            }
            size2--;
            view = view3;
        }
        return view;
    }

    public int k(int i) {
        ArrayList arrayList = (ArrayList) this.f;
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        this.b = ((StaggeredGridLayoutManager) this.g).r.g(view);
        ((gd6) view.getLayoutParams()).getClass();
        return this.b;
    }

    public Object l(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        synchronized (((so1) this.g)) {
            this.c += n(obj, obj2);
            e81 e81Var = (e81) this.f;
            e81Var.getClass();
            put = e81Var.b.put(obj, obj2);
            if (put != null) {
                this.c -= n(obj, put);
            }
        }
        if (put != null) {
            d(obj, put, obj2);
        }
        p(this.b);
        return put;
    }

    public Object m(Object obj) {
        Object remove;
        synchronized (((so1) this.g)) {
            e81 e81Var = (e81) this.f;
            e81Var.getClass();
            remove = e81Var.b.remove(obj);
            if (remove != null) {
                this.c -= n(obj, remove);
            }
        }
        if (remove != null) {
            d(obj, remove, null);
        }
        return remove;
    }

    public int n(Object obj, Object obj2) {
        int o = o(obj, obj2);
        if (o >= 0) {
            return o;
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
            java.lang.Object r0 = r5.g
            so1 r0 = (defpackage.so1) r0
            monitor-enter(r0)
            int r1 = r5.c     // Catch: java.lang.Throwable -> L1a
            if (r1 < 0) goto L6e
            java.lang.Object r1 = r5.f     // Catch: java.lang.Throwable -> L1a
            e81 r1 = (defpackage.e81) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.b     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            int r1 = r5.c     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L6e
            goto L1c
        L1a:
            r5 = move-exception
            goto L76
        L1c:
            int r1 = r5.c     // Catch: java.lang.Throwable -> L1a
            if (r1 <= r6) goto L6c
            java.lang.Object r1 = r5.f     // Catch: java.lang.Throwable -> L1a
            e81 r1 = (defpackage.e81) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.b     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2d
            goto L6c
        L2d:
            java.lang.Object r1 = r5.f     // Catch: java.lang.Throwable -> L1a
            e81 r1 = (defpackage.e81) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.b     // Catch: java.lang.Throwable -> L1a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1a
            r1.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = defpackage.tq0.L0(r1)     // Catch: java.lang.Throwable -> L1a
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L46
            monitor-exit(r0)
            return
        L46:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = r5.f     // Catch: java.lang.Throwable -> L1a
            e81 r3 = (defpackage.e81) r3     // Catch: java.lang.Throwable -> L1a
            r3.getClass()     // Catch: java.lang.Throwable -> L1a
            r2.getClass()     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r3 = r3.b     // Catch: java.lang.Throwable -> L1a
            r3.remove(r2)     // Catch: java.lang.Throwable -> L1a
            int r3 = r5.c     // Catch: java.lang.Throwable -> L1a
            int r4 = r5.n(r2, r1)     // Catch: java.lang.Throwable -> L1a
            int r3 = r3 - r4
            r5.c = r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            r0 = 0
            r5.d(r2, r1, r0)
            goto L0
        L6c:
            monitor-exit(r0)
            return
        L6e:
            java.lang.String r5 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            throw r6     // Catch: java.lang.Throwable -> L1a
        L76:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us3.p(int):void");
    }

    public String toString() {
        int i;
        String str;
        switch (this.a) {
            case 0:
                synchronized (((so1) this.g)) {
                    try {
                        int i2 = this.d;
                        int i3 = this.e + i2;
                        if (i3 != 0) {
                            i = (i2 * 100) / i3;
                        } else {
                            i = 0;
                        }
                        str = "LruCache[maxSize=" + this.b + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + i + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public us3(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.a = 1;
        this.g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }
}
