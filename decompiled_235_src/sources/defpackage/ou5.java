package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ou5  reason: default package */
/* loaded from: classes.dex */
public final class ou5 extends tu5 {
    public final a36 a;

    public ou5(a36 a36Var) {
        a36Var.getClass();
        this.a = a36Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ou5) && this.a == ((ou5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RuntimeMicSourceUpdate(newRuntimeMicSource=" + this.a + ")";
    }
}
