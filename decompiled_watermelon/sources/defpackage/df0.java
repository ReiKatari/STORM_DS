package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: df0  reason: default package */
/* loaded from: classes.dex */
public final class df0 {
    public static final df0 b;
    public static final df0 c;
    public final LinkedHashSet a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new jm3(0));
        b = new df0(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new jm3(1));
        c = new df0(linkedHashSet2);
    }

    public df0(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            jm3 jm3Var = (jm3) it.next();
            List<qd0> unmodifiableList = Collections.unmodifiableList(arrayList2);
            jm3Var.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (qd0 qd0Var : unmodifiableList) {
                nl2.y("The camera info doesn't contain internal implementation.", qd0Var instanceof td0);
                if (qd0Var.c() == jm3Var.a) {
                    arrayList3.add(qd0Var);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Iterator it = this.a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            jm3 jm3Var = (jm3) it.next();
            if (jm3Var instanceof jm3) {
                Integer valueOf = Integer.valueOf(jm3Var.a);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    i.n("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final vd0 c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((vd0) it.next()).b());
        }
        ArrayList a = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            vd0 vd0Var = (vd0) it2.next();
            if (a.contains(vd0Var.b())) {
                linkedHashSet2.add(vd0Var);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (vd0) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            td0 l = ((vd0) it4.next()).l();
            String f = l.f();
            int c2 = l.c();
            sb.append(" Id:" + f + "  Lens:" + c2);
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        LinkedHashSet linkedHashSet3 = this.a;
        int size = linkedHashSet3.size();
        sb3.append("PhyId:null  Filters:" + size);
        Iterator it5 = linkedHashSet3.iterator();
        while (it5.hasNext()) {
            jm3 jm3Var = (jm3) it5.next();
            sb3.append(" Id:");
            jm3Var.getClass();
            sb3.append(jm3.b);
            if (jm3Var instanceof jm3) {
                sb3.append(" LensFilter:");
                sb3.append(jm3Var.a);
            }
        }
        String sb4 = sb3.toString();
        throw new IllegalArgumentException("No available camera can be found. " + sb2 + " " + sb4);
    }
}
