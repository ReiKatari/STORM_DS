package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: au1  reason: default package */
/* loaded from: classes.dex */
public final class au1 extends cu1 {
    public final wm5 a;

    public au1(wm5 wm5Var) {
        this.a = wm5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof au1) || !this.a.equals(((au1) obj).a)) {
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
        return "CheatsScreen(romInfo=" + this.a + ")";
    }
}
