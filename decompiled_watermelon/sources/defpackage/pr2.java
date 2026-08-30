package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pr2  reason: default package */
/* loaded from: classes.dex */
public final class pr2 implements xa7 {
    public static final vn1 d = new vn1(6);
    public final hh3 a;
    public final xa7 b;
    public final l9 c;

    public pr2(hh3 hh3Var, xa7 xa7Var, os osVar) {
        this.a = hh3Var;
        this.b = xa7Var;
        this.c = new l9(1, osVar);
    }

    @Override // defpackage.xa7
    public final ra7 a(Class cls) {
        if (!this.a.containsKey(cls)) {
            return this.b.a(cls);
        }
        vd6.i("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        return null;
    }

    @Override // defpackage.xa7
    public final ra7 b(Class cls, g14 g14Var) {
        if (this.a.containsKey(cls)) {
            return this.c.b(cls, g14Var);
        }
        return this.b.b(cls, g14Var);
    }
}
