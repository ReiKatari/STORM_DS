package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ij4  reason: default package */
/* loaded from: classes.dex */
public final class ij4 extends cg2 {
    public final /* synthetic */ int g = 1;
    public final Method h;
    public final int i;
    public final t11 j;
    public final Object k;

    public ij4(Method method, int i, t11 t11Var, String str) {
        this.h = method;
        this.i = i;
        this.j = t11Var;
        this.k = str;
    }

    @Override // defpackage.cg2
    public final void t(wa5 wa5Var, Object obj) {
        int i = this.g;
        t11 t11Var = this.j;
        Object obj2 = this.k;
        Method method = this.h;
        int i2 = this.i;
        switch (i) {
            case 0:
                if (obj != null) {
                    try {
                        wa5Var.c((xq2) obj2, (ua5) t11Var.k(obj));
                        return;
                    } catch (IOException e) {
                        throw ct3.F0(method, i2, "Unable to convert " + obj + " to RequestBody", e);
                    }
                }
                return;
            default:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                xq2 xq2Var = xq2.B;
                                wa5Var.c(hi2.K("Content-Disposition", wh1.A("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (ua5) t11Var.k(value));
                            } else {
                                throw ct3.F0(method, i2, wh1.A("Part map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw ct3.F0(method, i2, "Part map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw ct3.F0(method, i2, "Part map was null.", new Object[0]);
        }
    }

    public ij4(Method method, int i, xq2 xq2Var, t11 t11Var) {
        this.h = method;
        this.i = i;
        this.k = xq2Var;
        this.j = t11Var;
    }
}
