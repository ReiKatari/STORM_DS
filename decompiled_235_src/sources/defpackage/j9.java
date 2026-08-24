package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j9  reason: default package */
/* loaded from: classes.dex */
public abstract class j9 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        a9 a9Var;
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        g9 g9Var = (g9) this.e.get(str);
        if (g9Var != null) {
            a9Var = g9Var.a;
        } else {
            a9Var = null;
        }
        if (a9Var != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                g9Var.a.a(g9Var.b.c(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new z8(intent, i2));
        return true;
    }

    public abstract void b(int i, b9 b9Var, Object obj);

    public final i9 c(String str, b9 b9Var, a9 a9Var) {
        str.getClass();
        e(str);
        this.e.put(str, new g9(b9Var, a9Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            a9Var.a(obj);
        }
        Bundle bundle = this.g;
        z8 z8Var = (z8) nc1.R(bundle, str, z8.class);
        if (z8Var != null) {
            bundle.remove(str);
            a9Var.a(b9Var.c(z8Var.B, z8Var.A));
        }
        return new i9(this, str, b9Var, 1);
    }

    public final i9 d(final String str, hu3 hu3Var, final b9 b9Var, final a9 a9Var) {
        str.getClass();
        b9Var.getClass();
        a9Var.getClass();
        ut3 lifecycle = hu3Var.getLifecycle();
        if (!lifecycle.b().isAtLeast(tt3.STARTED)) {
            e(str);
            LinkedHashMap linkedHashMap = this.c;
            h9 h9Var = (h9) linkedHashMap.get(str);
            if (h9Var == null) {
                h9Var = new h9(lifecycle);
            }
            fu3 fu3Var = new fu3() { // from class: f9
                @Override // defpackage.fu3
                public final void h(hu3 hu3Var2, st3 st3Var) {
                    j9 j9Var = j9.this;
                    LinkedHashMap linkedHashMap2 = j9Var.e;
                    st3 st3Var2 = st3.ON_START;
                    String str2 = str;
                    if (st3Var2 == st3Var) {
                        Bundle bundle = j9Var.g;
                        LinkedHashMap linkedHashMap3 = j9Var.f;
                        b9 b9Var2 = b9Var;
                        a9 a9Var2 = a9Var;
                        linkedHashMap2.put(str2, new g9(b9Var2, a9Var2));
                        if (linkedHashMap3.containsKey(str2)) {
                            Object obj = linkedHashMap3.get(str2);
                            linkedHashMap3.remove(str2);
                            a9Var2.a(obj);
                        }
                        z8 z8Var = (z8) nc1.R(bundle, str2, z8.class);
                        if (z8Var != null) {
                            bundle.remove(str2);
                            a9Var2.a(b9Var2.c(z8Var.B, z8Var.A));
                        }
                    } else if (st3.ON_STOP == st3Var) {
                        linkedHashMap2.remove(str2);
                    } else if (st3.ON_DESTROY == st3Var) {
                        j9Var.f(str2);
                    }
                }
            };
            h9Var.a.a(fu3Var);
            h9Var.b.add(fu3Var);
            linkedHashMap.put(str, h9Var);
            return new i9(this, str, b9Var, 0);
        }
        StringBuilder sb = new StringBuilder("LifecycleOwner ");
        sb.append(hu3Var);
        tt3 b = lifecycle.b();
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
        c5 c5Var = new c5(5);
        Iterator it = new f11(new qd2(c5Var, new ro5(c5Var, 10), 3)).iterator();
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
        fa6.e("Sequence contains no element matching the predicate.");
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
            StringBuilder t = i61.t("Dropping pending result for request ", str, ": ");
            t.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", t.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((z8) nc1.R(bundle, str, z8.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        h9 h9Var = (h9) linkedHashMap2.get(str);
        if (h9Var != null) {
            ArrayList arrayList = h9Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                h9Var.a.c((fu3) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
