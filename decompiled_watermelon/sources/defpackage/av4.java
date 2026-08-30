package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: av4  reason: default package */
/* loaded from: classes.dex */
public final class av4 {
    public final String a;

    public av4(String str) {
        this.a = str;
    }

    public final Object a(u93 u93Var) {
        Object obj = u93Var.a.get(this);
        if (obj != null) {
            return obj;
        }
        c44.i(this.a);
        return null;
    }

    public final void b(u93 u93Var, Object obj) {
        HashMap hashMap = u93Var.a;
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
        if (obj != null && av4.class == obj.getClass()) {
            return this.a.equals(((av4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b31.q(new StringBuilder("Prop{name='"), this.a, "'}");
    }
}
