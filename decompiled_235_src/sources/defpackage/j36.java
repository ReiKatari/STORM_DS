package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j36  reason: default package */
/* loaded from: classes.dex */
public interface j36 extends AutoCloseable {
    String R(int i);

    void c(int i, long j);

    void d(byte[] bArr, int i);

    void f(int i);

    boolean f0();

    void g();

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    boolean isNull(int i);

    void reset();

    void w(int i, String str);

    default boolean z() {
        if (getLong(0) == 0) {
            return false;
        }
        return true;
    }
}
