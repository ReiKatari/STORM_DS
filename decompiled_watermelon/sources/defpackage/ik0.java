package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ik0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ik0 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ mk0 B;
    public final /* synthetic */ ArrayList L;

    public /* synthetic */ ik0(mk0 mk0Var, ArrayList arrayList, int i) {
        this.A = i;
        this.B = mk0Var;
        this.L = arrayList;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        ArrayList arrayList = this.L;
        mk0 mk0Var = this.B;
        ls5 ls5Var = (ls5) obj;
        switch (i) {
            case 0:
                ls5Var.getClass();
                return mk0Var.c.X(ls5Var, arrayList);
            default:
                ls5Var.getClass();
                lk0 lk0Var = mk0Var.d;
                ns5 i0 = ls5Var.i0("UPDATE OR ABORT `cheat` SET `id` = ?,`enabled` = ? WHERE `id` = ?");
                try {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (obj2 != null) {
                            lk0Var.f(i0, obj2);
                            i0.a0();
                            i0.reset();
                            cg2.I(ls5Var);
                        }
                    }
                    iq2.h(i0, null);
                    return o27.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        iq2.h(i0, th);
                        throw th2;
                    }
                }
        }
    }
}
