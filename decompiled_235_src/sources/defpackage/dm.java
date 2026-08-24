package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dm implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ hm B;
    public final /* synthetic */ m07 L;

    public /* synthetic */ dm(hm hmVar, m07 m07Var, int i) {
        this.A = i;
        this.B = hmVar;
        this.L = m07Var;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [dh5, java.lang.Object] */
    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jk3 jk3Var = null;
        m07 m07Var = this.L;
        hm hmVar = this.B;
        switch (i) {
            case 0:
                cm cmVar = hmVar.f;
                a5 a5Var = new a5(m07Var, 3);
                ?? obj = new Object();
                hmVar.e.d("dataBuilder", cmVar, new q6(6, obj, a5Var));
                Object obj2 = obj.A;
                if (obj2 != null) {
                    return (l07) obj2;
                }
                nb3.a0("result");
                throw null;
            case 1:
                cm cmVar2 = hmVar.g;
                dm dmVar = new dm(hmVar, m07Var, 2);
                ?? obj3 = new Object();
                hmVar.e.d("positioner", cmVar2, new q6(6, obj3, dmVar));
                Object obj4 = obj3.A;
                if (obj4 != null) {
                    return (of5) obj4;
                }
                nb3.a0("result");
                throw null;
            default:
                Object c = hmVar.c.c();
                if (((jk3) c).t()) {
                    jk3Var = c;
                }
                jk3 jk3Var2 = jk3Var;
                if (jk3Var2 == null) {
                    return of5.e;
                }
                return m07Var.l(jk3Var2).i(jk3Var2.P(0L));
        }
    }
}
