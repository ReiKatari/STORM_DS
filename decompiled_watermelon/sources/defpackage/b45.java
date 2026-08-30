package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b45  reason: default package */
/* loaded from: classes.dex */
public final class b45 extends c45 implements Serializable {
    @Override // defpackage.c45
    public final int a(int i) {
        return c45.A.a(i);
    }

    @Override // defpackage.c45
    public final byte[] b(int i, byte[] bArr) {
        c45.A.b(i, bArr);
        return bArr;
    }

    @Override // defpackage.c45
    public final byte[] c(byte[] bArr) {
        h1 h1Var = c45.A;
        h1Var.getClass();
        h1Var.e().nextBytes(bArr);
        return bArr;
    }

    @Override // defpackage.c45
    public final int d() {
        return c45.A.d();
    }
}
