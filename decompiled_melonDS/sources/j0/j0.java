package j0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 implements e1 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7222a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f7223b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f7224c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public b5.l f7225d;

    /* renamed from: e  reason: collision with root package name */
    public b5.i f7226e;

    /* renamed from: f  reason: collision with root package name */
    public w.j f7227f;

    @Override // j0.e1
    public final void a(List list) {
        HashSet hashSet;
        HashMap hashMap = new HashMap();
        synchronized (this.f7222a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f7223b.keySet());
        }
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                hashMap.put(str, this.f7227f.c(str));
            }
            synchronized (this.f7222a) {
                try {
                    HashSet hashSet2 = new HashSet(this.f7223b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((d0) this.f7223b.get((String) it2.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList2 = (ArrayList) list;
                    int size = arrayList2.size();
                    int i2 = 0;
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        String str2 = (String) obj;
                        if (this.f7223b.containsKey(str2)) {
                            linkedHashMap.put(str2, (d0) this.f7223b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (d0) hashMap.get(str2));
                        }
                    }
                    this.f7223b.clear();
                    this.f7223b.putAll(linkedHashMap);
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        d0 d0Var = (d0) obj2;
                        if (d0Var != null) {
                            d0Var.h();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (d0.t e6) {
            throw new Exception("Failed to create CameraInternal", e6);
        }
    }

    public final d0 b(String str) {
        d0 d0Var;
        synchronized (this.f7222a) {
            try {
                d0Var = (d0) this.f7223b.get(str);
                if (d0Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d0Var;
    }

    public final LinkedHashSet c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f7222a) {
            linkedHashSet = new LinkedHashSet(this.f7223b.values());
        }
        return linkedHashSet;
    }

    public final void d(w.j jVar) {
        this.f7227f = jVar;
        synchronized (this.f7222a) {
            try {
                for (String str : jVar.a()) {
                    aj.g.o("CameraRepository", "Added camera: " + str);
                    d0 d0Var = (d0) this.f7223b.put(str, jVar.c(str));
                    if (d0Var != null) {
                        d0Var.a();
                    }
                }
            } catch (d0.t e6) {
                throw new Exception(e6);
            }
        }
    }
}
