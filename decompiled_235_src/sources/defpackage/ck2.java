package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ck2  reason: default package */
/* loaded from: classes.dex */
public final class ck2 {
    public static final ck2 d = new ck2("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new ck2("\n", "  ", true);
    }

    public ck2(String str, String str2, boolean z) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.a = str;
                this.b = str2;
                this.c = z;
                return;
            }
            i.h("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        i.h("Only combinations of \\n and \\r are allowed in newline.");
        throw null;
    }
}
