package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ks4  reason: default package */
/* loaded from: classes.dex */
public final class ks4 extends uj2 {
    public final /* synthetic */ int h = 1;
    public final Method i;
    public final int j;
    public final b51 k;
    public final Object l;

    public ks4(Method method, int i, b51 b51Var, String str) {
        this.i = method;
        this.j = i;
        this.k = b51Var;
        this.l = str;
    }

    @Override // defpackage.uj2
    public final void l(ok5 ok5Var, Object obj) {
        int i = this.h;
        b51 b51Var = this.k;
        Object obj2 = this.l;
        Method method = this.i;
        int i2 = this.j;
        switch (i) {
            case 0:
                if (obj != null) {
                    try {
                        ok5Var.c((yw2) obj2, (mk5) b51Var.h(obj));
                        return;
                    } catch (IOException e) {
                        throw ak7.v0(method, i2, "Unable to convert " + obj + " to RequestBody", e);
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
                                yw2 yw2Var = yw2.B;
                                ok5Var.c(ln2.R("Content-Disposition", lb1.A("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (mk5) b51Var.h(value));
                            } else {
                                throw ak7.v0(method, i2, lb1.A("Part map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw ak7.v0(method, i2, "Part map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw ak7.v0(method, i2, "Part map was null.", new Object[0]);
        }
    }

    public ks4(Method method, int i, yw2 yw2Var, b51 b51Var) {
        this.i = method;
        this.j = i;
        this.l = yw2Var;
        this.k = b51Var;
    }
}
