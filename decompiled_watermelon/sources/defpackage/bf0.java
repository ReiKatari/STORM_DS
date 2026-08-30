package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bf0  reason: default package */
/* loaded from: classes.dex */
public final class bf0 implements a43 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashSet c = new HashSet();
    public fq3 d;
    public i90 e;
    public zc0 f;

    @Override // defpackage.a43
    public final void a(List list) {
        HashSet hashSet;
        HashMap hashMap = new HashMap();
        synchronized (this.a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.b.keySet());
        }
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                hashMap.put(str, this.f.f(str));
            }
            synchronized (this.a) {
                try {
                    HashSet hashSet2 = new HashSet(this.b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((vd0) this.b.get((String) it2.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList2 = (ArrayList) list;
                    int size = arrayList2.size();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        String str2 = (String) obj;
                        if (this.b.containsKey(str2)) {
                            linkedHashMap.put(str2, (vd0) this.b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (vd0) hashMap.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(linkedHashMap);
                    int size2 = arrayList.size();
                    while (i < size2) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        vd0 vd0Var = (vd0) obj2;
                        if (vd0Var != null) {
                            vd0Var.i();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (gg0 e) {
            throw new Exception("Failed to create CameraInternal", e);
        }
    }

    public final vd0 b(String str) {
        vd0 vd0Var;
        synchronized (this.a) {
            try {
                vd0Var = (vd0) this.b.get(str);
                if (vd0Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vd0Var;
    }

    public final LinkedHashSet c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.a) {
            linkedHashSet = new LinkedHashSet(this.b.values());
        }
        return linkedHashSet;
    }

    public final void d(zc0 zc0Var) {
        this.f = zc0Var;
        synchronized (this.a) {
            try {
                for (String str : zc0Var.e()) {
                    ve2.v("CameraRepository", "Added camera: " + str);
                    vd0 vd0Var = (vd0) this.b.put(str, zc0Var.f(str));
                    if (vd0Var != null) {
                        vd0Var.a();
                    }
                }
            } catch (gg0 e) {
                throw new Exception(e);
            }
        }
    }
}
