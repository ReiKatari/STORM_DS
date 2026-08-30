package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kh5  reason: default package */
/* loaded from: classes.dex */
public final class kh5 extends lh5 {
    public final rg5 a;

    public kh5(rg5 rg5Var) {
        this.a = rg5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof kh5) || !this.a.equals(((kh5) obj).a)) {
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
        return "RomItem(rom=" + this.a + ")";
    }
}
