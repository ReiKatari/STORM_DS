package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ym1  reason: default package */
/* loaded from: classes.dex */
public final class ym1 implements o67 {
    public final tj4 a;

    public ym1(tj4 tj4Var) {
        this.a = tj4Var;
    }

    @Override // defpackage.o67
    public final Object a(sm4 sm4Var) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ym1) && this.a == ((ym1) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
