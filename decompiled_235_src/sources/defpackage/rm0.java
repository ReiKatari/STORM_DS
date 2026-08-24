package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rm0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rm0 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ vm0 B;
    public final /* synthetic */ ArrayList L;

    public /* synthetic */ rm0(vm0 vm0Var, ArrayList arrayList, int i) {
        this.A = i;
        this.B = vm0Var;
        this.L = arrayList;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        ArrayList arrayList = this.L;
        vm0 vm0Var = this.B;
        e36 e36Var = (e36) obj;
        switch (i) {
            case 0:
                e36Var.getClass();
                return vm0Var.c.a0(e36Var, arrayList);
            default:
                e36Var.getClass();
                um0 um0Var = vm0Var.d;
                j36 i0 = e36Var.i0("UPDATE OR ABORT `cheat` SET `id` = ?,`enabled` = ? WHERE `id` = ?");
                try {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (obj2 != null) {
                            um0Var.i(i0, obj2);
                            i0.f0();
                            i0.reset();
                            oi2.D(e36Var);
                        }
                    }
                    lb4.p(i0, null);
                    return jg7.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        lb4.p(i0, th);
                        throw th2;
                    }
                }
        }
    }
}
