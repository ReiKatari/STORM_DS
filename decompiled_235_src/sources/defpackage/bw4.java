package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bw4  reason: default package */
/* loaded from: classes.dex */
public class bw4 extends zv4 {
    public final aw4 R;
    public Object X;
    public boolean Y;
    public int Z;

    public bw4(aw4 aw4Var, bc7[] bc7VarArr) {
        super(aw4Var.L, bc7VarArr);
        this.R = aw4Var;
        this.Z = aw4Var.X;
    }

    public final void c(int i, ac7 ac7Var, Object obj, int i2) {
        int i3 = i2 * 5;
        bc7[] bc7VarArr = this.A;
        if (i3 > 30) {
            bc7 bc7Var = bc7VarArr[i2];
            Object[] objArr = ac7Var.d;
            bc7Var.a(objArr, objArr.length, 0);
            while (true) {
                bc7 bc7Var2 = bc7VarArr[i2];
                if (!nb3.k(bc7Var2.A[bc7Var2.L], obj)) {
                    bc7VarArr[i2].L += 2;
                } else {
                    this.B = i2;
                    return;
                }
            }
        } else {
            int I = 1 << oi2.I(i, i3);
            if (ac7Var.h(I)) {
                bc7VarArr[i2].a(ac7Var.d, Integer.bitCount(ac7Var.a) * 2, ac7Var.f(I));
                this.B = i2;
                return;
            }
            int t = ac7Var.t(I);
            ac7 s = ac7Var.s(t);
            bc7VarArr[i2].a(ac7Var.d, Integer.bitCount(ac7Var.a) * 2, t);
            c(i, s, obj, i2 + 1);
        }
    }

    @Override // defpackage.zv4, java.util.Iterator
    public final Object next() {
        if (this.R.X == this.Z) {
            if (this.L) {
                bc7 bc7Var = this.A[this.B];
                this.X = bc7Var.A[bc7Var.L];
                this.Y = true;
                return super.next();
            }
            fa6.c();
            return null;
        }
        i.l();
        return null;
    }

    @Override // defpackage.zv4, java.util.Iterator
    public final void remove() {
        int i;
        if (this.Y) {
            boolean z = this.L;
            aw4 aw4Var = this.R;
            if (z) {
                if (z) {
                    bc7 bc7Var = this.A[this.B];
                    Object obj = bc7Var.A[bc7Var.L];
                    ge7.n(aw4Var).remove(this.X);
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    c(i, aw4Var.L, obj, 0);
                } else {
                    fa6.c();
                    return;
                }
            } else {
                ge7.n(aw4Var).remove(this.X);
            }
            this.X = null;
            this.Y = false;
            this.Z = aw4Var.X;
            return;
        }
        e41.m();
    }
}
