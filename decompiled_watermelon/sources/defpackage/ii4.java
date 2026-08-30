package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ii4  reason: default package */
/* loaded from: classes.dex */
public final class ii4 extends nk6 implements aj2 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ki4 Z;
    public final /* synthetic */ int c0;
    public final /* synthetic */ float d0;
    public final /* synthetic */ ho e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii4(ki4 ki4Var, int i, float f, ho hoVar, j11 j11Var) {
        super(2, j11Var);
        this.Z = ki4Var;
        this.c0 = i;
        this.d0 = f;
        this.e0 = hoVar;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((ii4) t((j11) obj2, (dw5) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        ii4 ii4Var = new ii4(this.Z, this.c0, this.d0, this.e0, j11Var);
        ii4Var.Y = obj;
        return ii4Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        boolean z;
        int i;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i2 = this.X;
        o27 o27Var = o27.a;
        if (i2 != 0) {
            if (i2 == 1) {
                me2.a0(obj);
                return o27Var;
            }
            i.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        me2.a0(obj);
        ki4 ki4Var = this.Z;
        lk3 lk3Var = new lk3((dw5) this.Y, ki4Var, 1);
        this.X = 1;
        mi4 mi4Var = ni4.a;
        int i3 = this.c0;
        ki4Var.q.i(ki4Var.j(new Integer(i3).intValue()));
        if (i3 > ki4Var.e) {
            z = true;
        } else {
            z = false;
        }
        int e = (lk3Var.e() - ki4Var.e) + 1;
        if (((z && i3 > lk3Var.e()) || (!z && i3 < ki4Var.e)) && Math.abs(i3 - ki4Var.e) >= 3) {
            if (z) {
                i = i3 - e;
                int i4 = ki4Var.e;
                if (i < i4) {
                    i = i4;
                }
            } else {
                int i5 = e + i3;
                i = ki4Var.e;
                if (i5 <= i) {
                    i = i5;
                }
            }
            lk3Var.f(i);
        }
        Object r = gk2.r(RecyclerView.A1, lk3Var.b(i3) + this.d0, this.e0, new s4(27, new Object(), lk3Var), this, 4);
        if (r != p31Var) {
            r = o27Var;
        }
        if (r == p31Var) {
            return p31Var;
        }
        return o27Var;
    }
}
