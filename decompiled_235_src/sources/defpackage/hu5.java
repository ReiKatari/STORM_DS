package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hu5  reason: default package */
/* loaded from: classes.dex */
public final class hu5 extends tu5 {
    public final nx5 a;

    public hu5(nx5 nx5Var) {
        nx5Var.getClass();
        this.a = nx5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof hu5) && this.a == ((hu5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InputModeUpdate(inputMode=" + this.a + ")";
    }
}
