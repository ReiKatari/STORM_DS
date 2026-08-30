package t7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface c extends AutoCloseable {
    void C(int i2, String str);

    default boolean E() {
        if (getLong(0) == 0) {
            return false;
        }
        return true;
    }

    boolean N();

    void e(int i2);

    void g(int i2, long j2);

    byte[] getBlob(int i2);

    int getColumnCount();

    String getColumnName(int i2);

    long getLong(int i2);

    void h();

    boolean isNull(int i2);

    void j(int i2, byte[] bArr);

    String n(int i2);

    void reset();
}
