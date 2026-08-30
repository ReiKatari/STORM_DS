package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yy1  reason: default package */
/* loaded from: classes.dex */
public final class yy1 extends nk6 implements bj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ w92 Z;
    public /* synthetic */ Object[] c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy1(int i, int i2, j11 j11Var) {
        super(i, j11Var);
        this.X = i2;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        o27 o27Var = o27.a;
        w92 w92Var = (w92) obj;
        Object[] objArr = (Object[]) obj2;
        j11 j11Var = (j11) obj3;
        switch (i) {
            case 0:
                yy1 yy1Var = new yy1(3, 0, j11Var);
                yy1Var.Z = w92Var;
                yy1Var.c0 = objArr;
                return yy1Var.v(o27Var);
            default:
                yy1 yy1Var2 = new yy1(3, 1, j11Var);
                yy1Var2.Z = w92Var;
                yy1Var2.c0 = objArr;
                return yy1Var2.v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        sz0 sz0Var;
        int i = this.X;
        o27 o27Var = o27.a;
        int i2 = 0;
        sz0 sz0Var2 = null;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                w92 w92Var = this.Z;
                Object[] objArr = this.c0;
                Object obj2 = objArr[0];
                obj2.getClass();
                cm1 cm1Var = (cm1) obj2;
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
                yu1 yu1Var = new yu1(cm1Var, booleanValue, booleanValue2, booleanValue3, booleanValue4, booleanValue5, ((Boolean) obj8).booleanValue(), (gv5) objArr[7], (gv5) objArr[8]);
                this.Z = null;
                this.c0 = null;
                this.Y = 1;
                if (w92Var.b(yu1Var, this) == p31Var) {
                    return p31Var;
                }
                return o27Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                w92 w92Var2 = this.Z;
                sz0[] sz0VarArr = (sz0[]) this.c0;
                int length = sz0VarArr.length;
                while (true) {
                    sz0Var = qz0.a;
                    if (i2 < length) {
                        sz0 sz0Var3 = sz0VarArr[i2];
                        if (!b53.x(sz0Var3, sz0Var)) {
                            sz0Var2 = sz0Var3;
                        } else {
                            i2++;
                        }
                    }
                }
                if (sz0Var2 != null) {
                    sz0Var = sz0Var2;
                }
                this.Y = 1;
                if (w92Var2.b(sz0Var, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
        }
    }
}
