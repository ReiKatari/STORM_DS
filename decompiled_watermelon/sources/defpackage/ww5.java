package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ww5  reason: default package */
/* loaded from: classes.dex */
public final class ww5 extends nk6 implements aj2 {
    public ax5 X;
    public m75 Y;
    public long Z;
    public int c0;
    public /* synthetic */ Object d0;
    public final /* synthetic */ ax5 e0;
    public final /* synthetic */ m75 f0;
    public final /* synthetic */ long g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww5(ax5 ax5Var, m75 m75Var, long j, j11 j11Var) {
        super(2, j11Var);
        this.e0 = ax5Var;
        this.f0 = m75Var;
        this.g0 = j;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((ww5) t((j11) obj2, (xw5) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        ww5 ww5Var = new ww5(this.e0, this.f0, this.g0, j11Var);
        ww5Var.d0 = obj;
        return ww5Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        ax5 ax5Var;
        m75 m75Var;
        float c;
        ax5 ax5Var2;
        long j;
        long a;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.c0;
        if (i != 0) {
            if (i == 1) {
                j = this.Z;
                m75Var = this.Y;
                ax5Var = this.X;
                ax5Var2 = (ax5) this.d0;
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            ax5Var = this.e0;
            vw5 vw5Var = new vw5(ax5Var, (xw5) this.d0);
            a92 a92Var = ax5Var.c;
            m75Var = this.f0;
            long j2 = m75Var.A;
            jf4 jf4Var = ax5Var.d;
            jf4 jf4Var2 = jf4.Horizontal;
            long j3 = this.g0;
            if (jf4Var == jf4Var2) {
                c = p77.b(j3);
            } else {
                c = p77.c(j3);
            }
            float d = ax5Var.d(c);
            this.d0 = ax5Var;
            this.X = ax5Var;
            this.Y = m75Var;
            this.Z = j2;
            this.c0 = 1;
            obj = a92Var.a(vw5Var, d, this);
            if (obj == p31Var) {
                return p31Var;
            }
            ax5Var2 = ax5Var;
            j = j2;
        }
        float d2 = ax5Var2.d(((Number) obj).floatValue());
        if (ax5Var.d == jf4.Horizontal) {
            a = p77.a(j, d2, RecyclerView.A1, 2);
        } else {
            a = p77.a(j, RecyclerView.A1, d2, 1);
        }
        m75Var.A = a;
        return o27.a;
    }
}
