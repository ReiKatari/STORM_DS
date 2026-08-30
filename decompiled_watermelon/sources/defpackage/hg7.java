package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hg7  reason: default package */
/* loaded from: classes.dex */
public abstract class hg7 {
    public static final j14 a;
    public static final fg7[] b;

    static {
        j14 j14Var = new j14(8);
        fg7.a.getClass();
        gg7 gg7Var = eg7.g;
        j14Var.i(1, gg7Var);
        gg7 gg7Var2 = eg7.f;
        j14Var.i(2, gg7Var2);
        gg7 gg7Var3 = eg7.b;
        j14Var.i(4, gg7Var3);
        gg7 gg7Var4 = eg7.d;
        j14Var.i(8, gg7Var4);
        gg7 gg7Var5 = eg7.h;
        j14Var.i(16, gg7Var5);
        gg7 gg7Var6 = eg7.e;
        j14Var.i(32, gg7Var6);
        gg7 gg7Var7 = eg7.i;
        j14Var.i(64, gg7Var7);
        gg7 gg7Var8 = eg7.c;
        j14Var.i(128, gg7Var8);
        a = j14Var;
        b = new fg7[]{gg7Var, gg7Var2, gg7Var3, gg7Var7, gg7Var5, gg7Var6, gg7Var4, eg7.j, gg7Var8};
    }

    public static final void a(ds3 ds3Var, wz2 wz2Var, long j, int i, int i2) {
        if (!hk2.s(j, -1L)) {
            ds3Var.a(wz2Var.b(), (int) ((j >>> 48) & 65535));
            ds3Var.a(wz2Var.d(), (int) ((j >>> 32) & 65535));
            ds3Var.a(wz2Var.c(), i - ((int) ((j >>> 16) & 65535)));
            ds3Var.a(wz2Var.a(), i2 - ((int) (j & 65535)));
        }
    }
}
