package j0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7269a;

    public o1(v8.j jVar) {
        t8.d dVar;
        jVar.getClass();
        u8.c cVar = new u8.c(jVar.f13776b, 0);
        u8.c cVar2 = new u8.c(jVar.f13777c);
        u8.c cVar3 = new u8.c(jVar.f13779e, 4);
        v8.e eVar = jVar.f13778d;
        u8.c cVar4 = new u8.c(eVar, 2);
        u8.c cVar5 = new u8.c(eVar, 3);
        u8.f fVar = new u8.f(eVar);
        u8.e eVar2 = new u8.e(eVar);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = jVar.f13775a;
            String str = t8.h.f13149a;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            dVar = new t8.d((ConnectivityManager) systemService);
        } else {
            dVar = null;
        }
        this.f7269a = zb.k.v(new u8.d[]{cVar, cVar2, cVar3, cVar4, cVar5, fVar, eVar2, dVar});
    }

    public static String t(o1 o1Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = o1Var.f7269a;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(((k1) obj).getClass().getSimpleName());
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) " | ");
            }
        }
        return sb2.toString();
    }

    public void a(Object obj) {
        this.f7269a.add(obj);
    }

    public void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        p7.t.r(str);
        p7.t.s(str2, str);
        p7.t.e(this, str, str2);
    }

    public void c(String str) {
        int g02 = vc.h.g0(':', 1, 4, str);
        if (g02 != -1) {
            p7.t.e(this, str.substring(0, g02), str.substring(g02 + 1));
        } else if (str.charAt(0) == ':') {
            p7.t.e(this, "", str.substring(1));
        } else {
            p7.t.e(this, "", str);
        }
    }

    public void d(Object obj) {
        if (obj != null) {
            boolean z10 = obj instanceof Object[];
            ArrayList arrayList = this.f7269a;
            if (z10) {
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
        p7.t.r(str);
        p7.t.e(this, str, str2);
    }

    public pi.q f() {
        return new pi.q((String[]) this.f7269a.toArray(new String[0]));
    }

    public void g() {
        this.f7269a.add(o3.j.f10771c);
    }

    public boolean h(Class cls) {
        ArrayList arrayList = this.f7269a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (cls.isAssignableFrom(((k1) obj).getClass())) {
                return true;
            }
        }
        return false;
    }

    public void i(float f8, float f10, float f11, float f12, float f13, float f14) {
        this.f7269a.add(new o3.s(f8, f10, f11, f12, f13, f14));
    }

    public k1 j(Class cls) {
        ArrayList arrayList = this.f7269a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            k1 k1Var = (k1) obj;
            if (k1Var.getClass() == cls) {
                return k1Var;
            }
        }
        return null;
    }

    public String k(String str) {
        str.getClass();
        ArrayList arrayList = this.f7269a;
        int size = arrayList.size() - 2;
        int E = a.a.E(size, 0, -2);
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

    public ArrayList l(Class cls) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f7269a;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            k1 k1Var = (k1) obj;
            if (cls.isAssignableFrom(k1Var.getClass())) {
                arrayList.add(k1Var);
            }
        }
        return arrayList;
    }

    public void m(float f8) {
        this.f7269a.add(new o3.l(f8));
    }

    public void n(float f8) {
        this.f7269a.add(new o3.t(f8));
    }

    public void o(float f8, float f10) {
        this.f7269a.add(new o3.m(f8, f10));
    }

    public void p(float f8, float f10) {
        this.f7269a.add(new o3.u(f8, f10));
    }

    public void q(float f8, float f10) {
        this.f7269a.add(new o3.n(f8, f10));
    }

    public void r(float f8, float f10, float f11, float f12) {
        this.f7269a.add(new o3.x(f8, f10, f11, f12));
    }

    public void s(String str) {
        str.getClass();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f7269a;
            if (i2 < arrayList.size()) {
                if (str.equalsIgnoreCase((String) arrayList.get(i2))) {
                    arrayList.remove(i2);
                    arrayList.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            } else {
                return;
            }
        }
    }

    public cd.h u(x8.p pVar) {
        pVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f7269a;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            if (((u8.d) obj).c(pVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(zb.m.G(arrayList, 10));
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList3.add(((u8.d) obj2).b(pVar.f14429j));
        }
        return cd.q.m(new a9.i(4, (cd.h[]) zb.l.p0(arrayList3).toArray(new cd.h[0])));
    }

    public void v(float f8) {
        this.f7269a.add(new o3.a0(f8));
    }

    public void w(float f8) {
        this.f7269a.add(new o3.z(f8));
    }

    public o1(int i2, boolean z10) {
        switch (i2) {
            case 3:
                this.f7269a = new ArrayList(20);
                return;
            default:
                this.f7269a = new ArrayList(32);
                return;
        }
    }

    public o1(List list) {
        this.f7269a = new ArrayList(list);
    }

    public o1(int i2) {
        this.f7269a = new ArrayList(i2);
    }
}
