package defpackage;

import java.util.regex.Pattern;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zs2  reason: default package */
/* loaded from: classes.dex */
public final class zs2 extends t {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern b;
    public final ys2 a = new ys2(0);
    public boolean c = false;
    public sb d = new sb(1, (byte) 0);

    public zs2(Pattern pattern) {
        this.b = pattern;
    }

    @Override // defpackage.t
    public final void a(CharSequence charSequence) {
        sb sbVar = this.d;
        StringBuilder sb = (StringBuilder) sbVar.L;
        if (sbVar.B != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        sbVar.B++;
        Pattern pattern = this.b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.c = true;
        }
    }

    @Override // defpackage.t
    public final void c() {
        Object obj = this.d.L;
        this.d = null;
    }

    @Override // defpackage.t
    public final c30 d() {
        return this.a;
    }

    @Override // defpackage.t
    public final d30 g(vh1 vh1Var) {
        if (!this.c) {
            if (vh1Var.h && this.b == null) {
                return null;
            }
            return d30.a(vh1Var.b);
        }
        return null;
    }
}
