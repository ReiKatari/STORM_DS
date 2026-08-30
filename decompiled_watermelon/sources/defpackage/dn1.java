package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dn1  reason: default package */
/* loaded from: classes.dex */
public final class dn1 implements wz0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ dn1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wz0
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((wz0) this.b).getClass();
                ((wz0) this.b).accept(obj);
                return;
            case 1:
                be2 be2Var = (be2) obj;
                if (be2Var == null) {
                    be2Var = new be2(-3);
                }
                ((q03) this.b).w(be2Var);
                return;
            default:
                be2 be2Var2 = (be2) obj;
                synchronized (ce2.c) {
                    try {
                        m66 m66Var = ce2.d;
                        ArrayList arrayList = (ArrayList) m66Var.get((String) this.b);
                        if (arrayList != null) {
                            m66Var.remove((String) this.b);
                            for (int i = 0; i < arrayList.size(); i++) {
                                ((wz0) arrayList.get(i)).accept(be2Var2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ dn1() {
        this.a = 0;
    }
}
