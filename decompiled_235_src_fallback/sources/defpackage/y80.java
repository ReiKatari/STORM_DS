package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y80  reason: default package */
/* loaded from: classes.dex */
public interface y80 extends defpackage.ui6, java.nio.channels.WritableByteChannel {
    defpackage.y80 B(byte[] r1, int r2);

    defpackage.y80 H(java.lang.String r1);

    defpackage.y80 P(defpackage.da0 r1);

    defpackage.k80 a();

    @Override // defpackage.ui6, java.io.Flushable
    void flush();

    defpackage.y80 h0(long r1);

    defpackage.y80 write(byte[] r1);

    defpackage.y80 writeByte(int r1);

    defpackage.y80 writeInt(int r1);

    defpackage.y80 writeShort(int r1);
}
