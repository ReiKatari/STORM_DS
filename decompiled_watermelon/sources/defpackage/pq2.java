package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pq2  reason: default package */
/* loaded from: classes.dex */
public final class pq2 extends l0 {
    public final m93 a;
    public final m93 b;
    public final /* synthetic */ int c;
    public final oq2 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pq2(m93 m93Var, m93 m93Var2, int i) {
        this(m93Var, m93Var2, (byte) 0);
        this.c = i;
        m93Var.getClass();
        m93Var2.getClass();
        switch (i) {
            case 1:
                this(m93Var, m93Var2, (byte) 0);
                h06 e = m93Var.e();
                h06 e2 = m93Var2.e();
                e.getClass();
                e2.getClass();
                this.d = new oq2("kotlin.collections.LinkedHashMap", e, e2);
                return;
            default:
                h06 e3 = m93Var.e();
                h06 e4 = m93Var2.e();
                e3.getClass();
                e4.getClass();
                this.d = new oq2("kotlin.collections.HashMap", e3, e4);
                return;
        }
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        int i = i(obj);
        h06 e = e();
        zu0 f0 = mz1Var.f0(e, i);
        Iterator h = h(obj);
        int i2 = 0;
        while (h.hasNext()) {
            Map.Entry entry = (Map.Entry) h.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i3 = i2 + 1;
            f0.F(e(), i2, this.a, key);
            i2 += 2;
            f0.F(e(), i3, this.b, value);
        }
        f0.a(e);
    }

    @Override // defpackage.m93
    public final h06 e() {
        switch (this.c) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    @Override // defpackage.l0
    public final Object f() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.l0
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

    @Override // defpackage.l0
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

    @Override // defpackage.l0
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

    @Override // defpackage.l0
    public final void k(yu0 yu0Var, int i, Object obj) {
        Object U;
        Map map = (Map) obj;
        map.getClass();
        Object U2 = yu0Var.U(e(), i, this.a, null);
        int v = yu0Var.v(e());
        if (v == i + 1) {
            boolean containsKey = map.containsKey(U2);
            m93 m93Var = this.b;
            if (containsKey && !(m93Var.e().c() instanceof tt4)) {
                U = yu0Var.U(e(), v, m93Var, zt3.i0(U2, map));
            } else {
                U = yu0Var.U(e(), v, m93Var, null);
            }
            map.put(U2, U);
            return;
        }
        i.g(wh1.f(i, v, "Value must follow key in a map, index for key: ", ", returned index for value: "));
    }

    @Override // defpackage.l0
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

    @Override // defpackage.l0
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

    public pq2(m93 m93Var, m93 m93Var2, byte b) {
        this.a = m93Var;
        this.b = m93Var2;
    }
}
