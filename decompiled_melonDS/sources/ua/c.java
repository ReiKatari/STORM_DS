package ua;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final c f13521d = new c("", "", false);

    /* renamed from: a  reason: collision with root package name */
    public final String f13522a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13523b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13524c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z10) {
        if (str.matches("[\r\n]*")) {
            if (str2.matches("[ \t]*")) {
                this.f13522a = str;
                this.f13523b = str2;
                this.f13524c = z10;
                return;
            }
            a0.j.h("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        a0.j.h("Only combinations of \\n and \\r are allowed in newline.");
        throw null;
    }
}
