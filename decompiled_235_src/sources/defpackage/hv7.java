package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hv7  reason: default package */
/* loaded from: classes.dex */
public abstract class hv7 {
    public static final p94 a;
    public static final fv7[] b;

    static {
        p94 p94Var = new p94(8);
        fv7.a.getClass();
        gv7 gv7Var = ev7.g;
        p94Var.i(1, gv7Var);
        gv7 gv7Var2 = ev7.f;
        p94Var.i(2, gv7Var2);
        gv7 gv7Var3 = ev7.b;
        p94Var.i(4, gv7Var3);
        gv7 gv7Var4 = ev7.d;
        p94Var.i(8, gv7Var4);
        gv7 gv7Var5 = ev7.h;
        p94Var.i(16, gv7Var5);
        gv7 gv7Var6 = ev7.e;
        p94Var.i(32, gv7Var6);
        gv7 gv7Var7 = ev7.i;
        p94Var.i(64, gv7Var7);
        gv7 gv7Var8 = ev7.c;
        p94Var.i(128, gv7Var8);
        a = p94Var;
        b = new fv7[]{gv7Var, gv7Var2, gv7Var3, gv7Var7, gv7Var5, gv7Var6, gv7Var4, ev7.j, gv7Var8};
    }

    public static final void a(iz3 iz3Var, z53 z53Var, long j, int i, int i2) {
        if (!bl2.u(j, -1L)) {
            iz3Var.b(z53Var.b(), (int) ((j >>> 48) & 65535));
            iz3Var.b(z53Var.d(), (int) ((j >>> 32) & 65535));
            iz3Var.b(z53Var.c(), i - ((int) ((j >>> 16) & 65535)));
            iz3Var.b(z53Var.a(), i2 - ((int) (j & 65535)));
        }
    }
}
