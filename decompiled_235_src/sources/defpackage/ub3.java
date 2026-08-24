package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ub3  reason: default package */
/* loaded from: classes.dex */
public class ub3 extends IOException {
    /* JADX WARN: Type inference failed for: r0v0, types: [ub3, java.io.IOException] */
    public static ub3 a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [tb3, java.io.IOException] */
    public static tb3 b() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ub3, java.io.IOException] */
    public static ub3 c() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ub3, java.io.IOException] */
    public static ub3 d() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ub3, java.io.IOException] */
    public static ub3 e() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
