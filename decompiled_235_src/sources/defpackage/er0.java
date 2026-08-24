package defpackage;

import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: er0  reason: default package */
/* loaded from: classes.dex */
public final class er0 {
    public final int a;
    public final Method b;

    public er0(Method method, int i) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof er0) {
                er0 er0Var = (er0) obj;
                if (this.a == er0Var.a && this.b.getName().equals(er0Var.b.getName())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
