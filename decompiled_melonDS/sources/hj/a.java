package hj;

import java.io.IOException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class a extends IOException {
    public a(int i2, long j2) {
        super(j2 + " kb of memory would be needed; limit was " + i2 + " kb. If the file is not corrupt, consider increasing the memory limit.");
    }
}
