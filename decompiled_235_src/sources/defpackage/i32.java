package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i32  reason: default package */
/* loaded from: classes.dex */
public final class i32 extends hw6 implements fo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ ne2 Z;
    public /* synthetic */ Object[] d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i32(int i, r41 r41Var, int i2) {
        super(i, r41Var);
        this.X = i2;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        ne2 ne2Var = (ne2) obj;
        Object[] objArr = (Object[]) obj2;
        r41 r41Var = (r41) obj3;
        switch (i) {
            case 0:
                i32 i32Var = new i32(3, r41Var, 0);
                i32Var.Z = ne2Var;
                i32Var.d0 = objArr;
                return i32Var.s(jg7Var);
            default:
                i32 i32Var2 = new i32(3, r41Var, 1);
                i32Var2.Z = ne2Var;
                i32Var2.d0 = objArr;
                return i32Var2.s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x21 x21Var;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        int i2 = 0;
        x21 x21Var2 = null;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ne2 ne2Var = this.Z;
                Object[] objArr = this.d0;
                Object obj2 = objArr[0];
                obj2.getClass();
                jq1 jq1Var = (jq1) obj2;
                Object obj3 = objArr[1];
                obj3.getClass();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                Object obj4 = objArr[2];
                obj4.getClass();
                boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                Object obj5 = objArr[3];
                obj5.getClass();
                boolean booleanValue3 = ((Boolean) obj5).booleanValue();
                Object obj6 = objArr[4];
                obj6.getClass();
                boolean booleanValue4 = ((Boolean) obj6).booleanValue();
                Object obj7 = objArr[5];
                obj7.getClass();
                boolean booleanValue5 = ((Boolean) obj7).booleanValue();
                Object obj8 = objArr[6];
                obj8.getClass();
                jz1 jz1Var = new jz1(jq1Var, booleanValue, booleanValue2, booleanValue3, booleanValue4, booleanValue5, ((Boolean) obj8).booleanValue(), (p66) objArr[7], (p66) objArr[8]);
                this.Z = null;
                this.d0 = null;
                this.Y = 1;
                if (ne2Var.a(jz1Var, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ne2 ne2Var2 = this.Z;
                x21[] x21VarArr = (x21[]) this.d0;
                int length = x21VarArr.length;
                while (true) {
                    x21Var = v21.a;
                    if (i2 < length) {
                        x21 x21Var3 = x21VarArr[i2];
                        if (!nb3.k(x21Var3, x21Var)) {
                            x21Var2 = x21Var3;
                        } else {
                            i2++;
                        }
                    }
                }
                if (x21Var2 != null) {
                    x21Var = x21Var2;
                }
                this.Y = 1;
                if (ne2Var2.a(x21Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
        }
    }
}
