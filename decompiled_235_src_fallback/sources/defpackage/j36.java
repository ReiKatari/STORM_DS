package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j36  reason: default package */
/* loaded from: classes.dex */
public interface j36 extends java.lang.AutoCloseable {
    java.lang.String R(int r1);

    void c(int r1, long r2);

    void d(byte[] r1, int r2);

    void f(int r1);

    boolean f0();

    void g();

    byte[] getBlob(int r1);

    int getColumnCount();

    java.lang.String getColumnName(int r1);

    long getLong(int r1);

    boolean isNull(int r1);

    void reset();

    void w(int r1, java.lang.String r2);

    default boolean z() {
            r5 = this;
            r0 = 0
            long r1 = r5.getLong(r0)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Ld
            r5 = 1
            return r5
        Ld:
            return r0
    }
}
