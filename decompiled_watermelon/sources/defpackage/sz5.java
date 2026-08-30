package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sz5  reason: default package */
/* loaded from: classes.dex */
public abstract class sz5 {
    public static final Comparator[] a;
    public static final oz5 b;

    static {
        hd2 hd2Var;
        Comparator[] comparatorArr = new Comparator[2];
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                hd2Var = hd2.e;
            } else {
                hd2Var = hd2.c;
            }
            comparatorArr[i] = new xs1(4, new xs1(hd2Var));
        }
        a = comparatorArr;
        b = oz5.X;
    }

    public static final void a(iz5 iz5Var, ArrayList arrayList, yb ybVar, yb ybVar2, j14 j14Var) {
        ez5 ez5Var = iz5Var.d;
        Object g = ez5Var.A.g(mz5.n);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        if ((booleanValue || ((Boolean) ybVar2.n(iz5Var)).booleanValue()) && ((Boolean) ybVar.n(iz5Var)).booleanValue()) {
            arrayList.add(iz5Var);
        }
        if (booleanValue) {
            j14Var.i(iz5Var.f, b(iz5Var, ybVar, ybVar2, iz5.j(7, iz5Var)));
            return;
        }
        List j = iz5.j(7, iz5Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            a((iz5) j.get(i), arrayList, ybVar, ybVar2, j14Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed A[LOOP:1: B:12:0x0046->B:35:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5 A[EDGE_INSN: B:53:0x00f5->B:37:0x00f5 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(defpackage.iz5 r17, defpackage.yb r18, defpackage.yb r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz5.b(iz5, yb, yb, java.util.List):java.util.ArrayList");
    }
}
