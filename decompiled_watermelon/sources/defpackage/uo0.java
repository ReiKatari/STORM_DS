package defpackage;

import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uo0  reason: default package */
/* loaded from: classes.dex */
public final class uo0 {
    public final int a;
    public final Method b;

    public uo0(Method method, int i) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uo0) {
                uo0 uo0Var = (uo0) obj;
                if (this.a == uo0Var.a && this.b.getName().equals(uo0Var.b.getName())) {
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
