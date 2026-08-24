package defpackage;

import java.nio.channels.WritableByteChannel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y80  reason: default package */
/* loaded from: classes.dex */
public interface y80 extends ui6, WritableByteChannel {
    y80 B(byte[] bArr, int i);

    y80 H(String str);

    y80 P(da0 da0Var);

    k80 a();

    @Override // defpackage.ui6, java.io.Flushable
    void flush();

    y80 h0(long j);

    y80 write(byte[] bArr);

    y80 writeByte(int i);

    y80 writeInt(int i);

    y80 writeShort(int i);
}
