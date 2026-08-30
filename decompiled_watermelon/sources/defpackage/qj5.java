package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qj5  reason: default package */
/* loaded from: classes.dex */
public final class qj5 extends dk5 {
    public final lm5 a;

    public qj5(lm5 lm5Var) {
        lm5Var.getClass();
        this.a = lm5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qj5) && this.a == ((qj5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GbaSlotTypeUpdated(type=" + this.a + ")";
    }
}
