package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i53  reason: default package */
/* loaded from: classes.dex */
public class i53 extends IOException {
    /* JADX WARN: Type inference failed for: r0v0, types: [i53, java.io.IOException] */
    public static i53 a() {
        return new IOException("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h53, java.io.IOException] */
    public static h53 b() {
        return new IOException("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i53, java.io.IOException] */
    public static i53 c() {
        return new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i53, java.io.IOException] */
    public static i53 d() {
        return new IOException("Failed to parse the message.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i53, java.io.IOException] */
    public static i53 e() {
        return new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
