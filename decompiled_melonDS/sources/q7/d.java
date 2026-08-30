package q7;

import a0.j;
import android.os.Bundle;
import androidx.lifecycle.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import l.h;
import nc.k;
import p7.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final s7.a f12310a;

    /* renamed from: b  reason: collision with root package name */
    public h f12311b;

    public d(s7.a aVar) {
        this.f12310a = aVar;
    }

    public final Bundle a(String str) {
        Bundle bundle;
        s7.a aVar = this.f12310a;
        if (aVar.f12841g) {
            Bundle bundle2 = aVar.f12840f;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2.containsKey(str)) {
                bundle = bundle2.getBundle(str);
                if (bundle == null) {
                    m.z(str);
                    throw null;
                }
            } else {
                bundle = null;
            }
            bundle2.remove(str);
            if (bundle2.isEmpty()) {
                aVar.f12840f = null;
            }
            return bundle;
        }
        j.p("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        return null;
    }

    public final c b() {
        c cVar;
        s7.a aVar = this.f12310a;
        synchronized (aVar.f12837c) {
            Iterator it = aVar.f12838d.entrySet().iterator();
            do {
                cVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                c cVar2 = (c) entry.getValue();
                if (k.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    cVar = cVar2;
                    continue;
                }
            } while (cVar == null);
        }
        return cVar;
    }

    public final void c(String str, c cVar) {
        cVar.getClass();
        s7.a aVar = this.f12310a;
        synchronized (aVar.f12837c) {
            if (!aVar.f12838d.containsKey(str)) {
                aVar.f12838d.put(str, cVar);
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public final void d() {
        if (this.f12310a.f12842h) {
            h hVar = this.f12311b;
            if (hVar == null) {
                hVar = new h(this);
            }
            this.f12311b = hVar;
            try {
                l.class.getDeclaredConstructor(null);
                h hVar2 = this.f12311b;
                if (hVar2 != null) {
                    ((LinkedHashSet) hVar2.f8421b).add(l.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e6) {
                String simpleName = l.class.getSimpleName();
                throw new IllegalArgumentException("Class " + simpleName + " must have default constructor in order to be automatically recreated", e6);
            }
        }
        j.p("Can not perform this action after onSaveInstanceState");
    }
}
