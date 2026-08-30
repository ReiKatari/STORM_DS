package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zu0  reason: default package */
/* loaded from: classes.dex */
public interface zu0 {
    void A(h06 h06Var, int i, boolean z);

    void C(rt4 rt4Var, int i, char c);

    void F(h06 h06Var, int i, m93 m93Var, Object obj);

    void N(h06 h06Var, int i, m93 m93Var, Object obj);

    void R(rt4 rt4Var, int i, byte b);

    mz1 Y(rt4 rt4Var, int i);

    void a(h06 h06Var);

    void d(rt4 rt4Var, int i, double d);

    void e0(h06 h06Var, int i, float f);

    default boolean k(h06 h06Var) {
        h06Var.getClass();
        return true;
    }

    void m(rt4 rt4Var, int i, short s);

    void q(int i, int i2, h06 h06Var);

    void r(h06 h06Var, int i, long j);

    void z(h06 h06Var, int i, String str);
}
