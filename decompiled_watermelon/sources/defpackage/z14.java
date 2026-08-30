package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z14  reason: default package */
/* loaded from: classes.dex */
public final class z14 extends jc5 implements aj2 {
    public ll2 L;
    public a24 R;
    public long[] X;
    public int Y;
    public int Z;
    public /* synthetic */ Object c0;
    public final /* synthetic */ a24 d0;
    public final /* synthetic */ ll2 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z14(a24 a24Var, ll2 ll2Var, j11 j11Var) {
        super(2, j11Var);
        this.d0 = a24Var;
        this.e0 = ll2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((z14) t((j11) obj2, (c06) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        z14 z14Var = new z14(this.d0, this.e0, j11Var);
        z14Var.c0 = obj;
        return z14Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        a24 a24Var;
        long[] jArr;
        int i;
        ll2 ll2Var;
        c06 c06Var;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i2 = this.Z;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = this.Y;
                long[] jArr2 = this.X;
                a24 a24Var2 = this.R;
                ll2Var = this.L;
                c06Var = (c06) this.c0;
                me2.a0(obj);
                i = i3;
                a24Var = a24Var2;
                jArr = jArr2;
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            a24Var = this.d0;
            y14 y14Var = a24Var.B;
            jArr = y14Var.c;
            i = y14Var.e;
            ll2Var = this.e0;
            c06Var = (c06) this.c0;
        }
        while (i != Integer.MAX_VALUE) {
            int i4 = (int) ((jArr[i] >> 31) & 2147483647L);
            ll2Var.B = i;
            Object obj2 = a24Var.B.b[i];
            this.c0 = c06Var;
            this.L = ll2Var;
            this.R = a24Var;
            this.X = jArr;
            this.Y = i4;
            this.Z = 1;
            if (c06Var.c(this, obj2) == p31Var) {
                return p31Var;
            }
            i = i4;
        }
        return o27.a;
    }
}
