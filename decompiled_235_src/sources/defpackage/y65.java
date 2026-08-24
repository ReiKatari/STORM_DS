package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y65  reason: default package */
/* loaded from: classes.dex */
public final class y65 {
    public final ArrayList a;

    public y65(ArrayList arrayList) {
        this.a = new ArrayList(arrayList);
    }

    public static String d(y65 y65Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = y65Var.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((u65) obj).getClass().getSimpleName());
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
            if (cls.isAssignableFrom(((u65) obj).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final u65 b(Class cls) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u65 u65Var = (u65) obj;
            if (u65Var.getClass() == cls) {
                return u65Var;
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
            u65 u65Var = (u65) obj;
            if (cls.isAssignableFrom(u65Var.getClass())) {
                arrayList.add(u65Var);
            }
        }
        return arrayList;
    }
}
