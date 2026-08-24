package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j32  reason: default package */
/* loaded from: classes.dex */
public final class j32 implements le2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ le2[] B;

    public /* synthetic */ j32(le2[] le2VarArr, int i) {
        this.A = i;
        this.B = le2VarArr;
    }

    @Override // defpackage.le2
    public final Object b(ne2 ne2Var, r41 r41Var) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        le2[] le2VarArr = this.B;
        switch (i) {
            case 0:
                Object o = nb3.o(r41Var, ne2Var, new h32(le2VarArr, 0), new i32(3, null, 0), le2VarArr);
                if (o == x61.COROUTINE_SUSPENDED) {
                    return o;
                }
                return jg7Var;
            default:
                Object o2 = nb3.o(r41Var, ne2Var, new h32(le2VarArr, 2), new i32(3, null, 1), le2VarArr);
                if (o2 == x61.COROUTINE_SUSPENDED) {
                    return o2;
                }
                return jg7Var;
        }
    }
}
