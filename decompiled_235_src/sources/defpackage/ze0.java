package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ze0  reason: default package */
/* loaded from: classes.dex */
public final class ze0 implements ia3 {
    public final cf0 a;
    public final Object b;
    public kh0 c;
    public final ArrayList d;
    public int e;
    public boolean f;

    public ze0(tg0 tg0Var, cf0 cf0Var) {
        cf0Var.getClass();
        this.a = cf0Var;
        this.b = new Object();
        this.d = new ArrayList();
    }

    @Override // defpackage.ia3
    public final void a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Set<Set> c = cf0.c(this.a);
            if (c == null) {
                c = du1.A;
            }
            for (Set set : c) {
                Set<xf0> set2 = set;
                ArrayList arrayList = new ArrayList(ht0.v0(set2, 10));
                for (xf0 xf0Var : set2) {
                    arrayList.add(xf0Var.a);
                }
                Set p1 = gt0.p1(arrayList);
                if (!list.containsAll(p1)) {
                    if (kj2.L()) {
                        Log.w("CXCP", "Failed to retrieve concurrent camera: " + p1 + " from " + list);
                    }
                } else {
                    List k1 = gt0.k1(set);
                    if (k1.size() >= 2) {
                        String str = ((xf0) k1.get(0)).a;
                        String str2 = ((xf0) k1.get(1)).a;
                        try {
                            if (l.B(this.a, str) && l.B(this.a, str2)) {
                                linkedHashSet.add(set);
                                if (!linkedHashMap.containsKey(str)) {
                                    linkedHashMap.put(str, new ArrayList());
                                }
                                Object obj = linkedHashMap.get(str);
                                obj.getClass();
                                ((List) obj).add(str2);
                                if (!linkedHashMap.containsKey(str2)) {
                                    linkedHashMap.put(str2, new ArrayList());
                                }
                                Object obj2 = linkedHashMap.get(str2);
                                obj2.getClass();
                                ((List) obj2).add(str);
                            }
                        } catch (i53 e) {
                            if (kj2.L()) {
                                Log.w("CXCP", "Skipping incompatible concurrent pair: " + set + " due to " + e.getMessage());
                            }
                        }
                    }
                }
            }
            synchronized (this.b) {
            }
        } catch (Exception e2) {
            throw new Exception("Failed to retrieve concurrent camera id info for camera-pipe.", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [yt1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [ze0] */
    public final void b(kh0 kh0Var) {
        ?? r0;
        kh0Var.getClass();
        synchronized (this.b) {
            this.c = kh0Var;
        }
        ArrayList a = cf0.a(this.a);
        if (a != null) {
            r0 = new ArrayList(ht0.v0(a, 10));
            int size = a.size();
            int i = 0;
            while (i < size) {
                Object obj = a.get(i);
                i++;
                r0.add(((xf0) obj).a);
            }
        } else {
            r0 = yt1.A;
        }
        a(r0);
    }
}
