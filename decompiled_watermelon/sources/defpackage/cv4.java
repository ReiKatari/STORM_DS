package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cv4  reason: default package */
/* loaded from: classes.dex */
public abstract class cv4 extends d90 implements l93 {
    public final boolean Z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cv4(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r8 = this;
            r0 = 1
            r13 = r13 & r0
            r1 = 0
            if (r13 != r0) goto Lc
            r7 = r0
        L6:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            goto Le
        Lc:
            r7 = r1
            goto L6
        Le:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.Z = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv4.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    public final e93 d() {
        if (this.Z) {
            return this;
        }
        e93 e93Var = this.A;
        if (e93Var == null) {
            e93 a = a();
            this.A = a;
            return a;
        }
        return e93Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof cv4) {
                cv4 cv4Var = (cv4) obj;
                if (b().equals(cv4Var.b()) && this.R.equals(cv4Var.R) && this.X.equals(cv4Var.X) && b53.x(this.B, cv4Var.B)) {
                    return true;
                }
                return false;
            } else if (obj instanceof l93) {
                return obj.equals(d());
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.X.hashCode() + ej6.b(b().hashCode() * 31, 31, this.R);
    }

    public final String toString() {
        e93 d = d();
        if (d != this) {
            return d.toString();
        }
        return b31.q(new StringBuilder("property "), this.R, " (Kotlin reflection is not available)");
    }
}
