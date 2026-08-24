package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jr1  reason: default package */
/* loaded from: classes.dex */
public final class jr1 implements b31 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ jr1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b31
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((b31) this.b).getClass();
                ((b31) this.b).accept(obj);
                return;
            case 1:
                yi2 yi2Var = (yi2) obj;
                if (yi2Var == null) {
                    yi2Var = new yi2(-3);
                }
                ((u63) this.b).z(yi2Var);
                return;
            default:
                yi2 yi2Var2 = (yi2) obj;
                synchronized (zi2.c) {
                    try {
                        ci6 ci6Var = zi2.d;
                        ArrayList arrayList = (ArrayList) ci6Var.get((String) this.b);
                        if (arrayList != null) {
                            ci6Var.remove((String) this.b);
                            for (int i = 0; i < arrayList.size(); i++) {
                                ((b31) arrayList.get(i)).accept(yi2Var2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ jr1() {
        this.a = 0;
    }
}
