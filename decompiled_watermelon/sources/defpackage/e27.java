package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e27  reason: default package */
/* loaded from: classes.dex */
public final class e27 extends qt4 {
    public short[] a;
    public int b;

    @Override // defpackage.qt4
    public final Object a() {
        return new d27(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.qt4
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

    @Override // defpackage.qt4
    public final int d() {
        return this.b;
    }
}
