package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cc0  reason: default package */
/* loaded from: classes.dex */
public final class cc0 implements AutoCloseable {
    public final o41 A;
    public final CopyOnWriteArrayList B;

    public cc0(eb ebVar, String str) {
        o41 i = g04.i(jw2.y(((t57) ebVar.L).f, new tc3((rc3) ebVar.R)));
        this.A = i;
        this.B = new CopyOnWriteArrayList();
        hv.L(i, null, null, new b0(ebVar, str, this, (r41) null, 10), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        g04.x(this.A, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(long j, s41 s41Var) {
        ac0 ac0Var;
        Object obj;
        int i;
        tu0 tu0Var;
        if (s41Var instanceof ac0) {
            ac0Var = (ac0) s41Var;
            int i2 = ac0Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ac0Var.Z = i2 - Integer.MIN_VALUE;
                obj = ac0Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ac0Var.Z;
                boolean z = false;
                CopyOnWriteArrayList copyOnWriteArrayList = this.B;
                if (i == 0) {
                    if (i == 1) {
                        tu0Var = ac0Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    tu0 tu0Var2 = new tu0();
                    copyOnWriteArrayList.add(tu0Var2);
                    bc0 bc0Var = new bc0(tu0Var2, null, 0);
                    ac0Var.R = tu0Var2;
                    ac0Var.Z = 1;
                    Object N = xk2.N(j, bc0Var, ac0Var);
                    if (N == x61Var) {
                        return x61Var;
                    }
                    obj = N;
                    tu0Var = tu0Var2;
                }
                if (obj != null) {
                    z = true;
                }
                copyOnWriteArrayList.remove(tu0Var);
                return Boolean.valueOf(z);
            }
        }
        ac0Var = new ac0(this, s41Var);
        obj = ac0Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ac0Var.Z;
        boolean z2 = false;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.B;
        if (i == 0) {
        }
        if (obj != null) {
        }
        copyOnWriteArrayList2.remove(tu0Var);
        return Boolean.valueOf(z2);
    }
}
