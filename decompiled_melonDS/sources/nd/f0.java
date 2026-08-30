package nd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 extends a {

    /* renamed from: a  reason: collision with root package name */
    public final jd.a f10300a;

    /* renamed from: b  reason: collision with root package name */
    public final jd.a f10301b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10302c;

    /* renamed from: d  reason: collision with root package name */
    public final e0 f10303d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(jd.a aVar, jd.a aVar2, int i2) {
        this(aVar, aVar2, (byte) 0);
        this.f10302c = i2;
        aVar.getClass();
        aVar2.getClass();
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this(aVar, aVar2, (byte) 0);
                ld.e e6 = aVar.e();
                ld.e e10 = aVar2.e();
                e6.getClass();
                e10.getClass();
                this.f10303d = new e0("kotlin.collections.LinkedHashMap", e6, e10);
                return;
            default:
                ld.e e11 = aVar.e();
                ld.e e12 = aVar2.e();
                e11.getClass();
                e12.getClass();
                this.f10303d = new e0("kotlin.collections.HashMap", e11, e12);
                return;
        }
    }

    @Override // jd.a
    public final void d(md.d dVar, Object obj) {
        i(obj);
        ld.e e6 = e();
        e6.getClass();
        md.b a10 = dVar.a(e6);
        Iterator h2 = h(obj);
        int i2 = 0;
        while (h2.hasNext()) {
            Map.Entry entry = (Map.Entry) h2.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i2 + 1;
            ij.a aVar = (ij.a) a10;
            aVar.J(e(), i2, this.f10300a, key);
            i2 += 2;
            aVar.J(e(), i10, this.f10301b, value);
        }
        a10.b(e6);
    }

    @Override // jd.a
    public final ld.e e() {
        switch (this.f10302c) {
            case 0:
                return this.f10303d;
            default:
                return this.f10303d;
        }
    }

    @Override // nd.a
    public final Object f() {
        switch (this.f10302c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // nd.a
    public final int g(Object obj) {
        int size;
        switch (this.f10302c) {
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

    @Override // nd.a
    public final Iterator h(Object obj) {
        switch (this.f10302c) {
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

    @Override // nd.a
    public final int i(Object obj) {
        switch (this.f10302c) {
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

    @Override // nd.a
    public final void k(md.a aVar, int i2, Object obj) {
        Object o5;
        Map map = (Map) obj;
        map.getClass();
        Object o8 = aVar.o(e(), i2, this.f10300a, null);
        int g10 = aVar.g(e());
        if (g10 == i2 + 1) {
            boolean containsKey = map.containsKey(o8);
            jd.a aVar2 = this.f10301b;
            if (containsKey && !(aVar2.e().c() instanceof ld.d)) {
                o5 = aVar.o(e(), g10, aVar2, zb.v.D(o8, map));
            } else {
                o5 = aVar.o(e(), g10, aVar2, null);
            }
            map.put(o8, o5);
            return;
        }
        a0.j.e(kc.a.d(i2, g10, "Value must follow key in a map, index for key: ", ", returned index for value: "));
    }

    @Override // nd.a
    public final Object l(Object obj) {
        switch (this.f10302c) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // nd.a
    public final Object m(Object obj) {
        switch (this.f10302c) {
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

    public f0(jd.a aVar, jd.a aVar2, byte b10) {
        this.f10300a = aVar;
        this.f10301b = aVar2;
    }
}
