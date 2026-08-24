package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bm1  reason: default package */
/* loaded from: classes.dex */
public final class bm1 extends s25 {
    public double[] a;
    public int b;

    @Override // defpackage.s25
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.s25
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(dArr, i);
        }
    }

    @Override // defpackage.s25
    public final int d() {
        return this.b;
    }
}
