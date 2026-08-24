package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yd2  reason: default package */
/* loaded from: classes.dex */
public final class yd2 extends s25 {
    public float[] a;
    public int b;

    @Override // defpackage.s25
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.s25
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // defpackage.s25
    public final int d() {
        return this.b;
    }
}
