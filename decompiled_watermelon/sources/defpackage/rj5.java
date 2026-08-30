package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rj5  reason: default package */
/* loaded from: classes.dex */
public final class rj5 extends dk5 {
    public final ym5 a;

    public rj5(ym5 ym5Var) {
        ym5Var.getClass();
        this.a = ym5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rj5) && this.a == ((rj5) obj).a) {
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
