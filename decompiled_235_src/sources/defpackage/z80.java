package defpackage;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z80  reason: default package */
/* loaded from: classes.dex */
public interface z80 extends in6, ReadableByteChannel {
    long C(y80 y80Var);

    void K(k80 k80Var, long j);

    String M(Charset charset);

    boolean T(long j);

    k80 a();

    void g0(long j);

    da0 l(long j);

    byte[] q();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j);

    int t(eo4 eo4Var);

    String y(long j);
}
