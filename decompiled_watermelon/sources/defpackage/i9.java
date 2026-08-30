package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i9  reason: default package */
/* loaded from: classes.dex */
public abstract class i9 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        z8 z8Var;
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        f9 f9Var = (f9) this.e.get(str);
        if (f9Var != null) {
            z8Var = f9Var.a;
        } else {
            z8Var = null;
        }
        if (z8Var != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                f9Var.a.b(f9Var.b.c(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new y8(intent, i2));
        return true;
    }

    public abstract void b(int i, a9 a9Var, Object obj);

    public final h9 c(String str, a9 a9Var, z8 z8Var) {
        str.getClass();
        e(str);
        this.e.put(str, new f9(a9Var, z8Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            z8Var.b(obj);
        }
        Bundle bundle = this.g;
        y8 y8Var = (y8) mh7.O(bundle, str, y8.class);
        if (y8Var != null) {
            bundle.remove(str);
            z8Var.b(a9Var.c(y8Var.B, y8Var.A));
        }
        return new h9(this, str, a9Var, 1);
    }

    public final h9 d(final String str, fn3 fn3Var, final a9 a9Var, final z8 z8Var) {
        str.getClass();
        a9Var.getClass();
        z8Var.getClass();
        rm3 lifecycle = fn3Var.getLifecycle();
        if (!lifecycle.b().isAtLeast(qm3.STARTED)) {
            e(str);
            LinkedHashMap linkedHashMap = this.c;
            g9 g9Var = (g9) linkedHashMap.get(str);
            if (g9Var == null) {
                g9Var = new g9(lifecycle);
            }
            dn3 dn3Var = new dn3() { // from class: e9
                @Override // defpackage.dn3
                public final void d(fn3 fn3Var2, pm3 pm3Var) {
                    i9 i9Var = i9.this;
                    LinkedHashMap linkedHashMap2 = i9Var.e;
                    pm3 pm3Var2 = pm3.ON_START;
                    String str2 = str;
                    if (pm3Var2 == pm3Var) {
                        Bundle bundle = i9Var.g;
                        LinkedHashMap linkedHashMap3 = i9Var.f;
                        a9 a9Var2 = a9Var;
                        z8 z8Var2 = z8Var;
                        linkedHashMap2.put(str2, new f9(a9Var2, z8Var2));
                        if (linkedHashMap3.containsKey(str2)) {
                            Object obj = linkedHashMap3.get(str2);
                            linkedHashMap3.remove(str2);
                            z8Var2.b(obj);
                        }
                        y8 y8Var = (y8) mh7.O(bundle, str2, y8.class);
                        if (y8Var != null) {
                            bundle.remove(str2);
                            z8Var2.b(a9Var2.c(y8Var.B, y8Var.A));
                        }
                    } else if (pm3.ON_STOP == pm3Var) {
                        linkedHashMap2.remove(str2);
                    } else if (pm3.ON_DESTROY == pm3Var) {
                        i9Var.f(str2);
                    }
                }
            };
            g9Var.a.a(dn3Var);
            g9Var.b.add(dn3Var);
            linkedHashMap.put(str, g9Var);
            return new h9(this, str, a9Var, 0);
        }
        StringBuilder sb = new StringBuilder("LifecycleOwner ");
        sb.append(fn3Var);
        qm3 b = lifecycle.b();
        sb.append(" is attempting to register while current state is ");
        sb.append(b);
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString().toString());
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        d5 d5Var = new d5(5);
        Iterator it = new ay0(new o72(d5Var, new n95(12, d5Var))).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        vd6.e("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder u = b31.u("Dropping pending result for request ", str, ": ");
            u.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", u.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((y8) mh7.O(bundle, str, y8.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        g9 g9Var = (g9) linkedHashMap2.get(str);
        if (g9Var != null) {
            ArrayList arrayList = g9Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                g9Var.a.c((dn3) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
