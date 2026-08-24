package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sy1  reason: default package */
/* loaded from: classes.dex */
public final class sy1 extends az1 {
    public final mu4 a;

    public sy1(mu4 mu4Var) {
        this.a = mu4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof sy1) || !this.a.equals(((sy1) obj).a)) {
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
