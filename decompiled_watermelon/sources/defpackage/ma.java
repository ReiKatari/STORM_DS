package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ma  reason: default package */
/* loaded from: classes.dex */
public final class ma extends x74 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final byte[] g;

    public ma(byte[] bArr, String str, int i, String str2, int i2, int i3) {
        int length = bArr.length;
        if (length >= 16 && length >= i) {
            n67.a(i);
            if (i2 >= 10) {
                if ((str2.equals("HmacSha1") && i2 > 20) || ((str2.equals("HmacSha256") && i2 > 32) || (str2.equals("HmacSha512") && i2 > 64))) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
                if (((i3 - i2) - i) - 8 > 0) {
                    this.g = Arrays.copyOf(bArr, bArr.length);
                    this.f = str;
                    this.a = i;
                    this.b = str2;
                    this.c = i2;
                    this.d = i3;
                    this.e = i3 - i2;
                    return;
                }
                throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
            }
            throw new InvalidAlgorithmParameterException(wh1.g(i2, "tag size too small "));
        }
        int max = Math.max(16, i);
        throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + max);
    }

    public static byte[] i(ma maVar, byte[] bArr, long j, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        if (0 <= j && j < 4294967296L) {
            allocate.putInt((int) j);
            allocate.put(z ? (byte) 1 : (byte) 0);
            allocate.putInt(0);
            return allocate.array();
        }
        f81.u("Index out of range");
        return null;
    }

    @Override // defpackage.x74
    public final int c() {
        return e();
    }

    @Override // defpackage.x74
    public final int d() {
        return this.d;
    }

    @Override // defpackage.x74
    public final int e() {
        return this.a + 8;
    }

    @Override // defpackage.x74
    public final int f() {
        return this.e;
    }

    @Override // defpackage.x74
    public final wf6 g() {
        return new ka(this);
    }

    @Override // defpackage.x74
    public final xf6 h(byte[] bArr) {
        return new la(this, bArr);
    }
}
