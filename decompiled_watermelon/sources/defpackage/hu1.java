package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hu1  reason: default package */
/* loaded from: classes.dex */
public final class hu1 extends pu1 {
    public final kl4 a;

    public hu1(kl4 kl4Var) {
        this.a = kl4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof hu1) || !this.a.equals(((hu1) obj).a)) {
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
        return "ShowPauseMenu(pauseMenu=" + this.a + ")";
    }
}
