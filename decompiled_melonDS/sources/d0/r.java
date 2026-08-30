package d0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final r f3442b;

    /* renamed from: c  reason: collision with root package name */
    public static final r f3443c;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f3444a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new j0.f1(0));
        f3442b = new r(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new j0.f1(1));
        f3443c = new r(linkedHashSet2);
    }

    public r(LinkedHashSet linkedHashSet) {
        this.f3444a = linkedHashSet;
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = this.f3444a.iterator();
        while (it.hasNext()) {
            List<j0.b0> unmodifiableList = Collections.unmodifiableList(arrayList2);
            j0.f1 f1Var = (j0.f1) ((p) it.next());
            f1Var.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (j0.b0 b0Var : unmodifiableList) {
                p7.m.g("The camera info doesn't contain internal implementation.", b0Var instanceof j0.b0);
                if (b0Var.c() == f1Var.f7191b) {
                    arrayList3.add(b0Var);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Iterator it = this.f3444a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (pVar instanceof j0.f1) {
                Integer valueOf = Integer.valueOf(((j0.f1) pVar).f7191b);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    a0.j.p("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final j0.d0 c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((j0.d0) it.next()).b());
        }
        ArrayList a10 = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            j0.d0 d0Var = (j0.d0) it2.next();
            if (a10.contains(d0Var.b())) {
                linkedHashSet2.add(d0Var);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (j0.d0) it3.next();
        }
        StringBuilder sb2 = new StringBuilder("Cams:");
        sb2.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            j0.b0 k10 = ((j0.d0) it4.next()).k();
            String d4 = k10.d();
            int c4 = k10.c();
            sb2.append(" Id:" + d4 + "  Lens:" + c4);
        }
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        LinkedHashSet linkedHashSet3 = this.f3444a;
        int size = linkedHashSet3.size();
        sb4.append("PhyId:null  Filters:" + size);
        Iterator it5 = linkedHashSet3.iterator();
        while (it5.hasNext()) {
            p pVar = (p) it5.next();
            sb4.append(" Id:");
            pVar.getClass();
            sb4.append(p.f3434a);
            if (pVar instanceof j0.f1) {
                sb4.append(" LensFilter:");
                sb4.append(((j0.f1) pVar).f7191b);
            }
        }
        String sb5 = sb4.toString();
        throw new IllegalArgumentException("No available camera can be found. " + sb3 + " " + sb5);
    }
}
