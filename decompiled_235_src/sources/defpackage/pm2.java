package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pm2  reason: default package */
/* loaded from: classes.dex */
public final class pm2 extends d2 implements dp4 {
    public final /* synthetic */ tm2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm2(tm2 tm2Var) {
        super(4);
        this.c = tm2Var;
    }

    @Override // defpackage.dp4
    public final void b(Object obj) {
        Object obj2;
        rm2 rm2Var;
        ((tu0) this.b).b0(new kp4(obj));
        tm2 tm2Var = this.c;
        xw xwVar = tm2Var.f;
        do {
            obj2 = xwVar.a;
            rm2 rm2Var2 = (rm2) obj2;
            int i = sm2.a[rm2Var2.ordinal()];
            if (i != 1) {
                if (i == 3) {
                    rm2Var = rm2.COMPLETE;
                } else {
                    throw new IllegalStateException("Unexpected frame state for " + tm2Var + "! State is " + rm2Var2 + ' ');
                }
            } else {
                rm2Var = rm2.FRAME_INFO_COMPLETE;
            }
        } while (!xwVar.a(obj2, rm2Var));
        Iterator it = tm2Var.h.iterator();
        it.getClass();
        if (!it.hasNext()) {
            if (rm2Var == rm2.COMPLETE) {
                Iterator it2 = tm2Var.h.iterator();
                it2.getClass();
                if (it2.hasNext()) {
                    throw i61.j(it2);
                }
                return;
            }
            return;
        }
        throw i61.j(it);
    }
}
