package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m04  reason: default package */
/* loaded from: classes.dex */
public final class m04 extends o04 implements Iterator, zf3 {
    public final /* synthetic */ int X;

    public m04(p04 p04Var, int i) {
        this.X = i;
        p04Var.getClass();
        this.R = p04Var;
        this.B = -1;
        this.L = p04Var.d0;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.X) {
            case 0:
                b();
                int i = this.A;
                p04 p04Var = (p04) this.R;
                if (i < p04Var.Y) {
                    this.A = i + 1;
                    this.B = i;
                    n04 n04Var = new n04(p04Var, i);
                    e();
                    return n04Var;
                }
                fa6.c();
                return null;
            case 1:
                b();
                int i2 = this.A;
                p04 p04Var2 = (p04) this.R;
                if (i2 < p04Var2.Y) {
                    this.A = i2 + 1;
                    this.B = i2;
                    Object obj = p04Var2.A[i2];
                    e();
                    return obj;
                }
                fa6.c();
                return null;
            default:
                b();
                int i3 = this.A;
                p04 p04Var3 = (p04) this.R;
                if (i3 < p04Var3.Y) {
                    this.A = i3 + 1;
                    this.B = i3;
                    Object[] objArr = p04Var3.B;
                    objArr.getClass();
                    Object obj2 = objArr[this.B];
                    e();
                    return obj2;
                }
                fa6.c();
                return null;
        }
    }
}
