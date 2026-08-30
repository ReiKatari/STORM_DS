package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: df2  reason: default package */
/* loaded from: classes.dex */
public final class df2 {
    public static final df2 d = new df2("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new df2("\n", "  ", true);
    }

    public df2(String str, String str2, boolean z) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.a = str;
                this.b = str2;
                this.c = z;
                return;
            }
            i.i("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        i.i("Only combinations of \\n and \\r are allowed in newline.");
        throw null;
    }
}
