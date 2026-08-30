package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qc0  reason: default package */
/* loaded from: classes.dex */
public final class qc0 implements a43 {
    public final tc0 a;
    public final Object b;
    public bf0 c;
    public final ArrayList d;
    public int e;
    public boolean f;

    public qc0(ke0 ke0Var, tc0 tc0Var) {
        tc0Var.getClass();
        this.a = tc0Var;
        this.b = new Object();
        this.d = new ArrayList();
    }

    @Override // defpackage.a43
    public final void a(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Set<Set> c = tc0.c(this.a);
            if (c == null) {
                c = up1.A;
            }
            for (Set set : c) {
                Set<od0> set2 = set;
                ArrayList arrayList = new ArrayList(uq0.y0(set2, 10));
                for (od0 od0Var : set2) {
                    arrayList.add(od0Var.a);
                }
                Set s1 = tq0.s1(arrayList);
                if (!list.containsAll(s1)) {
                    if (ve2.I()) {
                        Log.w("CXCP", "Failed to retrieve concurrent camera: " + s1 + " from " + list);
                    }
                } else {
                    List n1 = tq0.n1(set);
                    if (n1.size() >= 2) {
                        String str = ((od0) n1.get(0)).a;
                        String str2 = ((od0) n1.get(1)).a;
                        try {
                            if (f34.H(this.a, str) && f34.H(this.a, str2)) {
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
                        } catch (fz2 e) {
                            if (ve2.I()) {
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
    /* JADX WARN: Type inference failed for: r0v1, types: [pp1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [qc0] */
    public final void b(bf0 bf0Var) {
        ?? r0;
        bf0Var.getClass();
        synchronized (this.b) {
            this.c = bf0Var;
        }
        ArrayList a = tc0.a(this.a);
        if (a != null) {
            r0 = new ArrayList(uq0.y0(a, 10));
            int size = a.size();
            int i = 0;
            while (i < size) {
                Object obj = a.get(i);
                i++;
                r0.add(((od0) obj).a);
            }
        } else {
            r0 = pp1.A;
        }
        a(r0);
    }
}
