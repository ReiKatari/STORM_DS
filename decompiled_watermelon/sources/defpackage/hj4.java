package defpackage;

import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hj4  reason: default package */
/* loaded from: classes.dex */
public final class hj4 extends cg2 {
    public final /* synthetic */ int g;
    public final Method h;
    public final int i;

    public /* synthetic */ hj4(Method method, int i, int i2) {
        this.g = i2;
        this.h = method;
        this.i = i;
    }

    @Override // defpackage.cg2
    public final void t(wa5 wa5Var, Object obj) {
        int i = this.g;
        int i2 = this.i;
        Method method = this.h;
        switch (i) {
            case 0:
                xq2 xq2Var = (xq2) obj;
                if (xq2Var != null) {
                    vq2 vq2Var = wa5Var.f;
                    vq2Var.getClass();
                    int size = xq2Var.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ie7.a(vq2Var, xq2Var.c(i3), xq2Var.i(i3));
                    }
                    return;
                }
                throw ct3.F0(method, i2, "Headers parameter must not be null.", new Object[0]);
            default:
                if (obj != null) {
                    wa5Var.c = obj.toString();
                    return;
                }
                throw ct3.F0(method, i2, "@Url parameter is null.", new Object[0]);
        }
    }
}
