package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r83  reason: default package */
/* loaded from: classes.dex */
public class r83 extends u0 {
    public final f83 Y;
    public final h06 Z;
    public int c0;
    public boolean d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r83(t63 t63Var, f83 f83Var, String str, h06 h06Var) {
        super(t63Var, str);
        t63Var.getClass();
        this.Y = f83Var;
        this.Z = h06Var;
    }

    @Override // defpackage.u0
    /* renamed from: N */
    public f83 C() {
        return this.Y;
    }

    @Override // defpackage.u0, defpackage.yu0
    public void a(h06 h06Var) {
        Object obj;
        Set set;
        Set O;
        h06Var.getClass();
        t63 t63Var = this.L;
        if (!a83.c(t63Var, h06Var) && !(h06Var.c() instanceof zp4)) {
            a83.d(t63Var, h06Var);
            String str = null;
            if (!this.X.e) {
                O = mh7.o(h06Var);
            } else {
                Set o = mh7.o(h06Var);
                t71 t71Var = t63Var.c;
                t71Var.getClass();
                Map map = (Map) ((ConcurrentHashMap) t71Var.B).get(h06Var);
                if (map != null) {
                    obj = map.get(a83.a);
                } else {
                    obj = null;
                }
                if (obj == null) {
                    obj = null;
                }
                Map map2 = (Map) obj;
                if (map2 != null) {
                    set = map2.keySet();
                } else {
                    set = null;
                }
                if (set == null) {
                    set = up1.A;
                }
                O = hi2.O(o, set);
            }
            for (String str2 : C().A.keySet()) {
                if (!O.contains(str2) && !b53.x(str2, this.R)) {
                    String n = b31.n('\'', "Encountered an unknown key '", str2);
                    String F = F();
                    if (t63Var.a.g) {
                        str = io2.Z(-1, C().toString()).toString();
                    }
                    throw new t73(io2.u(n, F, -1, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", str));
                }
            }
        }
    }

    @Override // defpackage.u0, defpackage.b91
    public final yu0 c(h06 h06Var) {
        String str;
        h06Var.getClass();
        h06 h06Var2 = this.Z;
        if (h06Var == h06Var2) {
            k73 g = g();
            String b = h06Var2.b();
            boolean z = g instanceof f83;
            t63 t63Var = this.L;
            if (!z) {
                String str2 = "Expected " + q75.a(f83.class).c() + ", but had " + q75.a(g.getClass()).c() + " as the serialized body of " + b;
                String F = F();
                if (t63Var.a.g) {
                    str = io2.Z(-1, g.toString()).toString();
                } else {
                    str = null;
                }
                throw new t73(io2.u(str2, F, -1, null, str));
            }
            return new r83(t63Var, (f83) g, this.R, h06Var2);
        }
        return super.c(h06Var);
    }

    @Override // defpackage.u0
    public k73 d(String str) {
        str.getClass();
        return (k73) zt3.i0(str, C());
    }

    @Override // defpackage.u0, defpackage.b91
    public final boolean i() {
        if (!this.d0 && super.i()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yu0
    public int v(h06 h06Var) {
        h06Var.getClass();
        while (this.c0 < h06Var.d()) {
            int i = this.c0;
            this.c0 = i + 1;
            String A = A(h06Var, i);
            boolean z = true;
            int i2 = this.c0 - 1;
            this.d0 = false;
            if (!C().containsKey(A)) {
                if (this.L.a.b || h06Var.k(i2) || !h06Var.j(i2).h()) {
                    z = false;
                }
                this.d0 = z;
                if (z) {
                }
            }
            this.X.getClass();
            return i2;
        }
        return -1;
    }

    @Override // defpackage.u0
    public String z(h06 h06Var, int i) {
        Object obj;
        h06Var.getClass();
        t63 t63Var = this.L;
        a83.d(t63Var, h06Var);
        String e = h06Var.e(i);
        if (this.X.e && !C().A.keySet().contains(e)) {
            t71 t71Var = t63Var.c;
            jd2 jd2Var = new jd2(5, h06Var, t63Var);
            t71Var.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) t71Var.B;
            Map map = (Map) concurrentHashMap.get(h06Var);
            String str = null;
            sn1 sn1Var = a83.a;
            if (map != null) {
                obj = map.get(sn1Var);
            } else {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
            if (obj == null) {
                obj = jd2Var.c();
                Object obj2 = concurrentHashMap.get(h06Var);
                if (obj2 == null) {
                    obj2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(h06Var, obj2);
                }
                ((Map) obj2).put(sn1Var, obj);
            }
            Map map2 = (Map) obj;
            Iterator it = C().A.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    str = next;
                    break;
                }
            }
            String str2 = str;
            if (str2 != null) {
                return str2;
            }
        }
        return e;
    }

    public /* synthetic */ r83(t63 t63Var, f83 f83Var, String str, int i) {
        this(t63Var, f83Var, (i & 4) != 0 ? null : str, (h06) null);
    }
}
