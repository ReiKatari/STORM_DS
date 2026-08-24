package defpackage;

import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: az2  reason: default package */
/* loaded from: classes.dex */
public final class az2 extends u {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern b;
    public final zy2 a = new zy2(0);
    public boolean c = false;
    public zb d = new zb(1, (byte) 0);

    public az2(Pattern pattern) {
        this.b = pattern;
    }

    @Override // defpackage.u
    public final void a(CharSequence charSequence) {
        zb zbVar = this.d;
        StringBuilder sb = (StringBuilder) zbVar.L;
        if (zbVar.B != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        zbVar.B++;
        Pattern pattern = this.b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.c = true;
        }
    }

    @Override // defpackage.u
    public final void c() {
        Object obj = this.d.L;
        this.d = null;
    }

    @Override // defpackage.u
    public final a50 d() {
        return this.a;
    }

    @Override // defpackage.u
    public final b50 g(am1 am1Var) {
        if (!this.c) {
            if (am1Var.h && this.b == null) {
                return null;
            }
            return b50.a(am1Var.b);
        }
        return null;
    }
}
