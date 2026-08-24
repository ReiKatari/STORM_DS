package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d56  reason: default package */
/* loaded from: classes.dex */
public final class d56 {
    public final f56 a;
    public hq b;

    public d56(f56 f56Var) {
        this.a = f56Var;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        f56 f56Var = this.a;
        if (f56Var.g) {
            Bundle bundle2 = f56Var.f;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2.containsKey(str)) {
                bundle = bundle2.getBundle(str);
                if (bundle == null) {
                    xk2.B(str);
                    throw null;
                }
            } else {
                bundle = null;
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                f56Var.f = null;
            }
            return bundle;
        }
        i.m("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        return null;
    }

    public final c56 b(String str) {
        c56 c56Var;
        f56 f56Var = this.a;
        synchronized (f56Var.c) {
            Iterator it = f56Var.d.entrySet().iterator();
            do {
                c56Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                c56 c56Var2 = (c56) entry.getValue();
                if (nb3.k((String) entry.getKey(), str)) {
                    c56Var = c56Var2;
                    continue;
                }
            } while (c56Var == null);
        }
        return c56Var;
    }

    public final void c(String str, c56 c56Var) {
        c56Var.getClass();
        f56 f56Var = this.a;
        synchronized (f56Var.c) {
            if (!f56Var.d.containsKey(str)) {
                f56Var.d.put(str, c56Var);
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public final void d() {
        if (this.a.h) {
            hq hqVar = this.b;
            if (hqVar == null) {
                hqVar = new hq(this);
            }
            this.b = hqVar;
            try {
                it3.class.getDeclaredConstructor(null);
                hq hqVar2 = this.b;
                if (hqVar2 != null) {
                    ((LinkedHashSet) hqVar2.b).add(it3.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                String simpleName = it3.class.getSimpleName();
                throw new IllegalArgumentException("Class " + simpleName + " must have default constructor in order to be automatically recreated", e);
            }
        }
        i.m("Can not perform this action after onSaveInstanceState");
    }
}
