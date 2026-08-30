package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: on3  reason: default package */
/* loaded from: classes.dex */
public final class on3 implements re7 {
    public final re7 a;
    public final int b;

    public on3(re7 re7Var, int i) {
        this.a = re7Var;
        this.b = i;
    }

    @Override // defpackage.re7
    public final int a(od1 od1Var) {
        if ((this.b & 32) != 0) {
            return this.a.a(od1Var);
        }
        return 0;
    }

    @Override // defpackage.re7
    public final int b(od1 od1Var) {
        if ((this.b & 16) != 0) {
            return this.a.b(od1Var);
        }
        return 0;
    }

    @Override // defpackage.re7
    public final int c(od1 od1Var, sd3 sd3Var) {
        int i;
        if (sd3Var == sd3.Ltr) {
            i = 4;
        } else {
            i = 1;
        }
        if ((i & this.b) != 0) {
            return this.a.c(od1Var, sd3Var);
        }
        return 0;
    }

    @Override // defpackage.re7
    public final int d(od1 od1Var, sd3 sd3Var) {
        int i;
        if (sd3Var == sd3.Ltr) {
            i = 8;
        } else {
            i = 2;
        }
        if ((i & this.b) != 0) {
            return this.a.d(od1Var, sd3Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on3)) {
            return false;
        }
        on3 on3Var = (on3) obj;
        if (b53.x(this.a, on3Var.a) && this.b == on3Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        int i2 = ig7.a;
        if ((i & i2) == i2) {
            ig7.b(sb3, "Start");
        }
        int i3 = ig7.c;
        if ((i & i3) == i3) {
            ig7.b(sb3, "Left");
        }
        if ((i & 16) == 16) {
            ig7.b(sb3, "Top");
        }
        int i4 = ig7.b;
        if ((i & i4) == i4) {
            ig7.b(sb3, "End");
        }
        int i5 = ig7.d;
        if ((i & i5) == i5) {
            ig7.b(sb3, "Right");
        }
        if ((i & 32) == 32) {
            ig7.b(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
