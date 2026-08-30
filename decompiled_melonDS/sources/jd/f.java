package jd;

import a2.n;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nc.u;
import zb.q;
import zb.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends nd.b {

    /* renamed from: a  reason: collision with root package name */
    public final nc.e f7809a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7810b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7811c = p7.a.s(yb.h.PUBLICATION, new n(25, this));

    /* renamed from: d  reason: collision with root package name */
    public final Map f7812d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f7813e;

    public f(nc.e eVar, nc.e[] eVarArr, a[] aVarArr, Annotation[] annotationArr) {
        this.f7809a = eVar;
        this.f7810b = q.A;
        if (eVarArr.length == aVarArr.length) {
            int min = Math.min(eVarArr.length, aVarArr.length);
            ArrayList arrayList = new ArrayList(min);
            for (int i2 = 0; i2 < min; i2++) {
                arrayList.add(new yb.j(eVarArr[i2], aVarArr[i2]));
            }
            Map H = v.H(arrayList);
            this.f7812d = H;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : H.entrySet()) {
                String b10 = ((a) entry.getValue()).e().b();
                Object obj = linkedHashMap.get(b10);
                if (obj == null) {
                    linkedHashMap.containsKey(b10);
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (entry2 == null) {
                    linkedHashMap.put(b10, entry);
                } else {
                    StringBuilder sb2 = new StringBuilder("Multiple sealed subclasses of '");
                    sb2.append(this.f7809a);
                    sb2.append("' have the same serial name '");
                    sb2.append(b10);
                    sb2.append("': '");
                    sb2.append(entry2.getKey());
                    Object key = entry.getKey();
                    sb2.append("', '");
                    sb2.append(key);
                    sb2.append('\'');
                    throw new IllegalStateException(sb2.toString().toString());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(v.E(linkedHashMap.size()));
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (a) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.f7813e = linkedHashMap2;
            List asList = Arrays.asList(annotationArr);
            asList.getClass();
            this.f7810b = asList;
            return;
        }
        String c4 = eVar.c();
        throw new IllegalArgumentException("All subclasses of sealed class " + c4 + " should be marked @Serializable");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yb.f, java.lang.Object] */
    @Override // jd.a
    public final ld.e e() {
        return (ld.e) this.f7811c.getValue();
    }

    @Override // nd.b
    public final a f(md.a aVar, String str) {
        a aVar2 = (a) this.f7813e.get(str);
        if (aVar2 != null) {
            return aVar2;
        }
        super.f(aVar, str);
        return null;
    }

    @Override // nd.b
    public final a g(md.d dVar, Object obj) {
        a aVar;
        obj.getClass();
        a aVar2 = (a) this.f7812d.get(u.a(obj.getClass()));
        if (aVar2 != null) {
            aVar = aVar2;
        } else {
            super.g(dVar, obj);
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar;
    }

    @Override // nd.b
    public final nc.e h() {
        return this.f7809a;
    }
}
