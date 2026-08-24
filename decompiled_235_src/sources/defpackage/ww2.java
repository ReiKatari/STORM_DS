package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ww2  reason: default package */
/* loaded from: classes.dex */
public final class ww2 {
    public final /* synthetic */ int a;
    public final ArrayList b;

    public ww2(w87 w87Var) {
        this.a = 4;
        w87Var.getClass();
        String str = zv7.a;
        a21 a21Var = w87Var.b;
        if4 if4Var = w87Var.d;
        ArrayList d0 = hf.d0(new v30(a21Var, 0), new v30(w87Var.c), new v30(w87Var.e, 4));
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = w87Var.a;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            d0.add(new cf4((ConnectivityManager) systemService));
        } else {
            if4Var.getClass();
            d0.addAll(hf.c0(new v30(if4Var, 2), new v30(if4Var, 3), new xe4(if4Var), new we4(if4Var)));
        }
        this.b = d0;
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
                    u34.x("Set contributions cannot be null");
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
        ft7.c(str);
        ft7.d(str2, str);
        ft7.a(this, str, str2);
    }

    public void c(String str) {
        int s0 = qs6.s0(':', 1, 4, str);
        if (s0 != -1) {
            ft7.a(this, str.substring(0, s0), str.substring(s0 + 1));
        } else if (str.charAt(0) == ':') {
            ft7.a(this, "", str.substring(1));
        } else {
            ft7.a(this, "", str);
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
        ft7.c(str);
        ft7.a(this, str, str2);
    }

    public yw2 f() {
        return new yw2((String[]) this.b.toArray(new String[0]));
    }

    public void g() {
        this.b.add(pt4.c);
    }

    public void h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.b.add(new qt4(f, f2, f3, f4, f5, f6));
    }

    public void i(float f, float f2, float f3, float f4, float f5, float f6) {
        this.b.add(new yt4(f, f2, f3, f4, f5, f6));
    }

    public String j(String str) {
        str.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size() - 2;
        int s = nj2.s(size, 0, -2);
        if (s <= size) {
            while (!str.equalsIgnoreCase((String) arrayList.get(size))) {
                if (size != s) {
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
        this.b.add(new rt4(f));
    }

    public void l(float f) {
        this.b.add(new zt4(f));
    }

    public void m(float f, float f2) {
        this.b.add(new st4(f, f2));
    }

    public void n(float f, float f2) {
        this.b.add(new au4(f, f2));
    }

    public void o(float f, float f2) {
        this.b.add(new tt4(f, f2));
    }

    public void p(float f, float f2, float f3, float f4) {
        this.b.add(new vt4(f, f2, f3, f4));
    }

    public void q(float f, float f2, float f3, float f4) {
        this.b.add(new du4(f, f2, f3, f4));
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

    public le2 s(yw7 yw7Var) {
        yw7Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (((k11) obj).c(yw7Var)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(ht0.v0(arrayList, 10));
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList3.add(((k11) obj2).b(yw7Var.j));
        }
        return f04.z(new j32((le2[]) gt0.k1(arrayList3).toArray(new le2[0]), 1));
    }

    public void t(float f) {
        this.b.add(new gu4(f));
    }

    public void u(float f) {
        this.b.add(new fu4(f));
    }

    public ww2(int i) {
        this.a = 3;
        this.b = new ArrayList(i);
    }

    public ww2(int i, byte b) {
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
