package defpackage;

import java.util.Random;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h1  reason: default package */
/* loaded from: classes.dex */
public abstract class h1 extends c45 {
    @Override // defpackage.c45
    public final int a(int i) {
        return (e().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.c45
    public final byte[] c(byte[] bArr) {
        e().nextBytes(bArr);
        return bArr;
    }

    @Override // defpackage.c45
    public final int d() {
        return e().nextInt();
    }

    public abstract Random e();
}
