package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s26  reason: default package */
/* loaded from: classes.dex */
public final class s26 {
    public ct7 a;
    public ArrayList b;

    public static long a(ci1 ci1Var, long j) {
        ct7 ct7Var = ci1Var.d;
        ArrayList arrayList = ci1Var.k;
        if (ct7Var instanceof fx2) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            xh1 xh1Var = (xh1) arrayList.get(i);
            if (xh1Var instanceof ci1) {
                ci1 ci1Var2 = (ci1) xh1Var;
                if (ci1Var2.d != ct7Var) {
                    j2 = Math.min(j2, a(ci1Var2, ci1Var2.f + j));
                }
            }
        }
        ci1 ci1Var3 = ct7Var.i;
        ci1 ci1Var4 = ct7Var.h;
        if (ci1Var == ci1Var3) {
            long j3 = j - ct7Var.j();
            return Math.min(Math.min(j2, a(ci1Var4, j3)), j3 - ci1Var4.f);
        }
        return j2;
    }

    public static long b(ci1 ci1Var, long j) {
        ct7 ct7Var = ci1Var.d;
        ArrayList arrayList = ci1Var.k;
        if (ct7Var instanceof fx2) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            xh1 xh1Var = (xh1) arrayList.get(i);
            if (xh1Var instanceof ci1) {
                ci1 ci1Var2 = (ci1) xh1Var;
                if (ci1Var2.d != ct7Var) {
                    j2 = Math.max(j2, b(ci1Var2, ci1Var2.f + j));
                }
            }
        }
        ci1 ci1Var3 = ct7Var.h;
        ci1 ci1Var4 = ct7Var.i;
        if (ci1Var == ci1Var3) {
            long j3 = ct7Var.j() + j;
            return Math.max(Math.max(j2, b(ci1Var4, j3)), j3 - ci1Var4.f);
        }
        return j2;
    }
}
