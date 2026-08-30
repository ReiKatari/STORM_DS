package od;

import l.i0;
import n2.o1;
import pd.k0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d  reason: collision with root package name */
    public static final b f10884d = new c(new o1(false, true, "    ", "type", true, a.POLYMORPHIC), qd.a.f12509a);

    /* renamed from: a  reason: collision with root package name */
    public final o1 f10885a;

    /* renamed from: b  reason: collision with root package name */
    public final k0.g f10886b;

    /* renamed from: c  reason: collision with root package name */
    public final i0 f10887c = new i0(20);

    public c(o1 o1Var, k0.g gVar) {
        this.f10885a = o1Var;
        this.f10886b = gVar;
    }

    public final Object a(jd.a aVar, z zVar) {
        return new pd.w(this, zVar, (String) null, 12).t(aVar);
    }

    public final Object b(String str, jd.a aVar) {
        aVar.getClass();
        str.getClass();
        pd.i0 i0Var = new pd.i0(str);
        Object t5 = new pd.e0(this, k0.OBJ, i0Var, aVar.e(), null).t(aVar);
        i0Var.n();
        return t5;
    }

    public final String c(jd.a aVar, Object obj) {
        aVar.getClass();
        bk.a aVar2 = new bk.a((char) 0, 7);
        pd.h hVar = pd.h.L;
        aVar2.L = hVar.h(128);
        try {
            pd.t.i(this, aVar2, aVar, obj);
            String aVar3 = aVar2.toString();
            char[] cArr = (char[]) aVar2.L;
            hVar.getClass();
            cArr.getClass();
            hVar.f(cArr);
            return aVar3;
        } catch (Throwable th2) {
            pd.h hVar2 = pd.h.L;
            char[] cArr2 = (char[]) aVar2.L;
            hVar2.getClass();
            cArr2.getClass();
            hVar2.f(cArr2);
            throw th2;
        }
    }
}
