package pd;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import nd.a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class w extends b {

    /* renamed from: f  reason: collision with root package name */
    public final od.z f11605f;

    /* renamed from: g  reason: collision with root package name */
    public final ld.e f11606g;

    /* renamed from: h  reason: collision with root package name */
    public int f11607h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11608i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(od.c cVar, od.z zVar, String str, ld.e eVar) {
        super(cVar, str);
        cVar.getClass();
        this.f11605f = zVar;
        this.f11606g = eVar;
    }

    @Override // pd.b
    public od.l E(String str) {
        str.getClass();
        return (od.l) zb.v.D(str, S());
    }

    @Override // pd.b
    public String Q(ld.e eVar, int i2) {
        Object obj;
        eVar.getClass();
        od.c cVar = this.f11561c;
        t.o(eVar, cVar);
        String e6 = eVar.e(i2);
        if (this.f11563e.f9967d && !S().A.keySet().contains(e6)) {
            l.i0 i0Var = cVar.f10887c;
            a3.e eVar2 = new a3.e(29, eVar, cVar);
            i0Var.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) i0Var.B;
            Map map = (Map) concurrentHashMap.get(eVar);
            String str = null;
            u uVar = t.f11602a;
            if (map != null) {
                obj = map.get(uVar);
            } else {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
            if (obj == null) {
                obj = eVar2.b();
                Object obj2 = concurrentHashMap.get(eVar);
                if (obj2 == null) {
                    obj2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(eVar, obj2);
                }
                ((Map) obj2).put(uVar, obj);
            }
            Map map2 = (Map) obj;
            Iterator it = S().A.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i2) {
                    str = next;
                    break;
                }
            }
            String str2 = str;
            if (str2 != null) {
                return str2;
            }
        }
        return e6;
    }

    @Override // pd.b
    /* renamed from: X */
    public od.z S() {
        return this.f11605f;
    }

    @Override // pd.b, md.c
    public final md.a a(ld.e eVar) {
        eVar.getClass();
        ld.e eVar2 = this.f11606g;
        if (eVar == eVar2) {
            od.l F = F();
            String b10 = eVar2.b();
            if (F instanceof od.z) {
                String str = this.f11562d;
                return new w(this.f11561c, (od.z) F, str, eVar2);
            }
            throw t.e(-1, "Expected " + nc.u.a(od.z.class).c() + ", but had " + nc.u.a(F.getClass()).c() + " as the serialized body of " + b10 + " at element: " + U(), F.toString());
        }
        return super.a(eVar);
    }

    @Override // pd.b, md.a
    public void b(ld.e eVar) {
        Object obj;
        Set D;
        eVar.getClass();
        od.c cVar = this.f11561c;
        if (!t.l(eVar, cVar) && !(eVar.c() instanceof ld.c)) {
            t.o(eVar, cVar);
            if (!this.f11563e.f9967d) {
                D = a1.b(eVar);
            } else {
                Set b10 = a1.b(eVar);
                l.i0 i0Var = cVar.f10887c;
                i0Var.getClass();
                Map map = (Map) ((ConcurrentHashMap) i0Var.B).get(eVar);
                Set set = null;
                if (map != null) {
                    obj = map.get(t.f11602a);
                } else {
                    obj = null;
                }
                if (obj == null) {
                    obj = null;
                }
                Map map2 = (Map) obj;
                if (map2 != null) {
                    set = map2.keySet();
                }
                if (set == null) {
                    set = zb.s.A;
                }
                D = p7.j.D(b10, set);
            }
            for (String str : S().A.keySet()) {
                if (!D.contains(str) && !nc.k.a(str, this.f11562d)) {
                    StringBuilder u4 = w.d.u("Encountered an unknown key '", str, "' at element: ");
                    u4.append(U());
                    u4.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                    u4.append((Object) t.n(-1, S().toString()));
                    throw t.d(-1, u4.toString());
                }
            }
        }
    }

    @Override // md.a
    public int g(ld.e eVar) {
        boolean z10;
        eVar.getClass();
        while (this.f11607h < eVar.d()) {
            int i2 = this.f11607h;
            this.f11607h = i2 + 1;
            String R = R(eVar, i2);
            int i10 = this.f11607h - 1;
            this.f11608i = false;
            if (!S().containsKey(R)) {
                if (!this.f11561c.f10885a.f9966c && !eVar.k(i10) && eVar.j(i10).h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f11608i = z10;
                if (z10) {
                }
            }
            this.f11563e.getClass();
            return i10;
        }
        return -1;
    }

    @Override // pd.b, md.c
    public final boolean i() {
        if (!this.f11608i && super.i()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ w(od.c cVar, od.z zVar, String str, int i2) {
        this(cVar, zVar, (i2 & 4) != 0 ? null : str, (ld.e) null);
    }
}
