package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hx0  reason: default package */
/* loaded from: classes.dex */
public abstract class hx0 {
    public static final j14 a;

    static {
        eg5 eg5Var = dr0.e;
        int i = eg5Var.c;
        gx0 gx0Var = new gx0(eg5Var, eg5Var, 1);
        int i2 = eg5Var.c;
        ac4 ac4Var = dr0.x;
        int i3 = (ac4Var.c << 6) | i2;
        gx0 gx0Var2 = new gx0(eg5Var, ac4Var, 0);
        int i4 = (i2 << 6) | ac4Var.c;
        gx0 gx0Var3 = new gx0(ac4Var, eg5Var, 0);
        j14 j14Var = z23.a;
        j14 j14Var2 = new j14();
        j14Var2.i(i | (i << 6), gx0Var);
        j14Var2.i(i3, gx0Var2);
        j14Var2.i(i4, gx0Var3);
        a = j14Var2;
    }
}
