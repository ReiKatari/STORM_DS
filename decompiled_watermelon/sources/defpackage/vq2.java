package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vq2  reason: default package */
/* loaded from: classes.dex */
public final class vq2 {
    public final /* synthetic */ int a;
    public final ArrayList b;

    public vq2(jw6 jw6Var) {
        this.a = 4;
        jw6Var.getClass();
        String str = zg7.a;
        vy0 vy0Var = jw6Var.b;
        t64 t64Var = jw6Var.d;
        ArrayList f0 = l07.f0(new a20(vy0Var, 0), new a20(jw6Var.c), new a20(jw6Var.e, 4));
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = jw6Var.a;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            f0.add(new n64((ConnectivityManager) systemService));
        } else {
            t64Var.getClass();
            f0.addAll(l07.c0(new a20(t64Var, 2), new a20(t64Var, 3), new j64(t64Var), new i64(t64Var)));
        }
        this.b = f0;
    }

    public void a(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.b;
        switch (i) {
            case 2:
                if (obj != null) {
                    arrayList.add(obj);
                    return;
                } else {
                    c44.i("Set contributions cannot be null");
                    return;
                }
            default:
                arrayList.add(obj);
                return;
        }
    }

    public void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        ie7.b(str);
        ie7.c(str2, str);
        ie7.a(this, str, str2);
    }

    public void c(String str) {
        int y0 = zg6.y0(':', 1, 4, str);
        if (y0 != -1) {
            ie7.a(this, str.substring(0, y0), str.substring(y0 + 1));
        } else if (str.charAt(0) == ':') {
            ie7.a(this, "", str.substring(1));
        } else {
            ie7.a(this, "", str);
        }
    }

    public void d(Object obj) {
        if (obj != null) {
            boolean z = obj instanceof Object[];
            ArrayList arrayList = this.b;
            if (z) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(arrayList, objArr);
                }
            } else if (obj instanceof Collection) {
                arrayList.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object obj2 : (Iterable) obj) {
                    arrayList.add(obj2);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            } else {
                Class<?> cls = obj.getClass();
                throw new UnsupportedOperationException("Don't know how to spread " + cls);
            }
        }
    }

    public void e(String str, String str2) {
        str.getClass();
        str2.getClass();
        ie7.b(str);
        ie7.a(this, str, str2);
    }

    public xq2 f() {
        return new xq2((String[]) this.b.toArray(new String[0]));
    }

    public void g() {
        this.b.add(nk4.c);
    }

    public void h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.b.add(new ok4(f, f2, f3, f4, f5, f6));
    }

    public void i(float f, float f2, float f3, float f4, float f5, float f6) {
        this.b.add(new wk4(f, f2, f3, f4, f5, f6));
    }

    public String j(String str) {
        str.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size() - 2;
        int E = cg2.E(size, 0, -2);
        if (E <= size) {
            while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
                if (size != E) {
                    size -= 2;
                } else {
                    return null;
                }
            }
            return (String) arrayList.get(size + 1);
        }
        return null;
    }

    public void k(float f) {
        this.b.add(new pk4(f));
    }

    public void l(float f) {
        this.b.add(new xk4(f));
    }

    public void m(float f, float f2) {
        this.b.add(new qk4(f, f2));
    }

    public void n(float f, float f2) {
        this.b.add(new yk4(f, f2));
    }

    public void o(float f, float f2) {
        this.b.add(new rk4(f, f2));
    }

    public void p(float f, float f2, float f3, float f4) {
        this.b.add(new tk4(f, f2, f3, f4));
    }

    public void q(float f, float f2, float f3, float f4) {
        this.b.add(new bl4(f, f2, f3, f4));
    }

    public void r(String str) {
        str.getClass();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            } else {
                return;
            }
        }
    }

    public u92 s(xh7 xh7Var) {
        xh7Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (((fy0) obj).a(xh7Var)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(uq0.y0(arrayList, 10));
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList3.add(((fy0) obj2).c(xh7Var.j));
        }
        return se.q(new zy1((u92[]) tq0.n1(arrayList3).toArray(new u92[0]), 1));
    }

    public void t(float f) {
        this.b.add(new el4(f));
    }

    public void u(float f) {
        this.b.add(new dl4(f));
    }

    public vq2(int i) {
        this.a = 3;
        this.b = new ArrayList(i);
    }

    public vq2(int i, byte b) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ArrayList(32);
                return;
            case 2:
                this.b = new ArrayList(9);
                return;
            default:
                this.b = new ArrayList(20);
                return;
        }
    }
}
