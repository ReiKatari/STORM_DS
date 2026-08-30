package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jt3  reason: default package */
/* loaded from: classes.dex */
public final class jt3 extends lt3 implements Iterator, f93 {
    public final /* synthetic */ int X;

    public jt3(mt3 mt3Var, int i) {
        this.X = i;
        mt3Var.getClass();
        this.R = mt3Var;
        this.B = -1;
        this.L = mt3Var.c0;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.X) {
            case 0:
                b();
                int i = this.A;
                mt3 mt3Var = (mt3) this.R;
                if (i < mt3Var.Y) {
                    this.A = i + 1;
                    this.B = i;
                    kt3 kt3Var = new kt3(mt3Var, i);
                    e();
                    return kt3Var;
                }
                vd6.b();
                return null;
            case 1:
                b();
                int i2 = this.A;
                mt3 mt3Var2 = (mt3) this.R;
                if (i2 < mt3Var2.Y) {
                    this.A = i2 + 1;
                    this.B = i2;
                    Object obj = mt3Var2.A[i2];
                    e();
                    return obj;
                }
                vd6.b();
                return null;
            default:
                b();
                int i3 = this.A;
                mt3 mt3Var3 = (mt3) this.R;
                if (i3 < mt3Var3.Y) {
                    this.A = i3 + 1;
                    this.B = i3;
                    Object[] objArr = mt3Var3.B;
                    objArr.getClass();
                    Object obj2 = objArr[this.B];
                    e();
                    return obj2;
                }
                vd6.b();
                return null;
        }
    }
}
