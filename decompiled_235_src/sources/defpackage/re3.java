package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: re3  reason: default package */
/* loaded from: classes.dex */
public final class re3 implements gg3 {
    public static final re3 a = new Object();
    public static final x25 b = mp2.b("kotlinx.serialization.json.JsonLiteral", v25.m);

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        String str;
        yd3 l = gi2.l(sc1Var);
        de3 y = l.y();
        if (!(y instanceof qe3)) {
            String str2 = "Unexpected JSON element, expected JsonLiteral, had " + gh5.a(y.getClass());
            if (l.S().a.g) {
                str = hi2.H(-1, y.toString()).toString();
            } else {
                str = null;
            }
            throw new me3(hi2.x(str2, null, -1, null, str));
        }
        return (qe3) y;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // defpackage.gg3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(x32 x32Var, Object obj) {
        Double d;
        qe3 qe3Var = (qe3) obj;
        qe3Var.getClass();
        String str = qe3Var.B;
        gi2.j(x32Var);
        if (qe3Var.A) {
            x32Var.d0(str);
            return;
        }
        Long i0 = xs6.i0(str);
        if (i0 != null) {
            x32Var.X(i0.longValue());
            return;
        }
        rf7 V = qo2.V(str);
        if (V != null) {
            x32Var.s(vf7.b).X(V.A);
            return;
        }
        Boolean bool = null;
        if (ws6.T(str)) {
            d = Double.valueOf(Double.parseDouble(str));
            if (d == null) {
                x32Var.l(d.doubleValue());
                return;
            }
            if (str.equals("true")) {
                bool = Boolean.TRUE;
            } else if (str.equals("false")) {
                bool = Boolean.FALSE;
            }
            if (bool != null) {
                x32Var.r(bool.booleanValue());
                return;
            } else {
                x32Var.d0(str);
                return;
            }
        }
        d = null;
        if (d == null) {
        }
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return b;
    }
}
