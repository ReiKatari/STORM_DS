package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ej4  reason: default package */
/* loaded from: classes.dex */
public final class ej4 extends cg2 {
    public final Method g;
    public final int h;
    public final t11 i;

    public ej4(Method method, int i, t11 t11Var) {
        this.g = method;
        this.h = i;
        this.i = t11Var;
    }

    @Override // defpackage.cg2
    public final void t(wa5 wa5Var, Object obj) {
        int i = this.h;
        Method method = this.g;
        if (obj != null) {
            try {
                wa5Var.k = (ua5) this.i.k(obj);
                return;
            } catch (IOException e) {
                throw ct3.G0(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
        throw ct3.F0(method, i, "Body parameter value must not be null.", new Object[0]);
    }
}
