package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s21  reason: default package */
/* loaded from: classes.dex */
public final class s21 extends nk6 implements aj2 {
    public final /* synthetic */ int X = 1;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object c0;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s21(aj2 aj2Var, String str, String str2, k24 k24Var, j11 j11Var) {
        super(2, j11Var);
        this.Y = aj2Var;
        this.Z = str;
        this.c0 = str2;
        this.d0 = k24Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                ((s21) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            default:
                ((s21) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.d0;
        Object obj3 = this.c0;
        Object obj4 = this.Z;
        switch (i) {
            case 0:
                s21 s21Var = new s21((vp4) obj4, (vo6) obj3, (bq6) obj2, j11Var);
                s21Var.Y = obj;
                return s21Var;
            default:
                return new s21((aj2) this.Y, (String) obj4, (String) obj3, (k24) obj2, j11Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        Object obj2 = this.c0;
        Object obj3 = this.Z;
        Object obj4 = this.d0;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                o31 o31Var = (o31) this.Y;
                s31 s31Var = s31.UNDISPATCHED;
                vp4 vp4Var = (vp4) obj3;
                tq5.w(o31Var, null, s31Var, new r21(vp4Var, (vo6) obj2, null, 0), 1);
                tq5.w(o31Var, null, s31Var, new y(vp4Var, (bq6) obj4, null, 26), 1);
                return o27Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                tv0 tv0Var = wi5.a;
                if (((Boolean) ((k24) obj4).getValue()).booleanValue()) {
                    ((aj2) this.Y).j((String) obj3, (String) obj2);
                }
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s21(vp4 vp4Var, vo6 vo6Var, bq6 bq6Var, j11 j11Var) {
        super(2, j11Var);
        this.Z = vp4Var;
        this.c0 = vo6Var;
        this.d0 = bq6Var;
    }
}
