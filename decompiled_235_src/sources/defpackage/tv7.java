package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tv7  reason: default package */
/* loaded from: classes.dex */
public final class tv7 implements fu3 {
    public final /* synthetic */ o41 A;
    public final /* synthetic */ um B;
    public final /* synthetic */ if5 L;
    public final /* synthetic */ dh5 R;

    public tv7(o41 o41Var, um umVar, if5 if5Var, dh5 dh5Var) {
        this.A = o41Var;
        this.B = umVar;
        this.L = if5Var;
        this.R = dh5Var;
    }

    @Override // defpackage.fu3
    public final void h(hu3 hu3Var, st3 st3Var) {
        boolean z;
        qj0 qj0Var = null;
        switch (sv7.a[st3Var.ordinal()]) {
            case 1:
                hv.L(this.A, null, a71.UNDISPATCHED, new kp5(this.R, this.L, hu3Var, this, null, 11), 1);
                return;
            case 2:
                um umVar = this.B;
                if (umVar != null) {
                    bk1 bk1Var = (bk1) umVar.L;
                    synchronized (bk1Var.L) {
                        try {
                            synchronized (bk1Var.L) {
                                z = bk1Var.A;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) bk1Var.B;
                                bk1Var.B = (ArrayList) bk1Var.R;
                                bk1Var.R = arrayList;
                                bk1Var.A = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((r41) arrayList.get(i)).i(jg7.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if5 if5Var = this.L;
                synchronized (if5Var.c) {
                    if (if5Var.t) {
                        if5Var.t = false;
                        qj0Var = if5Var.y();
                    }
                }
                if (qj0Var != null) {
                    ((rj0) qj0Var).i(jg7.a);
                    return;
                }
                return;
            case 3:
                if5 if5Var2 = this.L;
                synchronized (if5Var2.c) {
                    if5Var2.t = true;
                }
                return;
            case 4:
                this.L.x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                i.d();
                return;
        }
    }
}
