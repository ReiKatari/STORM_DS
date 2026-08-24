package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z80  reason: default package */
/* loaded from: classes.dex */
public interface z80 extends defpackage.in6, java.nio.channels.ReadableByteChannel {
    long C(defpackage.y80 r1);

    void K(defpackage.k80 r1, long r2);

    java.lang.String M(java.nio.charset.Charset r1);

    boolean T(long r1);

    defpackage.k80 a();

    void g0(long r1);

    defpackage.da0 l(long r1);

    byte[] q();

    byte readByte();

    void readFully(byte[] r1);

    int readInt();

    long readLong();

    short readShort();

    void skip(long r1);

    int t(defpackage.eo4 r1);

    java.lang.String y(long r1);
}
