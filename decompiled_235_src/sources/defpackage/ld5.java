package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ld5  reason: default package */
/* loaded from: classes.dex */
public final class ld5 extends md5 implements Serializable {
    @Override // defpackage.md5
    public final int a(int i) {
        return md5.A.a(i);
    }

    @Override // defpackage.md5
    public final byte[] b(byte[] bArr) {
        i1 i1Var = md5.A;
        i1Var.getClass();
        i1Var.e().nextBytes(bArr);
        return bArr;
    }

    @Override // defpackage.md5
    public final byte[] c(byte[] bArr, int i) {
        md5.A.c(bArr, i);
        return bArr;
    }

    @Override // defpackage.md5
    public final int d() {
        return md5.A.d();
    }
}
