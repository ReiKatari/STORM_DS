package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: id3  reason: default package */
/* loaded from: classes.dex */
public abstract class id3 {
    public static final hd3 d = new id3(new td3(false, true, "    ", "type", true, zq0.POLYMORPHIC, true), ic6.a);
    public final td3 a;
    public final jd1 b;
    public final d51 c = new d51(8);

    public id3(td3 td3Var, jd1 jd1Var) {
        this.a = td3Var;
        this.b = jd1Var;
    }

    public final Object a(gg3 gg3Var, String str) {
        gg3Var.getClass();
        str.getClass();
        ns6 i = np2.i(this, str);
        Object k = new fs6(this, by7.OBJ, i, gg3Var.e()).k(gg3Var);
        i.o();
        return k;
    }

    public final String b(gg3 gg3Var, Object obj) {
        gg3Var.getClass();
        zb zbVar = new zb((char) 0, 7);
        jm0 jm0Var = jm0.c;
        zbVar.L = jm0Var.d(128);
        try {
            oi2.v(this, zbVar, gg3Var, obj);
            String zbVar2 = zbVar.toString();
            char[] cArr = (char[]) zbVar.L;
            jm0Var.getClass();
            cArr.getClass();
            jm0Var.b(cArr);
            return zbVar2;
        } catch (Throwable th) {
            jm0 jm0Var2 = jm0.c;
            char[] cArr2 = (char[]) zbVar.L;
            jm0Var2.getClass();
            cArr2.getClass();
            jm0Var2.b(cArr2);
            throw th;
        }
    }
}
