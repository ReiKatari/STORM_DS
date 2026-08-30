package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uv0  reason: default package */
/* loaded from: classes.dex */
public final class uv0 implements o67 {
    public final mi2 a;

    public uv0(mi2 mi2Var) {
        this.a = mi2Var;
    }

    @Override // defpackage.o67
    public final Object a(sm4 sm4Var) {
        return this.a.n(sm4Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof uv0) || !this.a.equals(((uv0) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
