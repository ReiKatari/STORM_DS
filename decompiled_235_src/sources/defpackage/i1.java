package defpackage;

import java.util.Random;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i1  reason: default package */
/* loaded from: classes.dex */
public abstract class i1 extends md5 {
    @Override // defpackage.md5
    public final int a(int i) {
        return (e().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.md5
    public final byte[] b(byte[] bArr) {
        e().nextBytes(bArr);
        return bArr;
    }

    @Override // defpackage.md5
    public final int d() {
        return e().nextInt();
    }

    public abstract Random e();
}
