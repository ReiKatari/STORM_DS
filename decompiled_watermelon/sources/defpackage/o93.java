package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o93  reason: default package */
/* loaded from: classes.dex */
public final class o93 implements n93 {
    public final n93 a;

    public o93(n93 n93Var) {
        n93Var.getClass();
        this.a = n93Var;
    }

    @Override // defpackage.n93
    public final List a() {
        return this.a.a();
    }

    @Override // defpackage.n93
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.n93
    public final qo0 c() {
        return this.a.c();
    }

    public final boolean equals(Object obj) {
        o93 o93Var;
        n93 n93Var;
        n93 n93Var2;
        if (obj != null) {
            qo0 qo0Var = null;
            if (obj instanceof o93) {
                o93Var = (o93) obj;
            } else {
                o93Var = null;
            }
            if (o93Var != null) {
                n93Var = o93Var.a;
            } else {
                n93Var = null;
            }
            n93 n93Var3 = this.a;
            if (b53.x(n93Var3, n93Var)) {
                qo0 c = n93Var3.c();
                if (c instanceof qo0) {
                    if (obj instanceof n93) {
                        n93Var2 = (n93) obj;
                    } else {
                        n93Var2 = null;
                    }
                    if (n93Var2 != null) {
                        qo0Var = n93Var2.c();
                    }
                    if (qo0Var != null && (qo0Var instanceof qo0)) {
                        Class cls = c.a;
                        cls.getClass();
                        Class cls2 = qo0Var.a;
                        cls2.getClass();
                        return cls.equals(cls2);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
