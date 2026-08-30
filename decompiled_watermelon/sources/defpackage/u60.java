package defpackage;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u60  reason: default package */
/* loaded from: classes.dex */
public interface u60 extends sb6, ReadableByteChannel {
    int H(cf4 cf4Var);

    String O(long j);

    long S(t60 t60Var);

    f60 b();

    void b0(long j);

    String h0(Charset charset);

    w70 r(long j);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    boolean u(long j);
}
