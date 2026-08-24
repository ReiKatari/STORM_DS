package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gs4  reason: default package */
/* loaded from: classes.dex */
public final class gs4 extends uj2 {
    public final Method h;
    public final int i;
    public final b51 j;

    public gs4(Method method, int i, b51 b51Var) {
        this.h = method;
        this.i = i;
        this.j = b51Var;
    }

    @Override // defpackage.uj2
    public final void l(ok5 ok5Var, Object obj) {
        int i = this.i;
        Method method = this.h;
        if (obj != null) {
            try {
                ok5Var.k = (mk5) this.j.h(obj);
                return;
            } catch (IOException e) {
                throw ak7.w0(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
        throw ak7.v0(method, i, "Body parameter value must not be null.", new Object[0]);
    }
}
