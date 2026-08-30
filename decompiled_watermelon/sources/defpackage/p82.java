package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p82  reason: default package */
/* loaded from: classes.dex */
public final class p82 implements re7 {
    public final int a;

    public p82(int i) {
        this.a = i;
    }

    @Override // defpackage.re7
    public final int a(od1 od1Var) {
        return this.a;
    }

    @Override // defpackage.re7
    public final int b(od1 od1Var) {
        return 0;
    }

    @Override // defpackage.re7
    public final int c(od1 od1Var, sd3 sd3Var) {
        return 0;
    }

    @Override // defpackage.re7
    public final int d(od1 od1Var, sd3 sd3Var) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof p82) && this.a == ((p82) obj).a) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return ej6.g(new StringBuilder("Insets(left=0, top=0, right=0, bottom="), this.a, ')');
    }
}
