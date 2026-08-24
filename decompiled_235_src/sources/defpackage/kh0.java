package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kh0  reason: default package */
/* loaded from: classes.dex */
public final class kh0 implements ia3 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashSet c = new HashSet();
    public gx3 d;
    public qb0 e;
    public if0 f;

    @Override // defpackage.ia3
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
                        arrayList.add((eg0) this.b.get((String) it2.next()));
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
                            linkedHashMap.put(str2, (eg0) this.b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (eg0) hashMap.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(linkedHashMap);
                    int size2 = arrayList.size();
                    while (i < size2) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        eg0 eg0Var = (eg0) obj2;
                        if (eg0Var != null) {
                            eg0Var.n();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (pi0 e) {
            throw new Exception("Failed to create CameraInternal", e);
        }
    }

    public final eg0 b(String str) {
        eg0 eg0Var;
        synchronized (this.a) {
            try {
                eg0Var = (eg0) this.b.get(str);
                if (eg0Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eg0Var;
    }

    public final LinkedHashSet c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.a) {
            linkedHashSet = new LinkedHashSet(this.b.values());
        }
        return linkedHashSet;
    }

    public final void d(if0 if0Var) {
        this.f = if0Var;
        synchronized (this.a) {
            try {
                for (String str : if0Var.e()) {
                    kj2.t("CameraRepository", "Added camera: " + str);
                    eg0 eg0Var = (eg0) this.b.put(str, if0Var.f(str));
                    if (eg0Var != null) {
                        eg0Var.release();
                    }
                }
            } catch (pi0 e) {
                throw new Exception(e);
            }
        }
    }
}
