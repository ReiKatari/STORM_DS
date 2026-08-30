package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g57  reason: default package */
/* loaded from: classes.dex */
public final class g57 {
    public final g47 a;
    public final jf0 b;
    public final kn2 c;
    public final g47 d;
    public final il6 e = new il6(new ki2(this) { // from class: f57
        public final /* synthetic */ g57 B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            int i = r2;
            g57 g57Var = this.B;
            switch (i) {
                case 0:
                    return (jd0) g57Var.a.get();
                default:
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((Map) g57Var.d.get()).entrySet()) {
                        ag0 ag0Var = (ag0) entry.getKey();
                        hc1 hc1Var = (hc1) entry.getValue();
                        tf6 tf6Var = g57Var.a().L;
                        tf6Var.getClass();
                        ag0Var.getClass();
                        bg0 bg0Var = (bg0) tf6Var.B.get(ag0Var);
                        if (bg0Var != null) {
                            linkedHashMap.put(hc1Var, new uf6(bg0Var.a));
                        }
                    }
                    return zt3.r0(linkedHashMap);
            }
        }
    });
    public final il6 f = new il6(new ki2(this) { // from class: f57
        public final /* synthetic */ g57 B;

        {
            this.B = this;
        }

        @Override // defpackage.ki2
        public final Object c() {
            int i = r2;
            g57 g57Var = this.B;
            switch (i) {
                case 0:
                    return (jd0) g57Var.a.get();
                default:
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((Map) g57Var.d.get()).entrySet()) {
                        ag0 ag0Var = (ag0) entry.getKey();
                        hc1 hc1Var = (hc1) entry.getValue();
                        tf6 tf6Var = g57Var.a().L;
                        tf6Var.getClass();
                        ag0Var.getClass();
                        bg0 bg0Var = (bg0) tf6Var.B.get(ag0Var);
                        if (bg0Var != null) {
                            linkedHashMap.put(hc1Var, new uf6(bg0Var.a));
                        }
                    }
                    return zt3.r0(linkedHashMap);
            }
        }
    });

    public g57(g47 g47Var, jf0 jf0Var, kn2 kn2Var, g47 g47Var2) {
        this.a = g47Var;
        this.b = jf0Var;
        this.c = kn2Var;
        this.d = g47Var2;
    }

    public final jd0 a() {
        Object value = this.e.getValue();
        value.getClass();
        return (jd0) value;
    }

    public final LinkedHashSet b(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uf6 uf6Var = (uf6) ((Map) this.f.getValue()).get((hc1) it.next());
            if (uf6Var != null) {
                linkedHashSet.add(new uf6(uf6Var.a));
            }
        }
        return linkedHashSet;
    }
}
