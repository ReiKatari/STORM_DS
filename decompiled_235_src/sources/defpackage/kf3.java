package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kf3  reason: default package */
/* loaded from: classes.dex */
public class kf3 extends v0 {
    public final ye3 Y;
    public final wb6 Z;
    public int d0;
    public boolean e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf3(id3 id3Var, ye3 ye3Var, String str, wb6 wb6Var) {
        super(id3Var, str);
        id3Var.getClass();
        this.Y = ye3Var;
        this.Z = wb6Var;
    }

    @Override // defpackage.v0, defpackage.sc1
    public final boolean M() {
        if (!this.e0 && super.M()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.v0
    /* renamed from: R */
    public ye3 E() {
        return this.Y;
    }

    @Override // defpackage.v0, defpackage.ux0
    public void a(wb6 wb6Var) {
        Object obj;
        Set set;
        Set K;
        wb6Var.getClass();
        id3 id3Var = this.L;
        if (!te3.c(id3Var, wb6Var) && !(wb6Var.e() instanceof dz4)) {
            te3.d(id3Var, wb6Var);
            String str = null;
            if (!this.X.e) {
                K = q60.k(wb6Var);
            } else {
                Set k = q60.k(wb6Var);
                d51 d51Var = id3Var.c;
                d51Var.getClass();
                Map map = (Map) ((ConcurrentHashMap) d51Var.B).get(wb6Var);
                if (map != null) {
                    obj = map.get(te3.a);
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
                    set = du1.A;
                }
                K = ii2.K(k, set);
            }
            for (String str2 : E().A.keySet()) {
                if (!K.contains(str2) && !nb3.k(str2, this.R)) {
                    String k2 = i61.k('\'', "Encountered an unknown key '", str2);
                    String N = N();
                    if (id3Var.a.g) {
                        str = hi2.H(-1, E().toString()).toString();
                    }
                    throw new me3(hi2.x(k2, N, -1, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", str));
                }
            }
        }
    }

    @Override // defpackage.v0, defpackage.sc1
    public final ux0 c(wb6 wb6Var) {
        String str;
        wb6Var.getClass();
        wb6 wb6Var2 = this.Z;
        if (wb6Var == wb6Var2) {
            de3 f = f();
            String a = wb6Var2.a();
            boolean z = f instanceof ye3;
            id3 id3Var = this.L;
            if (!z) {
                String str2 = "Expected " + gh5.a(ye3.class).c() + ", but had " + gh5.a(f.getClass()).c() + " as the serialized body of " + a;
                String N = N();
                if (id3Var.a.g) {
                    str = hi2.H(-1, f.toString()).toString();
                } else {
                    str = null;
                }
                throw new me3(hi2.x(str2, N, -1, null, str));
            }
            return new kf3(id3Var, (ye3) f, this.R, wb6Var2);
        }
        return super.c(wb6Var);
    }

    @Override // defpackage.v0
    public de3 d(String str) {
        str.getClass();
        return (de3) c14.j0(E(), str);
    }

    @Override // defpackage.ux0
    public int q(wb6 wb6Var) {
        wb6Var.getClass();
        while (this.d0 < wb6Var.f()) {
            int i = this.d0;
            this.d0 = i + 1;
            String D = D(wb6Var, i);
            boolean z = true;
            int i2 = this.d0 - 1;
            this.e0 = false;
            if (!E().containsKey(D)) {
                if (this.L.a.b || wb6Var.k(i2) || !wb6Var.j(i2).c()) {
                    z = false;
                }
                this.e0 = z;
                if (z) {
                }
            }
            this.X.getClass();
            return i2;
        }
        return -1;
    }

    @Override // defpackage.v0
    public String x(wb6 wb6Var, int i) {
        Object obj;
        wb6Var.getClass();
        id3 id3Var = this.L;
        te3.d(id3Var, wb6Var);
        String g = wb6Var.g(i);
        if (this.X.e && !E().A.keySet().contains(g)) {
            d51 d51Var = id3Var.c;
            ci2 ci2Var = new ci2(6, wb6Var, id3Var);
            d51Var.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) d51Var.B;
            Map map = (Map) concurrentHashMap.get(wb6Var);
            String str = null;
            x31 x31Var = te3.a;
            if (map != null) {
                obj = map.get(x31Var);
            } else {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
            if (obj == null) {
                obj = ci2Var.c();
                Object obj2 = concurrentHashMap.get(wb6Var);
                if (obj2 == null) {
                    obj2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(wb6Var, obj2);
                }
                ((Map) obj2).put(x31Var, obj);
            }
            Map map2 = (Map) obj;
            Iterator it = E().A.keySet().iterator();
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
        return g;
    }

    public /* synthetic */ kf3(id3 id3Var, ye3 ye3Var, String str, int i) {
        this(id3Var, ye3Var, (i & 4) != 0 ? null : str, (wb6) null);
    }
}
