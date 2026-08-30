package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f03  reason: default package */
/* loaded from: classes.dex */
public final class f03 {
    public final yz2 a;
    public final e03 b;
    public final e03 c;

    public f03(yz2 yz2Var, e03 e03Var, e03 e03Var2) {
        yz2Var.getClass();
        e03Var.getClass();
        this.a = yz2Var;
        this.b = e03Var;
        this.c = e03Var2;
    }

    public static f03 a(f03 f03Var, e03 e03Var, e03 e03Var2, int i) {
        yz2 yz2Var = f03Var.a;
        if ((i & 2) != 0) {
            e03Var = f03Var.b;
        }
        if ((i & 4) != 0) {
            e03Var2 = f03Var.c;
        }
        f03Var.getClass();
        yz2Var.getClass();
        e03Var.getClass();
        e03Var2.getClass();
        return new f03(yz2Var, e03Var, e03Var2);
    }

    public final boolean b() {
        e03 e03Var = this.b;
        d03 d03Var = d03.a;
        if (b53.x(e03Var, d03Var) && b53.x(this.c, d03Var)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f03)) {
            return false;
        }
        f03 f03Var = (f03) obj;
        if (this.a == f03Var.a && b53.x(this.b, f03Var.b) && b53.x(this.c, f03Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InputConfig(input=" + this.a + ", assignment=" + this.b + ", altAssignment=" + this.c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ f03(defpackage.yz2 r2, defpackage.e03 r3, int r4) {
        /*
            r1 = this;
            r4 = r4 & 2
            d03 r0 = defpackage.d03.a
            if (r4 == 0) goto L7
            r3 = r0
        L7:
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f03.<init>(yz2, e03, int):void");
    }
}
