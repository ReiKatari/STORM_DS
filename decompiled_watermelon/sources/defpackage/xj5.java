package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xj5  reason: default package */
/* loaded from: classes.dex */
public final class xj5 extends dk5 {
    public final cs5 a;

    public xj5(cs5 cs5Var) {
        cs5Var.getClass();
        this.a = cs5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xj5) && this.a == ((xj5) obj).a) {
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
