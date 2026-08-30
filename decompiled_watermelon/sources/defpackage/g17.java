package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g17  reason: default package */
/* loaded from: classes.dex */
public final class g17 extends qt4 {
    public byte[] a;
    public int b;

    @Override // defpackage.qt4
    public final Object a() {
        return new f17(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.qt4
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.qt4
    public final int d() {
        return this.b;
    }
}
