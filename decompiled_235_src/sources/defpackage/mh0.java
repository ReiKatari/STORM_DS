package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mh0  reason: default package */
/* loaded from: classes.dex */
public final class mh0 {
    public static final mh0 b;
    public static final mh0 c;
    public final LinkedHashSet a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new lt3(0));
        b = new mh0(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new lt3(1));
        c = new mh0(linkedHashSet2);
    }

    public mh0(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            lt3 lt3Var = (lt3) it.next();
            List<zf0> unmodifiableList = Collections.unmodifiableList(arrayList2);
            lt3Var.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (zf0 zf0Var : unmodifiableList) {
                np2.s("The camera info doesn't contain internal implementation.", zf0Var instanceof cg0);
                if (zf0Var.m() == lt3Var.a) {
                    arrayList3.add(zf0Var);
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
            lt3 lt3Var = (lt3) it.next();
            if (lt3Var instanceof lt3) {
                Integer valueOf = Integer.valueOf(lt3Var.a);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    i.m("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final eg0 c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((eg0) it.next()).a());
        }
        ArrayList a = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            eg0 eg0Var = (eg0) it2.next();
            if (a.contains(eg0Var.a())) {
                linkedHashSet2.add(eg0Var);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (eg0) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            cg0 q = ((eg0) it4.next()).q();
            String d = q.d();
            int m = q.m();
            sb.append(" Id:" + d + "  Lens:" + m);
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        LinkedHashSet linkedHashSet3 = this.a;
        int size = linkedHashSet3.size();
        sb3.append("PhyId:null  Filters:" + size);
        Iterator it5 = linkedHashSet3.iterator();
        while (it5.hasNext()) {
            lt3 lt3Var = (lt3) it5.next();
            sb3.append(" Id:");
            lt3Var.getClass();
            sb3.append(lt3.b);
            if (lt3Var instanceof lt3) {
                sb3.append(" LensFilter:");
                sb3.append(lt3Var.a);
            }
        }
        String sb4 = sb3.toString();
        throw new IllegalArgumentException("No available camera can be found. " + sb2 + " " + sb4);
    }
}
