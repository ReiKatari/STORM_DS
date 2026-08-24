package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fz4  reason: default package */
/* loaded from: classes.dex */
public final class fz4 implements gg3 {
    public final ar0 a;
    public final go3 b;

    public fz4(ar0 ar0Var) {
        ar0Var.getClass();
        this.a = ar0Var;
        this.b = kj2.M(xr3.PUBLICATION, new er2(this, 14));
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        ux0 c = sc1Var.c(e());
        c.getClass();
        String str = null;
        while (true) {
            int q = c.q(e());
            if (q != -1) {
                if (q != 0) {
                    if (q != 1) {
                        StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb.append(str);
                        sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb.append(q);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (str == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    } else {
                        xk2.g(this, c, str);
                        throw null;
                    }
                }
                str = c.A(e(), q);
            } else {
                throw new IllegalArgumentException(i61.m("Polymorphic value has not been read for class ", str).toString());
            }
        }
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        obj.getClass();
        xk2.h(this, x32Var, obj);
        throw null;
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return (wb6) this.b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
