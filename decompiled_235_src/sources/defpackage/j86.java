package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j86  reason: default package */
/* loaded from: classes.dex */
public final class j86 extends hw6 implements eo2 {
    public m86 X;
    public ch5 Y;
    public long Z;
    public int d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ m86 f0;
    public final /* synthetic */ ch5 g0;
    public final /* synthetic */ long h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j86(m86 m86Var, ch5 ch5Var, long j, r41 r41Var) {
        super(2, r41Var);
        this.f0 = m86Var;
        this.g0 = ch5Var;
        this.h0 = j;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((j86) q((r41) obj2, (k86) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        j86 j86Var = new j86(this.f0, this.g0, this.h0, r41Var);
        j86Var.e0 = obj;
        return j86Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        m86 m86Var;
        ch5 ch5Var;
        float c;
        m86 m86Var2;
        long j;
        long a;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.d0;
        if (i != 0) {
            if (i == 1) {
                j = this.Z;
                ch5Var = this.Y;
                m86Var = this.X;
                m86Var2 = (m86) this.e0;
                oi2.Y(obj);
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            m86Var = this.f0;
            i86 i86Var = new i86(m86Var, (k86) this.e0);
            sd2 sd2Var = m86Var.c;
            ch5Var = this.g0;
            long j2 = ch5Var.A;
            lo4 lo4Var = m86Var.d;
            lo4 lo4Var2 = lo4.Horizontal;
            long j3 = this.h0;
            if (lo4Var == lo4Var2) {
                c = ol7.b(j3);
            } else {
                c = ol7.c(j3);
            }
            float d = m86Var.d(c);
            this.e0 = m86Var;
            this.X = m86Var;
            this.Y = ch5Var;
            this.Z = j2;
            this.d0 = 1;
            obj = sd2Var.a(i86Var, d, this);
            if (obj == x61Var) {
                return x61Var;
            }
            m86Var2 = m86Var;
            j = j2;
        }
        float d2 = m86Var2.d(((Number) obj).floatValue());
        if (m86Var.d == lo4.Horizontal) {
            a = ol7.a(j, d2, RecyclerView.B1, 2);
        } else {
            a = ol7.a(j, RecyclerView.B1, d2, 1);
        }
        ch5Var.A = a;
        return jg7.a;
    }
}
