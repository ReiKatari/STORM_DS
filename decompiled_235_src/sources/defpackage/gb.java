package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.GCMParameterSpec;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gb  reason: default package */
/* loaded from: classes.dex */
public final class gb extends og4 {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final byte[] e;

    public gb(String str, byte[] bArr, int i, int i2) {
        if (bArr.length >= 16 && bArr.length >= i) {
            kk7.a(i);
            if (i2 > e() + 16) {
                this.e = Arrays.copyOf(bArr, bArr.length);
                this.d = str;
                this.a = i;
                this.b = i2;
                this.c = i2 - 16;
                return;
            }
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
        int max = Math.max(16, i);
        throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + max);
    }

    public static GCMParameterSpec i(byte[] bArr, long j, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        if (0 <= j && j < 4294967296L) {
            allocate.putInt((int) j);
            allocate.put(z ? (byte) 1 : (byte) 0);
            return new GCMParameterSpec(128, allocate.array());
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
        return this.b;
    }

    @Override // defpackage.og4
    public final int e() {
        return this.a + 8;
    }

    @Override // defpackage.og4
    public final int f() {
        return this.c;
    }

    @Override // defpackage.og4
    public final mr6 g() {
        return new eb(this);
    }

    @Override // defpackage.og4
    public final nr6 h(byte[] bArr) {
        return new fb(this, bArr);
    }
}
