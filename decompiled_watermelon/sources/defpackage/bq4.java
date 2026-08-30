package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bq4  reason: default package */
/* loaded from: classes.dex */
public final class bq4 implements m93 {
    public final qo0 a;
    public final gh3 b;

    public bq4(qo0 qo0Var) {
        qo0Var.getClass();
        this.a = qo0Var;
        this.b = yf2.H(wk3.PUBLICATION, new bz2(10, this));
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        yu0 c = b91Var.c(e());
        c.getClass();
        String str = null;
        while (true) {
            int v = c.v(e());
            if (v != -1) {
                if (v != 0) {
                    if (v != 1) {
                        StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(v);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (str == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    } else {
                        mj2.u(this, c, str);
                        throw null;
                    }
                }
                str = c.K(e(), v);
            } else {
                throw new IllegalArgumentException(b31.p("Polymorphic value has not been read for class ", str).toString());
            }
        }
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        obj.getClass();
        mj2.v(this, mz1Var, obj);
        throw null;
    }

    @Override // defpackage.m93
    public final h06 e() {
        return (h06) this.b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
