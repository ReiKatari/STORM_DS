package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ph2  reason: default package */
/* loaded from: classes.dex */
public final class ph2 extends b2 implements ag4 {
    public final /* synthetic */ th2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph2(th2 th2Var) {
        super(4);
        this.c = th2Var;
    }

    @Override // defpackage.ag4
    public final void a(Object obj) {
        Object obj2;
        rh2 rh2Var;
        ((gs0) this.b).c0(new hg4(obj));
        th2 th2Var = this.c;
        fw fwVar = th2Var.f;
        do {
            obj2 = fwVar.a;
            rh2 rh2Var2 = (rh2) obj2;
            int i = sh2.a[rh2Var2.ordinal()];
            if (i != 1) {
                if (i == 3) {
                    rh2Var = rh2.COMPLETE;
                } else {
                    throw new IllegalStateException("Unexpected frame state for " + th2Var + "! State is " + rh2Var2 + ' ');
                }
            } else {
                rh2Var = rh2.FRAME_INFO_COMPLETE;
            }
        } while (!fwVar.a(obj2, rh2Var));
        Iterator it = th2Var.h.iterator();
        it.getClass();
        if (!it.hasNext()) {
            if (rh2Var == rh2.COMPLETE) {
                Iterator it2 = th2Var.h.iterator();
                it2.getClass();
                if (it2.hasNext()) {
                    throw b31.m(it2);
                }
                return;
            }
            return;
        }
        throw b31.m(it);
    }
}
