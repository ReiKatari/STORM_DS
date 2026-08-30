package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ox4  reason: default package */
/* loaded from: classes.dex */
public final class ox4 {
    public final ArrayList a;

    public ox4(ArrayList arrayList) {
        this.a = new ArrayList(arrayList);
    }

    public static String d(ox4 ox4Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = ox4Var.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((kx4) obj).getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) " | ");
            }
        }
        return sb.toString();
    }

    public final boolean a(Class cls) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (cls.isAssignableFrom(((kx4) obj).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final kx4 b(Class cls) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kx4 kx4Var = (kx4) obj;
            if (kx4Var.getClass() == cls) {
                return kx4Var;
            }
        }
        return null;
    }

    public final ArrayList c(Class cls) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            kx4 kx4Var = (kx4) obj;
            if (cls.isAssignableFrom(kx4Var.getClass())) {
                arrayList.add(kx4Var);
            }
        }
        return arrayList;
    }
}
