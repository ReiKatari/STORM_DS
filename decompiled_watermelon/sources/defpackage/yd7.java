package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yd7  reason: default package */
/* loaded from: classes.dex */
public final class yd7 {
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
                yd7 yd7Var = (yd7) arrayList.get(i);
                if (this.e == yd7Var.b) {
                    c(this.c, yd7Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(ho3 ho3Var, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        hz0 hz0Var = (hz0) ((gz0) arrayList.get(0)).U;
        ho3Var.t();
        hz0Var.b(ho3Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((gz0) arrayList.get(i2)).b(ho3Var, false);
        }
        if (i == 0 && hz0Var.C0 > 0) {
            l.s(hz0Var, ho3Var, arrayList, 0);
        }
        if (i == 1 && hz0Var.D0 > 0) {
            l.s(hz0Var, ho3Var, arrayList, 1);
        }
        try {
            ho3Var.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            gz0 gz0Var = (gz0) arrayList.get(i3);
            so1 so1Var = new so1(28);
            new WeakReference(gz0Var);
            ho3.n(gz0Var.I);
            ho3.n(gz0Var.J);
            ho3.n(gz0Var.K);
            ho3.n(gz0Var.L);
            ho3.n(gz0Var.M);
            this.d.add(so1Var);
        }
        if (i == 0) {
            n = ho3.n(hz0Var.I);
            n2 = ho3.n(hz0Var.K);
            ho3Var.t();
        } else {
            n = ho3.n(hz0Var.J);
            n2 = ho3.n(hz0Var.L);
            ho3Var.t();
        }
        return n2 - n;
    }

    public final void c(int i, yd7 yd7Var) {
        int i2 = yd7Var.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            gz0 gz0Var = (gz0) obj;
            ArrayList arrayList2 = yd7Var.a;
            if (!arrayList2.contains(gz0Var)) {
                arrayList2.add(gz0Var);
            }
            if (i == 0) {
                gz0Var.r0 = i2;
            } else {
                gz0Var.s0 = i2;
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
        String m = wh1.m(sb, this.b, "] <");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            StringBuilder t = b31.t(m, " ");
            t.append(((gz0) obj).j0);
            m = t.toString();
        }
        return m.concat(" >");
    }
}
