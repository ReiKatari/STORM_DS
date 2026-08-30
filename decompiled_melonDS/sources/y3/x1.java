package y3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class x1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a1.x f14758a;

    /* renamed from: b  reason: collision with root package name */
    public static final v1[] f14759b;

    static {
        a1.x xVar = new a1.x(8);
        v1.f14754a.getClass();
        w1 w1Var = u1.f14750g;
        xVar.i(1, w1Var);
        w1 w1Var2 = u1.f14749f;
        xVar.i(2, w1Var2);
        w1 w1Var3 = u1.f14745b;
        xVar.i(4, w1Var3);
        w1 w1Var4 = u1.f14747d;
        xVar.i(8, w1Var4);
        w1 w1Var5 = u1.f14751h;
        xVar.i(16, w1Var5);
        w1 w1Var6 = u1.f14748e;
        xVar.i(32, w1Var6);
        w1 w1Var7 = u1.f14752i;
        xVar.i(64, w1Var7);
        w1 w1Var8 = u1.f14746c;
        xVar.i(128, w1Var8);
        f14758a = xVar;
        f14759b = new v1[]{w1Var, w1Var2, w1Var3, w1Var7, w1Var5, w1Var6, w1Var4, u1.f14753j, w1Var8};
    }

    public static final void a(a4.u0 u0Var, t tVar, long j2, int i2, int i10) {
        if (!c0.h(j2, -1L)) {
            u0Var.a(tVar.b(), (int) ((j2 >>> 48) & 65535));
            u0Var.a(tVar.d(), (int) ((j2 >>> 32) & 65535));
            u0Var.a(tVar.c(), i2 - ((int) ((j2 >>> 16) & 65535)));
            u0Var.a(tVar.a(), i10 - ((int) (j2 & 65535)));
        }
    }
}
