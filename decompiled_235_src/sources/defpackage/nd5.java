package defpackage;

import java.security.SecureRandom;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nd5  reason: default package */
/* loaded from: classes.dex */
public abstract class nd5 {
    public static final qm a = new qm(5);

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
