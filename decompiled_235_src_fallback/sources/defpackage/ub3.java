package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ub3  reason: default package */
/* loaded from: classes.dex */
public class ub3 extends java.io.IOException {
    public static defpackage.ub3 a() {
            ub3 r0 = new ub3
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            r0.<init>(r1)
            return r0
    }

    public static defpackage.tb3 b() {
            tb3 r0 = new tb3
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r0.<init>(r1)
            return r0
    }

    public static defpackage.ub3 c() {
            ub3 r0 = new ub3
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            return r0
    }

    public static defpackage.ub3 d() {
            ub3 r0 = new ub3
            java.lang.String r1 = "Failed to parse the message."
            r0.<init>(r1)
            return r0
    }

    public static defpackage.ub3 e() {
            ub3 r0 = new ub3
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            return r0
    }
}
