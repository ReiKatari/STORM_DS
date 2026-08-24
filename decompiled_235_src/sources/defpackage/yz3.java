package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yz3  reason: default package */
/* loaded from: classes.dex */
public class yz3 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public yz3(int i) {
        this.a = 0;
        this.b = i;
        if (i > 0) {
            this.f = new wb1(4, (byte) 0);
            this.g = new Object();
            return;
        }
        i.h("maxSize <= 0");
        throw null;
    }

    public void a() {
        ArrayList arrayList = (ArrayList) this.f;
        View view = (View) arrayList.get(arrayList.size() - 1);
        this.c = ((StaggeredGridLayoutManager) this.g).r.d(view);
        ((wo6) view.getLayoutParams()).getClass();
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
                return gg5.G(view);
            }
            i += i3;
        }
        return -1;
    }

    public Object h(Object obj) {
        Object put;
        obj.getClass();
        synchronized (((q61) this.g)) {
            wb1 wb1Var = (wb1) this.f;
            wb1Var.getClass();
            Object obj2 = wb1Var.b.get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.e++;
            Object c = c(obj);
            if (c == null) {
                return null;
            }
            synchronized (((q61) this.g)) {
                wb1 wb1Var2 = (wb1) this.f;
                wb1Var2.getClass();
                put = wb1Var2.b.put(obj, c);
                if (put != null) {
                    wb1 wb1Var3 = (wb1) this.f;
                    wb1Var3.getClass();
                    wb1Var3.b.put(obj, put);
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
                if ((staggeredGridLayoutManager.w && gg5.G(view2) <= i) || ((!staggeredGridLayoutManager.w && gg5.G(view2) >= i) || !view2.hasFocusable())) {
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
            if ((staggeredGridLayoutManager.w && gg5.G(view3) >= i) || ((!staggeredGridLayoutManager.w && gg5.G(view3) <= i) || !view3.hasFocusable())) {
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
        ((wo6) view.getLayoutParams()).getClass();
        return this.b;
    }

    public Object l(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        synchronized (((q61) this.g)) {
            this.c += n(obj, obj2);
            wb1 wb1Var = (wb1) this.f;
            wb1Var.getClass();
            put = wb1Var.b.put(obj, obj2);
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
        synchronized (((q61) this.g)) {
            wb1 wb1Var = (wb1) this.f;
            wb1Var.getClass();
            remove = wb1Var.b.remove(obj);
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
    */
    public void p(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (((q61) this.g)) {
                try {
                    if (this.c < 0 || (((wb1) this.f).b.isEmpty() && this.c != 0)) {
                        break;
                    }
                    if (this.c <= i || ((wb1) this.f).b.isEmpty()) {
                        break;
                    }
                    Set entrySet = ((wb1) this.f).b.entrySet();
                    entrySet.getClass();
                    Map.Entry entry = (Map.Entry) gt0.I0(entrySet);
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    wb1 wb1Var = (wb1) this.f;
                    wb1Var.getClass();
                    key.getClass();
                    wb1Var.b.remove(key);
                    this.c -= n(key, value);
                } catch (Throwable th) {
                    throw th;
                }
            }
            d(key, value, null);
        }
    }

    public String toString() {
        int i;
        String str;
        switch (this.a) {
            case 0:
                synchronized (((q61) this.g)) {
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

    public yz3(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.a = 1;
        this.g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }
}
