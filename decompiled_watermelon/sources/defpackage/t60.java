package defpackage;

import java.nio.channels.WritableByteChannel;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t60  reason: default package */
/* loaded from: classes.dex */
public interface t60 extends g76, WritableByteChannel {
    t60 Y(int i, byte[] bArr);

    f60 b();

    t60 c0(String str);

    t60 d0(long j);

    @Override // defpackage.g76, java.io.Flushable
    void flush();

    t60 n(w70 w70Var);

    t60 write(byte[] bArr);

    t60 writeByte(int i);

    t60 writeInt(int i);

    t60 writeShort(int i);
}
