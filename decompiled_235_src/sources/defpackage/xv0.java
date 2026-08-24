package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xv0  reason: default package */
/* loaded from: classes.dex */
public final class xv0 extends ak7 {
    public final j62 o;
    public final HashMap l = new HashMap();
    public final HashMap m = new HashMap();
    public final HashMap n = new HashMap();
    public final AtomicReference p = new AtomicReference();

    public xv0(Executor executor, ArrayList arrayList, List list) {
        j62 j62Var = new j62(executor);
        this.o = j62Var;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(bv0.b(j62Var, j62.class, xt6.class, g65.class));
        int i = 0;
        arrayList2.add(bv0.b(this, xv0.class, new Class[0]));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bv0 bv0Var = (bv0) it.next();
            if (bv0Var != null) {
                arrayList2.add(bv0Var);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList3.add(obj);
        }
        ArrayList arrayList4 = new ArrayList();
        synchronized (this) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                try {
                    tv0 tv0Var = (tv0) ((o55) it2.next()).get();
                    if (tv0Var != null) {
                        arrayList2.addAll(tv0Var.getComponents());
                        it2.remove();
                    }
                } catch (vb3 e) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.l.isEmpty()) {
                hf.L(arrayList2);
            } else {
                ArrayList arrayList5 = new ArrayList(this.l.keySet());
                arrayList5.addAll(arrayList2);
                hf.L(arrayList5);
            }
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                final bv0 bv0Var2 = (bv0) obj2;
                this.l.put(bv0Var2, new ho3(new o55(this, bv0Var2) { // from class: vv0
                    public final xv0 a;
                    public final bv0 b;

                    {
                        this.a = this;
                        this.b = bv0Var2;
                    }

                    @Override // defpackage.o55
                    public final Object get() {
                        bv0 bv0Var3 = this.b;
                        return bv0Var3.d.create(new bm5(bv0Var3, this.a));
                    }
                }));
            }
            arrayList4.addAll(O0(arrayList2));
            arrayList4.addAll(P0());
            N0();
        }
        int size3 = arrayList4.size();
        while (i < size3) {
            Object obj3 = arrayList4.get(i);
            i++;
            ((Runnable) obj3).run();
        }
        Boolean bool = (Boolean) this.p.get();
        if (bool != null) {
            L0(this.l, bool.booleanValue());
        }
    }

    public final void L0(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            o55 o55Var = (o55) entry.getValue();
            ((bv0) entry.getKey()).getClass();
        }
        j62 j62Var = this.o;
        synchronized (j62Var) {
            try {
                arrayDeque = j62Var.a;
                if (arrayDeque != null) {
                    j62Var.a = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw i61.j(it);
            }
        }
    }

    public final void M0() {
        HashMap hashMap;
        AtomicReference atomicReference = this.p;
        Boolean bool = Boolean.TRUE;
        while (!atomicReference.compareAndSet(null, bool)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.l);
        }
        L0(hashMap, true);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [do4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [tr3, java.lang.Object] */
    public final void N0() {
        for (bv0 bv0Var : this.l.keySet()) {
            for (wh1 wh1Var : bv0Var.b) {
                if (wh1Var.b == 2 && !this.n.containsKey(wh1Var.a)) {
                    HashMap hashMap = this.n;
                    Class cls = wh1Var.a;
                    ?? obj = new Object();
                    obj.b = null;
                    obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.a.addAll(Collections.EMPTY_SET);
                    hashMap.put(cls, obj);
                } else if (this.m.containsKey(wh1Var.a)) {
                    continue;
                } else {
                    int i = wh1Var.b;
                    if (i != 1) {
                        if (i != 2) {
                            HashMap hashMap2 = this.m;
                            Class cls2 = wh1Var.a;
                            d90 d90Var = d90.A0;
                            wv0 wv0Var = wv0.c;
                            ?? obj2 = new Object();
                            obj2.a = d90Var;
                            obj2.b = wv0Var;
                            hashMap2.put(cls2, obj2);
                        }
                    } else {
                        Class cls3 = wh1Var.a;
                        throw new RuntimeException("Unsatisfied dependency for component " + bv0Var + ": " + cls3);
                    }
                }
            }
        }
    }

    public final ArrayList O0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bv0 bv0Var = (bv0) obj;
            if (bv0Var.c == 0) {
                o55 o55Var = (o55) this.l.get(bv0Var);
                for (Class cls : bv0Var.a) {
                    HashMap hashMap = this.m;
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, o55Var);
                    } else {
                        arrayList2.add(new uo2(7, (do4) ((o55) hashMap.get(cls)), o55Var));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [tr3, java.lang.Object] */
    public final ArrayList P0() {
        HashMap hashMap = this.n;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : this.l.entrySet()) {
            bv0 bv0Var = (bv0) entry.getKey();
            if (bv0Var.c != 0) {
                o55 o55Var = (o55) entry.getValue();
                for (Class cls : bv0Var.a) {
                    if (!hashMap2.containsKey(cls)) {
                        hashMap2.put(cls, new HashSet());
                    }
                    ((Set) hashMap2.get(cls)).add(o55Var);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (!hashMap.containsKey(entry2.getKey())) {
                ?? obj = new Object();
                obj.b = null;
                obj.a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap.put((Class) entry2.getKey(), obj);
            } else {
                tr3 tr3Var = (tr3) hashMap.get(entry2.getKey());
                for (o55 o55Var2 : (Set) entry2.getValue()) {
                    arrayList.add(new uo2(8, tr3Var, o55Var2));
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.ov0
    public final synchronized o55 b(Class cls) {
        ln2.k(cls, "Null interface requested.");
        return (o55) this.m.get(cls);
    }

    @Override // defpackage.ov0
    public final synchronized o55 c(Class cls) {
        tr3 tr3Var = (tr3) this.n.get(cls);
        if (tr3Var != null) {
            return tr3Var;
        }
        return wv0.b;
    }
}
