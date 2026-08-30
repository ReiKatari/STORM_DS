package defpackage;

import java.lang.reflect.Array;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dj4  reason: default package */
/* loaded from: classes.dex */
public final class dj4 extends cg2 {
    public final /* synthetic */ int g;
    public final /* synthetic */ cg2 h;

    public /* synthetic */ dj4(cg2 cg2Var, int i) {
        this.g = i;
        this.h = cg2Var;
    }

    @Override // defpackage.cg2
    public final void t(wa5 wa5Var, Object obj) {
        int i = this.g;
        cg2 cg2Var = this.h;
        switch (i) {
            case 0:
                Iterable<Object> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (Object obj2 : iterable) {
                        cg2Var.t(wa5Var, obj2);
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        cg2Var.t(wa5Var, Array.get(obj, i2));
                    }
                    return;
                }
                return;
        }
    }
}
