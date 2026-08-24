package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zs7  reason: default package */
/* loaded from: classes.dex */
public final class zs7 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                zs7 zs7Var = (zs7) arrayList.get(i);
                if (this.e == zs7Var.b) {
                    c(this.c, zs7Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(jv3 jv3Var, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        m21 m21Var = (m21) ((l21) arrayList.get(0)).U;
        jv3Var.t();
        m21Var.b(jv3Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((l21) arrayList.get(i2)).b(jv3Var, false);
        }
        if (i == 0 && m21Var.C0 > 0) {
            nc1.C(m21Var, jv3Var, arrayList, 0);
        }
        if (i == 1 && m21Var.D0 > 0) {
            nc1.C(m21Var, jv3Var, arrayList, 1);
        }
        try {
            jv3Var.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            l21 l21Var = (l21) arrayList.get(i3);
            Object obj = new Object();
            new WeakReference(l21Var);
            jv3.n(l21Var.I);
            jv3.n(l21Var.J);
            jv3.n(l21Var.K);
            jv3.n(l21Var.L);
            jv3.n(l21Var.M);
            this.d.add(obj);
        }
        if (i == 0) {
            n = jv3.n(m21Var.I);
            n2 = jv3.n(m21Var.K);
            jv3Var.t();
        } else {
            n = jv3.n(m21Var.J);
            n2 = jv3.n(m21Var.L);
            jv3Var.t();
        }
        return n2 - n;
    }

    public final void c(int i, zs7 zs7Var) {
        int i2 = zs7Var.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            l21 l21Var = (l21) obj;
            ArrayList arrayList2 = zs7Var.a;
            if (!arrayList2.contains(l21Var)) {
                arrayList2.add(l21Var);
            }
            if (i == 0) {
                l21Var.r0 = i2;
            } else {
                l21Var.s0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else if (i == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String o = lb1.o(sb, this.b, "] <");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            StringBuilder r = i61.r(o, " ");
            r.append(((l21) obj).j0);
            o = r.toString();
        }
        return o.concat(" >");
    }
}
