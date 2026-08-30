package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: as5  reason: default package */
/* loaded from: classes.dex */
public final class as5 {
    public be7 a;
    public ArrayList b;

    public static long a(yd1 yd1Var, long j) {
        be7 be7Var = yd1Var.d;
        ArrayList arrayList = yd1Var.k;
        if (be7Var instanceof er2) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            ud1 ud1Var = (ud1) arrayList.get(i);
            if (ud1Var instanceof yd1) {
                yd1 yd1Var2 = (yd1) ud1Var;
                if (yd1Var2.d != be7Var) {
                    j2 = Math.min(j2, a(yd1Var2, yd1Var2.f + j));
                }
            }
        }
        yd1 yd1Var3 = be7Var.i;
        yd1 yd1Var4 = be7Var.h;
        if (yd1Var == yd1Var3) {
            long j3 = j - be7Var.j();
            return Math.min(Math.min(j2, a(yd1Var4, j3)), j3 - yd1Var4.f);
        }
        return j2;
    }

    public static long b(yd1 yd1Var, long j) {
        be7 be7Var = yd1Var.d;
        ArrayList arrayList = yd1Var.k;
        if (be7Var instanceof er2) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            ud1 ud1Var = (ud1) arrayList.get(i);
            if (ud1Var instanceof yd1) {
                yd1 yd1Var2 = (yd1) ud1Var;
                if (yd1Var2.d != be7Var) {
                    j2 = Math.max(j2, b(yd1Var2, yd1Var2.f + j));
                }
            }
        }
        yd1 yd1Var3 = be7Var.h;
        yd1 yd1Var4 = be7Var.i;
        if (yd1Var == yd1Var3) {
            long j3 = be7Var.j() + j;
            return Math.max(Math.max(j2, b(yd1Var4, j3)), j3 - yd1Var4.f);
        }
        return j2;
    }
}
