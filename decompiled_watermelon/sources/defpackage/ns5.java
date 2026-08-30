package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ns5  reason: default package */
/* loaded from: classes.dex */
public interface ns5 extends AutoCloseable {
    void M(int i, String str);

    default boolean P() {
        if (getLong(0) == 0) {
            return false;
        }
        return true;
    }

    boolean a0();

    void e(int i);

    void g(int i, long j);

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    void h();

    boolean isNull(int i);

    void j(int i, byte[] bArr);

    String q(int i);

    void reset();
}
