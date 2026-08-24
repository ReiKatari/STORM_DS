package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lr4  reason: default package */
/* loaded from: classes.dex */
public final class lr4 extends hw6 implements eo2 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ nr4 Z;
    public final /* synthetic */ int d0;
    public final /* synthetic */ float e0;
    public final /* synthetic */ to f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr4(nr4 nr4Var, int i, float f, to toVar, r41 r41Var) {
        super(2, r41Var);
        this.Z = nr4Var;
        this.d0 = i;
        this.e0 = f;
        this.f0 = toVar;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((lr4) q((r41) obj2, (p76) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        lr4 lr4Var = new lr4(this.Z, this.d0, this.e0, this.f0, r41Var);
        lr4Var.Y = obj;
        return lr4Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        boolean z;
        int i;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.X;
        jg7 jg7Var = jg7.a;
        if (i2 != 0) {
            if (i2 == 1) {
                oi2.Y(obj);
                return jg7Var;
            }
            i.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oi2.Y(obj);
        nr4 nr4Var = this.Z;
        lr3 lr3Var = new lr3((p76) this.Y, nr4Var, 1);
        this.X = 1;
        or4 or4Var = pr4.a;
        int i3 = this.d0;
        nr4Var.q.i(nr4Var.j(new Integer(i3).intValue()));
        if (i3 > nr4Var.e) {
            z = true;
        } else {
            z = false;
        }
        int e = (lr3Var.e() - nr4Var.e) + 1;
        if (((z && i3 > lr3Var.e()) || (!z && i3 < nr4Var.e)) && Math.abs(i3 - nr4Var.e) >= 3) {
            if (z) {
                i = i3 - e;
                int i4 = nr4Var.e;
                if (i < i4) {
                    i = i4;
                }
            } else {
                int i5 = e + i3;
                i = nr4Var.e;
                if (i5 <= i) {
                    i = i5;
                }
            }
            lr3Var.f(i);
        }
        Object l = kj2.l(RecyclerView.B1, lr3Var.b(i3) + this.e0, this.f0, new ql1(27, new Object(), lr3Var), this, 4);
        if (l != x61Var) {
            l = jg7Var;
        }
        if (l == x61Var) {
            return x61Var;
        }
        return jg7Var;
    }
}
