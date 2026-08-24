package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o45  reason: default package */
/* loaded from: classes.dex */
public abstract class o45 {
    public static final n45 c = new o45(false, ic6.a);
    public final boolean a;
    public final jd1 b;

    public o45(boolean z, jd1 jd1Var) {
        this.a = z;
        this.b = jd1Var;
    }

    public final Object a(gg3 gg3Var, byte[] bArr) {
        gg3Var.getClass();
        return new a55(this, new e55(new r90(bArr, bArr.length)), gg3Var.e()).o0(gg3Var, null);
    }

    public final byte[] b(gg3 gg3Var, Object obj) {
        gg3Var.getClass();
        t90 t90Var = new t90();
        new c55(this, new s35(t90Var), gg3Var.e()).j(gg3Var, obj);
        int i = t90Var.b;
        byte[] bArr = new byte[i];
        fv.u0(0, i, 2, t90Var.a, bArr);
        return bArr;
    }
}
