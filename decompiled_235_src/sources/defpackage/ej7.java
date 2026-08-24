package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej7  reason: default package */
/* loaded from: classes.dex */
public final class ej7 {
    public final ei7 a;
    public final sh0 b;
    public final qt2 c;
    public final ei7 d;
    public final ex6 e = new ex6(new on2(this) { // from class: dj7
        public final /* synthetic */ ej7 B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            int i = r2;
            ej7 ej7Var = this.B;
            switch (i) {
                case 0:
                    return (sf0) ej7Var.a.get();
                default:
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((Map) ej7Var.d.get()).entrySet()) {
                        ji0 ji0Var = (ji0) entry.getKey();
                        ig1 ig1Var = (ig1) entry.getValue();
                        jr6 jr6Var = ej7Var.a().L;
                        jr6Var.getClass();
                        ji0Var.getClass();
                        ki0 ki0Var = (ki0) jr6Var.B.get(ji0Var);
                        if (ki0Var != null) {
                            linkedHashMap.put(ig1Var, new kr6(ki0Var.a));
                        }
                    }
                    return c14.s0(linkedHashMap);
            }
        }
    });
    public final ex6 f = new ex6(new on2(this) { // from class: dj7
        public final /* synthetic */ ej7 B;

        {
            this.B = this;
        }

        @Override // defpackage.on2
        public final Object c() {
            int i = r2;
            ej7 ej7Var = this.B;
            switch (i) {
                case 0:
                    return (sf0) ej7Var.a.get();
                default:
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : ((Map) ej7Var.d.get()).entrySet()) {
                        ji0 ji0Var = (ji0) entry.getKey();
                        ig1 ig1Var = (ig1) entry.getValue();
                        jr6 jr6Var = ej7Var.a().L;
                        jr6Var.getClass();
                        ji0Var.getClass();
                        ki0 ki0Var = (ki0) jr6Var.B.get(ji0Var);
                        if (ki0Var != null) {
                            linkedHashMap.put(ig1Var, new kr6(ki0Var.a));
                        }
                    }
                    return c14.s0(linkedHashMap);
            }
        }
    });

    public ej7(ei7 ei7Var, sh0 sh0Var, qt2 qt2Var, ei7 ei7Var2) {
        this.a = ei7Var;
        this.b = sh0Var;
        this.c = qt2Var;
        this.d = ei7Var2;
    }

    public final sf0 a() {
        Object value = this.e.getValue();
        value.getClass();
        return (sf0) value;
    }

    public final LinkedHashSet b(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kr6 kr6Var = (kr6) ((Map) this.f.getValue()).get((ig1) it.next());
            if (kr6Var != null) {
                linkedHashSet.add(new kr6(kr6Var.a));
            }
        }
        return linkedHashSet;
    }
}
