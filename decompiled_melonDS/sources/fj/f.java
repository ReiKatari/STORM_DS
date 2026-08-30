package fj;

import java.nio.channels.WritableByteChannel;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface f extends e0, WritableByteChannel {
    f M(int i2, byte[] bArr);

    f P(String str);

    f Q(long j2);

    e b();

    @Override // fj.e0, java.io.Flushable
    void flush();

    f p(h hVar);

    f write(byte[] bArr);

    f writeByte(int i2);

    f writeInt(int i2);

    f writeShort(int i2);
}
