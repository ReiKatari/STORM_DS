package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fh6  reason: default package */
/* loaded from: classes.dex */
public final class fh6 extends s25 {
    public short[] a;
    public int b;

    @Override // defpackage.s25
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.s25
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.s25
    public final int d() {
        return this.b;
    }
}
