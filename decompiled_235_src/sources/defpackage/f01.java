package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f01  reason: default package */
/* loaded from: classes.dex */
public abstract class f01 {
    public static final p94 a;

    static {
        cq5 cq5Var = qt0.e;
        int i = cq5Var.c;
        e01 e01Var = new e01(cq5Var, cq5Var, 1);
        int i2 = cq5Var.c;
        yk4 yk4Var = qt0.x;
        int i3 = (yk4Var.c << 6) | i2;
        e01 e01Var2 = new e01(cq5Var, yk4Var, 0);
        int i4 = (i2 << 6) | yk4Var.c;
        e01 e01Var3 = new e01(yk4Var, cq5Var, 0);
        p94 p94Var = h93.a;
        p94 p94Var2 = new p94();
        p94Var2.i(i | (i << 6), e01Var);
        p94Var2.i(i3, e01Var2);
        p94Var2.i(i4, e01Var3);
        a = p94Var2;
    }
}
