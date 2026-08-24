package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx2  reason: default package */
/* loaded from: classes.dex */
public final class qx2 implements yo7 {
    public static final w31 d = new w31(8);
    public final io3 a;
    public final yo7 b;
    public final m9 c;

    public qx2(io3 io3Var, yo7 yo7Var, bt btVar) {
        this.a = io3Var;
        this.b = yo7Var;
        this.c = new m9(btVar, 1);
    }

    @Override // defpackage.yo7
    public final qo7 a(Class cls) {
        if (!this.a.containsKey(cls)) {
            return this.b.a(cls);
        }
        fa6.h("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        return null;
    }

    @Override // defpackage.yo7
    public final qo7 b(Class cls, m94 m94Var) {
        if (this.a.containsKey(cls)) {
            return this.c.b(cls, m94Var);
        }
        return this.b.b(cls, m94Var);
    }
}
