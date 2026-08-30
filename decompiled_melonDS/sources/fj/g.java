package fj;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface g extends g0, ReadableByteChannel {
    String D(long j2);

    void O(long j2);

    String S(Charset charset);

    InputStream U();

    int V(v vVar);

    long W(f fVar);

    e b();

    h o(long j2);

    byte readByte();

    int readInt();

    short readShort();

    boolean s(long j2);

    void skip(long j2);
}
