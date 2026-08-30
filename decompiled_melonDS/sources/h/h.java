package h;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import g2.v3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import mh.z;
import p7.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f5825a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f5826b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f5827c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f5828d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final transient LinkedHashMap f5829e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f5830f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f5831g = new Bundle();

    public final boolean a(int i2, int i10, Intent intent) {
        b bVar;
        String str = (String) this.f5825a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.f5829e.get(str);
        if (eVar != null) {
            bVar = eVar.f5817a;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            ArrayList arrayList = this.f5828d;
            if (arrayList.contains(str)) {
                eVar.f5817a.a(eVar.f5818b.c(intent, i10));
                arrayList.remove(str);
                return true;
            }
        }
        this.f5830f.remove(str);
        this.f5831g.putParcelable(str, new a(intent, i10));
        return true;
    }

    public abstract void b(int i2, i.a aVar, Object obj);

    public final g c(final String str, x xVar, final i.a aVar, final b bVar) {
        str.getClass();
        aVar.getClass();
        bVar.getClass();
        r lifecycle = xVar.getLifecycle();
        if (!lifecycle.b().isAtLeast(q.STARTED)) {
            e(str);
            LinkedHashMap linkedHashMap = this.f5827c;
            f fVar = (f) linkedHashMap.get(str);
            if (fVar == null) {
                fVar = new f(lifecycle);
            }
            v vVar = new v() { // from class: h.d
                @Override // androidx.lifecycle.v
                public final void d(x xVar2, p pVar) {
                    h hVar = h.this;
                    LinkedHashMap linkedHashMap2 = hVar.f5829e;
                    p pVar2 = p.ON_START;
                    String str2 = str;
                    if (pVar2 == pVar) {
                        Bundle bundle = hVar.f5831g;
                        LinkedHashMap linkedHashMap3 = hVar.f5830f;
                        i.a aVar2 = aVar;
                        b bVar2 = bVar;
                        linkedHashMap2.put(str2, new e(aVar2, bVar2));
                        if (linkedHashMap3.containsKey(str2)) {
                            Object obj = linkedHashMap3.get(str2);
                            linkedHashMap3.remove(str2);
                            bVar2.a(obj);
                        }
                        a aVar3 = (a) o.k(bundle, str2, a.class);
                        if (aVar3 != null) {
                            bundle.remove(str2);
                            bVar2.a(aVar2.c(aVar3.B, aVar3.A));
                        }
                    } else if (p.ON_STOP == pVar) {
                        linkedHashMap2.remove(str2);
                    } else if (p.ON_DESTROY == pVar) {
                        hVar.f(str2);
                    }
                }
            };
            fVar.f5819a.a(vVar);
            fVar.f5820b.add(vVar);
            linkedHashMap.put(str, fVar);
            return new g(this, str, aVar, 0);
        }
        StringBuilder sb2 = new StringBuilder("LifecycleOwner ");
        sb2.append(xVar);
        q b10 = lifecycle.b();
        sb2.append(" is attempting to register while current state is ");
        sb2.append(b10);
        sb2.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb2.toString().toString());
    }

    public final g d(String str, i.a aVar, b bVar) {
        str.getClass();
        e(str);
        this.f5829e.put(str, new e(aVar, bVar));
        LinkedHashMap linkedHashMap = this.f5830f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            bVar.a(obj);
        }
        Bundle bundle = this.f5831g;
        a aVar2 = (a) o.k(bundle, str, a.class);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.a(aVar.c(aVar2.B, aVar2.A));
        }
        return new g(this, str, aVar, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f5826b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        v3 v3Var = new v3(5);
        Iterator it = new uc.a(new jc.h(3, v3Var, new z(22, v3Var))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f5825a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        m9.o.x("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        str.getClass();
        if (!this.f5828d.contains(str) && (num = (Integer) this.f5826b.remove(str)) != null) {
            this.f5825a.remove(num);
        }
        this.f5829e.remove(str);
        LinkedHashMap linkedHashMap = this.f5830f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder u4 = w.d.u("Dropping pending result for request ", str, ": ");
            u4.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", u4.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f5831g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((a) o.k(bundle, str, a.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f5827c;
        f fVar = (f) linkedHashMap2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f5820b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                fVar.f5819a.c((v) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
