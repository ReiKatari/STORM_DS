package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qw2  reason: default package */
/* loaded from: classes.dex */
public final class qw2 extends m0 {
    public final gg3 a;
    public final gg3 b;
    public final /* synthetic */ int c;
    public final pw2 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qw2(gg3 gg3Var, gg3 gg3Var2, int i) {
        this(gg3Var, gg3Var2, (byte) 0);
        this.c = i;
        gg3Var.getClass();
        gg3Var2.getClass();
        switch (i) {
            case 1:
                this(gg3Var, gg3Var2, (byte) 0);
                wb6 e = gg3Var.e();
                wb6 e2 = gg3Var2.e();
                e.getClass();
                e2.getClass();
                this.d = new pw2("kotlin.collections.LinkedHashMap", e, e2);
                return;
            default:
                wb6 e3 = gg3Var.e();
                wb6 e4 = gg3Var2.e();
                e3.getClass();
                e4.getClass();
                this.d = new pw2("kotlin.collections.HashMap", e3, e4);
                return;
        }
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        int i = i(obj);
        wb6 e = e();
        vx0 g0 = x32Var.g0(e, i);
        Iterator h = h(obj);
        int i2 = 0;
        while (h.hasNext()) {
            Map.Entry entry = (Map.Entry) h.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i3 = i2 + 1;
            g0.w(e(), i2, this.a, key);
            i2 += 2;
            g0.w(e(), i3, this.b, value);
        }
        g0.a(e);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        switch (this.c) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override // defpackage.m0
    public final Object f() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.m0
    public final int g(Object obj) {
        int size;
        switch (this.c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                size = hashMap.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.m0
    public final Iterator h(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // defpackage.m0
    public final int i(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // defpackage.m0
    public final void k(ux0 ux0Var, int i, Object obj) {
        Object G;
        Map map = (Map) obj;
        map.getClass();
        Object G2 = ux0Var.G(e(), i, this.a, null);
        int q = ux0Var.q(e());
        if (q == i + 1) {
            boolean containsKey = map.containsKey(G2);
            gg3 gg3Var = this.b;
            if (containsKey && !(gg3Var.e().e() instanceof v25)) {
                G = ux0Var.G(e(), q, gg3Var, c14.j0(map, G2));
            } else {
                G = ux0Var.G(e(), q, gg3Var, null);
            }
            map.put(G2, G);
            return;
        }
        i.f(lb1.j("Value must follow key in a map, index for key: ", i, q, ", returned index for value: "));
    }

    @Override // defpackage.m0
    public final Object l(Object obj) {
        Object obj2 = null;
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                if (map instanceof HashMap) {
                    obj2 = (HashMap) map;
                }
                if (obj2 == null) {
                    return new HashMap(map);
                }
                return obj2;
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                if (map2 instanceof LinkedHashMap) {
                    obj2 = (LinkedHashMap) map2;
                }
                if (obj2 == null) {
                    return new LinkedHashMap(map2);
                }
                return obj2;
        }
    }

    @Override // defpackage.m0
    public final Object m(Object obj) {
        switch (this.c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }

    public qw2(gg3 gg3Var, gg3 gg3Var2, byte b) {
        this.a = gg3Var;
        this.b = gg3Var2;
    }
}
