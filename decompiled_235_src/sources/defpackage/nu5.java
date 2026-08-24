package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nu5  reason: default package */
/* loaded from: classes.dex */
public final class nu5 extends tu5 {
    public final u26 a;

    public nu5(u26 u26Var) {
        u26Var.getClass();
        this.a = u26Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nu5) && this.a == ((nu5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RuntimeConsoleUpdate(newRuntimeConsole=" + this.a + ")";
    }
}
