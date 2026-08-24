package defpackage;

import java.nio.file.attribute.FileTime;
import java.time.Instant;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb2  reason: default package */
/* loaded from: classes.dex */
public abstract class zb2 {
    public static final long a;

    static {
        Instant unused;
        unused = Instant.EPOCH;
        FileTime.from(Instant.EPOCH);
        a = 10000000L;
    }

    public static FileTime a(long j) {
        Instant ofEpochSecond;
        FileTime from;
        long addExact = Math.addExact(j, -116444736000000000L);
        long j2 = a;
        ofEpochSecond = Instant.ofEpochSecond(Math.floorDiv(addExact, j2), Math.floorMod(addExact, j2) * 100);
        from = FileTime.from(ofEpochSecond);
        return from;
    }
}
