package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: of7  reason: default package */
/* loaded from: classes.dex */
public final class of7 extends s25 {
    public int[] a;
    public int b;

    @Override // defpackage.s25
    public final Object a() {
        return new nf7(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.s25
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.s25
    public final int d() {
        return this.b;
    }
}
