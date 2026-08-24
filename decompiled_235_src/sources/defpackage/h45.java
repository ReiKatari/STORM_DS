package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h45  reason: default package */
/* loaded from: classes.dex */
public final class h45 {
    public final String a;

    public h45(String str) {
        this.a = str;
    }

    public final Object a(ng3 ng3Var) {
        Object obj = ng3Var.A.get(this);
        if (obj != null) {
            return obj;
        }
        u34.x(this.a);
        return null;
    }

    public final void b(ng3 ng3Var, Object obj) {
        HashMap hashMap = ng3Var.A;
        if (obj == null) {
            hashMap.remove(this);
        } else {
            hashMap.put(this, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h45.class == obj.getClass()) {
            return this.a.equals(((h45) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return i61.n(new StringBuilder("Prop{name='"), this.a, "'}");
    }
}
