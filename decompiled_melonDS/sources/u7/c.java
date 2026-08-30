package u7;

import java.io.Closeable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface c extends Closeable {
    v7.b R();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
