package defpackage;

import java.nio.file.attribute.FileTime;
import java.time.Instant;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g72  reason: default package */
/* loaded from: classes.dex */
public abstract class g72 {
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
