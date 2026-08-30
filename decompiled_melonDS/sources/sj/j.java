package sj;

import java.util.regex.Pattern;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends xj.a {

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern[][] f12991e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* renamed from: b  reason: collision with root package name */
    public final Pattern f12993b;

    /* renamed from: a  reason: collision with root package name */
    public final vj.i f12992a = new vj.i(0);

    /* renamed from: c  reason: collision with root package name */
    public boolean f12994c = false;

    /* renamed from: d  reason: collision with root package name */
    public bk.a f12995d = new bk.a(10, (byte) 0);

    public j(Pattern pattern) {
        this.f12993b = pattern;
    }

    @Override // xj.a
    public final void a(CharSequence charSequence) {
        bk.a aVar = this.f12995d;
        StringBuilder sb2 = (StringBuilder) aVar.L;
        if (aVar.B != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        aVar.B++;
        Pattern pattern = this.f12993b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f12994c = true;
        }
    }

    @Override // xj.a
    public final void c() {
        Object obj = this.f12995d.L;
        this.f12995d = null;
    }

    @Override // xj.a
    public final vj.a d() {
        return this.f12992a;
    }

    @Override // xj.a
    public final a g(g gVar) {
        if (!this.f12994c) {
            if (gVar.f12978h && this.f12993b == null) {
                return null;
            }
            return a.a(gVar.f12972b);
        }
        return null;
    }
}
