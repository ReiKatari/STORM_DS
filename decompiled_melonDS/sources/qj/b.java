package qj;

import java.nio.file.attribute.FileTime;
import java.time.Instant;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final long f12554a;

    static {
        Instant unused;
        unused = Instant.EPOCH;
        FileTime.from(Instant.EPOCH);
        f12554a = 10000000L;
    }

    public static FileTime a(long j2) {
        Instant ofEpochSecond;
        FileTime from;
        long addExact = Math.addExact(j2, -116444736000000000L);
        long j10 = f12554a;
        ofEpochSecond = Instant.ofEpochSecond(Math.floorDiv(addExact, j10), Math.floorMod(addExact, j10) * 100);
        from = FileTime.from(ofEpochSecond);
        return from;
    }
}
