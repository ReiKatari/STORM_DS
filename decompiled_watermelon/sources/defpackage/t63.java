package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t63  reason: default package */
/* loaded from: classes.dex */
public abstract class t63 {
    public static final s63 d = new t63(new e73(false, true, "    ", "type", true, po0.POLYMORPHIC, true), u06.a);
    public final e73 a;
    public final vn1 b;
    public final t71 c = new t71(6);

    public t63(e73 e73Var, vn1 vn1Var) {
        this.a = e73Var;
        this.b = vn1Var;
    }

    public final Object a(m93 m93Var, String str) {
        m93Var.getClass();
        str.getClass();
        wg6 e = ep2.e(this, str);
        Object n = new og6(this, ej7.OBJ, e, m93Var.e()).n(m93Var);
        e.o();
        return n;
    }

    public final String b(m93 m93Var, Object obj) {
        m93Var.getClass();
        sb sbVar = new sb((char) 0, 7);
        ak0 ak0Var = ak0.c;
        sbVar.L = ak0Var.d(128);
        try {
            ep2.p(this, sbVar, m93Var, obj);
            String sbVar2 = sbVar.toString();
            char[] cArr = (char[]) sbVar.L;
            ak0Var.getClass();
            cArr.getClass();
            ak0Var.b(cArr);
            return sbVar2;
        } catch (Throwable th) {
            ak0 ak0Var2 = ak0.c;
            char[] cArr2 = (char[]) sbVar.L;
            ak0Var2.getClass();
            cArr2.getClass();
            ak0Var2.b(cArr2);
            throw th;
        }
    }
}
