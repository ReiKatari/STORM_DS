package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ra  reason: default package */
/* loaded from: classes.dex */
public final class ra extends og4 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final byte[] g;

    public ra(byte[] bArr, String str, int i, String str2, int i2, int i3) {
        int length = bArr.length;
        if (length >= 16 && length >= i) {
            kk7.a(i);
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
            throw new InvalidAlgorithmParameterException(lb1.g(i2, "tag size too small "));
        }
        int max = Math.max(16, i);
        throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + max);
    }

    public static byte[] i(ra raVar, byte[] bArr, long j, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        if (0 <= j && j < 4294967296L) {
            allocate.putInt((int) j);
            allocate.put(z ? (byte) 1 : (byte) 0);
            allocate.putInt(0);
            return allocate.array();
        }
        e41.v("Index out of range");
        return null;
    }

    @Override // defpackage.og4
    public final int c() {
        return e();
    }

    @Override // defpackage.og4
    public final int d() {
        return this.d;
    }

    @Override // defpackage.og4
    public final int e() {
        return this.a + 8;
    }

    @Override // defpackage.og4
    public final int f() {
        return this.e;
    }

    @Override // defpackage.og4
    public final mr6 g() {
        return new pa(this);
    }

    @Override // defpackage.og4
    public final nr6 h(byte[] bArr) {
        return new qa(this, bArr);
    }
}
