package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hv4  reason: default package */
/* loaded from: classes.dex */
public abstract class hv4 {
    public static final gv4 c = new hv4(false, u06.a);
    public final boolean a;
    public final vn1 b;

    public hv4(boolean z, vn1 vn1Var) {
        this.a = z;
        this.b = vn1Var;
    }

    public final Object a(m93 m93Var, byte[] bArr) {
        m93Var.getClass();
        return new tv4(this, new xv4(new k70(bArr.length, bArr)), m93Var.e()).o0(m93Var, null);
    }

    public final byte[] b(m93 m93Var, Object obj) {
        m93Var.getClass();
        m70 m70Var = new m70();
        new vv4(this, new ka3(28, m70Var), m93Var.e()).l(m93Var, obj);
        int i = m70Var.b;
        byte[] bArr = new byte[i];
        nu.g0(0, i, 2, m70Var.a, bArr);
        return bArr;
    }
}
