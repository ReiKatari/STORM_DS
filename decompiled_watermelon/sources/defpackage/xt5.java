package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xt5  reason: default package */
/* loaded from: classes.dex */
public final class xt5 {
    public final zt5 a;
    public vp b;

    public xt5(zt5 zt5Var) {
        this.a = zt5Var;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        zt5 zt5Var = this.a;
        if (zt5Var.g) {
            Bundle bundle2 = zt5Var.f;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2.containsKey(str)) {
                bundle = bundle2.getBundle(str);
                if (bundle == null) {
                    jk2.H(str);
                    throw null;
                }
            } else {
                bundle = null;
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                zt5Var.f = null;
            }
            return bundle;
        }
        i.n("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        return null;
    }

    public final wt5 b(String str) {
        wt5 wt5Var;
        zt5 zt5Var = this.a;
        synchronized (zt5Var.c) {
            Iterator it = zt5Var.d.entrySet().iterator();
            do {
                wt5Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                wt5 wt5Var2 = (wt5) entry.getValue();
                if (b53.x((String) entry.getKey(), str)) {
                    wt5Var = wt5Var2;
                    continue;
                }
            } while (wt5Var == null);
        }
        return wt5Var;
    }

    public final void c(String str, wt5 wt5Var) {
        wt5Var.getClass();
        zt5 zt5Var = this.a;
        synchronized (zt5Var.c) {
            if (!zt5Var.d.containsKey(str)) {
                zt5Var.d.put(str, wt5Var);
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public final void d() {
        if (this.a.h) {
            vp vpVar = this.b;
            if (vpVar == null) {
                vpVar = new vp(this);
            }
            this.b = vpVar;
            try {
                gm3.class.getDeclaredConstructor(null);
                vp vpVar2 = this.b;
                if (vpVar2 != null) {
                    ((LinkedHashSet) vpVar2.b).add(gm3.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                String simpleName = gm3.class.getSimpleName();
                throw new IllegalArgumentException("Class " + simpleName + " must have default constructor in order to be automatically recreated", e);
            }
        }
        i.n("Can not perform this action after onSaveInstanceState");
    }
}
