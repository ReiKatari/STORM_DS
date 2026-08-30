package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ze6  reason: default package */
/* loaded from: classes.dex */
public final class ze6 implements o67 {
    public final Object a;

    public ze6(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.o67
    public final Object a(sm4 sm4Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ze6) && b53.x(this.a, ((ze6) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
